import java.io.* ;
import java.util.ArrayList ;

class GameHelper {
    public String getUserInput (String prompt) {
        String inputLine = null ;
        System.out.print(prompt + "  ") ;
        try {
            BufferedReader is = new BufferedReader (
            new InputStreamReader (System.in)) ;
            inputLine = is.readLine() ;
            if (inputLine.length() == 0) return null ;
            } catch (IOException e) {
                System.out.println("IOException: "+e) ;
            }
        return inputLine ;
        }
    }

class DotCom {
    private ArrayList<String> locationCells ;
    // int numOfHits = 0 ;
    
    public static void main (String [] args) {
        int numOfGuesses = 0 ;
        GameHelper helper = new GameHelper() ;   //pre-written
        
        SimpleDotCom theDotCom = new SimpleDotCom() ;
        int randomNum = (int) (Math.random() * 5) ;
        int [] locations = {randomNum, randomNum+1, randomNum+2} ;
        theDotCom.setLocationCells (locations) ;
        boolean isAlive = true ;
        
        while (isAlive) {
            String guess = helper.getUserInput("enter a number") ;
            String result = theDotCom.checkYourself(guess) ;
            numOfGuesses++ ;
            if (result.equals("kill")) {
                isAlive = false ;
                System.out.println("You took "+numOfGuesses+" guesses"); 
            }
        }
    }
    
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc ;
    }
    
    public String checkYourself(String stringGuess) {
        //check user guess and return hit, miss or kill
        int guess = Integer.parseInt(stringGuess) ;
        String result = "miss" ;
        
        for (int cell: locationCells) {
            if (cell == guess) {
                numOfHits++ ;
                result = "hit" ;
                break ;    
            }   
        }
        
        if (numOfHits == locationCells.length) {
            result = "kill" ;
        }
        System.out.println(result) ;
        return result ;    
    }
 
}   

//test code

class SimpleDotComTestDrive {
    public static void main (String [] args) {
        SimpleDotCom dot = new SimpleDotCom() ;
        
        int [] locations = {2,3,4} ;
        dot.setLocationCells (locations) ;
        
        String userGuess = "2" ;
        String result = dot.checkYourself(userGuess) ;
        String testResult = "failed" ;
        
        if (result.equals("hit") ) {
            testResult = "passed" ;
        }
        System.out.println(testResult) ;
    }
}
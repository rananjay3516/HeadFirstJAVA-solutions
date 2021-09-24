class debris {
    static public void main (string args []) {
        
        // test code here
        kitten bet = new.kitten() ;
        bet.age = 5 ;
        System.out.println ("Bet is " + bet.age + " years old.") ;
    }
}

class kitten {
    string furColor ;
    string breed ;
    int age ;
}




class DrumKit {
    
    boolean topHat = true ;
    boolean snare = true ;
    
    void playSnare () {
    System.out.println("bang bang ba-bang") ;
    }
    
    void playTopHat () {
    System.out.println("ding ding da-ding")
    }
    
}

class DrumKitTestDrive {

    public static void main (String [] args) {
    
        DrumKit d = new DrumKit() ;
        
        d.playTopHat() ;
        d.playSnare() ;
        
        d.snare = false ;
        
        if (d.snare == true) {
        d.playSnare() ;
        }  
            
    }
}











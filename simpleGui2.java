import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;

class testPanel extends JPanel {
    public void paintComponent (Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g ;
        int numOfCol = 2 ; 
        
        Color[] colorBox = new Color[numOfCol] ;
        int red, green, blue ;
        for (int i = 0; i < 2; i++) {
            red = (int) (Math.random() * 255) ;
            green = (int) (Math.random() * 255) ;
            blue = (int) (Math.random() * 255) ;
            colorBox[i] = new Color (red, green, blue) ;
        }
        
        
        GradientPaint gradient = new GradientPaint (70,70, 
        colorBox[0], 150, 150, colorBox[1]) ;
        
        g2d.setPaint(gradient) ;
        g2d.fillOval(70,70,100,100) ;
        
        //g.fillRect (0, 0, this.getWidth(), this.getHeight()) ;
        //int red = (int) (Math.random() * 255) ;
        //int green = (int) (Math.random() * 255) ;
        //int blue = (int) (Math.random() * 255) ;
        
        //Color randomColor = new Color (red, green, blue) ;
        //g.setColor(randomColor) ;
        //g.fillOval (70,70,100,100) ;
        //Image image = new ImageIcon("edison.jpg").getImage() ;
        //g.drawImage(image,3, 4, this) ;
        
        //g.setColor(Color.orange) ;
        //g.fillRect(280,150,100,100) ;
    }
}

//java simpleGui2

public class simpleGui2  {
    
    public static void main (String [] args) {
        JFrame frame = new JFrame() ;
        testPanel wid = new testPanel() ;
     
        frame.getContentPane().add(wid) ;
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.setSize(600,600) ;
        frame.setVisible(true) ;
    }   
}
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

public class SimpleGui3 implements ActionListener {
    JFrame frame ;
    
    public static void main (String [] args) {
        SimpleGui3 gui = new SimpleGui3() ;
        gui.go() ;
    }
    
    public void go () {
        frame = new JFrame() ;
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
        
        JButton button = new JButton ("change color") ;
        button.addActionListener(this) ;
        
        MyDrawPanel drawPanel = new MyDrawPanel() ;
        
        frame.getContentPane().add(BorderLayout.SOUTH, button) ;
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel) ;
        frame.setSize(600,600) ;
        frame.setVisible(true) ;
    }
    
    public void actionPerformed (ActionEvent event) {
        frame.repaint() ;
    }
}

class MyDrawPanel extends JPanel {
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
    }
}
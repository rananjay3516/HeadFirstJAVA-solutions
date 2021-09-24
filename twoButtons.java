import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

public class twoButtons {
    JFrame frame ;
    JLabel label ;
    
    public static void main (String [] args) {
        twoButtons gui = new twoButtons() ;
        gui.go() ;
    }
    
    public void go () {
        frame = new JFrame() ;
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
        
        JButton labelButton = new JButton ("change label") ;
        labelButton.addActionListener(new LabelListener()) ;
        
        JButton colorButton = new JButton ("change color") ;
        colorButton.addActionListener(new ColorListener()) ;
        
        label = new JLabel("I'm a label") ;
        MyDrawPanel drawPanel = new MyDrawPanel() ;
        
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton) ;
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel) ;
        frame.getContentPane().add(BorderLayout.EAST, labelButton) ;
        frame.getContentPane().add(BorderLayout.WEST, label) ;
        
        frame.setSize(600,600) ;
        frame.setVisible(true) ;
    }
    
    class LabelListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
        label.setText ("ouch") ;
        }
    }
    
    class ColorListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            frame.repaint() ;
        }
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
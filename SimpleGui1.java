import javax.swing.* ;
import java.awt.event.* ;
import javax.swing.* ;
import java.awt.* ;

public class SimpleGui1 implements ActionListener {
    
    JButton button ;
    
    public static void main (String [] args) {
        SimpleGui1 gui = new SimpleGui1 () ;
        gui.go() ;
    }
    
    public void go() {
        JFrame frame = new JFrame() ;
        button = new JButton("click me") ;
        
        button.addActionListener(this) ;
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.getContentPane().add(button) ;
        frame.setSize(600,600) ;
        frame.setVisible(true) ;
    }
    
    public void actionPerformed (ActionEvent event) {
        button.setText("I've been clicked!") ;
    }
}    

class testPanel extends JPanel {
    public void paintComponent (Graphics g) {
        g.setColor(Color.orange) ;
        g.fillRect(20,50,100,100) ;
    }
}

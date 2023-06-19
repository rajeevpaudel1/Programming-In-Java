import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton btn;

        MyFrame(){
            c= this.getContentPane();
            c.setLayout(null);
            btn= new JButton("Click me");
            btn.setBounds(100, 100, 100, 40);
            c.add(btn);
            btn.addActionListener(this);
            
        }
        public void actionPerformed(ActionEvent e){
            c.setBackground(Color.RED);

        }
}
class ActionDemo{
    public static void main(String[] args) {
        MyFrame frame= new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Action Demo");
        frame.setBounds(100, 100, 500, 400);
        
    }
}
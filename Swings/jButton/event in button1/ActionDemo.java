import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton btn;
    JTextField field;
    MyFrame(){
        c=this.getContentPane();
        c.setLayout(null);
        field= new JTextField();
        field.setBounds(250,150,200,80);
        btn=new JButton("Click Me!");
        btn.setBounds(300,250, 100,40);
        c.add(field);
        c.add(btn);
        btn.addActionListener(this);
    }

        public void actionPerformed(ActionEvent e){
         field.setText("Hello World");

        }

}

public class ActionDemo {
    public static void main(String[] args) {
        MyFrame frame= new MyFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);
        frame.setTitle("Event handling 1");
    }
}

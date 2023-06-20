//this is the code of event handling in java swings using button 
//here we are using button in java to change the back ground color into yellow
//note this program is diffrent from the previous program
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Anonymous inner class");
        frame.setBounds(100, 100, 700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c =frame.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("Click me");
        btn.setBounds(100, 100, 100, 50);
        c.add(btn);


        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.YELLOW);
            }
        });
    }
}

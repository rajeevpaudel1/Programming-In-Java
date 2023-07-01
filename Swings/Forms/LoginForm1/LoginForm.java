//we'll design the same form using the anonymous inner class method because i feels it was the easy method
// we have used event handling here 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login Form");
        Container c= frame.getContentPane();
        c.setLayout(null);

        //for the label we can write like this
        JLabel label1 = new JLabel("Name: ");
        JLabel label2 = new JLabel("Semester: ");
        JLabel label3 = new JLabel("Roll No: ");
        JLabel label4 = new JLabel("College: ");

        label1.setBounds(50,50,100,30);
        label2.setBounds(50,100,100,30);
        label3.setBounds(50,150,100,30);
        label4.setBounds(50,200,100,30);

        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);

        //Now letus add 4 textfield
        JTextField t1= new JTextField();
        JTextField t2= new JTextField();
        JTextField t3= new JTextField();
        JTextField t4= new JTextField();

        t1.setBounds(150, 50, 150, 40);
        t2.setBounds(150, 100, 150, 40);
        t3.setBounds(150, 150, 150, 40);
        t4.setBounds(150, 200, 150, 40);

        c.add(t1);
        c.add(t2);
        c.add(t3);
        c.add(t4);

        //Let us add the button here
        JButton btn =new JButton("Submit");
        btn.setBounds(100, 300, 100, 30);
        c.add(btn);
        frame.setVisible(true);

        // here we'll add the event handling that will stole your data 
        // HAHA!!
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JLabel lab= new JLabel("Hurray !!! I stole your data");
                lab.setBounds(100, 350, 300, 30);
                c.add(lab);
            }
        });
    }
    

}

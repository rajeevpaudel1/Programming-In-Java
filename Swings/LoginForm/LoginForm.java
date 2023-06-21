import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{

    Container c;
    JLabel label1, label2;
    JTextField user;
    JPasswordField psw;
    JButton btn;

    MyFrame(){
       
        setBounds(100,100, 400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login Form");

        c=getContentPane();
        c.setLayout(null);

        label1= new JLabel("Username");
        label2= new JLabel("Password");

        label1.setBounds(10, 50, 100,20);
        label2.setBounds(10,100,100,20);

        c.add(label1);
        c.add(label2);

        user=new JTextField();
        user.setBounds(120,50,120,20);
        c.add(user);

        psw=new JPasswordField();
        psw.setBounds(120, 100, 120, 20);
        c.add(psw);


        btn= new JButton("Submit");
        btn.setBounds(100,150,100,20);
        c.add(btn);



         setVisible(true);
         btn.addActionListener(this);
         setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Username: "+user.getText());
        System.out.println("Password: "+psw.getText());

    }
}



class LoginForm{

    public static void main(String[] args) {
        MyFrame frame =new MyFrame();

        
    }
}

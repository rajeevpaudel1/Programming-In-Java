import javax.swing.*;
import java.awt.*;
public class MyPassword {
    public static void main(String[] args) {
         JFrame frame= new JFrame();
         frame.setVisible(true);
         frame.setBounds(100,100,500,300);
         frame.setTitle("This is first time using Jpasssword ");
         Container c= frame.getContentPane();
         c.setLayout(null);


         // till here the code used is same for creating the jframe
         //let us now move towards learning the Jpassswordfield, which is same as the JTextField
         //first step is same as always creating the object of JPasswordField

         JPasswordField pass =new JPasswordField();
         pass.setBounds(100, 100, 200, 50);
         pass.setText("Password");
         Font font=new Font("Arial",Font.PLAIN,30);
         pass.setFont(font);

         //Till here we can see the password field have the dot (.) character, so i want to replace it with some 
         //special character, just see the magic

         pass.setEchoChar('*');




         c.add(pass);


}
    }
   

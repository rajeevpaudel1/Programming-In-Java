import javax.swing.*;
import java.awt.*;

public class MyButton {
   public static void main(String[] args) {
    JFrame frame =new JFrame();
    frame.setVisible(true);
    frame.setBounds(100, 100, 500, 400);
    Container c = frame.getContentPane();
    c.setLayout(null);

    //Till here nothing changes in the first portion of the program
    //in this program we are learning about the use of button

    JButton btn= new JButton("click me");
    btn.setLocation(100, 100);
    btn.setSize(150, 30);
    Font font= new Font("arial", Font.PLAIN, 24);
    btn.setFont(font);
    btn.setText("Submit");
    btn.setForeground(Color.WHITE);
    btn.setBackground(Color.GREEN);

    //Now we'll be changing the way cursor looks in when we hover the cursor on button
     Cursor cur =new Cursor(Cursor.HAND_CURSOR);
     btn.setCursor(cur);

     //similarly, there is this function where we will be able to make the button clickable or not

     btn.setEnabled(false);
     
     //False make the button unclickable
     // whereas true let it be as like default or we can say clickable


     //Also, there is this last function which let you to make the button invisible
     //if true--> the button remains as it is!
     //if False--> the button will be invisible!
     btn.setVisible(true);
    c.add(btn);

    //There is also a function which will let you insert image inside the button
    //For that let me create a new button and insert the image object
    //firstly create a object of imageicon

    ImageIcon icon= new ImageIcon("Arthasasthri.png");
    // I tried inserting image inside the button but i wasn't able to upload
    // sorry for the moment
    JButton button = new JButton(icon);
    button.setSize(icon.getIconWidth(), icon.getIconHeight());
    button.setBounds(100, 150, 150, 30);
    c.add(button);



        
    }    
}

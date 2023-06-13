import javax.swing.*;
import java.awt.*;
public class MyTextField {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setTitle("This is My TEXT FIELD");
        frame.setBounds(100, 100, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= frame.getContentPane();
        c.setLayout(null);

        //till here we have set the only the frame structure
        //Now, we'll be moving towards the Text field case
        //For the text field we will set the object same as we used to do in jframe and jlabel

        JTextField text= new JTextField();
        text.setBounds(100, 100, 300, 50);

        //We have succesfully created the text field but do you know it won't be shown in the frame
        //for that we need to add it inside the container, to do that watch me
        c.add(text); //this is how you should add the text field inside container-- remember !!
        
        //Note : Sometime it may not load, for that you can resize the screen to refresh the window.


        //Now, if you want some text to appear already in the text field then see the magic here!
        text.setText("Your Name");

        //similarly if you want the text in the text field to appear larger then, you can play with the font function
        //we need to create the object of font first then we could proceed

        Font font= new Font("Arial", Font.PLAIN, 30);

        //After making the object of font then we need to pass it inside the text field
        text.setFont(font);
        
        // till here the text is apprearing in black color, now you have acces to the power that can change the text color
        text.setForeground(Color.BLUE);

        // similarly you can change the background of the text field 
        text.setBackground(Color.YELLOW);

        // finally, the last function can give access to the user to edit or not.
        text.setEditable(false);

        //if True- You can edit
        //if false- You cannot edit



    }
}

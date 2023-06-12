import java.awt.*;
import javax.swing.*;

public class FirstFrame {
    public static void main(String[] args) {
        JFrame frame= new JFrame(); //The Frame will be created but not visible
        frame.setVisible(true); //The frame will get visible using this function 
        // Even after closing down the frame the command won't stop running,so we further move to this function 
        //which will completely stop the command frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Now, we got to know that the size of frame doesn't look good so let us provide it a certain size
       // frame.setSize(700,500);
         
        //The window always appears form the left corner of the screen, so let us make it appear from the place where 
        //we wish it to appear
        
        //frame.setLocation(100, 100);

        //also there is this function which can replace the function size and location
        frame.setBounds(100, 100, 700, 500);

        //now everythings looks great, so let us start filling the elements inside the frame
        // let's start with title
        frame.setTitle("This is my first frame");

        //let's work on icon to do this, we need to create the object of this function
        ImageIcon icon= new ImageIcon("image.png");

        //as image location is already defined we can call it now using the above function
        frame.setIconImage(icon.getImage());

        //the window appears in white background, new let us see if there is something we could do to change it color
        //we need content pane to access the container type of window screen, for this we set a container variable 

        Container c= frame.getContentPane();
        c.setBackground(Color.BLUE);

        //till this process there is still no change in process because the container used above isn't the class of
        //swimg whereas it is the class of awt, so we need to import the awt


        //now there comes an arrow in the window that that can be used to resize the window scree, so to avoid this
        frame.setResizable(false);






    }
}

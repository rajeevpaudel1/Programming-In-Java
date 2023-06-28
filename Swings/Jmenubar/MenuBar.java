import javax.swing.*;
import java.awt.*;

public class MenuBar{
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 600);
        frame.setTitle("Menu Bar");
        Container c=frame.getContentPane();
        c.setLayout(null);

        //We are creating the menubar, menu, menuitem objects.

        JMenuBar menubar=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenuItem i3=new JMenuItem("Save");
        JMenuItem i4=new JMenuItem("Undo");
        JMenuItem i5=new JMenuItem("Redo");

        //first we should add menu item to menu
        file.add(i1);
        file.add(i2);
        file.add(i3);
        edit.add(i4);
        edit.add(i5);

        //second we need to add the menuto the menu bar
        menubar.add(file);
        menubar.add(edit);

        //lastly we should add the menubar to the jframe
        frame.setJMenuBar(menubar);
        frame.setVisible(true);
       }
}

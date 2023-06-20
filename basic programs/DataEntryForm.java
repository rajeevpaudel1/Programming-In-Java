import java.awt.*;
import java.awt.event.*;

public class DataEntryForm extends Frame {
    private TextField nameField;
    private TextField ageField;
    private TextField emailField;

    public DataEntryForm() {
        super("Data Entry Form");

        Label nameLabel = new Label("Name:");
        nameField = new TextField(20);

        Label ageLabel = new Label("Age:");
        ageField = new TextField(3);

        Label emailLabel = new Label("Email:");
        emailField = new TextField(30);

        Button submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String email = emailField.getText();

                System.out.println("Data Summary");
                System.out.println("-------------------------------");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Email: " + email);

                // Clear the fields
                nameField.setText("");
                ageField.setText("");
                emailField.setText("");
            }
        });

        setLayout(new FlowLayout());
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(emailLabel);
        add(emailField);
        add(submitButton);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DataEntryForm();
    }
}
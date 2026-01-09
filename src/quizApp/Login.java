package quizApp;
import java.net.URL;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

    Login() {
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizApp/icons/quiz.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("The Quiz!");
        heading.setBounds(775, 60, 300, 45);
        heading.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 55));
        heading.setForeground(new Color(82, 98, 103));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
        name.setForeground(new Color(82, 98, 103));
        add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Arial", Font.BOLD, 20));
        add(tfname);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login(); //new object

    }
}

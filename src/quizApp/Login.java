package quizApp;
import java.net.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tfname;
    Login() {
        getContentPane().setBackground(new Color(214, 234, 248));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizApp/icons/quiz.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("The Quiz!");
        heading.setBounds(690, 30, 900, 160);
        heading.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 100));
        heading.setForeground(new Color(25, 70, 140));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        //set middle
        name.setBounds(745, 210, 900, 50);
        name.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 36));
        name.setForeground(new Color(25, 70, 140));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(540, 280, 720, 55);
        tfname.setFont(new Font("Arial", Font.BOLD, 32));
        tfname.setHorizontalAlignment(JTextField.CENTER);
        add(tfname);

        rules = new JButton("Start");
        rules.setFont(new Font("Tahoma", Font.BOLD, 28));
        rules.setBounds(765, 390, 260, 55);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        rules.setFocusPainted(false);
        rules.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(rules);

        //back = new JButton("Back");
       // back.setFont(new Font("Tahoma", Font.BOLD, 28));
       // back.setBounds(930, 390, 260, 55);
       // back.setBackground(new Color(30, 144, 254));
      //  back.setForeground(Color.WHITE);
       // back.addActionListener(this);
       // back.setFocusPainted(false);
       // back.setCursor(new Cursor(Cursor.HAND_CURSOR));
       // add(back);



        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(0, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new Login(); //new object

    }
}

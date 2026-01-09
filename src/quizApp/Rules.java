package quizApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to the quiz. ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28));
        heading.setForeground(Color.green);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        rules.setText(
                "<html>" +
                        "<h2>Quiz Rules</h2>" +
                        "1. The quiz consists of multiple-choice questions.<br><br>" +
                        "2. Each question has only one correct answer.<br><br>" +
                        "3. Each correct answer awards 1 point. No negative marking.<br><br>" +
                        "4. Questions must be answered in order. You cannot go back.<br><br>" +
                        "5. Each question is time-limited.<br><br>" +
                        "6. Your final score will be shown with a performance message.<br><br>" +
                        "7. Closing the application ends the quiz.<br><br>" +
                        "8. Have fun and challenge yourself!" +
                        "</html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        start = new JButton("Start");
        start.setBounds(735, 270, 120, 25);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(300, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {

        } else {
            setVisible(false);
            new Login();

        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}

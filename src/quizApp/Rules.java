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
        getContentPane().setBackground(new Color(214, 234, 248));
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to the quiz. ");
        heading.setBounds(450, 30, 1600, 120);
        heading.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        heading.setForeground(new Color(25, 70, 140));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(250, 80, 1100, 520);
        rules.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
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
        back.setBounds(250, 570, 260, 55);
        back.setBackground(new Color(52, 120, 210));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 26));
        back.setFocusPainted(false);
        back.addActionListener(this);
        add(back);


        start = new JButton("Start");
        start.setBounds(550, 570, 260, 55);
        start.setBackground(new Color(52, 120, 210));
        start.setForeground(Color.WHITE);
        start.setFont(new Font("Tahoma", Font.BOLD, 26));
        start.setFocusPainted(false);
        start.addActionListener(this);
        add(start);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(0, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
           new Quiz(name);
        } else {
            setVisible(false);
            new Login();

        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}

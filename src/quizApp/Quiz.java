package quizApp;
import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    String question[][] = new String[10][5];
    String answers[][] = new String[10][5];
    JLabel QNumber, questionLabel ;
    JRadioButton opt1, opt2, opt3, opt4;
    public static int timer = 15;

    Quiz() {
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizApp/icons/quiz.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1350, 350);
        add(image);

        QNumber = new JLabel(); //qno
        QNumber.setBounds(100, 450, 50, 30);
        QNumber.setFont (new Font("Tahoma", Font.PLAIN,24));
        add(QNumber);

        questionLabel = new JLabel(); //question
        questionLabel.setBounds(150, 450, 900, 30);
        questionLabel.setFont (new Font("Tahoma", Font.PLAIN,24));
        add(questionLabel);

        //questions
        question[0][0] = "What is the main purpose of using Object-Oriented Programming (OOP)?";
        question[0][1] = "To make programs run faster";
        question[0][2] = "To organise code using objects and classes";
        question[0][3] = "To reduce memory usage only";
        question[0][4] = "To avoid using loops";

        question[1][0] = "Which concept allows data to be hidden from direct access?";
        question[1][1] = "Inheritance";
        question[1][2] = "Encapsulation";
        question[1][3] = "Polymorphism";
        question[1][4] = "Abstraction";

        question[2][0] = "Why is using multiple classes better than one large class?";
        question[2][1] = "It makes the program slower";
        question[2][2] = "It improves code organisation and readability";
        question[2][3] = "It removes the need for methods";
        question[2][4] = "It increases memory usage";

        question[3][0] = "Which Swing component is used to display text or images?";
        question[3][1] = "JButton";
        question[3][2] = "JTextField";
        question[3][3] = "JLabel";
        question[3][4] = "JCheckBox";

        question[4][0] = "What is the main advantage of using a GUI over a console application?";
        question[4][1] = "It uses less memory";
        question[4][2] = "It is more user-friendly and visually appealing";
        question[4][3] = "It removes the need for logic";
        question[4][4] = "It runs without errors";

        question[5][0] = "What does the keyword 'extends' do in Java?";
        question[5][1] = "Creates an object";
        question[5][2] = "Allows one class to inherit another class";
        question[5][3] = "Ends a program";
        question[5][4] = "Starts a loop";

        question[6][0] = "Why is exception handling important in Java?";
        question[6][1] = "To speed up the program";
        question[6][2] = "To prevent the program from crashing unexpectedly";
        question[6][3] = "To avoid writing logic";
        question[6][4] = "To reduce file size";

        question[7][0] = "What is the purpose of version control systems like Git?";
        question[7][1] = "To compile Java programs";
        question[7][2] = "To track changes and manage code versions";
        question[7][3] = "To delete old files automatically";
        question[7][4] = "To design user interfaces";

        question[8][0] = "Why should UI code and logic code be separated?";
        question[8][1] = "To make the program longer";
        question[8][2] = "To make maintenance and updates easier";
        question[8][3] = "To confuse users";
        question[8][4] = "To avoid using classes";

        question[9][0] = "Which skill is most important when debugging code?";
        question[9][1] = "Typing speed";
        question[9][2] = "Logical thinking and patience";
        question[9][3] = "Guessing randomly";
        question[9][4] = "Copying code blindly";

        answers[0][2] = "To organise code using objects and classes";
        answers[1][2] = "Encapsulation";
        answers[2][2] = "It improves code organisation and readability";
        answers[3][3] = "JLabel";
        answers[4][2] = "It is more user-friendly and visually appealing";
        answers[5][2] = "Allows one class to inherit another class";
        answers[6][2] = "To prevent the program from crashing unexpectedly";
        answers[7][2] = "To track changes and manage code versions";
        answers[8][2] = "To make maintenance and updates easier";
        answers[9][2] = "Logical thinking and patience";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 520,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN,20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 560,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN,20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 600,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN,20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 640,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN,20));
        add(opt4);

        ButtonGroup groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        JButton nextButton = new JButton("Next");
        nextButton.setBounds(1100, 550, 200, 40);
        nextButton.setFont (new Font("Tahoma", Font.PLAIN, 22));
        nextButton.setBackground(new Color(30, 144, 255));
        nextButton.setForeground(Color.WHITE);
        add(nextButton);

        JButton lifeline = new JButton("50 50 lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont (new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        add(lifeline);

        JButton submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont (new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        add(submit);

        start(0);

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        }

    }


    public void start(int count) {
    QNumber.setText("" + (count + 1) + ". ");
    questionLabel.setText(question[count][0]);
    opt1.setText(question[count][1]);
    opt2.setText(question[count][2]);
    opt3.setText(question[count][3]);
    opt4.setText(question[count][4]);

    }

    public static void main(String[] args) {
        new Quiz();

    }
}

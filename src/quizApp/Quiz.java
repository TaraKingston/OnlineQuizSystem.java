package quizApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    String question[][] = new String[10][5];
    String answers[][] = new String[10][5];
    String userAnswers[][] = new String[10][1];

    JLabel QNumber, questionLabel ;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton nextButton, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    Quiz(String name) {
        this.name = name;
       // setBounds(50, 0, 1440, 850);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(0, 0);
        getContentPane().setBackground(new Color(214, 234, 248));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizApp/icons/quiz_icon.png"));
        Image img = i1.getImage().getScaledInstance(400, 220, Image.SCALE_SMOOTH);
        JLabel image = new JLabel(new ImageIcon(img));
        // Center horizontally: (frame width - image width) / 2
        image.setBounds((1440 - 560) / 2, 10, 560, 300);
        add(image);


        QNumber = new JLabel(); //qno
        QNumber.setBounds(100, 330, 50, 30);
        QNumber.setFont (new Font("Tahoma", Font.PLAIN,24));
        add(QNumber);

        questionLabel = new JLabel(); //question
        questionLabel.setBounds(150, 330, 900, 30);
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

        answers[0][1] = "To organise code using objects and classes";
        answers[1][1] = "Encapsulation";
        answers[2][1] = "It improves code organisation and readability";
        answers[3][1] = "JLabel";
        answers[4][1] = "It is more user-friendly and visually appealing";
        answers[5][1] = "Allows one class to inherit another class";
        answers[6][1] = "To prevent the program from crashing unexpectedly";
        answers[7][1] = "To track changes and manage code versions";
        answers[8][1] = "To make maintenance and updates easier";
        answers[9][1] = "Logical thinking and patience";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 390,700,40);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN,20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 430,700,40);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN,20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 470,700,40);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN,20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 510,700,40);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN,20));
        add(opt4);

        Font optionFont = new Font("Dialog", Font.PLAIN, 20);
        opt1.setFont(optionFont);
        opt2.setFont(optionFont);
        opt3.setFont(optionFont);
        opt4.setFont(optionFont);

        Color bg = getContentPane().getBackground();
        opt1.setBackground(bg);
        opt2.setBackground(bg);
        opt3.setBackground(bg);
        opt4.setBackground(bg);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        nextButton = new JButton("Next");
        nextButton.setBounds(1000, 410, 200, 40);
        nextButton.setFont (new Font("Tahoma", Font.PLAIN, 22));
        nextButton.setBackground(new Color(30, 144, 255));
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        nextButton.setFocusPainted(false);
        nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(nextButton);

        lifeline = new JButton("50 50 lifeline");
        lifeline.setBounds(1000, 470, 200, 40);
        lifeline.setFont (new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        lifeline.setFocusPainted(false);
        lifeline.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1000, 530, 200, 40);
        submit.setFont (new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        submit.setFocusPainted(false);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(submit);

        start(count);
        setVisible(true);
    }
    //helper method
   // private String getCorrectAnswer(int i) {
     //   for (int j = 1; j <= 4; j++) {
      //      if (answers[i][j] != null) return answers[i][j];
     //   }
     //   return "";
   // }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == nextButton) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);


            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                userAnswers[count][0] = "";
            } else {
                userAnswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                nextButton.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);

       // } else if (ae.getSource() == lifeline) {
         //   if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
         //       opt2.setEnabled(false);
         //       opt3.setEnabled(false);
         //   } else {
            //     opt1.setEnabled(true);
         //       opt4.setEnabled(true);
          //  }
            // lifeline.setEnabled(false);

        } else if (ae.getSource() == lifeline) {

            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 3) { // Question 4
                opt1.setEnabled(false);
                opt2.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }

            lifeline.setEnabled(false);
            lifeline.setBackground(Color.LIGHT_GRAY);
            lifeline.setForeground(Color.DARK_GRAY);
            lifeline.setText("50/50 used");



        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                userAnswers[count][0] = "";
            } else {
                userAnswers[count][0] = groupoptions.getSelection().getActionCommand();
            }


            for (int i = 0; i < userAnswers.length; i++) {
               if (userAnswers[i][0].equals(answers[i][1])) {
                  score += 10;
               } else {
                   score += 0;
              }
           }
            setVisible(false);
            new Score(name, score);
            //score
        }

    }


    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1000, 386);
        } else {
            g.drawString("Times up!!", 1000, 386);
        }

        timer--; // 15

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;

        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                nextButton.setEnabled(false);
                submit.setEnabled(true);
            }

            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                    userAnswers[count][0] = "";
                } else {
                    userAnswers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < userAnswers.length; i++) {
                    if (userAnswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { //next button
                if (groupoptions.getSelection() == null) {
                    userAnswers[count][0] = "";
                } else {
                    userAnswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; //0 //1
                start(count);

            }

        }
    }


    public void start(int count) {
    QNumber.setText("" + (count + 1) + ". ");
    questionLabel.setText(question[count][0]);
    opt1.setText(question[count][1]);
    opt1.setActionCommand(question[count][1]);

    opt2.setText(question[count][2]);
    opt2.setActionCommand(question[count][2]);

    opt3.setText(question[count][3]);
    opt3.setActionCommand(question[count][3]);

    opt4.setText(question[count][4]);
    opt4.setActionCommand(question[count][4]);

    groupoptions.clearSelection();

    }

    public static void main(String[] args) {
        new Quiz("User");

    }
}

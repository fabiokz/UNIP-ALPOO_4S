package swing3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Quiz extends JFrame {
    private JLabel questionLabel;
    private JRadioButton option1Button;
    private JRadioButton option2Button;
    private JRadioButton option3Button;
    private JRadioButton option4Button;
    private ButtonGroup optionGroup;
    private JButton nextButton;
    private int currentQuestionIndex;
    private int score;
    private ArrayList<Question> questions;

    public Quiz() {

        setTitle("Quiz de Geografia e Matemática");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        currentQuestionIndex = 0;
        score = 0;

        questions = new ArrayList<>();
        questions.add(new Question("Quanto é 5x5?", "25"));
        questions.add(new Question("Quanto é 2 + 2?", "4"));

        questionLabel = new JLabel(questions.get(0).getQuestionText());
        option1Button = new JRadioButton(questions.get(0).getOptions().get(0));
        option2Button = new JRadioButton(questions.get(0).getOptions().get(1));
        option3Button = new JRadioButton(questions.get(0).getOptions().get(2));
        option4Button = new JRadioButton(questions.get(0).getOptions().get(3));

        optionGroup = new ButtonGroup();
        optionGroup.add(option1Button);
        optionGroup.add(option2Button);
        optionGroup.add(option3Button);
        optionGroup.add(option4Button);

        nextButton = new JButton("Próxima Pergunta");

        nextButton.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                showNextQuestion();
            }
        });

        JPanel questionPanel = new JPanel(new GridLayout(6, 1));
        questionPanel.add(questionLabel);
        questionPanel.add(option1Button);
        questionPanel.add(option2Button);
        questionPanel.add(option3Button);
        questionPanel.add(option4Button);
        add(questionPanel, BorderLayout.CENTER);
        add(nextButton, BorderLayout.SOUTH);

    
        showQuestion(0);
    }

    private void showQuestion(int index) {
        Question question = questions.get(index);
        questionLabel.setText(question.getQuestionText());
        option1Button.setText(question.getOptions().get(0));
        option2Button.setText(question.getOptions().get(1));
        option3Button.setText(question.getOptions().get(2));
        option4Button.setText(question.getOptions().get(3));
     
        optionGroup.clearSelection();
    }

    private void checkAnswer() {
        Question question = questions.get(currentQuestionIndex);
        String selectedAnswer = getSelectedAnswer();
        if (question.isCorrect(selectedAnswer)) {
            score++;
        }
    }

    private void showNextQuestion() {
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.size()) {
            showQuestion(currentQuestionIndex);
        } else {
      
            JOptionPane.showMessageDialog(this, "Pontuação final: " + score + "/" + questions.size());
            System.exit(0);
        }
    }

    private String getSelectedAnswer() {
        if (option1Button.isSelected()) {
            return option1Button.getText();
        } else if (option2Button.isSelected()) {
            return option2Button.getText();
        } else if (option3Button.isSelected()) {
            return option3Button.getText();
        } else if (option4Button.isSelected()) {
            return option4Button.getText();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
       
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }
}

class Question {
    private String questionText;
    private ArrayList<String> options;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        options = new ArrayList<>();
        options.add(correctAnswer);

        Random random = new Random();
        while (options.size() < 4) {
            int randomNum = random.nextInt(10); 
            String option = Integer.toString(randomNum);
            if (!options.contains(option)) {
                options.add(option);
            }
        }
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public boolean isCorrect(String answer) {
        return correctAnswer.equals(answer);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;;

public class Calculator implements ActionListener {

    JFrame calFrame;
    JTextField fielddForText;
    JButton[] operation = new JButton[9];
    JButton[] digits = new JButton[10];
    JButton additionBottom, subtractionBottom, multiplicationBottom, divisionBottom;
    JButton dotBottom, minus1calculator, clearBottom, deleteBottom, equalBottom;

    JPanel panel;

    double firstDigit = 0;
    double secondDigit = 0;
    double result = 0;
    char operatorSign;
    Font textFond = new Font("ROMAN_BASELINE", Font.BOLD, 30);

    Calculator() {

        calFrame = new JFrame("Calculator in Java");
        calFrame.setVisible(true);
        calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calFrame.setSize(500, 500);
        calFrame.setLayout(null);

        fielddForText = new JTextField();
        fielddForText.setBounds(55, 35, 200, 50);
        fielddForText.setBackground(Color.GRAY);
        fielddForText.setFont(textFond);
        fielddForText.setVisible(true);
        fielddForText.setEditable(false);

        calFrame.add(fielddForText);


        additionBottom = new JButton("+");
        subtractionBottom = new JButton("-");
        multiplicationBottom = new JButton("x");
        divisionBottom = new JButton("/");
        equalBottom = new JButton("=");
        dotBottom = new JButton(".");
        deleteBottom = new JButton("<-");
        minus1calculator = new JButton("(-)");
        clearBottom = new JButton("A/C");

        operation[0] = additionBottom;
        operation[1] = subtractionBottom;
        operation[2] = multiplicationBottom;
        operation[3] = divisionBottom;
        operation[4] = equalBottom;
        operation[5] = dotBottom;
        operation[6] = deleteBottom;
        operation[7] = minus1calculator;
        operation[8] = clearBottom;

        for (int operationFunction = 0; operationFunction < 9; operationFunction++) {
            operation[operationFunction].addActionListener(this);
            operation[operationFunction].setFont(textFond);
            operation[operationFunction].setFocusable(false);
        }

        for (int numbers = 0; numbers < 10; numbers++) {
            digits[numbers] = new JButton(String.valueOf(numbers));
            digits[numbers].addActionListener(this);
            digits[numbers].setFont(textFond);
            digits[numbers].setFocusable(false);
        }

        subtractionBottom.setBounds(50, 430, 100, 50);
        deleteBottom.setBounds(150, 430, 100, 50);
        clearBottom.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(digits[1]);
        panel.add(digits[2]);
        panel.add(digits[3]);
        panel.add(additionBottom);
        panel.add(digits[4]);
        panel.add(digits[5]);
        panel.add(digits[6]);
        panel.add(subtractionBottom);
        panel.add(digits[7]);
        panel.add(digits[8]);
        panel.add(digits[9]);
        panel.add(multiplicationBottom);
        panel.add(dotBottom);
        panel.add(digits[0]);
        panel.add(equalBottom);
        panel.add(divisionBottom);

        calFrame.add(panel);
        calFrame.add(minus1calculator);
        calFrame.add(deleteBottom);
        calFrame.add(clearBottom);
        calFrame.add(fielddForText);
        calFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == digits[i]) {
                fielddForText.setText(fielddForText.getText().concat(String.valueOf(i)));
            }

        }
        if (e.getSource() == dotBottom) {
            fielddForText.setText(fielddForText.getText().concat("."));
        }
        if (e.getSource() == additionBottom) {
            firstDigit = Double.parseDouble(fielddForText.getText());
            operatorSign = '+';
            fielddForText.setText("");
        }
        if (e.getSource() == multiplicationBottom) {
            firstDigit = Double.parseDouble(fielddForText.getText());
            operatorSign = '*';
            fielddForText.setText("");
        }
        if (e.getSource() == subtractionBottom) {
            firstDigit = Double.parseDouble(fielddForText.getText());
            operatorSign = '-';
            fielddForText.setText("");
        }
        if (e.getSource() == divisionBottom) {
            firstDigit = Double.parseDouble(fielddForText.getText());
            operatorSign = '/';
            fielddForText.setText("");
        }
        if (e.getSource() == equalBottom) {
            secondDigit = Double.parseDouble(fielddForText.getText());

            switch (operatorSign) {
                case '+':
                    result = firstDigit + secondDigit;
                    break;
                case '-':
                    result = firstDigit - secondDigit;
                    break;
                case '*':
                    result = firstDigit * secondDigit;
                    break;
                case '/':
                    result = firstDigit / secondDigit;
                    break;
            }
            fielddForText.setText(String.valueOf(result));
            firstDigit = result;
        }
        if (e.getSource() == deleteBottom) {
            String textInTheField = fielddForText.getText();
            fielddForText.setText("");
            for (int i = 0; i < textInTheField.length(); i++) {
                fielddForText.setText(fielddForText.getText() + textInTheField.charAt(i));
            }
        }

        if (e.getSource() == minus1calculator) {
            double temp = Double.parseDouble(fielddForText.getText());
            temp *= -1;
            fielddForText.setText(String.valueOf(temp));
        }


    }
}


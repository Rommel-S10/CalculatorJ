import javax.swing.*;
import java.awt.*;

public class Calculator {

    JFrame calFrame;
    JTextField fielddForText;
    JButton[] operation = new JButton[9];
    JButton[] digits = new JButton[10];
    JButton additionBottom, subtractionBottom, multiplicationBottom, divisionBottom;
    JButton dotBottom, minus1calculator, clearBottom, deleteBottom, equalBottom;

    JPanel panel;

    double firstDigit =0;
    double secondDigit = 0;
    double result = 0;
    Font textFond = new Font("ROMAN_BASELINE", Font.BOLD, 30);
    Calculator(){

        calFrame = new JFrame("Calculator in Java");
        calFrame.setVisible(true);
        calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calFrame.setSize(500, 500);
        calFrame.setLayout(null);

        fielddForText = new JTextField();
        fielddForText.setBounds(25, 75, 300, 100);
        fielddForText.setBackground(Color.GRAY);
        fielddForText.setFont(textFond);
        fielddForText.setSelectedTextColor(Color.WHITE);
        fielddForText.setVisible(true);
        fielddForText.setLayout(null);
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

        operation[1] = additionBottom;
        operation[2] = subtractionBottom;
        operation[3] = multiplicationBottom;
        operation[4] = divisionBottom;
        operation[5] = equalBottom;
        operation[6] = dotBottom;
        operation[7] = deleteBottom;
        operation[8] = minus1calculator;
        operation[9] = clearBottom;

        for(int numbers = 0; numbers < 9; numbers ++){
            digits[numbers] = new JButton(String.valueOf(numbers));
            digits[numbers].addActionListener(this);
            digits[numbers].setFont(textFond);
            digits[numbers].setFocusable(false);
        }










    }
}

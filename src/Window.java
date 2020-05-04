
    import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;


    public class Window extends JFrame {

        public Window()  {
            setBounds(400, 200, 300, 100);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);
            setTitle("Calculate");

            JPanel mainPanel1 = new JPanel();
            mainPanel1.setLayout(new GridLayout(1,3));

            JTextField textField1 = new JTextField();
            mainPanel1.add(textField1);
            JTextField textField2 = new JTextField();
            mainPanel1.add(textField2);
            JTextField textField3 = new JTextField();
            mainPanel1.add(textField3);


            add(mainPanel1, BorderLayout.CENTER);

            JPanel secondPanel = new JPanel(new GridLayout(1,5));

            JButton btn1 = new JButton("+");

            btn1.addActionListener(e -> {
                int x = Integer.parseInt(textField1.getText());
                int y = Integer.parseInt(textField2.getText());
                textField3.setText("" + (x + y));


            });
            secondPanel.add(btn1);
            JButton btn2 = new JButton("-");
            btn2.addActionListener(e ->{
                int x = Integer.parseInt(textField1.getText());
                int y = Integer.parseInt(textField2.getText());
                textField3.setText("" + (x - y));

            } );

            secondPanel.add(btn2);
            JButton btn3 = new JButton("/");
            btn3.addActionListener(e ->{
                int x = Integer.parseInt(textField1.getText());
                int y = Integer.parseInt(textField2.getText());
                textField3.setText("" + (x / y));

            } );

            secondPanel.add(btn3);

            JButton btn4 = new JButton("*");
            btn4.addActionListener(e ->{
                int x = Integer.parseInt(textField1.getText());
                int y = Integer.parseInt(textField2.getText());
                textField3.setText("" + (x * y));
            } );
            secondPanel.add(btn4);
            add(secondPanel, BorderLayout.SOUTH);

        }

    }


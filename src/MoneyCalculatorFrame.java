import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MoneyCalculatorFrame extends JFrame {


   public MoneyCalculatorFrame() {
       setTitle("Money Calculator");
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setMinimumSize(new Dimension(300, 300));

       createComponents();

       setVisible(true);
   }


    private void createComponents() {
        add(createExchangeDialog());
        add(createToolBar(), BorderLayout.SOUTH);
    }


    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel();

        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());

        return panel;
    }


    private JPanel createToolBar() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createCloseButton());
        return panel;
    }


    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculating");
            }
        });

        return button;
    }


    private JButton createCloseButton() {
        JButton button = new JButton("Close");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        return button;
    }

}

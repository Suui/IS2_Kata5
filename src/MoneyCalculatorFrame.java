import javax.swing.*;
import java.awt.*;


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
        return panel;
    }


    private JPanel createToolBar() {
        return null;
    }

}

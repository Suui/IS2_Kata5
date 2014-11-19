import javax.swing.*;


public class MoneyDialog extends JPanel {

    public MoneyDialog() {
        super();
        add(createTextField());
        add(new CurrencyDialog());
    }

    private JTextField createTextField() {
        return new JTextField(10);
    }
}

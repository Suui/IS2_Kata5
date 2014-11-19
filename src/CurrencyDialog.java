import javax.swing.*;


public class CurrencyDialog extends JPanel {

    public CurrencyDialog() {
        super();
        add(CreateComboBox());
    }


    private JComboBox CreateComboBox() {
        return new JComboBox(new String[] {"EUR", "USD", "GBP"});
    }

}

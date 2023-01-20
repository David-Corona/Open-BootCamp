package JavaBasico.SwingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JButton buttonCalculate;
    private JPanel taxPanel;
    private JTextField price;
    private JTextField tax;
    private JTextField total;


    public MainForm() {
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double priceValue = Double.parseDouble(price.getText()); //TODO: Comprobar antes que es double
                double taxValue = Double.parseDouble(tax.getText());
                double totalValue = priceValue + (priceValue * taxValue / 100);
                total.setText(String.valueOf(totalValue));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

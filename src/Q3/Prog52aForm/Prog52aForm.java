package Q3.Prog52aForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog52aForm {
    private JTextField txtLen;
    private JTextField txtWid;
    private JButton calculateButton;
    private JButton clearButton;
    private JPanel Panel;
    private JLabel lblArea;
    private JLabel lblPerim;

    public Prog52aForm() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLen.setText("");
                txtWid.setText("");
                lblArea.setText("");
                lblPerim.setText("");
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = Integer.parseInt(txtLen.getText());
                int wid = Integer.parseInt(txtWid.getText());
                int area = len * wid;
                int perim = 2 * len + 2 * wid;
                lblArea.setText("" + area);
                lblPerim.setText("" + perim);
            }
        });

    }

    public static void main(String[] args) {
    }
}

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class Assign10 implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3;
    JPanel p;
    JTextField t1, t2, t3;
    JButton b1, b2, b3;

    Assign10() {
        f = new JFrame();
        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        p = new JPanel();
        l3 = new JLabel("Result");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("ADD");
        b2 = new JButton("CLEAR");
        b3 = new JButton("EXIT");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400, 400);
        l1.setBounds(30, 20, 100, 20);
        l2.setBounds(30, 50, 100, 20);
        l3.setBounds(30, 80, 100, 20);
        t1.setBounds(140, 20, 100, 20);
        t2.setBounds(140, 50, 100, 20);
        t3.setBounds(140, 80, 100, 20);
        b1.setBounds(30, 120, 80, 30);
        b2.setBounds(120, 120, 80, 30);
        b3.setBounds(210, 120, 80, 30);
        Border black = BorderFactory.createTitledBorder("Number Additions");
        p.setBorder(black);
        p.setLayout(null);
        p.setBounds(0, 0, 300, 300);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(t1);
        p.add(t2);
        p.add(t3);
        p.add(b1);
        p.add(b2);
        p.add(b3);

        f.add(p);
//        f.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b1)) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = a + b;
            t3.setText(Integer.toString((sum)));
        } else if (ae.getSource().equals(b2)) {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        } else if (ae.getSource().equals(b3)) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Assign10();
    }
}

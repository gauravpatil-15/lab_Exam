import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assign9 implements ActionListener {
    JFrame f;
    JMenu m1, m2;
    JLabel l1;
    JTextField t1;
    JButton b1, b2;
    JMenuItem i1, i2, i3, i4, i5;

    Assign9() {
        f = new JFrame("Chat Frame");
        JMenuBar mb = new JMenuBar();
        JToolBar tb = new JToolBar();
        m1 = new JMenu("FILE");
        m2 = new JMenu("HELP");
        i1 = new JMenuItem("Open");
        i2 = new JMenuItem("Save As");
        i3 = new JMenuItem("Privacy");
        i4 = new JMenuItem("Settings");
        i5 = new JMenuItem("Block");
        b1 = new JButton("SEND");
        b2 = new JButton("RESET");
        l1 = new JLabel("Enter the Text");
        t1 = new JTextField();

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        m1.add(i1);
        m1.add(i2);
        m2.add(i3);
        m2.add(i4);
        m2.add(i5);
        mb.add(m1);
        mb.add(m2);

        f.add(tb);
        f.setJMenuBar(mb);
        tb.add(l1);
        tb.add(t1);
        tb.add(b1);
        tb.add(b2);
        tb.setFloatable(false);
        tb.setBounds(0, 300, 380, 25);
//        f.add(tb);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b1)) {
            JOptionPane.showMessageDialog(null, "Message send");
        } else if (e.getSource().equals(b2)) {
            t1.setText(null);
        }
    }

    public static void main(String[] args) {
        new Assign9();
    }
}

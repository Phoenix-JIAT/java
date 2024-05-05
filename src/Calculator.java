
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator {

    public static void main(String[] args) {

        new cal();
        int j = 10;

    }

}

class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    TextField tf;

    String fv, sv, op, tv, fff, ffff, fvd;

    double fdv, sdv, tot, bb, ff;

    Menu m1 = new Menu("View");
    Menu m2 = new Menu("themes");
    Menu m3 = new Menu("Edit");
    Menu m4 = new Menu("Help");

    MenuItem mi1 = new MenuItem("Standard");
    MenuItem mi2 = new MenuItem("Scientific");
    MenuItem mi3 = new MenuItem("Light Mode");
    MenuItem mi4 = new MenuItem("Dark Mode");
    MenuItem mi5 = new MenuItem("Help");
    MenuItem mi6 = new MenuItem("About");

    Frame frame1 = new Frame();

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    cal() {

        frame1.addWindowListener(new close());
        frame1.setBackground(Color.white);
        frame1.setBounds(500, 140, 350, 420);
        frame1.setTitle("Calculater");

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads\\calculater.png");
        frame1.setIconImage(icon);

        MenuBar mbar = new MenuBar();

        m1.add(mi1);
        m1.add(mi2);

        m2.add(mi3);
        m2.add(mi4);

        m4.add(mi5);
        m4.add(mi6);

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        mbar.add(m4);

        frame1.setMenuBar(mbar);

        Panel p1 = new Panel();
        frame1.add(p1);

        tf = new TextField(20);
        Font font = new Font("Cambria Math", Font.BOLD, 24);
        tf.setFont(font);
        tf.setEditable(false);
        tf.setForeground(Color.black);
        tf.setBackground(Color.white);

        p1.add(tf);
        p1.setPreferredSize(new Dimension(0, 50));

        b1 = new Button("CE");
        b2 = new Button("C");
        b3 = new Button("%");
        b4 = new Button("<--");
        b5 = new Button("1/x");
        b6 = new Button("x*");
        b7 = new Button("√");
        b8 = new Button("÷");
        b9 = new Button("7");
        b10 = new Button("8");
        b11 = new Button("9");
        b12 = new Button("x");
        b13 = new Button("4");
        b14 = new Button("5");
        b15 = new Button("6");
        b16 = new Button("-");
        b17 = new Button("1");
        b18 = new Button("2");
        b19 = new Button("3");
        b20 = new Button("+");
        b21 = new Button("+/-");
        b22 = new Button("0");
        b23 = new Button(".");
        b24 = new Button("=");

        Font font1 = new Font("Cambria Math", Font.BOLD, 20);
        Font font2 = new Font("Cambria Math", Font.PLAIN, 20);

        b1.setFont(font2);
        b1.setForeground(Color.gray);
        b1.setBackground(Color.white);

        b2.setFont(font2);
        b2.setForeground(Color.gray);
        b2.setBackground(Color.white);

        b3.setFont(font2);
        b3.setForeground(Color.gray);
        b3.setBackground(Color.white);

        b4.setFont(font2);
        b4.setForeground(Color.gray);
        b4.setBackground(Color.white);

        b5.setFont(font1);
        b5.setBackground(Color.white);
        b5.setForeground(Color.gray);

        b6.setFont(font1);
        b6.setBackground(Color.white);
        b6.setForeground(Color.gray);

        b7.setFont(font1);
        b7.setBackground(Color.white);
        b7.setForeground(Color.gray);

        b8.setFont(font2);
        b8.setForeground(Color.gray);
        b8.setBackground(Color.white);

        b9.setFont(font1);
        b9.setForeground(Color.BLACK);
        b9.setBackground(Color.ORANGE);
        b9.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b10.setFont(font1);
        b10.setForeground(Color.BLACK);
        b10.setBackground(Color.ORANGE);
        b10.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b11.setFont(font1);
        b11.setForeground(Color.BLACK);
        b11.setBackground(Color.ORANGE);
        b11.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b12.setFont(font2);
        b12.setForeground(Color.gray);
        b12.setBackground(Color.white);

        b13.setFont(font1);
        b13.setForeground(Color.BLACK);
        b13.setBackground(Color.ORANGE);
        b13.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b14.setFont(font1);
        b14.setForeground(Color.BLACK);
        b14.setBackground(Color.ORANGE);
        b14.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b15.setFont(font1);
        b15.setForeground(Color.BLACK);
        b15.setBackground(Color.ORANGE);
        b15.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b16.setFont(font2);
        b16.setForeground(Color.gray);
        b16.setBackground(Color.white);

        b17.setFont(font2);
        b17.setForeground(Color.BLACK);
        b17.setBackground(Color.ORANGE);
        b17.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b18.setFont(font1);
        b18.setForeground(Color.BLACK);
        b18.setBackground(Color.ORANGE);
        b18.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b19.setFont(font2);
        b19.setForeground(Color.BLACK);
        b19.setBackground(Color.ORANGE);
        b19.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b20.setFont(font2);
        b20.setForeground(Color.gray);
        b20.setBackground(Color.white);

        b21.setBackground(Color.white);
        b21.setFont(font2);
        b21.setForeground(Color.gray);

        b22.setFont(font2);
        b22.setForeground(Color.BLACK);
        b22.setBackground(Color.ORANGE);
        b22.setCursor(new Cursor(Cursor.HAND_CURSOR));

        b23.setBackground(Color.white);
        b23.setFont(font2);
        b23.setForeground(Color.gray);

        b24.setBackground(Color.white);
        b24.setFont(font2);
        b24.setForeground(Color.gray);

        Panel p2 = new Panel();

        GridLayout g1 = new GridLayout(6, 2, 2, 4);

        p2.setLayout(g1);
        p2.setBackground(Color.black);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);

        frame1.add(p1, BorderLayout.NORTH);
        frame1.add(p2, BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        m2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        frame1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object o = e.getSource();
        

        if (e.getSource() == mi4) {

            b1.setForeground(Color.WHITE);
            b1.setBackground(Color.BLACK);

            b2.setForeground(Color.WHITE);
            b2.setBackground(Color.BLACK);

            b3.setForeground(Color.WHITE);
            b3.setBackground(Color.BLACK);

            b4.setForeground(Color.WHITE);
            b4.setBackground(Color.BLACK);

            b5.setForeground(Color.WHITE);
            b5.setBackground(Color.BLACK);

            b6.setForeground(Color.WHITE);
            b6.setBackground(Color.BLACK);

            b7.setForeground(Color.WHITE);
            b7.setBackground(Color.BLACK);

            b8.setForeground(Color.WHITE);
            b8.setBackground(Color.BLACK);

            b9.setForeground(Color.BLACK);
            b9.setBackground(Color.ORANGE);

            b10.setForeground(Color.BLACK);
            b10.setBackground(Color.ORANGE);

            b11.setForeground(Color.BLACK);
            b11.setBackground(Color.ORANGE);

            b12.setForeground(Color.WHITE);
            b12.setBackground(Color.BLACK);

            b13.setForeground(Color.BLACK);
            b13.setBackground(Color.ORANGE);

            b14.setForeground(Color.BLACK);
            b14.setBackground(Color.ORANGE);

            b15.setForeground(Color.BLACK);
            b15.setBackground(Color.ORANGE);

            b16.setForeground(Color.WHITE);
            b16.setBackground(Color.BLACK);

            b17.setForeground(Color.BLACK);
            b17.setBackground(Color.ORANGE);

            b18.setForeground(Color.BLACK);
            b18.setBackground(Color.ORANGE);

            b19.setForeground(Color.BLACK);
            b19.setBackground(Color.ORANGE);

            b20.setForeground(Color.WHITE);
            b20.setBackground(Color.BLACK);

            b21.setForeground(Color.WHITE);
            b21.setBackground(Color.BLACK);

            b22.setForeground(Color.BLACK);
            b22.setBackground(Color.ORANGE);

            b23.setForeground(Color.WHITE);
            b23.setBackground(Color.BLACK);

            b24.setForeground(Color.WHITE);
            b24.setBackground(Color.BLACK);

        } else if (e.getSource() == mi3) {

            b1.setForeground(Color.GRAY);
            b1.setBackground(Color.WHITE);

            b2.setForeground(Color.GRAY);
            b2.setBackground(Color.WHITE);

            b3.setForeground(Color.GRAY);
            b3.setBackground(Color.WHITE);

            b4.setForeground(Color.GRAY);
            b4.setBackground(Color.WHITE);

            b5.setForeground(Color.GRAY);
            b5.setBackground(Color.WHITE);

            b6.setForeground(Color.GRAY);
            b6.setBackground(Color.WHITE);

            b7.setForeground(Color.GRAY);
            b7.setBackground(Color.WHITE);

            b8.setForeground(Color.GRAY);
            b8.setBackground(Color.WHITE);

            b12.setForeground(Color.GRAY);
            b12.setBackground(Color.WHITE);

            b16.setForeground(Color.GRAY);
            b16.setBackground(Color.WHITE);

            b20.setForeground(Color.GRAY);
            b20.setBackground(Color.WHITE);

            b21.setForeground(Color.GRAY);
            b21.setBackground(Color.WHITE);

            b23.setForeground(Color.GRAY);
            b23.setBackground(Color.WHITE);

            b24.setForeground(Color.GRAY);
            b24.setBackground(Color.WHITE);
        }

        if (o.equals(b22)) {
            tf.setText(tf.getText() + b22.getLabel());
        } else if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) {
            tf.setText(tf.getText() + b19.getLabel());
        } else if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());

        } else if (o.equals(b20)) {

            fv = tf.getText();
            tf.setText("");

            op = b20.getLabel();

        } else if (o.equals(b16)) {

            fv = tf.getText();
            tf.setText("");

            op = b16.getLabel();
        } else if (o.equals(b12)) {

            fv = tf.getText();
            tf.setText("");

            op = b12.getLabel();

        } else if (o.equals(b7)) {

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            bb = Math.sqrt(fdv);
            tf.setText(bb + "");

            op = b7.getLabel();

        } else if (o.equals(b6)) {

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            bb = fdv * fdv;
            tf.setText(bb + "");

            op = b6.getLabel();

        } else if (o.equals(b5)) {

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            bb = 1 / fdv;
            tf.setText(bb + "");

            op = b5.getLabel();

        } else if (o.equals(b3)) {

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            bb = fdv / 100;
            tf.setText(bb + "");

            op = b3.getLabel();

        } else if (o.equals(b4)) {

            tv = tf.getText();

            String str = tv;
            String strNew = str.substring(0, str.length() - 1);
            tf.setText(strNew);

            op = b4.getLabel();

        } else if (o.equals(b2)) {

            tot = 0;
            fdv = 0;
            sdv = 0;

            tf.setText("");

            op = b2.getLabel();

        } else if (o.equals(b1)) {

            tot = sdv;
            tf.setText(tot + "");
            op = b1.getLabel();

        } else if (o.equals(b21)) {

            String value = tf.getText();
            if (!value.contains("-")) {

                tf.setText('-' + value);

            } else {

                try {

                    tf.setText(value.split("-")[1]);
                } catch (IndexOutOfBoundsException c) {

                    tf.setText("");

                }

            }

        } else if (o.equals(b23)) {

            fvd = tf.getText();
            tf.setText(fvd + ".");

            op = b23.getLabel();

        } else if (o.equals(b8)) {

            fv = tf.getText();
            tf.setText("");
            op = b8.getLabel();

        } else if (o.equals(b24)) {

            sv = tf.getText();
            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("-")) {

                tot = fdv - sdv;
                tf.setText(tot + "");

            } else if (op.equals("+")) {

                tot = fdv + sdv;
                tf.setText(tot + "");

            } else if (op.equals("x")) {
                tot = fdv * sdv;
                tf.setText(tot + "");

            } else if (op.equals("÷")) {
                tot = fdv / sdv;
                tf.setText(tot + "");

            } else if (op.equals("C")) {

                tf.setText(0 + "");

            }

        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

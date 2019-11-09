import java.awt.*;
import java.awt.event.*;

public class GuiSqure implements ActionListener{
    Frame f1,f2;
    Label lin,lout;
    Button b;
    TextField tf;
    public GuiSqure(){
        f1 = new Frame();
        f2 = new Frame();
        lin = new Label("enter a number:");
        tf = new TextField();
        b = new Button("squre");
        lout = new Label();
        f1.add(lin);f1.add(tf);
        f2.add(b);f2.add(lout);
        b.addActionListener(this);
        f1.setVisible(true);
        f2.setVisible(true);
        f1.setLayout(new GridLayout(1,2));
        f2.setLayout(new GridLayout(1,2));
        f1.setSize(300,100);
        f2.setSize(300,100);
    }

    public void actionPerformed(ActionEvent ae){
        int n = Integer.parseInt(tf.getText());
        lout.setText(Integer.toString(n*n));
    }

    public static void main(String[] args) throws Exception {
        GuiSqure obj = new GuiSqure();
    }
}
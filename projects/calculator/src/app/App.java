package app;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.script.*;
public class App implements ActionListener {
    int height = 380;
    int width = 260;
    int dis_height = 50;
    int b_size = Math.floorDiv(width, 4);
    String exp = "";
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    JFrame f = new JFrame();
    JTextField dis = new JTextField("0");
    JButton b1 = new JButton("1");JButton b2 = new JButton("2");JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");JButton b5 = new JButton("5");JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");JButton b8 = new JButton("8");JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");JButton div = new JButton("/");JButton mul = new JButton("*");
    JButton sub = new JButton("-");JButton add = new JButton("+");JButton eq = new JButton("=");JButton clr = new JButton("clr");
    JButton pm = new JButton("+/-");JButton dot = new JButton(".");
    JButton[] num_buttons = {b7,b4,b1,
                             b8,b5,b2,
                             b9,b6,b3};
    JButton[] op_buttons = {div,mul,sub,add};
    Font font = new Font(Font.SERIF,Font.BOLD,20);
    public App(){
        dis.setBounds(0,0,width,dis_height);
        dis.setHorizontalAlignment(SwingConstants.RIGHT);
        dis.setFont(font);
        eq.setBounds(0,dis_height,b_size*2,b_size/2);clr.setBounds(b_size*2,dis_height,b_size*2,b_size/2);
        int k = 0;
        for(int i=0;i<width-b_size;i+=b_size){
            for(int j=dis_height+(b_size/2);j<b_size*4;j+=b_size){
                num_buttons[k].setBounds(i,j,b_size,b_size);
                k+=1;
            }
        }
        int n = 0;
        for(int i=dis_height+(b_size/2);i<b_size*4;i+=b_size){
            op_buttons[n].setBounds(width-b_size,i,b_size,b_size);
            n+=1;
        }
        add.setBounds(width-b_size*2,dis_height+(b_size*4-(b_size/2)),b_size*2,b_size);
        dot.setBounds(0,dis_height+(b_size*4-(b_size/2)),b_size,b_size);
        b0.setBounds(b_size,dis_height+(b_size*4-(b_size/2)),b_size,b_size);
        f.add(dis);
        f.add(eq);f.add(clr);
        f.add(b1);f.add(b2);f.add(b3);
        f.add(b4);f.add(b5);f.add(b6);
        f.add(b7);f.add(b8);f.add(b9);
        f.add(div);f.add(mul);f.add(sub);f.add(add);
        f.add(pm);f.add(b0);f.add(dot);
        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
        b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
        b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
        b0.addActionListener(this);div.addActionListener(this);mul.addActionListener(this);
        sub.addActionListener(this);add.addActionListener(this);pm.addActionListener(this);
        dot.addActionListener(this);eq.addActionListener(this);clr.addActionListener(this);
        f.setSize(width,height);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Calculator");
    }
    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        String str = dis.getText();
        if(s.equals("=")){
            exp = dis.getText();
            try{
                Object res = se.eval(exp);
                dis.setText(res.toString());
            }
            catch(ScriptException e){
                dis.setText("error");
            }
        }
        else if(s.equals("clr")){
            dis.setText("0");
        }
        else{
            if(str.equals("0")){
                str = "";
            }
            exp = str+s;
            dis.setText(exp);   
        }
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
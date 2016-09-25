package Window; /**
 * Created by HKLLC on 2016/9/20.
 */
import java.util.*;import java.applet.*;import java.awt.*;
import javax.swing.*;import java.awt.event.*; import java.lang.String;

public class panel extends Applet implements ActionListener{
    JButton btn;
    Container con;
    public MyWindow win;
    JPanel panel1;
    PanelDemo panel2;
    PanelDemo panel3;
    JTextField txt1;
    JTextField txt2;
    JLabel lab1;
    JLabel lab2;
    JLabel cover;
    public boolean ready = false;
    public String[] name = new String[2];
    String player1;
    String player2;

    public void create(){
        win = new MyWindow("Name Battle", 600, 500);
        con = win.getContentPane();
        con.setBackground(Color.WHITE);
        con.setLayout(new FlowLayout());

        panel1 = new JPanel();
        cover = new JLabel("Name Battle");
        cover.setFont(new Font("italic", Font.BOLD, 40));
        panel1.add(cover);

        txt1 = new JTextField("Name of the 1st player",50);
        txt2 = new JTextField("Name of the 2nd player",50);


        /*panel2 = new PanelDemo(txt1,lab1, "Player1", "Player 1:");
        panel3 = new PanelDemo(txt2,lab2, "Player2", "Player 2:");
        panel2.setBackground(Color.RED);
        panel3.setBackground(Color.YELLOW);
        */

        btn = new JButton("Fight!!!");
        btn.setFont(new Font("italic", Font.BOLD, 20));
        btn.addActionListener(this);
        panel1.setBounds(50,0,50,100);
        /*panel2.setBounds(50,50,50,100);
        panel3.setBounds(50,250,50,100);
        */

        con.add(panel1);
        con.add(txt1);
        con.add(txt2);
        con.add(btn);
        win.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==txt1) txt1.setText("");
        if(e.getSource()==txt2) txt2.setText("");

        if(e.getSource()==btn){
            name[0]=txt1.getText();
            name[1]=txt2.getText();

            if (name[0]!=null && name[1]!=null) {
//                JOptionPane.showMessageDialog(null, name[0],name[1], JOptionPane.WARNING_MESSAGE);
                Ready();
            }
        }
    }

    public void Ready(){
        ready = true;
    }
}

class PanelDemo extends JPanel{
    PanelDemo(JTextField txt, JLabel lab, String s1, String s2){
        txt = new JTextField("",40);
        lab = new JLabel(s2);
        add(lab);add(txt);
    }
}

class MyWindow extends JFrame{
    public MyWindow(String name, int w, int h){
        setTitle(name);
        setSize(w, h);
    }
}
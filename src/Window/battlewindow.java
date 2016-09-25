package Window; /**
 * Created by HKLLC on 2016/9/20.
 */

import java.awt.*;
import javax.swing.*;

public class battlewindow extends JFrame {
    JPanel panel1;
    JLabel cover;
    JMenuBar jb;
    public JTextArea ja;
    JScrollPane jsp;
    String info = null;

    public void setImage() {
        jb = new JMenuBar();
        this.setJMenuBar(jb);
        ja = new JTextArea();
        jsp = new JScrollPane(ja);
//        panel1 = new JPanel();
//        cover = new JLabel("Name Battle");
//        cover.setFont(new Font("italic", Font.BOLD, 40));
//        panel1.add(cover);
        this.setSize(600, 500);
        this.setLayout(new BorderLayout());
//        this.add(panel1);
        this.add(jsp);
        this.setVisible(true);
    }

    public void inputM(String s){
        if (info == null) info=s;
        else info = info + "\n" + s;

        ja.setText(info);
    }


    public static void main(String[] args) {
        battlewindow a = new battlewindow();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setImage();

    }

}



import java.util.*;import java.applet.*;import java.awt.*;
import javax.swing.*;import java.awt.event.*;

public class test extends Applet implements ActionListener{
    JTextArea textA;JTextField textF;JButton b1,b2;
    public void init(){
        setSize(250,150);
        textA=new JTextArea("",5,10);
        textA.setBackground(Color.cyan);
        textF=new JTextField("",10);
        textF.setBackground(Color.pink);
        b1=new JButton("求 和"); b2=new JButton("重新开始");
        textF.setEditable(false);
        b1.addActionListener(this); b2.addActionListener(this);
        add(textA); add(textF); add(b1);add(b2);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            String s=textA.getText();
            StringTokenizer tokens=new StringTokenizer(s);
            //使用默认的分隔符集合：空格、换行、Tab符合回车作分隔符
            int n=tokens.countTokens(),sum=0,i;
            for(i=0;i<=n-1;i++){
                String temp=tokens.nextToken();//从文本区取下一个数据
                sum+=Integer.parseInt(temp);
            }
            textF.setText(""+sum);
        }
        else if(e.getSource()==b2){
            textA.setText(null);
            textF.setText(null);
        }
    }

    public static void main(String []args){
        test t = new test();
        t.init();
    }
}

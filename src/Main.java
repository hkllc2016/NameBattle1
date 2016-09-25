import java.awt.event.ActionEvent;
import java.util.*;
import Window.*;
import javax.swing.*;
import java.awt.Window;
import java.util.*;import java.applet.*;import java.awt.*;
import javax.swing.*;import java.awt.event.*; import java.lang.String;
/**
 * Created by HKLLC on 2016/9/20.
 */
public class Main {
    static panel window = new panel();
    static battlewindow battle = new battlewindow();

    public static void main (String[] args) {

        window.create();

        while(window.ready == false){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        if(window.ready) {
            Battle myB = new Battle();
            Player player1 = new Player(window.name[0]);
            Player player2 = new Player(window.name[1]);



            battle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            window.win.setVisible(false);
            battle.setImage();
            battle.inputM("\n ---------- " + player1.name + " vs " + player2.name + " ----------\n");


//            System.out.println("The name of the 1st player:");
//            Scanner scanner = new Scanner(System.in);
//            player1.name = scanner.nextLine();
//            player1.print();
//            System.out.println("The name of the 2nd player:");
//            scanner = new Scanner(System.in);
//            player2.name = scanner.nextLine();
//            player2.print();

//            System.out.println("\n ---------- " + player1.name + " vs " + player2.name + " ----------\n");

            int rand = new Random().nextInt(2);
            if (rand == 0) {
                battle.inputM(player1.name + " acts more quickly to attack first.\n");
                myB.battle(player1, player2, myB.s, battle);
            } else {
                battle.inputM(player2.name + " has a better face to attack first.\n");
                myB.battle(player2, player1, myB.s, battle);
            }
        }

    }



}

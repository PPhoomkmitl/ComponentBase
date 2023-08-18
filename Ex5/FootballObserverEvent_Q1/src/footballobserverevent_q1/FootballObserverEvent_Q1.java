/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballobserverevent_q1;

import java.util.Scanner;

/**
 *
 * @author Phoom1645
 */

//64050191 phoomrapee srifah
public class FootballObserverEvent_Q1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        Subscriber subscriber_1  = new Subscriber();
        Subscriber subscriber_2  = new Subscriber();
        source.Register(subscriber_1);
        source.Register(subscriber_2);
        //source.UnRegister(subscriber_2); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score : ");
        String txt =  sc.nextLine();
        source.setScoreLine(txt);
        System.out.print("Enter Score : ");
        txt =  sc.nextLine();
        source.setScoreLine(txt);
        sc.close();    
    }   
}

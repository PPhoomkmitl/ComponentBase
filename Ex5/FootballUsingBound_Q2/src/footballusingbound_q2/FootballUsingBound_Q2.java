/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballusingbound_q2;

import java.util.Scanner;

/**
 *
 * @author Phoom1645
 */
public class FootballUsingBound_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBeans liveScore = new LiveScoreBeans();
        Subscriber subscriber_1 = new Subscriber();
        Subscriber subscriber_2 = new Subscriber();
        liveScore.addPropertyChangeListener(subscriber_1);
        liveScore.addPropertyChangeListener(subscriber_2);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score : ");
            String txt =  sc.nextLine();
            if(txt.equals("")){
                System.out.print("Program Ended");
                break;
            }
            liveScore.setScoreLine(txt);   
        }
    }  
}

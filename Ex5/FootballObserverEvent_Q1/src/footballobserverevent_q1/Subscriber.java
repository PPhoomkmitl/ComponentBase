/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverevent_q1;

/**
 *
 * @author Phoom1645
 */
public class Subscriber implements ScoreListener {

    @Override
    public void scoreChange(ScoreEvent evt) {
        System.out.println("(subscriber) ScoreEvent is updated to " + evt.getSomeData());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverevent_q1;

import java.util.ArrayList;

/**
 *
 * @author Phoom1645
 */
public class ScoreSource {
    ArrayList<ScoreListener> observers;
    public ScoreSource() {
        observers = new ArrayList<>();
    }
    
    public void Register(ScoreListener obj) {
        observers.add(obj);
    }
    public void UnRegister(ScoreListener obj) {
        observers.remove(obj);
    }
    public void setScoreLine(String val){
        fireScoreEvent(new ScoreEvent(this , val));
    }
    public void fireScoreEvent(ScoreEvent evt){
        for(ScoreListener observer : observers){
            observer.scoreChange(evt);
        }
    }

  
}

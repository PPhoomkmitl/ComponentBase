/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserverevent_q1;

import java.util.EventObject;

/**
 *
 * @author Phoom1645
 */
public class ScoreEvent extends EventObject{
    
    private String someData;
    public String getSomeData() {
        return someData;
    }
    public ScoreEvent(Object source , String val) {
        super(source);
        someData = val;
        
    }
    
}

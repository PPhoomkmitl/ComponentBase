/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package footballobserverevent_q1;

import java.util.EventListener;

/**
 *
 * @author Phoom1645
 */
public interface ScoreListener  extends EventListener{
    public void scoreChange(ScoreEvent evt);
}

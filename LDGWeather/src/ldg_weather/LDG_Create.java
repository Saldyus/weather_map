/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldg_weather;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import ldg_graphic.Initial_Page;

/**
 *
 * @author salva
 */
public class LDG_Create {
    public static void main(String []args){
        Initial_Page f = new Initial_Page("LDG_Weather");
        f.setSize(265, 379);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

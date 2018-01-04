/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldg_weather;

import javax.swing.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.awt.*;

/**
 *
 * @author salva
 */
public class prova {

    JFrame frame = new JFrame("");
    AutoCompleteDecorator decorator;
    JComboBox combobox;

    public prova() {
        combobox = new JComboBox(new Object[]{"", "Ester", "Jordi",
            "Jordina", "Jorge", "Sergi"});
        AutoCompleteDecorator.decorate(combobox);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(combobox);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        prova p = new prova();
    }

}

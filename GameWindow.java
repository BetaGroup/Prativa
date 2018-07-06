/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class GameWindow {
    
    
    public static void main(String[] args) throws IOException {
        JFrame window = new JFrame("Shooter game"); //title
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //click on x it will close
        
        HighScoreManager hm = new HighScoreManager();
        hm.addScoreBoard("Prativa", 1200); //Passing (name, score) value to program now
        System.out.print(hm.getHighScoreString()); //Displaying just for test purpose
        
        // this in a way, starts our game. so you can build a menue before
        //this code and after a user selects (start game) we can get into the game loop
        window.setContentPane(new GameLooper());
        
        window.pack(); //set window size
        window.setVisible(true); // we can see the window
    
    }
}

  

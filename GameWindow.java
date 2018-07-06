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

public class GameWindow implements ActionListener {

    GameWindow() throws IOException {
        JFrame window = new JFrame("Shooter Game"); //title
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //click on x it will close
        window.setSize(820, 820);
        
        //Sample Menu
        JMenuBar jmb = new JMenuBar();

        JMenu jmGame = new JMenu("Game Choices");
        JMenuItem jmiNew = new JMenuItem("New Game");
        JMenuItem jmiSave = new JMenuItem("Save Game");
        JMenuItem jmiExit = new JMenuItem("Exit");
        jmGame.add(jmiNew);
        jmGame.add(jmiSave);
        jmGame.addSeparator();
        jmGame.add(jmiExit);
        jmb.add(jmGame);

        JMenu jmScore = new JMenu("Score");
        JMenuItem displayScore = new JMenuItem("Display Score");
        JMenuItem displayWinner = new JMenuItem("Display Winner");
        jmScore.add(displayScore);
        jmScore.add(displayWinner);

        jmb.add(jmScore);

        JMenu jmHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("About");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        jmiNew.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        displayScore.addActionListener(this);
        displayWinner.addActionListener(this);
        jmiAbout.addActionListener(this);

        window.setJMenuBar(jmb);
        window.setVisible(true);

        HighScoreManager hm = new HighScoreManager();
        hm.addScoreBoard("SK", 1150); //Passing (name, score) value to program now
        System.out.print(hm.getHighScoreString()); //Displaying just for test purpose
    }

    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        System.out.println(comStr + " Selected");

        if (comStr == "New Game") { //Open Shooter Game when "New Game" is clicked
            JFrame openWindow = new JFrame("Shooter Game"); //title
            openWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //click on x it will close
            openWindow.setSize(800, 800);
            // this in a way, starts our game. so you can build a menue before
            //this code and after a user selects (start game) we can get into the game loop
            openWindow.setContentPane(new GameLooper());

            openWindow.pack(); //set window size
            openWindow.setVisible(true); // we can see the window
        } else if (comStr == "Exit") { //Exit progam when "Exit" is clicked
            System.exit(0);
        } else if (comStr == "Display Score") {//TO DO: Display Score Window when "Display Score" gets clicked

        }
        //TO DO: More menu funcationality
    }

    public static void main(String[] args) throws IOException {
        new GameWindow();
        //TO DO: Need to open game window as a child of main window with menu items
    }
}

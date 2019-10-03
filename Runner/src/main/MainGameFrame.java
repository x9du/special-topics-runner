package main;

import javax.swing.*;
/**
 * 
 * @author Yalchin ALIYEV
 * @version 1.0 26.03.2016
 *
 */
public class MainGameFrame extends JFrame { // JFrame = window

	private JPanel runnerGamePanel;
	
	public MainGameFrame() {
		runnerGamePanel = new RunnerGamePanel();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // default is to hide JFrame
		setTitle("Runner Game v_1.4");
		setLocation(500, 200); // of top left corner
		add(runnerGamePanel); // adding a child component to the JFrame
		pack(); // window is sized to fit the preferred size and layout of its components
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainGameFrame();
	}

}

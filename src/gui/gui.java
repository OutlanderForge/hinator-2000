package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.File;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
public class gui extends Application implements ActionListener {

	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JButton button;
	private JPanel panel;

	public gui() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("hi");
		label = new JLabel("number of hi's: 0");
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("cool");
		frame.pack();
		frame.setVisible(true);
		
		button.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new gui();

	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		count++;
		label.setText("Number of hi's: " + count);
		String bip = "sounds/binfuwu.mp3";
		Media hit = new Media(new File(bip).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

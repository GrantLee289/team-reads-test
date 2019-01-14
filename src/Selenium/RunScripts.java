package Selenium;

import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RunScripts extends TryCatchTest implements ActionListener {
	JButton button;
	JFrame frame;
	JLabel label;
	
	public static void main (String[] args) {

		RunScripts gui = new RunScripts(); 
		gui.go();
	}
	
	public void go() {
		int red = 80;
		int green = 95;
		int blue = 130;
		
		JFrame frame = new JFrame("TeamReads Test Suite."); 
		button = new JButton("Run Test");
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(10, 20));
		
		graphicsWidget image = new graphicsWidget();
		
		label = new JLabel("<html><font color = 'white'>Team<font color='#228B22'>Reads</font></html>");
		label.setFont(new Font("Open Sans", Font.BOLD, 20));
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(label);
        panel.setBackground(new Color(red,green,blue));

        frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.getContentPane().add(BorderLayout.CENTER, image);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(red,green,blue));
	}

	public void actionPerformed(ActionEvent event) {
		run();
	}
	
	public void run() {
		getBaseUrlFirst();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TestAndRetry();
		driver.quit();
	}
	
}

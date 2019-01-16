package Selenium;

import java.awt.*;
import javax.swing.*;

public class graphicsWidget extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		Image image = new ImageIcon("/Users/Grant/eclipse-workspace/team-reads-test/src/Selenium/LogoWhiteFinal.png").getImage();
		g.drawImage(image,3,4,this);
	}
}

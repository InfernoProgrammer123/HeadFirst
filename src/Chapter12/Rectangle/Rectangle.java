package Chapter12.Rectangle;

import java.awt.*;
import javax.swing.*;

public class Rectangle extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
	}
	
}

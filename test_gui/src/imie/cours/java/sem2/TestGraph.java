package imie.cours.java.sem2;

import java.awt.*;
import javax.swing.*;


public class TestGraph {
	
	public static void main(String[] args) {
		
		JFrame wind = new JFrame("test disp forme");
		wind.setSize(500, 400);
		wind.setBackground(Color.black);
		PerPan back = new PerPan();
		wind.setContentPane(back);
		
		wind.setVisible(true);
		
	}

}

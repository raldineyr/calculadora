package br.com.raldineyr.calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel{
	
	private JLabel label = new JLabel();
	
	public Display() {
	setBackground(new Color(46,49,50));
	
	label = new JLabel("1234560.00");
	label.setForeground(Color.WHITE);
	label.setFont(new Font("Helvetica Neue UltraLight",Font.PLAIN,35));
	
	setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
	add(label);
	
	}	
}

package com.roocon.test3;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jb;
	
	public Main() {
		this.setBounds(200, 200, 400, 200);
		this.setTitle("lambda测试");
		
		jb = new JButton("click");
//		jb.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("clicked");
//				
//			}
//		});
		
		jb.addActionListener(Event -> System.out.println("Hello"));
		
		this.add(jb);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


}

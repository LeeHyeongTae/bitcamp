package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener{

	private static final long serialVersionUID = 2L;
	JPanel panel;
	JButton loginButton, cancelButton;
	JTextField[] textFields;
	JLabel[] labels;
	

	public void execute() {
		JFrame frame = new JFrame("Member Log-In");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		labels = new JLabel[2];
		textFields = new JTextField[2];
		String[] labelNames = {"ID", "PW"};
		for(int i=0; i<labels.length; i++) {
			labels[i]=new JLabel(labelNames[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
			}
		loginButton = new JButton("로그인");
		cancelButton = new JButton("취소");
		loginButton.addActionListener(this);
		cancelButton.addActionListener(this);
		panel.add(loginButton);
		panel.add(cancelButton);
		labels[0].setBounds(40,90,60,40);
		labels[1].setBounds(40,130,40,60);
		textFields[0].setBounds(120,90,200,30);
		textFields[1].setBounds(120,130,280,30);
		loginButton.setBounds(125, 330, 80, 30);
		cancelButton.setBounds(240, 330, 80, 30);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {//버튼이 내부적으로 이벤트를 가지고 있다.
		if(e.getSource() == loginButton) {
		
			JOptionPane.showMessageDialog(this,"로그인" );
		}else  if(e.getSource() == cancelButton){
			JOptionPane.showMessageDialog(this, "취소");
			return;
		}
		
	}
	
}
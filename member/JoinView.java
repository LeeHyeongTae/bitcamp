package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinView extends JFrame implements ActionListener{
	JPanel panel;
	JButton saveButton, cancelButton;
	JTextField[] fields;
	JTextField nameField, useridField, passwordField, ssnField, contentField;
	JLabel[] labels;
	JLabel nameLabel, useridLabel, passwordLabel, ssnLabel, contentLabel;
	
	private static final long serialVersionUID = 1L;

	public void execute() {
		JFrame frame = new JFrame("Member Sing-up");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		labels = new JLabel[5];
//			labels[0] = new JLabel("이름");
//			labels[1] = new JLabel("아이디");
//			labels[2] = new JLabel("패스워드");
//			labels[3] = new JLabel("주민번호");
//			labels[4] = new JLabel("추가사항");
		for(int i=0; i<5; i++) {
			String[] label = {"이름", "아이디", "패스워드", "주민번호", "추가사항"};
			labels[i] = new JLabel(label[i]);
			}
		panel.add(nameLabel);
		panel.add(useridLabel);
		panel.add(passwordLabel);
		panel.add(ssnLabel);
		panel.add(contentLabel);
		nameField = new JTextField();
		useridField = new JTextField();
		passwordField = new JTextField();
		ssnField = new JTextField();
		contentField = new JTextField();
		panel.add(nameField);
		panel.add(useridField);
		panel.add(passwordField);
		panel.add(ssnField);
		panel.add(contentField);
		saveButton = new JButton("저장");
		cancelButton = new JButton("취소");
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);
		panel.add(saveButton);
		panel.add(cancelButton);
		nameLabel.setBounds(40,10,40,40);
		useridLabel.setBounds(40,50,40,40);
		passwordLabel.setBounds(40,90,60,40);
		ssnLabel.setBounds(40,130,40,60);
		contentLabel.setBounds(40,170,60,40);
		nameField.setBounds(120,10,200,30);
		useridField.setBounds(120,50,200,30);
		passwordField.setBounds(120,90,200,30);
		ssnField.setBounds(120,130,280,30);
		contentField.setBounds(120,180,280,120);
		saveButton.setBounds(125, 330, 80, 30);
		cancelButton.setBounds(240, 330, 80, 30);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {//버튼이 내부적으로 이벤트를 가지고 있다.
		if(e.getSource() == saveButton) {
			JOptionPane.showMessageDialog(this, "클릭" );
		}else  if(e.getSource() == cancelButton){
			JOptionPane.showMessageDialog(this, "취소");
			return;
		}
		
	}
	
}

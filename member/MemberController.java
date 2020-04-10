package com.jse.member;
import java.awt.FlowLayout;

import javax.swing.*;

public class MemberController {
	public static void main(String[] args) {
	JFrame frame = new JFrame("회원 가입");
	frame.setSize(800,600);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	panel.setLayout(new FlowLayout());
	panel.setBounds(30, 30, 700, 500);
	JLabel nameLabel = new JLabel("이름");
	JLabel idLabel = new JLabel("ID");
	JLabel pwLabel = new JLabel("비밀번호");
	JLabel ageLabel = new JLabel("나이");
	nameLabel.setBounds(200, 50, 40, 40);
	idLabel.setBounds(200, 150, 40, 40);
	pwLabel.setBounds(200, 250, 60, 40);
	ageLabel.setBounds(200, 350, 40, 40);
	frame.add(nameLabel);
	frame.add(idLabel);
	frame.add(pwLabel);
	frame.add(ageLabel);
	JTextField nameTextField = new JTextField();
	JTextField idTextField = new JTextField();
	JTextField pwTextField = new JTextField();
	JTextField ageTextField = new JTextField();
	frame.add(nameTextField);
	frame.add(idTextField);
	frame.add(pwTextField);
	frame.add(ageTextField);
	nameTextField.setBounds(300, 50, 200, 30);
	idTextField.setBounds(300, 150, 200, 30);
	pwTextField.setBounds(300, 250, 200, 30);
	ageTextField.setBounds(300, 350, 200, 30);
	JButton saveButton = new JButton("저장");
	JButton cancelButton = new JButton("취소");
	saveButton.setBounds(200, 450, 80, 30);
	cancelButton.setBounds(400, 450, 80, 30);
	frame.add(saveButton);
	frame.add(cancelButton);
	frame.add(panel);
	frame.setVisible(true);
	}
}

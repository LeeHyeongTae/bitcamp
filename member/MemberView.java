package com.jse.member;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
    private Container container; 
    private JLabel title,nameLabel,useridLabel,passwordLabel,
    				ssnLabel,addrLabel; 
    private JTextField nameText, useridText, passwordText, ssnText,
    					addrText; 
    private JTextArea resultText; 
    private JButton submitButton, listButton, loginButton, detailButton, 
    				nameButton, genderButton, countButton, updateButton, deleteButton; 
    public MemberService memberService;
    public void open(){ 
        memberService = new MemberServiceImpl();
    	setTitle("Swing Form"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        useridLabel = new JLabel("Userid"); 
        useridLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        useridLabel.setSize(100, 20); 
        useridLabel.setLocation(100, 150); 
        container.add(useridLabel); 
  
        useridText = new JTextField(); 
        useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        useridText.setSize(150, 20); 
        useridText.setLocation(200, 150); 
        container.add(useridText); 
  
        passwordLabel = new JLabel("Password"); 
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        passwordLabel.setSize(100, 20); 
        passwordLabel.setLocation(100, 200); 
        container.add(passwordLabel); 
        
        passwordText = new JTextField(); 
        passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        passwordText.setSize(150, 20); 
        passwordText.setLocation(200, 200); 
        container.add(passwordText);
  
        ssnLabel = new JLabel("SSN"); 
        ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ssnLabel.setSize(100, 20); 
        ssnLabel.setLocation(100, 250); 
        container.add(ssnLabel); 
        
        ssnText = new JTextField(); 
        ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        ssnText.setSize(150, 20); 
        ssnText.setLocation(200, 250); 
        container.add(ssnText);
  
        addrLabel = new JLabel("Address"); 
        addrLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        addrLabel.setSize(100, 20); 
        addrLabel.setLocation(100, 300); 
        container.add(addrLabel); 
        
        addrText = new JTextField(); 
        addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        addrText.setSize(150, 20); 
        addrText.setLocation(200, 300); 
        container.add(addrText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(100, 450); 
        submitButton.addActionListener(this);
        container.add(submitButton); 
        
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(220, 450); 
        listButton.addActionListener(this);
        container.add(listButton); 
        
        loginButton = new JButton("Log-In"); 
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        loginButton.setSize(100, 20); 
        loginButton.setLocation(340, 450); 
        loginButton.addActionListener(this);
        container.add(loginButton);
        
        detailButton = new JButton("Detail"); 
        detailButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        detailButton.setSize(100, 20); 
        detailButton.setLocation(100, 470); 
        detailButton.addActionListener(this);
        container.add(detailButton); 
        
        countButton = new JButton("Count"); 
        countButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        countButton.setSize(100, 20); 
        countButton.setLocation(100, 490); 
        countButton.addActionListener(this);
        container.add(countButton);
        
        nameButton = new JButton("Name"); 
        nameButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        nameButton.setSize(100, 20); 
        nameButton.setLocation(220, 470); 
        nameButton.addActionListener(this);
        container.add(nameButton); 
        
        updateButton = new JButton("Update"); 
        updateButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        updateButton.setSize(100, 20); 
        updateButton.setLocation(220, 490); 
        updateButton.addActionListener(this);
        container.add(updateButton); 
         
        genderButton = new JButton("Gender"); 
        genderButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        genderButton.setSize(100, 20); 
        genderButton.setLocation(340, 470); 
        genderButton.addActionListener(this);
        container.add(genderButton); 
       
        deleteButton = new JButton("Delete"); 
        deleteButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        deleteButton.setSize(100, 20); 
        deleteButton.setLocation(340, 490); 
        deleteButton.addActionListener(this);
        container.add(deleteButton); 
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true); 
    } 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == submitButton) {
			JOptionPane.showMessageDialog(this, "test");
			nameText.setText("홍길동,홍길동,이순신,신사임당,이도");
			useridText.setText("hong,you,lee,shin,leedo");
			passwordText.setText("1,1,1,1,1");
			ssnText.setText("900101-1,960101-2,980101-1,011010-4,020606-3");
			addrText.setText("서울,서울,서울,부산,부산");
			String data = String.format("%s/%s/%s/%s/%s", 
					nameText.getText(),
					useridText.getText(),
					passwordText.getText(),
					ssnText.getText(),
					addrText.getText());
			String[] arr = data.split("/");
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwords = arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");
			Member member = null;
			for(int i=0;i< names.length; i++) {
				member = new Member(); 
				member.setName(names[i]);
				member.setUserid(userids[i]);
				member.setPasswd(passwords[i]);
				member.setSsn(ssns[i]);
				member.setAddr(addrs[i]);
				memberService.add(member);
			}
		}else if(e.getSource() == listButton) {
			Member[] members = memberService.list();
			String result = "";
			for(int i=0;i< members.length; i++) {
				result += (members[i]+"\n");
			}
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
			resultText.setText(result);
		}else if(e.getSource()==loginButton) {
			JOptionPane.showMessageDialog(this, "login");
			Member member = new Member();
			member.setUserid(useridText.getText());
			member.setPasswd(passwordText.getText());
				if(member.getPasswd().equals(memberService.login(member).getPasswd())){
					JOptionPane.showMessageDialog(this, "로그인 성공");
					useridText.setText("");
					passwordText.setText("");
					resultText.setText(memberService.login(member)
							+memberService.welcome(memberService.login(member).getName()));
					}else {
					JOptionPane.showMessageDialog(this, "로그인 실패");
			}		
	
		}else if(e.getSource()==detailButton) {	
			if(useridText.getText().equals(memberService.detail(useridText.getText()).getUserid())) {
				resultText.setText(memberService.detail(useridText.getText()).toString());				
			}else {
				resultText.setText("해당 아이디가 없습니다.");
			}
		}else if(e.getSource()==nameButton) {
			Member[] seachmembers = memberService.searchByName(nameText.getText());
			String searchResult = "";
			if(memberService.count(nameText.getText())!=0) {
				for(int i=0; i<seachmembers.length; i++) {
					searchResult += seachmembers[i]+"\n";
				}
				resultText.setText(searchResult);				
			}else {
				resultText.setText("");
				JOptionPane.showMessageDialog(this, "일치하는 이름이 없습니다.");
			}
			
			}else if(e.getSource()==genderButton){
				Member[] genderCheckedMember = 
						memberService.searchByGender(Integer.parseInt(ssnText.getText()));
				String checkResult = "";
				if(memberService.count(Integer.parseInt(ssnText.getText()))!=0) {
					for(int i=0; i<genderCheckedMember.length; i++) {
						checkResult += genderCheckedMember[i]+"\n";
					}
					checkResult += 
							"주민번호뒷자리가 ("+ssnText+")인 사람의 수: "
							+memberService.count(Integer.parseInt(ssnText.getText()));
					resultText.setText(checkResult);
				}else {
					JOptionPane.showMessageDialog(this, "일치하는 성별이 없습니다.");
				}
			}else if(e.getSource()==countButton){
				String result = "회원수:"+memberService.count();
				resultText.setText(result);
				
			}else if(e.getSource()==updateButton){
				Member updatemember = new Member();
				updatemember.setName(nameText.getText());
				updatemember.setUserid(useridText.getText());
				updatemember.setPasswd(passwordText.getText());
				memberService.update(updatemember);
				String updatedmembers = "";
				for(int i=0; i<memberService.count(); i++) {
					updatedmembers += memberService.list()[i]+"\n";
				}
				updatedmembers += "\n 현재 멤버 수:"+memberService.count();
				resultText.setText(updatedmembers);
			}else if(e.getSource()==deleteButton){
				Member deletemember = new Member();
				deletemember.setUserid(useridText.getText());
				deletemember.setPasswd(passwordText.getText());
				memberService.delete(deletemember);
				String deletedmembers = "";
				for(int i=0; i<memberService.count(); i++) {
					deletedmembers += memberService.list()[i]+"\n";
				}
				deletedmembers += "\n 현재 멤버 수:"+memberService.count();
				resultText.setText(deletedmembers);
			}
		}
	}
	
	


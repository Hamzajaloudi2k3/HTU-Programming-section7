package eventdriven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main  {

	public static void main(String[] args) {
			String name =JOptionPane.showInputDialog("enter your name");
			String age = JOptionPane.showInputDialog("enter your age");
			JOptionPane.showMessageDialog(null, "hello " + name +" enter your account");
		
			JFrame frame= new JFrame(" Account");
			frame.setSize(300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new FlowLayout());
			frame.setLocationRelativeTo(null);
			
			JLabel emailLabel= new JLabel("Email");
			JTextField emailField=new JTextField(25);
			
			JLabel passLabel= new JLabel("Password");
			JPasswordField passField= new JPasswordField(25);
			
			JButton logbtn= new JButton("sign in");
			logbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					String email= emailField.getText();
					String pass=  new String(passField.getPassword());
					if(email.equalsIgnoreCase("hamzajaloudi88@gmail.com")&&pass.equals("Hamza123")) {
						JOptionPane.showMessageDialog(null, "welcom Hamza ALjaloudi");
					}else {
						JOptionPane.showMessageDialog(null, "Invaled try agian");
					}
	
					
				}
			});
			
		
			frame.add(emailLabel);
			frame.add(emailField);
			frame.add(passLabel);
			frame.add(passField);
			frame.add(logbtn);
			frame.setVisible(true);

			
			
		}
	
		}

	



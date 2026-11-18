
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Cristhoper Website!");
		frame.setLayout(null);
		frame.setBounds(150, 130, 800, 500);
		
		Color c0 = Color.WHITE;
		Color c3 = Color.BLACK;
		Color c4 = new Color(255, 100, 0);   // RGB: red, green, blue (0-255 each)
		Color c5 = new Color(255, 0, 0, 128); // RGBA: last value is transparency (0-255)

		JLabel label = new JLabel();
		label.setText("Welcome, sir/madam! I am a Website Developer.");
		label.setBounds(200, 10, 300, 100);
		label.setForeground(c3);
		
		
		JLabel label1 = new JLabel();
		label1.setText("If you have concerned about your website just be with me!");
		label1.setBounds(170, 30, 350, 100);
		label1.setForeground(c3);
		
		JLabel label2 = new JLabel();
		label2.setText("REGISTER ACCOUNT!");
		label2.setBounds(250, 70, 200, 100);
		label2.setForeground(c3);
		
		JLabel label3 = new JLabel();
		label3.setText("Username:");
		label3.setBounds(170, 125, 80, 60);
		label3.setForeground(c3);
		
		JTextField txtBox = new JTextField();
		txtBox.setBounds(250, 140, 250, 30);
		txtBox.setForeground(c3);
		
		
		JLabel label4 = new JLabel();
		label4.setText("Password:");
		label4.setBounds(170, 170, 80, 60);
		label4.setForeground(c3);
		
		JTextField txtBox1 = new JTextField();
		txtBox1.setBounds(250, 185, 250, 30);
		txtBox1.setForeground(c3);
		
		
		JButton loginButton = new JButton();
		loginButton.setText("Register");
		loginButton.setBounds(250, 235, 130, 30);
		loginButton.setForeground(c3);
		
		
		JButton cancelButton = new JButton();
		cancelButton.setText("Cancel");
		cancelButton.setBounds(170, 235, 75, 30);
		cancelButton.setForeground(c3);
		
		JButton forgotButton = new JButton();
		forgotButton.setText("Forgot Password");
		forgotButton.setBounds(385, 235, 135, 30);
		forgotButton.setForeground(c3);
		
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int register = JOptionPane.showConfirmDialog(frame, "Create Account? " + txtBox.getText() + " and " + txtBox1.getText() + "!", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (register == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(frame, "Account Created! " + txtBox.getText() + " and " + txtBox1.getText() + "!", "Successful", JOptionPane.INFORMATION_MESSAGE);
				} else if (register == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(frame, "Account Not Created! " + txtBox.getText() + " and " + txtBox1.getText() + "!", "Cancelled", JOptionPane.WARNING_MESSAGE);
				} else if (register == JOptionPane.CLOSED_OPTION) {
					JOptionPane.showMessageDialog(frame, "Opps! you have closed it!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Something went wrong! about these " + txtBox.getText() + " and " + txtBox1.getText() + "!", "Account Denied", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		forgotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame newFrame = new JFrame("Change Password");
				newFrame.setLayout(null);
				newFrame.setBounds(150, 200, 500, 300);
				
				Color c01 = Color.WHITE;
				Color c02 = Color.BLACK;
				
				JLabel newLabel = new JLabel();
				newLabel.setText("Please, Create your new password!");
				newLabel.setBounds(150, 10, 300, 50);
				newLabel.setForeground(c02);
				
				JLabel newLabel1 = new JLabel();
				newLabel1.setText("New Password:");
				newLabel1.setBounds(100, 60, 135, 50);
				newLabel1.setForeground(c02);
				
				JTextField newTxtBox = new JTextField();
				newTxtBox.setBounds(200, 70, 175, 30);
				newTxtBox.setForeground(c02);
				
				JButton newCancelButton = new JButton();
				newCancelButton.setText("Cancel");
				newCancelButton.setBounds(100, 125, 75, 30);
				newCancelButton.setForeground(c02);
				
				JButton newChangeButton = new JButton();
				newChangeButton.setText("Change");
				newChangeButton.setBounds(200, 125, 100, 30);
				newChangeButton.setForeground(c02);
				
				newChangeButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame, "Password was changed into " + newTxtBox.getText() + ".", "Success", JOptionPane.INFORMATION_MESSAGE);
					}
				});
				
				newCancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame, "Cancelled!", "Something went wrong!", JOptionPane.WARNING_MESSAGE);
					}
				});
				
				
				JPanel newPanel = new JPanel();
				newPanel.setLayout(null);
				newPanel.setBounds(0, 0, 500, 300);
				newPanel.setBackground(c01);
				newPanel.add(newLabel);
				newPanel.add(newLabel1);
				newPanel.add(newTxtBox);
				newPanel.add(newCancelButton);
				newPanel.add(newChangeButton);
				
				
				
				newFrame.setDefaultCloseOperation(newFrame.DISPOSE_ON_CLOSE);
				newFrame.add(newPanel);
				newFrame.setVisible(true);
			}
		});
	
		
		JLabel label5 = new JLabel();
		label5.setText("Click the button below! to login your account!");
		label5.setBounds(170, 280, 300, 100);
		label5.setForeground(c3);
		
		JButton loginAccountButton = new JButton();
		loginAccountButton.setText("Login Account");
		loginAccountButton.setBounds(170, 360, 135, 30);
		loginAccountButton.setForeground(c3);
		
		loginAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = JOptionPane.showInputDialog(frame, "Enter your Username: ", "Username Input", JOptionPane.PLAIN_MESSAGE);
				
				if (userName != null) {
					String passWord = JOptionPane.showInputDialog(frame, "Enter your Password: ", "Password Input", JOptionPane.PLAIN_MESSAGE);
					
					if (passWord != null) {
						JOptionPane.showMessageDialog(frame, "Welcome! " + txtBox.getText() + "! and Please, hide these password " + txtBox1.getText() + "!", "Account Login", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		
		txtBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName1 = JOptionPane.showInputDialog(frame, "Enter your username: ", "I'm asking you!", JOptionPane.QUESTION_MESSAGE);
				
				if (userName1 != null) {
					int confirm = JOptionPane.showConfirmDialog(frame, "Is this username " + txtBox.getText() + " is correct?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					
					if (confirm == JOptionPane.YES_OPTION) {
						String passWord1 = JOptionPane.showInputDialog(frame, "Enter your password: ", "I'm asking you!", JOptionPane.QUESTION_MESSAGE);
						
						if (passWord1 != null) {
							int confirm1 = JOptionPane.showConfirmDialog(frame, "Is this password " + txtBox1.getText() + " is correct?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
							
							if (confirm1 == JOptionPane.YES_OPTION) {
								JOptionPane.showMessageDialog(frame, "Welcome, " + txtBox.getText() + "! and your password is " + txtBox1.getText() + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
							}else if (confirm1 == JOptionPane.NO_OPTION) {
								JOptionPane.showMessageDialog(frame, "Wrong! " + txtBox1.getText() + "!", "Invalid", JOptionPane.ERROR_MESSAGE);
							}
						}

					} else if (confirm == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "Incorrect " + txtBox.getText() + "!", "Invalid", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		
		txtBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName1 = JOptionPane.showInputDialog(frame, "Enter your username: ", "I'm asking you!", JOptionPane.QUESTION_MESSAGE);
				
				if (userName1 != null) {
					int confirm = JOptionPane.showConfirmDialog(frame, "Is this username " + txtBox.getText() + " is correct?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					
					if (confirm == JOptionPane.YES_OPTION) {
						String passWord1 = JOptionPane.showInputDialog(frame, "Enter your password: ", "I'm asking you!", JOptionPane.QUESTION_MESSAGE);
						
						if (passWord1 != null) {
							int confirm1 = JOptionPane.showConfirmDialog(frame, "Is this password " + txtBox1.getText() + " is correct?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
							
							if (confirm1 == JOptionPane.YES_OPTION) {
								JOptionPane.showMessageDialog(frame, "Welcome, " + txtBox.getText() + "! and your password is " + txtBox1.getText() + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
							}else if (confirm1 == JOptionPane.NO_OPTION) {
								JOptionPane.showMessageDialog(frame, "Wrong! " + txtBox1.getText() + "!", "Invalid", JOptionPane.ERROR_MESSAGE);
							}
						}

					} else if (confirm == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "Incorrect " + txtBox.getText() + "!", "Invalid", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 800, 500);
		panel.setBackground(c0);
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(txtBox);
		panel.add(label4);
		panel.add(txtBox1);
		panel.add(loginButton);
		panel.add(cancelButton);
		panel.add(forgotButton);
		panel.add(label5);
		panel.add(loginAccountButton);
		
		
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		
	}
}
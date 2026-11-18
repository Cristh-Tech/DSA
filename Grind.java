
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Grind {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Main Window");
		frame.setLayout(null);
		frame.setBounds(20, 20, 500, 350);
		
		JLabel label = new JLabel();
		label.setText("Enter:");
		label.setBounds(10, 10, 50, 25);
		
		JTextField txtBox = new JTextField();
		txtBox.setBounds(60, 10, 100, 25);
		
		JButton button = new JButton();
		button.setText("Submit!");
		button.setBounds(60, 45, 95, 30);
		
		
		// showConfirmDialog
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(frame, "Do you want to save " + txtBox.getText() + "?",
							"what is your choice?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			
				if (choice == JOptionPane.OK_OPTION) {
					JOptionPane.showMessageDialog(frame, "Saved! " + txtBox.getText() + " Already!", "Successful", JOptionPane.INFORMATION_MESSAGE);
				} else if (choice == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(frame, "Invalid " + txtBox.getText() + "!", "Denied", JOptionPane.ERROR_MESSAGE);
				} else if (choice == JOptionPane.CLOSED_OPTION) {
					JOptionPane.showMessageDialog(frame, "Closed " + txtBox.getText() + "!", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
			
		});
		
		
		// showMessageDialog
		txtBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "uyy unsa mana! " + txtBox.getText() + " nahhh!", "Succeed", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		
		
		JButton btn = new JButton();
		btn.setText("Enter text");
		btn.setBounds(100, 140, 130, 40);
		
		// showInputDialog for text only
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(frame, "Enter your name: ", "Name Input", JOptionPane.PLAIN_MESSAGE);
				
				if (name != null) {
					
					if (name.matches("[a-zA-Z]+")) {
						JOptionPane.showMessageDialog(frame, "Hello, " +  name + "!", "Greeting's Message", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(frame, "Please enter text only!", "Invalid", JOptionPane.WARNING_MESSAGE);
					}
				}
				
			}
		});
		
		JButton newButton = new JButton();
		newButton.setText("Enter number");
		newButton.setBounds(250, 140, 130, 40);
		
		// showInputDialog for number only
		newButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog(frame, "Enter your age: ", "Number Input", JOptionPane.PLAIN_MESSAGE);
				
				try {
					
					int age = Integer.parseInt(input);
					if (input != null) {
						JOptionPane.showMessageDialog(frame, "next year you will be " + (age + 1) + "  years old!", "Advanced Birthday", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		
		
		
		
		
		JButton anotherButton = new JButton();
		anotherButton.setText("Others");
		anotherButton.setBounds(170, 200, 130, 40);
		
		
		// showInputDialog and showConfirmDialog
		anotherButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				String gender = JOptionPane.showInputDialog(null, "Enter your gender: ", "Your gender", JOptionPane.PLAIN_MESSAGE);
				
				if (gender != null) {
					int confirm = JOptionPane.showConfirmDialog(null, "Is this " + gender + " gender is correct?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					
					if (confirm == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Welcome, your gender is " + gender + "!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
					} else if (confirm == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(null, "Something went wrong! this " + gender + " gender is Invalid!", "Error", JOptionPane.WARNING_MESSAGE);
					} else if (confirm == JOptionPane.CLOSED_OPTION) {
						JOptionPane.showMessageDialog(null, "OPPS! " + gender + " is Error!", "Closed", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.add(txtBox);
		frame.add(button);
		frame.add(btn);
		frame.add(newButton);
		frame.add(anotherButton);
		frame.setVisible(true);
	}
}


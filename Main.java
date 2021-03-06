/*Reginah Chuhi
	CIS221
	Tuesday and Thursday 2:10pm*/

/*ATTENTION
 *
 * This are the User names on my list
 * Jules13, Henry17, Adam23, Veronica16

 */



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Main implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	

	public static void main(String[] args) {
		//Creates the login panel
		JPanel panel= new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		//creates a button and sets onclick listener
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new Main());
		panel.add(button);
		
		
		
		frame.setVisible(true);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e)  {
		/*ATTENTION
		 * 
		 * This are the User names on my list
		 * Jules13, Henry17, Adam23, Veronica16
		 
		 */
		//Reads from a file in my downloads folder. 		
		File file = new File("/Users/regchuhi/Downloads/username.rtf");
		
		try {
			//Scans the file
		Scanner	scan = new Scanner(file);
			scan.useDelimiter("[,\n]");
			
			while (scan.hasNext()) {
				
				String username= scan.next();
				//Stores the entered username
				String user = userText.getText();
				//Compares the user text entered to the usernames on the file
				if (user.trim().equals(username.trim())) {
					
					System.out.println("Login Successful");
					
				}
				
				else {
				   
					System.out.println("User not found");
				}
			}
			scan.close();
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
	
		
			
		
	}}
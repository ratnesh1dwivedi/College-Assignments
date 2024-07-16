// Q20. Write a java program to design a Login window with Event Handling. 
 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class eventhandling implements ActionListener { 
 private JFrame frame; 
 private JLabel lblUsername, lblPassword; 
 private JTextField txtUsername; 
 private JPasswordField txtPassword; 
 private JButton btnLogin, btnCancel; 
 public eventhandling() { 
 frame = new JFrame("Login Window"); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 frame.setSize(300, 200); 
 frame.setLayout(new GridLayout(3, 2)); 
 frame.setLocationRelativeTo(null); 
 lblUsername = new JLabel("Username:"); 
 lblPassword = new JLabel("Password:"); 
 txtUsername = new JTextField(); 
 txtPassword = new JPasswordField(); 
 btnLogin = new JButton("Login"); 
 btnCancel = new JButton("Cancel"); 
 btnLogin.addActionListener(this); 
 btnCancel.addActionListener(this); 
 frame.add(lblUsername); 
 frame.add(txtUsername); 
 frame.add(lblPassword); 
 frame.add(txtPassword); 
 frame.add(btnLogin); 
 frame.add(btnCancel); 
 frame.setVisible(true); 
 } 
 public void actionPerformed(ActionEvent e) { 
 if (e.getSource() == btnLogin) { 
 String username = txtUsername.getText(); 
 String password = String.valueOf(txtPassword.getPassword()); 
 if (username.equals("admin") && password.equals("password")) { 
 JOptionPane.showMessageDialog(frame, "Login Successful!"); 
 } else { 
 JOptionPane.showMessageDialog(frame, "Invalid username or password. Please try again.", 
"Error", 
 JOptionPane.ERROR_MESSAGE); 
 } 
 } else if (e.getSource() == btnCancel) { 
 System.exit(0); 
 } 
 } 
 public static void main(String[] args) { 
 new eventhandling(); 
 } 
 } 
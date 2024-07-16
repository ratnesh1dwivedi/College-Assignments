// Q22.Write a program to show the use of Radio Button and Check Box upon the Frame. 
 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class buttonframe { 
 public static void main(String[] args) { 
 JFrame frame = new JFrame("Radio Button and Check Box Example"); 
 frame.setLayout(new FlowLayout()); 
 JRadioButton radioButton1 = new JRadioButton("Radio Button 1"); 
 JRadioButton radioButton2 = new JRadioButton("Radio Button 2"); 
 JRadioButton radioButton3 = new JRadioButton("Radio Button 3"); 
 JCheckBox checkBox1 = new JCheckBox("Check Box 1"); 
 JCheckBox checkBox2 = new JCheckBox("Check Box 2"); 
 JCheckBox checkBox3 = new JCheckBox("Check Box 3"); 
 frame.add(radioButton1); 
 frame.add(radioButton2); 
 frame.add(radioButton3); 
 frame.add(checkBox1); 
 frame.add(checkBox2); 
 frame.add(checkBox3); 
 JButton button = new JButton("Show Selected"); 
 frame.add(button); 
 button.addActionListener(new ActionListener() { 
 @Override 
 public void actionPerformed(ActionEvent e) { 
 if (radioButton1.isSelected()) { 
 System.out.println("Radio Button 1 selected"); 
 } else if (radioButton2.isSelected()) { 
 System.out.println("Radio Button 2 selected"); 
 } else if (radioButton3.isSelected()) { 
 System.out.println("Radio Button 3 selected"); 
 } 
 if (checkBox1.isSelected()) { 
 System.out.println("Check Box 1 selected"); 
 } 
 if (checkBox2.isSelected()) { 
 System.out.println("Check Box 2 selected"); 
 } 
 if (checkBox3.isSelected()) { 
 System.out.println("Check Box 3 selected"); 
 } 
 } 
 }); 
 frame.setSize(300, 200); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 frame.setVisible(true); 
 } 
}
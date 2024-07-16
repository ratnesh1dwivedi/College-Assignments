// AWT 3 code

import java.awt.*;
import java.awt.event.*;
public class AWT3 implements ActionListener,ItemListener
{
 String msg= "HNV";
 Frame f;
 Label l1,l2;
 Button b;
 Checkbox cb;
 CheckboxGroup cbg;
 Checkbox cbg1,cbg2,cbg3;
 Choice c;
 List Li;
 TextField name, password;
 TextArea ta;
   AWT3()
{
 f=new Frame("My Title");
 f.setSize(1000,800);
 f.setLayout(null);
 f.setBackground(Color.cyan);
 f.setForeground(Color.red);
 f.setVisible(true);
 l1=new Label("Name:");
 l1.setBounds(30,100,80,30);
 f.add (l1);
 l2=new Label("Password");
 l2.setBounds(230,300,200,30);
 f.add(l2);
 name=new TextField(15);
 name.setBounds(130,100,80,30);
 f.add(name);
 password=new TextField(15);
 password.setBounds(230,100,80,30);
 f.add(password);
 password.addActionListener(this);
 password.setEchoChar('&');
 b=new Button("Press");
 b.setBounds(430,100,80,30);
 f.add(b);
 b.addActionListener(this);
 cb=new Checkbox("Hello",true);
 cb.setBounds(30,150,80,30);
 f.add(cb);
 cb.addItemListener(this);
 cbg=new CheckboxGroup();
 cbg1= new Checkbox("H",cbg, false);
 cbg1.setBounds(30,200,80,30);
 f.add(cbg1);
 cbg1.addItemListener(this);
 cbg2=new Checkbox("N",cbg, true);
 cbg2.setBounds(30,220,80,30);
 f.add(cbg2);
 cbg2.addItemListener(this);
 cbg3=new Checkbox("Verma",cbg, false);
 cbg3.setBounds(30,240,80,30);
 f.add(cbg3);
 cbg3.addItemListener(this);
 c=new Choice();
 c.setBounds(130,150,80,30);
 c.addItem("India");
 c.addItem("Pakistan");
 c.addItem("Afghanistan");
 c.addItem("Bhutan");
 c.addItem("Nepal");
 c.addItem("China");
 c.addItem("Myanmar");
 c.addItem("Sri Lanka");
 c.addItem("Bangladesh");
 c.addItem("Maldives");
 f.add(c);
 c.addItemListener(this);
 Li=new List(2,false);
 Li.setBounds(230,150,180,50);
 Li.addItem("U.P");
 Li.addItem("Islamabad");
 Li.addItem("Afghanistan"); 
 Li.addItem("Bhutan");
 Li.addItem("Nepal");
 Li.addItem("China");
 Li.addItem("Myanmar");
 Li.addItem("Sri Lanka");
 Li.addItem("Bangladesh");
 Li.addItem("Maldives");
 f.add(Li);
 Li.addItemListener(this);
 ta=new TextArea(10,20);
 ta.setBounds(30,300,180,100);
 f.add(ta);
}
public static void main(String args[])
{
 new AWT3();
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
if (s.equals("Press"))
if(ae.getSource()==b)
{
msg=ta.getText();
if(password.getText().length()!=0)
ta.setText("Your Pawwsord is:"+password.getText());
else
ta.setText("Button Pressed");
}
l2.setText(msg);
}
public void itemStateChanged(ItemEvent ie)
{
 if(ie.getSource()==cb)
 ta.setText("Checkbox clicked"+cb.getState());
 if(ie.getSource()==cbg1 || ie.getSource()==cbg2 || ie.getSource()==cbg3)
 ta.setText("Checkboxgroup clicked"+cbg.getSelectedCheckbox().getLabel());
 if(ie.getSource()==c)
 ta.setText("Choice clicked"+c.getSelectedItem());
 if(ie.getSource()==Li)
 ta.setText("List clicked"+Li.getSelectedItem());
 }
}

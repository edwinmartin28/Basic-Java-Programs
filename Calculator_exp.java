//Java program for implementing a GUI based Calculator using swing
import javax.swing.*;
import java.awt.event.*;
class calculator extends JFrame implements ActionListener{
 JLabel l1=new JLabel("First Number :");
 JLabel l2=new JLabel("Second Number :");
 JLabel l3=new JLabel("Result :");
 JTextField t1=new JTextField();
 JTextField t2=new JTextField();
 JTextField t3=new JTextField();
 JButton b1=new JButton("Add");
 JButton b2=new JButton("subtract");
 JButton b3=new JButton("Multiply");
 JButton b4=new JButton("Divide");
 JButton b5=new JButton("Exit");
 calculator(){
  l1.setBounds(50,60,100,20);
  l2.setBounds(50,100,100,20);
  l3.setBounds(50,140,100,20);
  t1.setBounds(200,60,100,20);
  t2.setBounds(200,100,100,20);
  t3.setBounds(200,140,100,20);
  b1.setBounds(50,230,80,30);
  b2.setBounds(150,230,80,30);
  b3.setBounds(250,230,80,30);
  b4.setBounds(350,230,80,30);
  b5.setBounds(450,230,80,30);
  add(l1);
  add(l2);
  add(l3);
  add(t1);
  add(t2);
  add(t3);
  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 setLayout(null);
 setVisible(true);
 setSize(600,600);
 }
public void actionPerformed(ActionEvent e){
 int n1=Integer.parseInt(t1.getText());
 int n2=Integer.parseInt(t2.getText());
 if(e.getSource()==b1){
 t3.setText(String.valueOf((n1+n2)));
 }
 if(e.getSource()==b2){
 t3.setText(String.valueOf((n1-n2)));
 }
 if(e.getSource()==b3){
 t3.setText(String.valueOf((n1*n2)));
 }
 try{
 if(e.getSource()==b4){
    t3.setText(String.valueOf((n1/n2)));
  }
 }catch(Exception E){
    t3.setText("Error Occured");
 }
 if(e.getSource()==b5)
 System.exit(0);
 } 
}
class Calculator_exp{
  public static void main(String args[]){
      new calculator();
  }
}

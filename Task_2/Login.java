package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//implementing action listener interface just to make the button actions
public class Login extends JFrame implements ActionListener{

JButton login, signup, clear; //globally defining them, hence we have to remove JButton locally as it is here written already
JTextField cardinput ;//declaring that card input field
JPasswordField pininput;//declaring that pin input field



Login(){


//random number generation for the applicant form number 
Random ran = new Random();//creating a random object ran of random class between 1000000 and 1999999
long r1 = (ran.nextLong()%900000L) + 1000000L;
String str_random = " "+Math.abs(r1);


setTitle("LOGIN");//setting welcome nd login page
setLayout(null);//so that we can form our custom layout
//whole screen size
setSize(500,500);//defining the dimensions
setVisible(true);//making it visible to the user
setLocation(350,200);

ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quick_bank1.png"));//creating image_icon_object

Image i2 = i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);//image_object

ImageIcon i3 = new ImageIcon(i2);//converting the image_object into the image_icon_obect or conversion of image to icon

JLabel label = new JLabel(i3);//creating image label where the specified image is passed using jlabel

label.setBounds(1,1,300,200);//setting the location of this image file on the screen
add(label);//adding the label to the screen

//Welcome label
JLabel text = new JLabel("Welcome To QuickBank Services");
text.setFont(new Font("Osward1",Font.BOLD,35));//changing tge font size
text.setBounds(550,40,600,300);
text.setForeground(Color.WHITE);
add(text);


//Card number 
JLabel cardno = new JLabel("Enter 16 digit card number");
cardno.setFont(new Font("Raleway",Font.BOLD, 22));//changing tge font size
cardno.setBounds(550,140,600,300);
cardno.setForeground(Color.WHITE);
add(cardno);

//adding text field for card number or the cardinput
cardinput = new JTextField();
cardinput.setBounds(550,320,400,30);
cardinput.setFont(new Font("Arial", Font.BOLD, 14));
add(cardinput);


//pin number
JLabel pin = new JLabel("Enter secret key");
pin.setFont(new Font("Osward1",Font.BOLD, 22));//changing the font size
pin.setBounds(550,240,600,300);
pin.setForeground(Color.WHITE);
add(pin);

//adding text field for pin number
pininput = new JPasswordField();
pininput.setBounds(550,420,100,30);
pininput.setFont(new Font("Arial", Font.BOLD, 14));
add(pininput);

//adding buttons


//login button
login = new JButton("LOGIN");//sign in button
login.setBounds(700,600,100,30);
login.setForeground(Color.BLACK);
login.setBackground(Color.WHITE);
login.addActionListener(this);//calling this action listener function for login button, mentioning this here will point 'login' to the action listener method and will do the necessary operations
add(login);

//signup button
signup = new JButton("SIGNUP");//sign up button
signup.setBounds(1000,600,100,30);
signup.setForeground(Color.BLACK);
signup.setBackground(Color.WHITE);
signup.addActionListener(this);//calling this action listener function for signup button
add(signup);

//clear button
clear = new JButton("CLEAR");//clear screen button
clear.setBounds(400,600,100,30);
clear.setForeground(Color.BLACK);
clear.setBackground(Color.WHITE);
clear.addActionListener(this);//calling this action listener function for signup button
add(clear);

//visitor number
JLabel visitor_num = new JLabel("Visitor Number -"+str_random);
visitor_num.setFont(new Font("Osward1",Font.BOLD, 10));//changing the font size
visitor_num.setBounds(5,600,600,300);
visitor_num.setForeground(Color.WHITE);
add(visitor_num);

getContentPane().setBackground(Color.BLACK);//setting color of the background




}

//using ActionEvent class method and ae is the action event class object here it is passed as an object reference 'ActionEvent ae' of class ActionEvent
public void actionPerformed(ActionEvent ae){

//getSource will tell which source has been pressed so far
if (ae.getSource() == clear){

//adding empty if that clear button is pressed
cardinput.setText("");//clearing cardinput
pininput.setText("");//clearing pininput



}
else if (ae.getSource() == login){



}
else if (ae.getSource() == signup){

}
}

//calling the main function
public static void main(String args[]){

new Login();
}

}













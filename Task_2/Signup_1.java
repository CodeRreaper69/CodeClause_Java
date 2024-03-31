package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Signup_1 extends JFrame{
	
	JButton login, signup, clear; //globally defining them, hence we have to remove JButton locally as it is here written already
    JTextField namein, mnamein, fnamein, idin, acctypein, addrin;
	Signup_1(){
		

setTitle("PAGE 1");//setting welcome nd login page
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
	
getContentPane().setBackground(Color.BLACK);//setting color of the background
	
	
//random number generation for the applicant form number 
Random ran = new Random();//creating a random object ran of random class between 10000 and 19999
long r1 = (ran.nextLong()%9000L) + 10000L;
String str_random = " "+Math.abs(r1);


	
//Info label
JLabel formno = new JLabel("APPLICANT NO - "+str_random);
formno.setFont(new Font("Osward1",Font.BOLD, 30));//changing the font size
formno.setBounds(650,-100,600,300);
formno.setForeground(Color.WHITE);
add(formno);

//name label
JLabel name = new JLabel("NAME:-");
name.setFont(new Font("Raleway",Font.BOLD, 18));//changing tge font size
name.setBounds(400,40,600,300);
name.setForeground(Color.WHITE);
add(name);
	
//text field for name input
namein = new JTextField();
namein.setBounds(700,175,400,20);
namein.setFont(new Font("Arial", Font.BOLD, 14));
add(namein);
	
//DOB label
JLabel dob = new JLabel("DOB:-");
dob.setFont(new Font("Raleway",Font.BOLD, 18));//changing tge font size
dob.setBounds(400,100,600,300);
dob.setForeground(Color.WHITE);
add(dob);	
	
	
//fname label
JLabel fname = new JLabel("Enter Mother's Name:-");
fname.setFont(new Font("Raleway",Font.BOLD, 18));//changing tge font size
fname.setBounds(400,160,600,300);
fname.setForeground(Color.WHITE);
add(fname);	
	
//mname label
JLabel mname = new JLabel("Enter Father's Name:-");
mname.setFont(new Font("Raleway",Font.BOLD, 18));//changing tge font size
mname.setBounds(400,220,600,300);
mname.setForeground(Color.WHITE);
add(mname);

//educational qualification label
JLabel quali = new JLabel("Enter Qualification:-");
quali.setFont(new Font("Raleway",Font.BOLD, 18));//changing tge font size
quali.setBounds(400,280,600,300);
quali.setForeground(Color.WHITE);
add(quali);	
	
	
//ID number label
JLabel idno = new JLabel("Enter Govt. ID number:-");
idno.setFont(new Font("Raleway",Font.BOLD, 18));//changing tge font size
idno.setBounds(400,340,600,300);
idno.setForeground(Color.WHITE);
add(idno);	
	
	
//account type label
JLabel acctype = new JLabel("Enter Account type:-");
acctype.setFont(new Font("Raleway",Font.BOLD, 18));//changing tge font size
acctype.setBounds(400,400,600,300);
acctype.setForeground(Color.WHITE);
add(acctype);


//address label
JLabel addr = new JLabel("Enter address in Govt Id:-");
addr.setFont(new Font("Raleway",Font.BOLD, 18));//changing tge font size
addr.setBounds(400,460,600,300);
addr.setForeground(Color.WHITE);
add(addr);	

//gender label
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	public static void main(String args[]){
		
		new Signup_1();
	}
	
	}
	

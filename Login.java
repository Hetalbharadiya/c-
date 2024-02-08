import java.awt.*;
import javax.swing.*;

public class Login
{
	public static void main(String[] args)
	{
		JFrame jfrm = new JFrame();
		jfrm.setVisible(true);
		jfrm.setLayout(null);
		jfrm.setSize(900, 600);
		
		//lable1 username
		JLabel label1 = new JLabel("Enter Username");
		label1.setBounds(550, 275, 100, 30);
		jfrm.add(label1);
		//taxtfield1 for username
		JTextField textField1 = new JTextField();
		textField1.setBounds(660, 281, 150, 20);
		jfrm.add(textField1);
		//lable2 password
		JLabel label2 = new JLabel("Enter Password");
		label2.setBounds(550, 306, 100, 30);
		jfrm.add(label2);
		//taxtfiled for password
		JTextField textField2 = new JTextField();
		textField2.setBounds(660, 312, 150, 20);
		jfrm.add(textField2);
		//button
		JButton btn = new JButton("Login");
		btn.setBounds(550, 354, 268, 38);
		jfrm.add(btn);
		
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
	}
}
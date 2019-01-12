package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//ÄÁÆ®·Ñ+½¬ÇÁÆ®+o(¿µ¹®)

public class ChinaFood extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	int count = 0;
	final int price = 5000;
	JLabel lblNewLabel_2;
		

	public ChinaFood() {
		getContentPane().setBackground(Color.YELLOW);
		setBackground(Color.YELLOW);
		setSize(700,500);
		setTitle("ÁÖ¹®ÇÏ¼¼¿ä...");
		
		ImageIcon icon = new ImageIcon("Áß±¹Áý.png");		
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JButton btnNewButton = new JButton("\uC9DC\uC7A5\uBA74");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");		
				textField_1.setText(count*price+"");
								
				ImageIcon icon2 = new ImageIcon("Â¥Àå¸é.jpg");	
				lblNewLabel_2.setIcon(icon2);
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setToolTipText("\uC9DC\uC7A5\uBA74 \uD558\uB098\uAC00 \uCD94\uAC00\uB428");
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAE50\uC1FC\uC0C8\uC6B0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				
				ImageIcon icon3 = new ImageIcon("±ñ¼î»õ¿ì.jpg");	
				lblNewLabel_2.setIcon(icon3);
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC591\uC7A5\uD53C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");		
				textField_1.setText(count*price+"");
				
				ImageIcon icon4 = new ImageIcon("¾çÀåÇÇ.jpg");	
				lblNewLabel_2.setIcon(icon4);
			}
		});
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btnNewButton_2.setForeground(Color.MAGENTA);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218");
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.GREEN);
		textField.setForeground(Color.RED);
		textField.setFont(new Font("±¼¸²", Font.BOLD, 12));
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uAE08\uC561");
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setBackground(Color.GREEN);
		textField_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_2.setIcon(icon);
		
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
     ChinaFood china = new ChinaFood();
		
	}

}

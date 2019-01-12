package window2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class Pizza {

	JFrame f;
	JLabel top, count;
	JButton b1, b2, b3;
	JTextField total;
	int sum = 0;
	int combo = 0;
	int potato = 0;
	int bulgoki = 0;
	
	JTextArea list;
	private JLabel lblWow;
	private JButton btnNewButton;
		
	public Pizza() {
		f = new JFrame();
		f.setSize(350, 260);
		top = new JLabel("<<<<<<<<<<<<자바피자에 오신걸 환영>>>>>>>>>>>>");
		count = new JLabel("개수");
		b1 = new JButton("콤보피자");
		b2 = new JButton("포테토피자");
		b3 = new JButton("불고기피자");
		total = new JTextField(20);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		list = new JTextArea(3, 30);
		
		
		
		f.getContentPane().add(top);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(count);
		f.getContentPane().add(total);
		f.getContentPane().add(list);
		
		btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "나를 정말 누르셨군요.");
				
				
			}
		});
		
		lblWow = new JLabel("\uCD1D\uACC4");
		lblWow.setForeground(Color.RED);
		lblWow.setFont(new Font("굴림", Font.BOLD, 14));
		f.getContentPane().add(lblWow);
		f.getContentPane().add(btnNewButton);
				

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				combo++;
				
				list.setText("콤보 개수: " + combo + "개\n"
						+ "포테이토 개수: " + potato + "개\n"
						+ "불고기 개수: " + bulgoki + "개"						
						);		
				}
		});

		
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				potato++;
				
				list.setText("콤보 개수: " + combo + "개\n"
						+ "포테이토 개수: " + potato + "개\n"
						+ "불고기 개수: " + bulgoki + "개"						
						);						
			}
		});
				
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				bulgoki++;				
				
				list.setText("콤보 개수: " + combo + "개\n"
						+ "포테이토 개수: " + potato + "개\n"
						+ "불고기 개수: " + bulgoki + "개"						
						);						
			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {
		Pizza p = new Pizza();
	}
}

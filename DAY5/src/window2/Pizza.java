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
		top = new JLabel("<<<<<<<<<<<<�ڹ����ڿ� ���Ű� ȯ��>>>>>>>>>>>>");
		count = new JLabel("����");
		b1 = new JButton("�޺�����");
		b2 = new JButton("����������");
		b3 = new JButton("�Ұ������");
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
		btnNewButton.setFont(new Font("����", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "���� ���� �����̱���.");
				
				
			}
		});
		
		lblWow = new JLabel("\uCD1D\uACC4");
		lblWow.setForeground(Color.RED);
		lblWow.setFont(new Font("����", Font.BOLD, 14));
		f.getContentPane().add(lblWow);
		f.getContentPane().add(btnNewButton);
				

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				combo++;
				
				list.setText("�޺� ����: " + combo + "��\n"
						+ "�������� ����: " + potato + "��\n"
						+ "�Ұ�� ����: " + bulgoki + "��"						
						);		
				}
		});

		
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				potato++;
				
				list.setText("�޺� ����: " + combo + "��\n"
						+ "�������� ����: " + potato + "��\n"
						+ "�Ұ�� ����: " + bulgoki + "��"						
						);						
			}
		});
				
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				bulgoki++;				
				
				list.setText("�޺� ����: " + combo + "��\n"
						+ "�������� ����: " + potato + "��\n"
						+ "�Ұ�� ����: " + bulgoki + "��"						
						);						
			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {
		Pizza p = new Pizza();
	}
}

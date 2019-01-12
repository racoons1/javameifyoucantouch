package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyDiary extends JFrame {
	private JTextField noText;

	public MyDiary() {
		getContentPane().setBackground(Color.GREEN);
		// 컨트롤+시프트+f(자동정리)
		setTitle("나의 일기장 시작화면");
		setSize(500, 800);

		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("일기장자두.jpg");
		img.setIcon(icon);
		getContentPane().add(img);
		
		JLabel no = new JLabel("번호");
		getContentPane().add(no);

		noText = new JTextField();
		noText.setForeground(Color.RED);
		noText.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(noText);
		noText.setColumns(20);

		JButton save = new JButton("일기저장");
		save.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(save);

		JButton read = new JButton("일기읽기");
		read.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(read);

		setVisible(true);

	}

	public static void main(String[] args) {
		MyDiary name = new MyDiary();

	}

}

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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MyDiary extends JFrame {
	private JTextField noText;
	private JTextField titleText;

	public MyDiary() {
		getContentPane().setBackground(Color.GREEN);
		// 컨트롤+시프트+f(자동정리)
		setTitle("나의 일기장 시작화면");
		setSize(500, 860);

		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("일기장사이드.jpg");
		img.setIcon(icon);
		getContentPane().add(img);

		JLabel no = new JLabel("번호");
		no.setFont(new Font("굴림", Font.BOLD, 12));
		getContentPane().add(no);

		noText = new JTextField();
		noText.setForeground(Color.RED);
		noText.setFont(new Font("Arial", Font.BOLD, 20));
		getContentPane().add(noText);
		noText.setColumns(25);

		JLabel lblNewLabel = new JLabel("제목");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		getContentPane().add(lblNewLabel);

		titleText = new JTextField();
		titleText.setForeground(Color.RED);
		titleText.setFont(new Font("Arial", Font.BOLD, 20));
		getContentPane().add(titleText);
		titleText.setColumns(25);

		JLabel lblNewLabel_1 = new JLabel("내용");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		getContentPane().add(lblNewLabel_1);

		JTextArea contentText = new JTextArea();
		contentText.setFont(new Font("Monospaced", Font.BOLD, 13));
		contentText.setRows(5);
		contentText.setColumns(53);
		getContentPane().add(contentText);

		JButton save = new JButton("일기저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();
				// 컨트롤+쉬프트+F(format)
				// 컨트롤+알트+화살표아래(복사) 또는 컨트롤+c/v(블록잡고)
				// 알트+화살표는 이동

				try {

					FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
					f.write(noT + "\r\n");
					f.write(titleT + "\r\n");
					f.write(contentT + "\r\n");
					f.flush();
					f.close();

					noText.setText("");
					titleText.setText("");
					contentText.setText("");

					JOptionPane.showMessageDialog(null, "파일로 저장 성공!!");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "파일로 저장 실패!!");

				}

			}
		});
		save.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(save);

		JButton read = new JButton("일기읽기");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();

				try {

					FileReader f2 = new FileReader("c:/diary/" + noT + ".txt");
					BufferedReader reader = new BufferedReader(f2);
					String noR = reader.readLine();
					String titleR = reader.readLine();
					String contentR = reader.readLine();
					
					noText.setText(noR);
					titleText.setText(titleR);
					contentText.setText(contentR);			
					
					noText.setForeground(Color.BLUE);
					
					JOptionPane.showMessageDialog(null, "파일로 읽기 성공!!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "파일로 읽기 실패!!");
				}

			}
		});
		read.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(read);
		
		JButton reset = new JButton("초기화");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noText.setText("");
				titleText.setText("");
				contentText.setText("");			
			}
		});
		reset.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(reset);

		setVisible(true);

	}

	public static void main(String[] args) {
		MyDiary name = new MyDiary();

	}

}

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

public class DiaryMain extends JFrame {
	private JTextField id;
	private JTextField pw;

	public DiaryMain() {
		getContentPane().setBackground(Color.GREEN);
		// 컨트롤+시프트+f(자동정리)
		setTitle("나의 일기장 시작화면");
		setSize(560, 800);

		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("일기장자두.jpg");
		img.setIcon(icon);
		getContentPane().add(img);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);

		id = new JTextField();
		id.setForeground(Color.RED);
		id.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(id);
		id.setColumns(20);

		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(lblNewLabel_1);

		pw = new JTextField();
		pw.setForeground(Color.RED);
		pw.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(pw);
		pw.setColumns(20);

		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sId = "root";
				String sPw = "1234";
				String gId = id.getText();
				String gPw = pw.getText();

				if ((sId.equals(gId)) && (sPw.equals(gPw))) {
					JOptionPane.showMessageDialog(null, "로그인 OK입니다.");
				} else {
					JOptionPane.showMessageDialog(null, "로그인 불가 입니다. 재입력 해주세요");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("초기화");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(btnNewButton_1);

		setVisible(true);

	}

	public static void main(String[] args) {
		DiaryMain name = new DiaryMain();

	}

}

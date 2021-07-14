package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.w3c.dom.Text;

import movieVO.Movie;
import movieVO.MovieDAO;

public class FrameMovieSelect extends JPanel {
	// 생성자에 내용 추가
	public FrameMovieSelect() {

		// JPanel 구조
		setBackground(new Color(0xfad700));
		setLayout(null);
		setSize(600, 2000);

		JPanel top = new JPanel();
		top.setBackground(new Color(0xAAD700));
		top.setLayout(null);
		top.setSize(600, 140);
		top.setLocation(0, 0);

		JPanel center = new JPanel();
		center.setBackground(new Color(0xFFFF0));
		center.setLayout(null);
		center.setSize(600, 470);
		center.setLocation(0, 140);

		// 하단의 버튼 설정
		JButton btnPrev = new JButton("이전");
		JButton btnExit = new JButton("종료");

		btnPrev.setBackground(new Color(183, 240, 117));
		btnExit.setBackground(new Color(183, 240, 117));

		btnPrev.setSize(300, 150);
		btnPrev.setLocation(((int) getSize().getWidth() / 2) - 310, (int) getLocation().getY() / 2 + 610);

		btnPrev.setFont(new Font("굴림", Font.BOLD, 26));
		btnExit.setSize(300, 150);

		btnExit.setLocation((int) btnPrev.getLocation().getX() + 300, (int) btnPrev.getLocation().getY());

		btnExit.setFont(new Font("굴림", Font.BOLD, 26));

		add(btnPrev);
		add(btnExit);
		
		add(top);
		add(center);

		top.setVisible(true);
		center.setVisible(true);
		
		//하단 버튼 이벤트
		btnPrev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(ABORT);
			}
		});
		
	}//생성자 종료
}//class 종료

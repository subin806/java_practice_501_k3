package ex_241023_ch9.homework;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WordTestLsy1205Test extends JFrame {
	// 전역으로 선언만 했음. 생성자에서 초기화 하면, 다른 곳에서 사용이 가능
	private JTextField wordField; //  영어단어 입력 필드 
	private JTextField meaningField; //  영어 뜻 입력 필드
	private JPanel wordPanel; // 단어 표실할 필드 
	
	// 단어를 임시로 저장할 Map -> HashMap  
	// UI, 화면에 표시할 라벨
	private Map<String, JLabel> wordLabelMap; 
	// 영어의 뜻을 저장하는 임시 공간.
	private Map<String, String> wordMeaningLabelMap;
	// 랜덤으로 단어 퀴즈 형식처럼 출력하기 위한 도구, 
	private Random random;
	
	// 생성자 이용해서, UI를 그리고, 임시 메모리 Map 공간에 단어를 입력 받고, 출력하고, 랜덤출력. 
	// 
	public WordTestLsy1205Test() {
		// 윈도우 창과 -> 최상위 프레임 필요함. 부모 클래스로 부터 상속 받아서, 
		// 그리기 도구를 장착. 
		// 창 제목 
		setTitle("단어 프로그램 V 1.0.0");
		// 창 사이즈. 기본 크기. 
		setSize(400, 300);
		// 창의 닫기를 클릭시, 정상 종료. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//임시 저장소 Map, 전역으로 선언만 한 인스턴스를, 생성자에서 초기화 작업을 함. 
		// 다른 곳에서 사용 가능. 
		wordLabelMap = new HashMap<>();
		wordMeaningLabelMap = new HashMap<String, String>();
		
		// random 도구 초기화. 
		random = new Random();
		
		// 배치 관리자 이용해서, 입력 공간은 북, 단어 표시 공간, 중간에 표기.
		setLayout(new BorderLayout());
		
		// UI 생성하기. 
		// 상단 패널 - 단어를 입력하는 공간, 뜻을 입력하는 공간.
		// 인스턴스 당 하나의 입력 공간.
		// 최상위 프레임 창위에, 패널을 붙이는 역할 -> 패널 위에 JLabel 붙이 예정. 
		JPanel inputPanel = new JPanel();
		// inputPanel -> 배치 관리자, flex , FlowLayout 나란히 배치. 
		inputPanel.setLayout(new FlowLayout());
		
		// 패널에 붙이는 입력 공간 
		// 영어 단어를 입력하는 1) 라벨 2) 입력란
		// 1. 라벨 붙이기, 화면, 이벤트 핸들러, 보통 1회용으로 많이 사용해서, 
		inputPanel.add(new JLabel("단어: "));
		// 2. 입력 공간 붙이기. 
		inputPanel.add(new JTextField(10));
		
		// 영어 뜻 입력하는 1) 라벨 2) 입력란
		inputPanel.add(new JLabel("뜻: "));
		inputPanel.add(new JTextField(10));
		
		// 단어를 추가하는 버튼 
		inputPanel.add(new JButton("단어추가"));
		
		// 단어를 입력하는 패널을, 북쪽에 붙이기 작업. 
		add(inputPanel,BorderLayout.NORTH);
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new WordTestLsy1205Test();
	} // main
	
	
	
}// class







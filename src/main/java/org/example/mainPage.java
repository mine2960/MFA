package org.example;

import javax.swing.*;
import java.awt.*;

public class mainPage extends JFrame {
    public JTextField inputSpace = new JTextField();
    private GridBagLayout grid = new GridBagLayout();

    public mainPage(){
        // GUI 공간 설정
        setTitle("파일 관리 메인 화면"); //창제목을 설정
        setVisible(true); //창보이기 값 설정
        setSize(1920/2, 1080/2);
        setLocationRelativeTo(null); // 화면 가운데에 띄우기
        //setResizable(false); // 창 사이즈 조절 불가
        getContentPane().setBackground(Color.white); // GUI 배경 색상
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료
        setLayout(null);

        Dimension FD = getSize();
        JPanel rightPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.fillRoundRect(
                        0 , 0 ,
                        FD.width, FD.height - 40,
                        30, 30); // R15 곡선 처리
            }
        };
        rightPanel.setBackground(Color.white);
        rightPanel.setBounds(
                (int) (FD.width * 2.0 / 3.0) + 5 , 0 ,
                (int) (FD.width / 3.0) - 20 , FD.height - 40);
        add(rightPanel);

        // 왼쪽 회색 공간
        JPanel leftPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.fillRoundRect(
                        -15 , 0 ,
                        (int) (FD.width * 2.0 / 3.0) - 5 , FD.height - 40,
                        30, 30); // R15 곡선 처리
            }
        };
        leftPanel.setBounds(
                0 , 0 ,
                (int) (FD.width * 2.0 / 3.0) - 5 , FD.height - 40);
        leftPanel.setBackground(Color.white);
        add(leftPanel);

        /*
        // 값 입력하는 공간 설정
        inputSpace = new JTextField();
        inputSpace.setBackground(Color.DARK_GRAY); // 입력칸 배경 색상

        inputSpace.setEditable(false); // 편집 불가능
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);  // input값 정렬 위치
        inputSpace.setFont(new Font("Times", Font.BOLD, 50)); // 글씨 체
        inputSpace.setBounds(8, 10, 270, 70); // x:8, y:10 위치 270x70 크기

        // 버튼 공간 설정
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); // 격자형태로 배열
        buttonPanel.setBounds(8, 90, 270, 235); // x:8, y:90 위치 270x235 크기

        // 버튼에 들어갈 글자 배열
        String[] button_names = {"C","÷", "+","=", "7", "8", "9", "x","4", "5", "6", "-", "1", "2", "3","0"};
        // 버튼글자배열 개수만큼 버튼 만들기
        JButton[] buttons = new JButton[button_names.length];

        for(int i = 0; i<button_names.length; i++) {
            buttons[i] = new JButton(button_names[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20)); // 폰트 지정

            // 버튼색상 지정
            if(button_names[i].equals("C")){ buttons[i].setBackground(Color.red); }
            else if((i >=4 && i<=6) || (i >= 8 && i<=10) || (i >=12 && i<=14)) {
                buttons[i].setBackground(Color.black);
            }else { buttons[i].setBackground(Color.gray); }

            buttons[i].setForeground(Color.white); // 글자 색상 설정
            buttons[i].setBorderPainted(false); // 테두리 없애주기

            buttonPanel.add(buttons[i]); // 버튼 추가
            buttons[i].setOpaque(true);  // 맥에서 배경색이 먹지 않는것을 해결!
        }

        // JFrame에 추가
        add(inputSpace);
        add(buttonPanel);

         */
    }
}

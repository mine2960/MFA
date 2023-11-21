package org.example;

import javax.swing.*;
import java.awt.*;

public class mainPage extends JFrame {
    public mainPage() {
        setTitle("Custom GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920/2, 1080/2);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        // 왼쪽 2/3 부분을 나타내는 패널
        JPanel mainPanel = new JPanel(null) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // 배경을 하얀색으로 설정
                setBackground(Color.WHITE);

                // 화면을 2/3 지점에서 분할
                int width = getWidth();
                int height = getHeight();
                int splitPoint = width * 2 / 3;

                // 왼쪽 영역에 둥근 모서리 직사각형 그리기 (4픽셀씩 띄워서)
                int padding = 4;
                int leftWidth = splitPoint - padding * 2;
                int leftHeight = height - padding * 2;

                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(220, 220, 220)); // RGB 값으로 회색 설정
                g2d.fillRoundRect(padding, padding, leftWidth, leftHeight, 20, 20);

                // 오른쪽 영역에 짙은 회색의 둥근 모서리 직사각형 그리기 (4픽셀씩 띄워서)
                int rectWidth = width - splitPoint - padding * 2;
                int rectHeight = height - padding * 2;

                g2d.setColor(Color.GRAY);
                g2d.fillRoundRect(splitPoint + padding, padding, rectWidth, rectHeight, 20, 20);
            }
        };

        // 프레임 에 전체 패널 추가
        add(mainPanel);

        try {
            Thread.sleep(10);
            // Setting 버튼 추가
            JButton settingButton = new JButton("Setting");
            int buttonX = mainPanel.getWidth() - 20 - 64;
            settingButton.setBounds(buttonX, 20, 64, 64);
            settingButton.addActionListener(e -> System.out.println("test"));

            // mainPanel에 버튼 추가
            mainPanel.add(settingButton);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
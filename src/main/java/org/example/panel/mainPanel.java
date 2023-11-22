package org.example.panel;

import javax.swing.*;
import java.awt.*;

public class mainPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 배경을 하얀색으로 설정
        setBackground(Color.WHITE);
        setLayout(null);

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
}

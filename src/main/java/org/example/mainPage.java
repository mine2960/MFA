package org.example;

import org.example.button.buttonSetting;
import org.example.panel.mainPanel;

import javax.swing.*;

public class mainPage extends JFrame {
    public mainPage() {
        setTitle("Custom GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920/2, 1080/2);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        // 왼쪽 2/3 부분을 나타내는 패널
        JPanel mainPanel = new mainPanel();
        // 프레임 에 전체 패널 추가
        add(mainPanel);

        try {
            Thread.sleep(1);
            // Setting 버튼 추가
            JButton settingButton = new buttonSetting();
            settingButton.setLocation(mainPanel.getWidth() - 20 - 32, 20);
            settingButton.addActionListener(e -> System.out.println("test"));

            // mainPanel에 버튼 추가
            mainPanel.add(settingButton);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
package org.example.button;

import javax.swing.*;

public class buttonSetting extends JButton {
    ImageIcon img = new ImageIcon("./image/button/setting_but.png");

    public buttonSetting(){
        super();
        create();
    }

    protected void create() {
        setIcon(img);
        setSize(32,32);
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
    }
}

package com.chenxi.runtime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TestJFrame extends JFrame implements ActionListener {
    JButton button1 = new JButton("点这个会在桌面上生成button1.txt");
    JButton button2 = new JButton("点这个会在桌面上生成button2.txt");

    JButton button3 = new JButton("点这个有弹窗");



    public TestJFrame() {
        init();
        initButton();

        this.setVisible(true);

    }

    private void init() {
        this.setSize(603,680);
        this.setTitle("小游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(3); //数字代表关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中方式，才能使用x/y轴定位图片
        this.setLayout(null);

    }

    public void initButton(){
        this.getContentPane().removeAll();

        button1.setBounds(200,250,200,50);
        button1.addActionListener(this);

        button2.setBounds(200,325,200,50);
        button2.addActionListener(this);

        button3.setBounds(200,400,200,50);
        button3.addActionListener(this);

        this.getContentPane().add(button1);
        this.getContentPane().add(button2);
        this.getContentPane().add(button3);

    }

    private void showDialog(String content){
        //创建一个弹窗对象
        JDialog jDialog = new JDialog();
        jDialog.setSize(300,200);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        jDialog.setTitle("弹窗展示");

        JLabel label = new JLabel(content);
        jDialog.getContentPane().add(label);

        jDialog.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == button1){
            try {
                Runtime.getRuntime().exec("/usr/bin/touch /Users/ycx/Desktop/button1.txt");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (source == button2) {
            try {
                Runtime.getRuntime().exec("/usr/bin/touch /Users/ycx/Desktop/button2.txt");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (source == button3) {
            showDialog("弹窗内容");
        }
    }
}

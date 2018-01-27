package com.allianceSystem.stage.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JFrame rootJFrame = new JFrame();

    private JButton displayHistogram = new JButton("Display Histogram");
    private JButton histogramStretch = new JButton("Histogram Stretch");
    private JButton aggressiveStretch = new JButton("Aggressive Stretch");
    private JButton histogramEqualization = new JButton("Histogram Equalization");
    private JButton downLoadButton = new JButton("Download");

    private JCheckBox redCheckBox = new JCheckBox("Red");
    private JCheckBox greenCheckBox = new JCheckBox("Green");
    private JCheckBox blueCheckBox = new JCheckBox("Blue");

    public View() {
        rootJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        rootJFrame.setBounds(dimension.width/2-500, dimension.height/2-300, 1000, 600);
        rootJFrame.setTitle("Histogram");

        rootJFrame.setLayout(new BorderLayout());

        JPanel jPanelTop = new JPanel();
        JPanel jPanelArea = new JPanel();
        JPanel jPanelButton = new JPanel();

        jPanelTop.add(downLoadButton);
        rootJFrame.add(jPanelTop, BorderLayout.NORTH);

        jPanelArea.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(30, 27);
        JTextArea textArea1 = new JTextArea(30, 27);
        JTextArea textArea2 = new JTextArea(30, 27);

        jPanelArea.add(textArea);
        jPanelArea.add(textArea1);
        jPanelArea.add(textArea2);
        rootJFrame.add(jPanelArea, BorderLayout.CENTER);

        jPanelButton.setLayout(new FlowLayout());
        jPanelButton.add(displayHistogram);
        displayHistogram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
                jPanelTop.setBackground(Color.gray);
            }
        });

        jPanelButton.add(histogramStretch);
        histogramStretch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
                jPanelTop.setBackground(null);
            }
        });

        jPanelButton.add(redCheckBox);
        redCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        jPanelButton.add(greenCheckBox);
        greenCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        jPanelButton.add(blueCheckBox);
        blueCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        jPanelButton.add(aggressiveStretch);
        aggressiveStretch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });

        jPanelButton.add(histogramEqualization);
        histogramEqualization.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });
        rootJFrame.add(jPanelButton, BorderLayout.SOUTH);

        rootJFrame.setVisible(true);
    }
}

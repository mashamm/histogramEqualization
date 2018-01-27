package com.allianceSystem;

import com.allianceSystem.stage.view.View;

import javax.swing.*;
import java.awt.*;

public class AppExecutor extends JFrame {

    public static void main(String[] args) {
         EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new View();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

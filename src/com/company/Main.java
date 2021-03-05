package com.company;
import ecs100.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
    }
    public void resetX(){
       // double X;
        //X = UI.askDouble("Give me X");
        UI.setColor(Color.red);
        UI.fillRect(20,100,40,80);
        setupGUI();
    }
    public void  setupGUI(){
        UI.addButton("Reset X", this::resetX);
    }
}

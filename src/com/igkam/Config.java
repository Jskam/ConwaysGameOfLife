package com.igkam;

import java.awt.*;

public class Config {

    public static final int SIZE = 10;
    public static final int WIDTH = 100;
    public static final int HEIGHT = 60;
    public static final int SLEEPMS = 100;


    public static Color getColor (Status status) {
        return switch (status){
            case NONE -> Color.BLACK;
            case BORN -> Color.GRAY;
            case LIVE -> Color.WHITE;
            case DIED -> Color.DARK_GRAY;
        };
    }
}

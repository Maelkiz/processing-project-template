/*
 * Documentation: https://processing.org/reference"
 */

import processing.core.PApplet;

public class App extends PApplet {
    public static void main(String[] args) {
        System.setProperty("sun.java2d.uiScale", "1");
        PApplet.main("App");
    }

    @Override
    public void settings() {
        fullScreen(P2D);
    }

    @Override
    public void setup() {
        keyRepeatEnabled = true;
    }

    @Override
    public void draw() {
        background(0);
        rect(width / 2, height / 2, 100, 100);
    }

    @Override
    public void keyPressed() {

    }
}
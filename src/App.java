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
        frameRate(60);
    }

    @Override
    public void draw() {
        background(0);
        circle(width / 2, height / 2, 150);
    }

    @Override
    public void keyPressed() {

    }

    @Override
    public void keyReleased() {

    }

    @Override
    public void mouseClicked() {

    }
}

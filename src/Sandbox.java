import processing.core.*;

import java.util.ArrayList;

public class Sandbox extends PApplet {

    public static Sandbox singleton;
    public Input input = new Input();

    public ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

    public static void main(String args[]) {
        PApplet.main(new String[]{Sandbox.class.getName()});
    }

    public void settings() {
        size(600, 600, P3D);
        fullScreen();
        singleton = this;
    }

    public void setup()
    {
        gameObjects.add(new Camera());
        gameObjects.add(new Cube(color(0, 0, 100), new Transform(new PVector(width / 2, height / 2, -200))));
    }

    public void draw()
    {
        background(255);
        for(GameObject o : gameObjects)
        {
            o.Draw();
        }
    }

    public void keyPressed()
    {
        input.keyPressed(key);
    }

    public void keyReleased()
    {
        input.keyReleased(key);
    }

}

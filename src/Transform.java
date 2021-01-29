import processing.core.*;

public class Transform {

    public PVector position = new PVector(0, 0, 0);
    public PVector rotation = new PVector(0, 0, 0);
    public PVector scale = new PVector(100, 100, 100);

    public PVector forward = new PVector(0, 0, 1);
    public PVector right = new PVector(1, 0, 0);

    public PVector velocity = new PVector(0, 0, 0);

    public Transform(PVector p)
    {
        position = p;
    }
}

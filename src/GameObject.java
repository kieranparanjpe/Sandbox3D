import processing.core.PApplet;
import processing.core.PVector;

public class GameObject {

    public Transform transform = new Transform(new PVector(0, 0, 0));

    protected Sandbox sketch;

    public GameObject()
    {
        sketch = Sandbox.singleton;
    }

    public void Draw()
    {

    }
}

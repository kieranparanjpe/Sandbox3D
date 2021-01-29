import processing.core.*;

public class Cube extends GameObject
{
    private int colour;

    public Cube(int c)
    {
        colour = c;
    }

    public Cube(int c, Transform t)
    {
        transform = t;
        colour = c;
    }

    @Override
    public void Draw()
    {
        sketch.pushMatrix();

        sketch.translate(transform.position.x, transform.position.y, transform.position.z);
        sketch.rotateX(transform.rotation.x);
        sketch.rotateY(transform.rotation.y);
        sketch.rotateZ(transform.rotation.z);

        sketch.stroke(8);
        sketch.fill(colour);

        sketch.box(transform.scale.x, transform.scale.y, transform.scale.z);

        sketch.popMatrix();
    }

}

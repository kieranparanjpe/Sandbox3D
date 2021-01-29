import processing.core.PVector;

import java.awt.*;

public class Camera extends GameObject
{
    public float sensitivity;

    private PVector focus = new PVector();
    private Robot robot;

    public Camera()
    {
        try {
            //robot = new Robot();
        }
        catch (Exception e)
        {}

        focus.x = sketch.width / 2;
        focus.y = sketch.height / 2;
        focus.z = -sketch.width / 2;

        transform.position.x = sketch.width / 2;
        transform.position.y = sketch.height / 2;
    }

    @Override
    public void Draw()
    {
        sketch.camera(transform.position.x, transform.position.y, transform.position.z,
                focus.x, focus.y, focus.z, 0, 1, 0);

        Move();
        Rotate();
    }

    private void Move()
    {
        int horizontal = 0;
        int vertical = 0;

        if(sketch.input.w)
            vertical = 1;
        if(sketch.input.s)
            vertical = -1;
        if(sketch.input.a)
            horizontal = -1;
        if(sketch.input.d)
            horizontal = 1;

        transform.velocity = transform.forward.copy().mult(vertical);
        transform.velocity.add(transform.right.copy().mult(horizontal));

        transform.position.x += transform.velocity.x;
        transform.position.z += transform.velocity.z;

    }

    private void Rotate()
    {
        transform.rotation.y +=
                ((sketch.mouseX - sketch.pmouseX) < sketch.width / 2 && (sketch.mouseX - sketch.pmouseX) > -sketch.width / 2) ?
                        (sketch.mouseX - sketch.pmouseX) * 0.01 : 0;
        transform.rotation.x += (sketch.mouseY - sketch.pmouseY) * 0.01;

        if(transform.rotation.x > sketch.radians(89))
            transform.rotation.x = sketch.radians(89);

        if(transform.rotation.x < sketch.radians(-89))
            transform.rotation.x = sketch.radians(-89);



        transform.forward.x = sketch.cos(transform.rotation.y);
        transform.forward.y = sketch.tan(transform.rotation.x);
        transform.forward.z = sketch.sin(transform.rotation.y);


        transform.right.x = sketch.cos(transform.rotation.y + sketch.radians(90));
        transform.right.z = sketch.sin(transform.rotation.y + sketch.radians(90));

       // if(sketch.mouseX > sketch.width - 2) robot.mouseMove(3, sketch.mouseY);
        //if(sketch.mouseX < 2) robot.mouseMove(sketch.width-3, sketch.mouseY);

        focus.x = transform.position.x + transform.forward.x * 100;
        focus.y = transform.position.y + (transform.forward.y * 100);
        focus.z = transform.position.z + (transform.forward.z * 100);
    }
}



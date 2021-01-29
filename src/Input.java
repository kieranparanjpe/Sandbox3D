public class Input {

    public boolean w, a, s, d, q, e;

    void keyPressed(char key)
    {
        if(key == 'W' || key == 'w')
        {
            w = true;
        }
        else if(key == 'S' || key == 's')
        {
            s = true;
        }
        else if(key == 'D' || key == 'd')
        {
            d = true;
        }
        else if(key == 'A' || key == 'a')
        {
            a = true;
        }
        else if(key == 'q' || key == 'Q')
        {
            q = true;
        }
        else if(key == 'E' || key == 'e')
        {
            e = true;
        }
    }

    void keyReleased(char key)
    {
        if(key == 'W' || key == 'w')
        {
            w = false;
        }
        else if(key == 'S' || key == 's')
        {
            s = false;
        }
        else if(key == 'D' || key == 'd')
        {
            d = false;
        }
        else if(key == 'A' || key == 'a')
        {
            a = false;
        }
        else if(key == 'q' || key == 'Q')
        {
            q = false;
        }
        else if(key == 'E' || key == 'e')
        {
            e = false;
        }
    }
}

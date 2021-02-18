package chapter3.equality;

import java.awt.*;
import java.util.Objects;

public class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;

        // Color blind equality
        if (!(o instanceof ColorPoint)) {
            return o.equals(this);
        }

        ColorPoint cp = (ColorPoint)o;
        return super.equals(o) && ((ColorPoint)o).color.equals(color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}

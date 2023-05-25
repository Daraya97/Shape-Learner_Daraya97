
import models.Shape;
import models.ShapeDTO;

import java.awt.*;
import java.awt.geom.Path2D;

public class ShapeService {
    static public ShapeDTO[] shapeDTOS = new ShapeDTO[]{
            new ShapeDTO(ShapeType.Square.name(),new Square()),
            new ShapeDTO(ShapeType.Circle.name(),new Circle()),
            new ShapeDTO(ShapeType.Rectangle.name(),new Rectangle()),
            new ShapeDTO(ShapeType.Triangle.name(),new Triangle()),
            new ShapeDTO(ShapeType.Pentagon.name(),new Pentagon()),
            new ShapeDTO(ShapeType.Hexagon.name(),new Hexagon()),
            new ShapeDTO(ShapeType.Octagon.name(),new Octagon()),
            new ShapeDTO(ShapeType.Heptagon.name(),new Heptagon()),
            new ShapeDTO(ShapeType.Nonagon.name(), new Nonagon()),
            new ShapeDTO(ShapeType.Decagon.name(), new Decagon()),
            new ShapeDTO(ShapeType.Ellipse.name(),new Ellipse()),
            new ShapeDTO(ShapeType.Diamond.name(),new Diamond()),
            new ShapeDTO(ShapeType.Trapezoid.name(),new Trapezoid()),
            new ShapeDTO(ShapeType.Parallelogram.name(),new Parallelogram()),
            new ShapeDTO(ShapeType.Cloud.name(),new Cloud()),
            new ShapeDTO(ShapeType.Cross.name(),new Cross()),
            new ShapeDTO(ShapeType.Oval.name(), new Oval()),
            new ShapeDTO(ShapeType.Flower.name(), new Flower()),
            new ShapeDTO(ShapeType.Star.name(), new Star()),
            new ShapeDTO(ShapeType.Heart.name(), new Heart()),
    };
}


enum ShapeType{
    Rectangle,
    Circle,
    Triangle,
    Square,
    Pentagon,
    Hexagon,
    Octagon,
    Ellipse,
    Diamond,
    Trapezoid,
    Parallelogram,
    Cloud,
    Cross,
    Oval,
    Flower,
    Heptagon,
    Nonagon,
    Decagon,
    Star,
    Heart
}

class Trapezoid implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xPoints = {x + width / 4, x + width * 3 / 4, x + width, x};
        int[] yPoints = {y, y, y + height, y + height};
        g.fillPolygon(xPoints, yPoints, 4);
    }
}

class Parallelogram implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xPoints = {x + width / 4, x + width, x + width * 3 / 4, x};
        int[] yPoints = {y, y, y + height, y + height};
        g.fillPolygon(xPoints, yPoints, 4);
    }
}

class Cloud implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.fillOval(x, y, width, height);
        g.fillOval(x + width / 4, y - height / 2, width / 2, height);
        g.fillOval(x + width / 2, y, width / 2, height);
    }
}

class Cross implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int lineThickness = Math.min(width, height) / 5;
        g.fillRect(x, y + height / 2 - lineThickness / 2, width, lineThickness);
        g.fillRect(x + width / 2 - lineThickness / 2, y, lineThickness, height);
    }
}











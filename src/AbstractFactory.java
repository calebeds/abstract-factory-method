//It doesn't follow interface segregation principle, but it's just an example on how abstract factory works
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape == null) {
            return null;
        }
        if(shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }
}

class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color == null) {
            return null;
        }
        if(color.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("Blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
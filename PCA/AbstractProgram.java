abstract class Triangle {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public abstract void type_of_triangle();
}

class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public void type_of_triangle() {
        System.out.println("Equilateral Triangle: Three sides are equal.");
    }
}

class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double equalSide) {
        super(base, equalSide, equalSide);
    }

    @Override
    public void type_of_triangle() {
        System.out.println("Isosceles Triangle: Two sides are equal.");
    }
}

class ScaleneTriangle extends Triangle {
    public ScaleneTriangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    @Override
    public void type_of_triangle() {
        System.out.println("Scalene Triangle: Three sides are different.");
    }
}

public class AbstractProgram {
    public static void main(String[] args) {
        // Example usage
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5.0);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(4.0, 6.0);
        ScaleneTriangle scaleneTriangle = new ScaleneTriangle(3.0, 4.0, 5.0);

        equilateralTriangle.type_of_triangle();
        isoscelesTriangle.type_of_triangle();
        scaleneTriangle.type_of_triangle();
    }
}

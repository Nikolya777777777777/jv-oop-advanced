package core.basesyntax;

public class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + ": " + getClass().getSimpleName());
    }
}

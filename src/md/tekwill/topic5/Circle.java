package md.tekwill.topic5;

public class Circle extends GeometricFigure {
    private double radiusOfCircle; // ENCAPSULATION declarand clasa, variabilele, metodele private pt a evita modificarea valorilor date, pentru a respecta principiul securitatii

    public void setRadiusOfCircle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }

    public double getRadiusOfCircle() {
        return radiusOfCircle;
    }

    @Override
    protected double returnPerimeter() {
        this.perimeterOfTheFigure = 2 * 3.14 * radiusOfCircle;
        return this.perimeterOfTheFigure;
    }

    @Override
    protected double returnAria() {
        this.ariaOfTheFigure = 3.14 * radiusOfCircle * radiusOfCircle;
        return this.ariaOfTheFigure;
    }
}

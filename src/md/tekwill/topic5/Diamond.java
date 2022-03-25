package md.tekwill.topic5;

public class Diamond extends GeometricFigure {
    private double smallDiagonal;
    private double bigDiagonal;
    private double smallSide;
    private double bigSide;

    public void setBigDiagonal(double bigDiagonal) {
        this.bigDiagonal = bigDiagonal;
    }

    public void setSmallDiagonal(double smallDiagonal) {
        this.smallDiagonal = smallDiagonal;
    }

    public void setSmallSide(double smallSide) {
        this.smallSide = smallSide;
    }

    public void setBigSide(double bigSide) {
        this.bigSide = bigSide;
    }

    public double getSmallDiagonal() {
        return smallDiagonal;
    }

    public double getBigDiagonal() {
        return bigDiagonal;
    }

    public double getSmallSide() {
        return smallSide;
    }

    public double getBigSide() {
        return bigSide;
    }

    @Override
    protected double returnPerimeter() {
        this.perimeterOfTheFigure = 2 * smallSide + 2 * bigSide;
        return this.perimeterOfTheFigure;
    }

    @Override
    protected double returnAria() {
        this.ariaOfTheFigure = smallDiagonal * bigDiagonal / 2;
        return this.ariaOfTheFigure;
    }
}

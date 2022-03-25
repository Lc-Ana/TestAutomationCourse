package md.tekwill.topic5;

//extends - principiul INHERITANCE scop reduce repetarea proprietatilor si metodelor, de cod
public class Square extends GeometricFigure {
    public Square(double sizeLengthSide) {
        lengthOfTheSide = sizeLengthSide;
    } // am definit un constructor pentru a putea popula direct obiectul in timpul crearii lui

    private double lengthOfTheSide; //proprietate particulara la cele din super class

    //metode setter si getter pt proprietatile setate private
    public void setLengthOfTheSide(double lengthOfTheSide) {
        this.lengthOfTheSide = lengthOfTheSide;
    }

    public double getLengthOfTheSide() {
        return lengthOfTheSide;
    }

    //override,rescrim metodele sablon - principiul POLIMORFISM, blocul de cod difera; la overloading ne axam pe diferenta parametrilor formali
    @Override
    protected double returnPerimeter() {
        this.perimeterOfTheFigure = 4 * lengthOfTheSide;
        return this.perimeterOfTheFigure;
    }

    @Override
    protected double returnAria() {
        this.ariaOfTheFigure = lengthOfTheSide * lengthOfTheSide;
        return this.ariaOfTheFigure;
    }
}

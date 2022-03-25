package md.tekwill.topic5;
//abstract - principiul ABSTRACTION, clasa sablon(cu metode sablon) mostenita de clase copil
public abstract class GeometricFigure {
    protected double ariaOfTheFigure; // daca era modificatorul "private" atunci in clasele mostenitoare utilizam metodele getter a acestor proprietati?
    protected double perimeterOfTheFigure; // aceste proprietati sunt comune pentru toate clasele, particular mai adaugam parametri unici fiecarei clase copil

    public double getAriaOfTheFigure() {
        return ariaOfTheFigure;
    }

    public double getPerimeterOfTheFigure() {
        return perimeterOfTheFigure;
    }

    protected abstract double returnAria(); // abstract methods=sabloane pentru metodele din clasele copil, suprascrise, principiul POLYMORPHISM

    protected abstract double returnPerimeter();
}

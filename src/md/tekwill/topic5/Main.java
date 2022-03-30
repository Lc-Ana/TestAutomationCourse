package md.tekwill.topic5;

public class Main {
    public static void main(String[] args) {
        Circle circle001 = new Circle();
        Square square001 = new Square(3.21);
        Diamond diamond001 = new Diamond();

        circle001.setRadiusOfCircle(3.74512); // sat a value because this obj is not populated, does not have a constructor
        System.out.println("Tha aria of the manipulated figure is: " + circle001.returnAria());
        System.out.println("Tha perimeter of the manipulated figure is: " + circle001.returnPerimeter());

        //this is the 1st method to print the value of square obj
        System.out.println("Tha aria of the manipulated figure is: " + square001.returnAria()); // this object is populated
        //this is the 2nd method to print the value of square obj
        double hereIsAriaOfSquare = square001.returnAria();
        System.out.println("Tha aria of the manipulated figure is: " + hereIsAriaOfSquare);
        //this is the 3rd method to print the value of square obj
        System.out.println("Tha aria of the manipulated figure is: " + square001.getAriaOfTheFigure());

        System.out.println("Tha perimeter of the manipulated figure is: " + square001.returnPerimeter());
        System.out.println("Tha perimeter of the manipulated figure is: " + square001.getPerimeterOfTheFigure());//de ce returneaza 0 daca o las fara primul print square001.returnPerimeter()??

        diamond001.setBigDiagonal(2.31);
        diamond001.setSmallDiagonal(1.11);
        diamond001.setBigSide(5.12);
        diamond001.setSmallSide(4.54);
        double ariaDiamond = diamond001.returnAria();
        System.out.println("Tha aria of the manipulated figure is: " + ariaDiamond);
        double perimeterDiamond = diamond001.returnPerimeter();
        System.out.println("Tha perimeter of the manipulated figure is: " + perimeterDiamond);

    }
}

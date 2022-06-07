package EasyJava.ch04;

public class Car {
    private String color;
    private static int numberOfCar = 0;
    private static int numOfRedCar = 0;

    Car( String color ){
        setColor(color);
        if (color == "red" || color == "RED") {
            setNumberOfCar();
            setNumOfRedCar();

        } else {
        setNumberOfCar();
        }
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }
    public void setNumberOfCar() {
        numberOfCar++;
        this.numberOfCar = numberOfCar;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }
    public void setNumOfRedCar() {
        numOfRedCar++;
        this.numOfRedCar = numOfRedCar;
    }
} // end of class


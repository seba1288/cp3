public class Person {
    public String name;
    public int width;
    public int hight;
//     c.	setWeightAndHeight(weight,height)
// d.	calculateBMI() – calculates Body Mass Index
// e.	displayRecord() – displays full info (name, weight, height, and BMI)

    public void setWeightAndHeight(int width, int hight) {
        this.width = width;
        this.hight = hight;
    }

    public double calculateBMI() {
        return this.width / (this.hight * this.hight);
    }

    public void displayRecord() {
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.width);
        System.out.println("Height: " + this.hight);
        System.out.println("BMI: " + this.calculateBMI());
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int width, int hight) {
        this.name = name;
        this.width = width;
        this.hight = hight;
    }
}

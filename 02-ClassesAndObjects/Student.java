public class Student {
    String name;        /*a.	Object attributes: (1) student ID card, (2) whether the student ID card is valid or not, (3) semester number, (4) average grade
    b.	Object behaviors: (1) display the student’s name, semester number and average grade, (2) change the status of student ID card (valid/invalid), (3) display the student’s name, ID card number and whether the ID card is valid (you can use ?: operator)
     */
    int age;
    int id;
    boolean isValid;
    int semester;
    float averageGrade;


    void  sayHello() {
        System.out.println("HI!");
    }
    void studentIdInfo(){
        System.out.println("Student name: "+ this.name);
        System.out.println("Student id: "+ this.id);
        System.out.println("Student id is valid: "+ this.isValid);

    }
    void changeIdCardStatus() {
        this.isValid = !this.isValid;
    }
    void studentInfo() {
        System.out.println("Student name: "+ this.name);
        System.out.println("Student semester: "+ this.semester);
        System.out.println("Student average grade: "+ this.averageGrade);
    };

    void displayName() {
        System.out.println("Student name: "+ this.name);
    }

    void  displayAge() {
        System.out.println("Student age: " + this.age);
    }

    
}

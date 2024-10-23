public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Hello worlds");
        Student s = new Student();
        s.name = "seba";
        s.age = 20;
        s.id = 231419;
        s.isValid = true;
        s.averageGrade = 4.03f;
        s.semester = 3;

        System.out.println(s.name + "," + s.age);
        s.studentInfo();
        s.changeIdCardStatus();
        s.studentIdInfo();

        /*s.sayHello();
        s.displayAge();
        s.displayName();
        w.name = "seba2";
        w.age = 21;
        System.out.println(w.name + "," + w.age);
        w.sayHello();
        w.displayAge();
        w.displayName(); */
    }
}

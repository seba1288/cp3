public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Anna", 21);
        
        System.out.println("Age: " + p.getAge());
        
        System.out.println("Is adult: " + p.isAdult());
        
        p.setAge(17);
        
        System.out.println("Is adult: " + p.isAdult());
        System.out.println(p.toString());
    }
}
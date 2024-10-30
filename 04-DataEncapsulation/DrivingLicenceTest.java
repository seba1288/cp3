public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setName("jACk");
        dl.setSurname("Smith");
        dl.setAddress("123 Main St");
        dl.setPostalCode("12345");
        dl.setCity("London");
        dl.setDrivingLicenseNumber("123456789");
        dl.setYearOfIssue(2019);
        dl.setDrivingLicenseCategory("B");
        System.out.println("Name: " + dl.getName());
        System.out.println("Surname: " + dl.getSurname());
        System.out.println("Address: " + dl.getAddress());
        System.out.println("Postal Code: " + dl.getPostalCode());
        System.out.println("City: " + dl.getCity());
        System.out.println("Driving License Number: " + dl.getDrivingLicenseNumber());
        System.out.println("Year of Issue: " + dl.getYearOfIssue());
        System.out.println("Driving License Category: " + dl.getDrivingLicenseCategory());
        System.out.println(dl.DisplayData());
        System.out.println(dl.toString());
    }
}
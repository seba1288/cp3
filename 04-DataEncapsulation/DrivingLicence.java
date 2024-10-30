public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseNumber;
    private int yearOfIssue;
    private String drivingLicenseCategory;

    public String DisplayData() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Address: " + address + "\n" +
                "Postal Code: " + postalCode + "\n" +
                "City: " + city + "\n" +
                "Driving License Number: " + drivingLicenseNumber + "\n" +
                "Year of Issue: " + yearOfIssue + "\n" +
                "Driving License Category: " + drivingLicenseCategory;
    }

    public void setName(String name) {
        this.name = name;
        String corectName = name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
        this.name = corectName;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= 1980 && yearOfIssue <= 2024) {
            System.out.println("Invalid year of issue");
            return;
        }
        this.yearOfIssue = yearOfIssue;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public String getDrivingLicenseCategory() {
        return drivingLicenseCategory;
    }
    public String toString() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Address: " + address + "\n" +
                "Postal Code: " + postalCode + "\n" +
                "City: " + city + "\n" +
                "Driving License Number: " + drivingLicenseNumber + "\n" +
                "Year of Issue: " + yearOfIssue + "\n" +
                "Driving License Category: " + drivingLicenseCategory;
    }

}
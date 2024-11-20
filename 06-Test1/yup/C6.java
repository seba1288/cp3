public class C6 {
    private String name;
    private float grade;
    private boolean passed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.substring(0,1).toUpperCase()+ name.substring(1, name.length()).toLowerCase();
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = (float)grade;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

   

}

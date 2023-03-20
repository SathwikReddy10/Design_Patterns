package builder_design;

public class Person{
    private String name;
    private int age;
    private String address;
    private String gender;
    private String dob;
    private String placeOfBirth;
    private String workingAt;
    private String maritalStatus;
    private String salary;

    public  Person(){

    }
    public Person(String name, int age, String address, String gender, String dob, String placeOfBirth, String workingAt, String maritalStatus, String salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.placeOfBirth = placeOfBirth;
        this.workingAt = workingAt;
        this.maritalStatus = maritalStatus;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setWorkingAt(String workingAt) {
        this.workingAt = workingAt;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", workingAt='" + workingAt + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
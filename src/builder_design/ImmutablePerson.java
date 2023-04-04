package builder_design;

public class ImmutablePerson {
    private String name;
    private int age;
    private String address;
    private String gender;
    private String dob;
    private String placeOfBirth;
    private String workingAt;
    private String maritalStatus;
    private String salary;

    public ImmutablePerson(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
        this.gender = personBuilder.gender;
        this.dob = personBuilder.dob;
        this.placeOfBirth = personBuilder.placeOfBirth;
        this.workingAt = personBuilder.workingAt;
        this.maritalStatus = personBuilder.maritalStatus;
        this.salary = personBuilder.salary;
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
package builder_design;

public class PersonBuilder{
    String name;
    int age;
    String address;
    String gender;
    String dob;
    String placeOfBirth;
    String workingAt;
    String maritalStatus;
    String salary;
    
    public PersonBuilder(String name, int age, String gender, String dob) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PersonBuilder setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public PersonBuilder setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }

    public PersonBuilder setWorkingAt(String workingAt) {
        this.workingAt = workingAt;
        return this;
    }

    public PersonBuilder setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public PersonBuilder setSalary(String salary) {
        this.salary = salary;
        return this;
    }
    public Person buildMutablePerson(){
        return new Person(this.name,this.age,this.address,this.gender,this.dob,this.placeOfBirth,this.workingAt,this.maritalStatus,this.salary);
    }
    
    public PersonBuilder personBuilder;
    
    public ImmutablePerson buildImmutablePerson(){
        return new ImmutablePerson(personBuilder);
    }
}
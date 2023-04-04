package builder_design;

public class Main {
	public static void main(String[] args) {
	
		Person person1 = new PersonBuilder("Sathwik",22,"male","01/06/2000").buildMutablePerson();
	    System.out.println(person1);
	
	    //can set optional parameters
	    Person person2 = new PersonBuilder("Sathwik",22,"male","01/06/2000").setMaritalStatus("single").setWorkingAt("zemoso").buildMutablePerson();
	    System.out.println(person2);
	    //Yes, the same result can be achieved by using setters
	    Person person = new Person();
	    person.setName("Sathwik");
	    person.setAddress("Hyd");
	    person.setGender("Male");
	
	    // mutable
	    person2.setAddress("hyderabad");
	    System.out.println(person2);
	    //immutable
	    ImmutablePerson immutablePerson = new PersonBuilder("Sathwik",22,"male","01/06/2000").setAddress("pune").setSalary("3400000").setMaritalStatus("single").buildImmutablePerson();
	    //no methods are available to mutate
	    System.out.println(immutablePerson);
	}
}

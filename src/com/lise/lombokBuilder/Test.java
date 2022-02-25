package com.lise.lombokBuilder;

public class Test {

	public static void main(String[] args) {

//		This is instance creation for User data Members...
		User u1= User.builder().name("TOM").age(29).build();
		System.out.println("User class instance : "+u1.getName()+" "+ u1.getAge());
		
		User u2= User.builder().name("RUN-RUN").build();
		System.out.println("User class instance : "+u2.getName()+" "+ u2.getAge());
		
		User u3= User.builder().build();
		System.out.println("User class instance : "+u3.getName()+" "+ u3.getAge());
		
//		This is instance creation for Person data member using Constructor initialization...
		Person p1= Person.builder().name("Peter").age(25).build();
		System.out.println("Person class instance : "+p1.getName()+" "+ p1.getAge()+" "+ p1.getRole()+ " "+ p1.isActive());
		
//		This is instance creation for Person data member using Constructor initialization...		
		Customer c1=Customer.builder().name("Lise").age(60).build();
		System.out.println("Customer class instance : "+c1.getName()+" "+c1.getAge()+" "+c1.getCity()+" "+c1.isActive());
	
	}
}

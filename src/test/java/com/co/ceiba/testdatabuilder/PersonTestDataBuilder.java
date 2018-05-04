package com.co.ceiba.testdatabuilder;

import com.co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder( ) {
		name = "Ceiba";
		lastName = "Software House";
	}
	
	public PersonTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person build() {
		return new Person(name, lastName);
	}
	
	public static PersonTestDataBuilder aPerson() {
		return new PersonTestDataBuilder();
	}

}

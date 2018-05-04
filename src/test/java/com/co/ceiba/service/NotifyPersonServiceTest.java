package com.co.ceiba.service;

import static com.co.ceiba.testdatabuilder.PersonTestDataBuilder.aPerson;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.co.ceiba.domain.Person;

public class NotifyPersonServiceTest {
	
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup() {
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notifyTest() {
		//Arrange
		Person person = aPerson().build();
		//Act
		String message = notifyPersonService.notify(person);
		//Assert
		Assert.assertNotNull(message);
		
		
	}

}

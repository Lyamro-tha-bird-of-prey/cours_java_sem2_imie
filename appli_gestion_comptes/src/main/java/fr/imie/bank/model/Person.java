package main.java.fr.imie.bank.model;

import java.time.LocalDate;
import java.util.List;

public class Person implements BankAccountDao {
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate birthDate;

	
	public Person() {
		super();
	}


	public Person(String firstName, String lastName, String email, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "prénom = " + firstName + ", nom = " + lastName + ", email = " + email + ", date de naissance = "
				+ birthDate;
	}
	@Override
	public List<BankAccount> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BankAccount findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void save(BankAccount person) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saveAll(List<BankAccount> people) {
		// TODO Auto-generated method stub
		
	}
}

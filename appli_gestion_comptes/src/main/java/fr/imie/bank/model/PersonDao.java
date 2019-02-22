package main.java.fr.imie.bank.model;

import java.util.List;

public interface PersonDao extends Dao<Person> {

	public List<Person> findAll();

	public Person findById(int id);

	public void save(Person person);

	public void saveAll(List<Person> people);

}

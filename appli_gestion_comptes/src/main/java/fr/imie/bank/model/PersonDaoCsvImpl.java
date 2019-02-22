package main.java.fr.imie.bank.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import main.java.fr.imie.bank.DateUtils;

public class PersonDaoCsvImpl implements PersonDao {
	
	static String head = "id,prenom,nom,email,dateNaissance\n";
	static {
		// TODO utiliser FileWriter et BufferedReader/FileReader
		
		
		
		try {
			PrintWriter fw = new PrintWriter("Persons.csv");
			fw.println(head);
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}}
		

	@Override
	public List<Person> findAll() {
		List<Person> results = new ArrayList<Person>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("Persons.csv"));
			
			String[] elem = null;
			String line = br.readLine();
			while (line != null) {
				if (line != head) {
					elem = line.split(",");
			        Person per = new Person(elem[1], elem[2], elem[3], DateUtils.toDate(elem[4]));
			        results.add(per);
				}

			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return results;
	}

	@Override
	public Person findById(int id) {
		String sid = "" + id;
		String line = null;
		String[] sline = null;
		
		Person result = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Persons.csv"));
			line = br.readLine();
			while (line != null) {
				if (line != head) {
					sline = line.split(",");
					if (sline[0] == sid) {
						result = new Person(sline[1], sline[2], sline[3], DateUtils.toDate(sline[4]));
						
					}
				}
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public void save(Person person) {
		int id = 0;
		try {
			PrintWriter fw = new PrintWriter("Persons.csv");
			id++;
			fw.println(id + "," + person.getFirstName() + "," + person.getLastName() + "," + person.getEmail() + "," + person.getBirthDate() + "\r");
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void saveAll(List<Person> people) {
		int id = 0;
		try {
			PrintWriter fw = new PrintWriter("Persons.csv");
			for (Person pers:people) {
				fw.println(id + "," + pers.getFirstName() + "," + pers.getLastName() + "," + pers.getEmail() + "," + pers.getBirthDate() + "\n");
			}
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
}

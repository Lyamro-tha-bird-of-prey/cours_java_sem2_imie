package main.java.fr.imie.bank.model;

import java.math.BigDecimal;
import java.util.List;

public class BankAccount implements BankAccountDao {
	private String number;
	private BigDecimal balance;
	
	@Override
	public List<BankAccount> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BankAccount findById(int id) {
		
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

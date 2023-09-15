package ecommerceDemo.dataAccess.abstracts;

import java.util.List;

import ecommerceDemo.entites.concretes.Register;

public interface RegisterDao {

	public void add(Register register);
	public void update(Register register);
	public void delete(Register register);
	
	Register get(int id);
	List<Register> getAll();

}


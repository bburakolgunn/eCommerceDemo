package ecommerceDemo.dataAccess.concretes;

import java.util.List;

import ecommerceDemo.dataAccess.abstracts.RegisterDao;
import ecommerceDemo.entites.concretes.Register;

public class HibernateRegisterDao implements RegisterDao {

	@Override
	public void add(Register register) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile eklendi :"+  register.getEmail());
	}

	@Override
	public void update(Register register) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Register register) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Register get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Register> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

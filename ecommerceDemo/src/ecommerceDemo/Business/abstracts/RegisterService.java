package ecommerceDemo.Business.abstracts;

import java.util.List;

import ecommerceDemo.entites.concretes.Register;

public interface RegisterService {

	void SignUp(Register register);
	List<Register> getAll();
}

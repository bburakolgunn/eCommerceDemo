package ecommerceDemo.Business.abstracts;

import ecommerceDemo.entites.concretes.Register;

public interface RegisterCheckService {
	
	boolean FirstNameCheck(Register register);
	boolean LastNameCheck(Register register);
	boolean PasswordCheck(Register register);
	boolean EmailCheck(Register register);
	boolean EmailControl(Register register);
}

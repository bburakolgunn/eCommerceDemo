package ecommerceDemo;

import ecommerceDemo.Business.abstracts.RegisterService;
import ecommerceDemo.Business.concretes.RegisterCheckManager;
import ecommerceDemo.Business.concretes.RegisterManager;
import ecommerceDemo.core.OceanLoggerManagerAdapter;
import ecommerceDemo.dataAccess.concretes.HibernateRegisterDao;
import ecommerceDemo.entites.concretes.Register;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegisterService registerService = new RegisterManager(new RegisterCheckManager(),new HibernateRegisterDao(),new OceanLoggerManagerAdapter());
		Register register = new Register(1,"Boris ", "Johnson", "112454", "sivas");
		Register register2 = new Register(1,"Margaret", "Tech", "457983", "sivas");
		registerService.SignUp(register);
		registerService.SignUp(register2);
	}

}

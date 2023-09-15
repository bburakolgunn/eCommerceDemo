package ecommerceDemo.Business.concretes;

import java.util.List;

import ecommerceDemo.Business.abstracts.RegisterService;
import ecommerceDemo.core.LoggerService;
import ecommerceDemo.dataAccess.abstracts.RegisterDao;
import ecommerceDemo.entites.concretes.Register;

public class RegisterManager implements RegisterService {
	
	 RegisterDao registerDao;
	 RegisterCheckManager registerCheckManager;
	 LoggerService loggerService;

	


	
	public RegisterManager(RegisterCheckManager registerCheckManager, RegisterDao registerDao,
			LoggerService loggerService) {
		super();
		this.registerDao = registerDao;
		this.registerCheckManager = registerCheckManager;
		this.loggerService = loggerService;
	}



	@Override
	public void SignUp(Register register) {
		// TODO Auto-generated method stub
		
		if(registerCheckManager.FirstNameCheck(register) && registerCheckManager.LastNameCheck(register) &&
				registerCheckManager.PasswordCheck(register) && registerCheckManager.EmailCheck(register) && registerCheckManager.EmailControl(register)) {
			System.out.println("Kullanıcı Kaydedildi");
			registerDao.add(register);
			
			loggerService.logToSystem("Kullanıcı eklendi");
		}else {
			System.out.println("Kayıt başarısız.");
		}
		
	}



	@Override
	public List<Register> getAll() {
		// TODO Auto-generated method stub
		return null;
	}




}

package ecommerceDemo.Business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ecommerceDemo.Business.abstracts.RegisterCheckService;
import ecommerceDemo.entites.concretes.Register;


@SuppressWarnings("unused")
public class RegisterCheckManager implements RegisterCheckService {
	
	List<Register> registers = new ArrayList<Register>();

	@Override
	public boolean FirstNameCheck(Register register) {
		if(register.getFirstName().length()<1) {
			System.out.println("İsmin en az 2 karakterle yazılmalıdır.");
			return false;
		}
		
		else {
			if(register.getFirstName().isEmpty()){
				System.out.println("Boş bırakılmamalıdır.");
		return false;
		}
	}
	return true;	
	}

	@Override
	public boolean LastNameCheck(Register register) {
		if(register.getLastName().length()<1) {
			System.out.println("Soyadın en az 2 karakterle yazılmalıdır.");
			return false;
		}
		
		else {
			if(register.getLastName().isEmpty()){
				System.out.println("Boş bırakılmamalıdır.");
		
		return false;
	}
}
		return true;
	}
	@Override
	public boolean PasswordCheck(Register register) {
		
		if(register.getPassword().length()<5) {
			System.out.println("Parolan en az 6 karakterle yazılmalıdır.");
			return false;
		}
		
		else {
			if(register.getPassword().isEmpty()){
				System.out.println("Boş bırakılmamalıdır.");
		
		return false;
	}
}
		return true;
	}

	@Override
	public boolean EmailCheck(Register register) {
	
		
	Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",Pattern.CASE_INSENSITIVE);
	Matcher m = p.matcher(register.getEmail());	
	if(m.find()) {
		System.out.println("Özel ifadeler kullanılmıştır");
		return false;
	}
	
	return true;
	
	}

	@Override
	public boolean EmailControl(Register register) {
		for(Register reg : registers ) {
			if(reg.getEmail() == register.getEmail()) {
				System.out.println("Seçtiğiniz kullanıcı maili kullanılmıştır.");
				
				return false;
			}
		}
		registers.add(register);
		return true;
		
	}

}

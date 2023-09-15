package ecommerceDemo.core;

import ecommerceDemo.entites.OceanLogger.OceanLoggerManager;

public class OceanLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		OceanLoggerManager manager = new OceanLoggerManager();
		manager.log(message);
	}

}

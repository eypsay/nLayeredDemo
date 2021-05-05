package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		//Dis ortamdan geldigi icin new sorun olmaz.DpINj ilede yapýalabilir
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}

}

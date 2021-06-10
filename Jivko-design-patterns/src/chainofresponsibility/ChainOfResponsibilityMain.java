package chainofresponsibility;

public class ChainOfResponsibilityMain {

	public static void main(String[] args) {


		Logger errorLogger = new ErrorLogger();
		Logger warnLogger = new WarnLogger();
		Logger infoLogger = new InfoLogger();
		
		errorLogger.setNextLogger(warnLogger);
		warnLogger.setNextLogger(infoLogger);
		
		
		errorLogger.logMessage(2, "Test message");
		errorLogger.logMessage(5, "QA test");

	}

}

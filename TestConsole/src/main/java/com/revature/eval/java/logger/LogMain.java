package com.revature.eval.java.logger;

public class LogMain {

	public static void main(String[] args) {
		MyLogger.logger.info("Program Started");
		int num;
		MyLogger.logger.warn("The variable 'num' is not used");
		try {
			int x = 1/10;
		} catch (ArithmeticException e) {
			MyLogger.logger.error(e.getMessage());
		}
		MyLogger.logger.info("Program ended");
	}

}

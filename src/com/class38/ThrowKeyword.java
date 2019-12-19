package com.class38;

public class ThrowKeyword {

		public static void main(String[] args) {
			System.out.println("Beginning");
			callingExceptionMethod();
			System.out.println("End");
		}

		public static void throwingException() {
			System.out.println("Creating an exception");
			ArithmeticException ae = new ArithmeticException();
			throw (ae);
		}

		public static void callingExceptionMethod() {

			try {
				throwingException();
			} catch (ArithmeticException ae) {
				System.out.println("Arithemtic E got caught");
			}
		}
	}


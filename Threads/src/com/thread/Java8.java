package com.thread;

public class Java8 {

	public static void main(String[] args) {

		Java8 java = new Java8();
		try {
			java.getAge(21);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void getAge(int age) throws MyException {
		if (age < 18) {
			throw new MyException("Age less than 18");
		} else {
			System.out.println("Sucess");
		}

	}

}

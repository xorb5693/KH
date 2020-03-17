package kh.java.run;

import kh.java.test.DBTest;

public class Run {

	public static void main(String[] args) {
		DBTest test = new DBTest();
		test.deleteEmp();
		test.main();
	}
}

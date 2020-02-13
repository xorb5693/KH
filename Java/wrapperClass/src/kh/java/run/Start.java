package kh.java.run;

import kh.java.wrap.Calculator;
import kh.java.wrap.Wrap;

public class Start {

	public static void main(String[] args) {

		Wrap w = new Wrap();
		w.wrapTest();
		
		Calculator calc = new Calculator();
		calc.start();
	}

}

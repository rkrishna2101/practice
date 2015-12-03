package com.flipkart.placeorder;

import java.lang.instrument.Instrumentation;

public class TestJavaAgent {

	public static void premain(String s, Instrumentation inst){
		System.out.println("pre main");
	}
}

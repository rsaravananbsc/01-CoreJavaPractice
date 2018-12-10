package Multithreading;

import java.io.IOException;

public class Execution {

	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("calc");
		System.err.println("CALCULATOR IS OPENED");
	}
}

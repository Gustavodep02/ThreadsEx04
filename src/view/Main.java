package view;

import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Colocacao:");
		Thread sapo1 = new ThreadSapo();
		sapo1.start();
		Thread sapo2 = new ThreadSapo();
		sapo2.start();
		Thread sapo3 = new ThreadSapo();
		sapo3.start();
		Thread sapo4 = new ThreadSapo();
		sapo4.start();
		Thread sapo5 = new ThreadSapo();
		sapo5.start();
		
	}

}

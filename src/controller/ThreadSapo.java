package controller;

import java.util.Random;

public class ThreadSapo extends Thread{

	public ThreadSapo() {
		
	}
	public void  run() {
		correr();
	}
	private void correr() {
		int maxSalto = 3;
		int chegada = 30;
		int salto;
		int distancia=0;
		
		Random gerador = new Random();
		while(distancia <chegada) {
			salto = gerador.nextInt(maxSalto);
			distancia = distancia +salto;
		}
		System.out.println("Sapo: "+getId());
	}

}

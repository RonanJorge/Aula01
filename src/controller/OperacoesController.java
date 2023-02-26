package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public void vetor100000() {
		int [] vetor = new int[100000];
		double tempoInicial = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		System.out.print("Tempo = "+ tempoTotal + " nano segundos = " + tempoTotal/Math.pow(10, 9)+ " segundos");
	}
}

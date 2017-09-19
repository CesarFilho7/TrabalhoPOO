package trabalho;

import java.util.Random;

public class Partida {
	public String data;
	public String hora;
	public String campeonato;
	Time time1;
	Time time2;
	Random random = new Random();
	
	public String Jogar() {
		int total = time1.forca + time2.forca;
		int probabilidadeTime1 = (100*time1.forca)/total;
		int x = random.nextInt(101);
		System.out.println("Random: " + x);
		System.out.println("Prob: " + probabilidadeTime1);
		
		if(Math.abs(x - probabilidadeTime1) <= 10) {
			return " Empate pelo(a) " + campeonato;
		}
		
		else if(x < probabilidadeTime1) {
			return time1.toString() + " Venceu pelo(a) " + campeonato;
		}else if(x > probabilidadeTime1) {
			return time2.toString() + " Venceu pelo(a) " + campeonato;
		}else {
			return "Partida não aconteceu";
		}
	}
}


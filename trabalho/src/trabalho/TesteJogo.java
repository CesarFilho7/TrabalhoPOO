package trabalho;

import javax.swing.JOptionPane;

public class TesteJogo {
	public static void main(String[] Args) {
		
		String nomeTime1 = JOptionPane.showInputDialog("Digite o nome do time 1: ");
		String nomeTime2 = JOptionPane.showInputDialog("Digite o nome do time 2: ");
		
		Time time1 = new Time(nomeTime1);
		Time time2 = new Time(nomeTime2);
		
		int forcaTime1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a for�a do time 1: " + time1.toString()));
		int forcaTime2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a for�a do time 2: " + time2.toString()));
		
		time1.forca = forcaTime1;
		time2.forca = forcaTime2;
		
		String campeonato = JOptionPane.showInputDialog("Digite o nome do campeonato: ");
		
		Partida partida = new Partida();
		partida.campeonato = campeonato;
		partida.time1 = time1;
		partida.time2 = time2;
		String resultado = partida.Jogar();
		JOptionPane.showMessageDialog(null, resultado);
	}
}

package exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		int numero = 0;
		int resultado = 1;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
		
		for(int index = 2; index <= numero || numero == 0; index++) {
			if (numero == 0){
				resultado = 1;
				break;
			} else {
				resultado *= index;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Resultado " + numero + "!: " + resultado);
	}

}
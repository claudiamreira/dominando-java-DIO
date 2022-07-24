package exceptions;

import javax.swing.JOptionPane;

public class UncheckedException {
	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Numerador: ");
		String b = JOptionPane.showInputDialog("Denominador: ");
		
		try {
			int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
			JOptionPane.showMessageDialog(null, " Resultado: " + resultado);
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, " Entrada inválida, informe um número inteiro! " + e.getMessage());
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, " Impossivel dividir um número por 0! ");
		} 
		finally { 
			System.out.println("Chegou no finally!");
		}
		
		
		System.out.println("O código continua...");
	}
	
	public static int dividir(int a, int b) {
		return a / b;
		}
}

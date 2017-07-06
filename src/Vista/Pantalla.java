package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pantalla {

	public String ingresarValor(){
		
		JFrame frame = new JFrame("cualquiera");
		
		
		String ingresado = JOptionPane.showInputDialog( frame, "Inserte Nombre Empleado", "");
		
		return ingresado;
	}
	
	public String ingresarValor2(){
		JFrame frame= new JFrame("cualquiera");
		
		String ingresado2 = JOptionPane.showInputDialog(frame," Por favor inserte N° Documento", "");
		
		return ingresado2;
		
	}
	
	public void mostrarMensaje( String mensaje ){
		
		JFrame frame = new JFrame("etc");
		
		JOptionPane.showMessageDialog( frame, mensaje );
		
		
	}
}

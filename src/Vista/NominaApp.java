package Vista;

import Controlador.Logica;
import Modelo.Empleado;

public class NominaApp {
	public static void main(String[] args) {
		
		Pantalla vista = new Pantalla();
		Logica controlador = new Logica();
		
		String nombreEmpleado = vista.ingresarValor();
		Empleado empleado = controlador.buscarEmpleado(nombreEmpleado);

		if (empleado!=null){
			vista.mostrarMensaje( "Bienvenido " + empleado.getNombre() );
		}else {
			vista.mostrarMensaje( "Error" ); 
		
		}
		
		String documentoEmpleado = vista.ingresarValor2();
		Empleado documento = controlador.buscarDocumento(documentoEmpleado);

		if (documento != null){
			vista.mostrarMensaje( "Nombre :" + empleado.getNombre() +"|Documento :" + empleado.getDocumento() +" | Edad : " + empleado.getEdad() + " | Sueldo : "+ empleado.getSueldo());
		}else {
			vista.mostrarMensaje( "El usuario no existe" ); 
		}
		

		
	}
}

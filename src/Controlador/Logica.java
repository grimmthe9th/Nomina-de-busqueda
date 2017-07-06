package Controlador;

import Modelo.Empleado;
import Modelo.Nomina;

public class Logica {
	
	public Empleado buscarEmpleado( String nombre ){
		
		Empleado encontrado = null;
		
		Nomina basededatos = new Nomina();

		Empleado[] misempleados = basededatos.getEmpleados();
		
		for (int i = 0; i < misempleados.length; i++) {
			
			if ( nombre.equalsIgnoreCase( misempleados[ i ].getNombre() ) ) {
				encontrado = misempleados[ i ];
			}
			
		}
		
		return encontrado;
	}
	
	public Empleado buscarDocumento( String documento ){
		
		Empleado documentoEncontrado = null; 
		
		Nomina basededatos = new Nomina();
		
		Empleado[]documentos = basededatos.getEmpleados();
		
		for (int x = 0; x < documentos.length; x++) {
		
		if (documento.equalsIgnoreCase(documentos[x].getDocumento() ) )  {
			documentoEncontrado = documentos[x]; 
		    }
		}
	
		return documentoEncontrado;
	}	
		
		

	}


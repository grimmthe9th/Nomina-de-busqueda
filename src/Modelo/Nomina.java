package Modelo;

public class Nomina {

		Empleado[] empleados = new Empleado[5];
			
			public Nomina(){
				llenarNomina();
			}
			
			public void llenarNomina(){
				
				Empleado denisa = new Empleado();
				denisa.setNombre("Denisa Hiriart");
				denisa.setDocumento( "27439320" );
				denisa.setEdad(28);
				denisa.setSueldo( 23.448 );
				empleados[ 0 ] = denisa;
				
				Empleado pedro = new Empleado();
				pedro.setNombre("Pedro Monteverde");
				pedro.setDocumento( "40549333" );
				pedro.setEdad(22);
				pedro.setSueldo( 19.432 );
				empleados[ 1 ] = pedro;
			
				Empleado gonzalo = new Empleado();
				gonzalo.setNombre("Gonzalo Amante");
				gonzalo.setDocumento( "37278800" );
				gonzalo.setEdad(24);
				gonzalo.setSueldo( 30.444 );
				empleados[ 2 ] = gonzalo;
				
				Empleado aixa = new Empleado();
				aixa.setNombre("Aixa Sueiro");
				aixa.setDocumento( "39329443" );
				aixa.setEdad(23);
				aixa.setSueldo( 23.448 );
				empleados[ 3 ] = denisa;
			
				Empleado pablo = new Empleado();
				pablo.setNombre("Pablo Emens");
				pablo.setDocumento( "35678932" );
				pablo.setEdad(30);
				pablo.setSueldo( 40.777 );
				empleados[ 4 ] = pablo;
			}
			public Empleado[] getEmpleados(){
				return empleados;
			} 

}

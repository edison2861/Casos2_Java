import java.util.Scanner;
public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre_carrera = "", nombre_turno = "";
		String alumno = "", carrera = "", turno = "";
		
		System.out.println("Alumno: ");
		alumno = sc.nextLine();
		
		System.out.println("Carrera <DS/RC/DG>: ");
		carrera = sc.nextLine();
		
		System.out.println("Turno <M/T/N>: ");
		turno = sc.nextLine();
		
		float monto = 0;
		float dscto = 0;
		
		switch (carrera) {
				
				case "DS":
					nombre_carrera = "Desarrollo de Software";
					monto = 1500;break;
				case "RC":
					nombre_carrera = "Redes y Conectividad";
					monto = 1400;break;
				case "DG":
					nombre_carrera = "Diseño Gráfico";
					monto = 1300;break;
					
				
		}
			switch (turno) {
				case "M":
					nombre_turno = "Mañana";
					dscto = 0.1f ;break;
				case "T":
					nombre_turno= "Tarde";
					dscto = 0.2f ;break;
				case "N":
					nombre_turno = "Noche";
					dscto = 0.15f;break;
			}
		
			float descuento,total_pagar, equivalente_d ;
			
			descuento = monto * dscto;
			total_pagar = monto - descuento;
			equivalente_d = total_pagar / 3.33f ;
			
			System.out.println("-- RESULTADOS --");
			System.out.println("Alumno: "+ alumno);
			System.out.println("Carrera: "+ nombre_carrera);
			System.out.println("Monto: "+ monto);
			System.out.println("Turno: "+ nombre_turno);
			System.out.println("Descuento: "+ descuento);
			System.out.println("Total a pagar: "+ total_pagar);
			System.out.println("Total a pagar en $: "+ equivalente_d);
			
					
		}		
					
		}		
		
	


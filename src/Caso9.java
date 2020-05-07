import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		System.out.print("Ingrese nombre del alumno: ");
		String alumno = sc.nextLine();
		
		System.out.println("Ingrese nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Ingrese nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Ingrese número de asistencia ");
		float asistencia = sc.nextFloat();
		
		
		float promedio, porc_asistencia ;
		String estado = "" ;
		
		promedio = nota1 * 0.3f + nota2 * 0.7f;
		porc_asistencia =  (asistencia / 12) * 100;
		
		if (promedio >= 13);
				else				
					if (asistencia >= 12 * 0.7)
						estado = "Aprobado";
						else	
							estado = "Desaprobado";							

		System.out.println("--- Resultado ---");
		System.out.println("Nombre del alumno: "+ alumno);
		System.out.println("Promedio: 		   "+ promedio);
		System.out.println("Asistencia: 	   "+ df.format(porc_asistencia) + "%");
		System.out.println("Estado:            "+ estado);
	}

}

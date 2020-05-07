import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese número 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese operación [1-6]: ");
		int opc = sc.nextInt();
		
		String operación = "";
		float rpta = 0;
		
		switch (opc) {
			case 1:
				operación = "Suma" ;
				rpta      =n1 + n2 ;
				
			case 2:
				operación = "Resta";
				if (n1>n2)
					rpta = n1 - n2 ;
				else 
					rpta = n2 - n1 ;
			
			case 3:
				operación = "Multiplicación";
				rpta = n1 * n2;
				
			case 4:
				operación = "División";
				rpta = n1 / n2 ;
				
			case 5:
				operación = "Resto";
				if (n2 > 0)
					rpta = n1 % n2 ;
				else
					System.out.println("No es posible hallar el resto entero ");
			case 6:
				operación = "Promedio";
				rpta = (n1 + n2) / 2;
									
		}
		System.out.println("<< RESULTADOS >>");
		System.out.println("Número 1....: "+ n1);
		System.out.println("Número 2....: "+ n2);
		System.out.println("Operación...: "+ operación);
		System.out.println("Respuesta...: "+ rpta);
		

	}

}

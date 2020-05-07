import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese operaci�n [1-6]: ");
		int opc = sc.nextInt();
		
		String operaci�n = "";
		float rpta = 0;
		
		switch (opc) {
			case 1:
				operaci�n = "Suma" ;
				rpta      =n1 + n2 ;
				
			case 2:
				operaci�n = "Resta";
				if (n1>n2)
					rpta = n1 - n2 ;
				else 
					rpta = n2 - n1 ;
			
			case 3:
				operaci�n = "Multiplicaci�n";
				rpta = n1 * n2;
				
			case 4:
				operaci�n = "Divisi�n";
				rpta = n1 / n2 ;
				
			case 5:
				operaci�n = "Resto";
				if (n2 > 0)
					rpta = n1 % n2 ;
				else
					System.out.println("No es posible hallar el resto entero ");
			case 6:
				operaci�n = "Promedio";
				rpta = (n1 + n2) / 2;
									
		}
		System.out.println("<< RESULTADOS >>");
		System.out.println("N�mero 1....: "+ n1);
		System.out.println("N�mero 2....: "+ n2);
		System.out.println("Operaci�n...: "+ operaci�n);
		System.out.println("Respuesta...: "+ rpta);
		

	}

}

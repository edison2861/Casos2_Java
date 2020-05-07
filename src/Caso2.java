import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		String rpta ="Número Impar";
		
		if (n % 2 == 0)
		   rpta = "Número Par";
		  	 	   
		System.out.println("Respuesta: "+ rpta);	
			
			
	}

}

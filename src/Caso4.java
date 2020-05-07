//EDISON MEDINA QUEZADA
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2 ;
		
		System.out.print("Ingrese el primer número: ");
		n1 = sc.nextInt();
		
		System.out.print("Ingrese el segundo número: ");
		n2 = sc.nextInt();
		
		if ( n1 > n2 )
			System.out.println("El segundo número es menor");
		else
			if ( n1 == n2 )
				System.out.println("Los número son iguales");
			else
				System.out.println("El primer número es menor");
		
		

	}

}

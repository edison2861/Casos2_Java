//EDISON MEDINA QUEZADA
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2 ;
		
		System.out.print("Ingrese el primer n�mero: ");
		n1 = sc.nextInt();
		
		System.out.print("Ingrese el segundo n�mero: ");
		n2 = sc.nextInt();
		
		if ( n1 > n2 )
			System.out.println("El segundo n�mero es menor");
		else
			if ( n1 == n2 )
				System.out.println("Los n�mero son iguales");
			else
				System.out.println("El primer n�mero es menor");
		
		

	}

}

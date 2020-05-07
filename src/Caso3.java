import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese número 2: ");
		int n2 = sc.nextInt();
		
		if (n1 == n2) {System.out.println("Los números son iguales: ");
		}
		
		else {
			if (n1 > n2) {
				System.out.println("El primer número es mayor");
		
			}
			else {
				System.out.println("El segundo número es mayor");
			}

		}

	}
}
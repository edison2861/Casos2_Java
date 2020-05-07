//EDISON MEDINA QUEZADA
import java.util.Scanner;
public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota: ");
		int n1 = sc.nextInt();
		
		if (n1 <=7 ) 
		
			System.out.print("Sin Palabras");	
		
		else
			if (n1 <=10)
				System.out.print("Malo");
			else 
				if (n1 <= 14)
					System.out.print("Regular");
				else
					if (n1 <= 17)
						System.out.println("Notable");
					else 
						if (n1 <= 20)
							System.out.println("Excelente");
			
				
		
	}

}

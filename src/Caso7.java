//EDISON MEDINA QUEZADA
import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: ");
		float sueldo = sc.nextFloat();
		
		float impuesto ;
		
		if (sueldo <= 1500) 
			impuesto = (float) (0.03 * sueldo);
		
			else 
				if (sueldo <= 3000)
					impuesto = (float) (0.08 * sueldo);
				else 
					
					 impuesto = (float) (0.12 * sueldo);
		
		System.out.println("Impuesto: "+ impuesto);
		
			
		
		
		
		
	}

}

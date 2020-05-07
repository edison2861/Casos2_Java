//EDISON MEDINA QUEZADA
import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese sueldo: ");
		int sueldo = sc.nextInt();
		
		float impuesto ;
		
		if (sueldo > 2800)
		 	impuesto = (float) (0.05) * (sueldo);
		else
			impuesto = (float) (0.02) * (sueldo);
		
		System.out.println("--RESULTADO--");
		System.out.println("Impuesto calculado: "+ impuesto);
		
		
		
		
	}

}

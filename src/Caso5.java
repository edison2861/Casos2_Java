import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		float total = cantidad * precio;
		float dscto = 0;
		
		
		if (cantidad > 8)
			dscto = (float) 0.1 * total;
		
		System.out.println("<<< Resultados >>>");
		System.out.println("Importe:....."+ total);
		System.out.println("Descuento:..."+ dscto);
		System.out.println("Total:......."+ (total - dscto));
			
		

	}

}

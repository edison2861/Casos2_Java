import java.util.Scanner;
public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String cliente = "", producto = "", pago = "";
		float cantidad ;
		
		System.out.println("Ingrese cliente: ");
		cliente = sc.nextLine();
		
		System.out.println("Ingrese producto [TB/LT/MN/IM]: ");
		producto = sc.nextLine();
		
		System.out.println("Ingrese cantidad: ");
		cantidad = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("Ingrese forma de pago [C1/C2]: ");
		pago = sc.nextLine();
		
		
		float precio = 0 , importe = 0, forma = 0 , total = 0;
		String condi = "", pago2="";
		
		
		
				switch (producto) {
					case "TB": 
						producto = "Tablet";
						precio = 350 ;break;
				
					case "LT":
						producto = "Laptop";
						precio = 2300;break;
						
					case "MN":
						producto = "Monitor";
						precio = 850 ;break;
						
					case "IM":
						producto = "Impresora";
						precio = 680 ;break; 
	}
				importe = precio * cantidad ;
				
				switch (pago) {
					case"C1":
					pago2  = "Contado";
					condi = "Descuento";
					forma = importe * 0.05f;
					total = importe - forma; break;
					
					case"C2":
					pago2  = "Credito";
					condi = "Incremento";
					forma = importe * 0.12f;
					total = importe + forma; break;
					
				}
			System.out.println("Cliente: "       + cliente);
			System.out.println("Producto: "      + producto);
			System.out.println("Precio: "        + precio);
			System.out.println("Cantidad: "      + cantidad);
			System.out.println("Importe: "       + importe);
			System.out.println("Forma de pago: " + pago2);
			System.out.println(""   + condi + ": " + forma);
			System.out.println("Total a pagar: " + total);
			

	}

}

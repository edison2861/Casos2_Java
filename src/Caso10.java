import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		System.out.print("Trabajador: ");
		String empleado = sc.nextLine();
		
		System.out.print("Horas trabajadas: ");
		float horas_t = sc.nextFloat();
		
		System.out.print("Tarifas por horas: ");
		float tarifa = sc.nextFloat();
		
		float importe, bono, dscto, alcanzado ;
		
		importe = horas_t * tarifa;
		
		if (horas_t > 60)
			
			bono = (importe * 0.13f);
		else 
			bono = (importe * 0.04f);
		
		if (horas_t > 54.0)
			
			dscto = (importe * 0.03f);
		else
			dscto = 0;
		
		alcanzado = (horas_t / 70) * 100;
		
		System.out.println("Trabajador: "+ empleado);
		System.out.println("Horas Trabajadas: "+ horas_t);
		System.out.println("Tarifa por horas: "+ tarifa);
		System.out.println("Importe: "+ importe);
		System.out.println("Bono: "+ bono);
		System.out.println("Descuento: "+ dscto);
		System.out.println("Meta alcanzada: "+  alcanzado + "%");
	}

}

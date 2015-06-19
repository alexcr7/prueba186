import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// pocholo
// si usamos void en el tipo de dato en vez de double seria un parametro que te devuelve ya el resultado
public class areacirc 
{

	final static double pi=3.14;
	public static double calculo(double r)
	{
		return (pi*r*r);
	}
	public static void main(String[] args)throws IOException 
	{
	
		//HOLAAA
		
		BufferedReader	leer=new	BufferedReader(new	InputStreamReader(System.in));
		double r;
		do
		{
			System.out.println("introduzca el radio de la circunferencia");
			r=Double.parseDouble(leer.readLine());
		}
		while(r<0);
		System.out.println("el resultado es: " +calculo(r));
	}

}

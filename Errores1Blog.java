package errores1Blog;
import java.io.BufferedReader;
import java.io.IOException;

/**
*
* @author Gaby Nieva
*/
public class Errores1Blog {
/**
* @param args the command line arguments

String nombre;
public static void main(String[] args) {
// Declaración de variables
Double x, y,z;
float a, b, c;

BufredReader bufer = new BufferedReader(new ImputStreamReader());
String entrada;
System.out.println(&quot;Escribe el valor de x: &quot;);
entrada = bufer.readLine();
x= Integer.parseInt(entrada);
System.out.println(&quot;Escribe el valor de y: &quot;);
entrada = bufer.readLine();
y = Double.parseDouble(entrada);
z = y / x;
System.out.println(&quot;El residuo de dividir y ( + y + &quot;) entre x ( &quot; +x + ) es: &quot; + z);
System.out.println(&quot;Escribe el valor de a: &quot;);
entrada = b.readLine();
a = entrada;
System.out.println(&quot;Escribe el valor de b: &quot;);
in = bufer.readLine();
b = Float.parseFloat(entrada);
c = a * b ;
System.out.println(&quot;El resultado de multiplicar a por b es: &quot; + c);

}
System.out.println(&quot;Escribe una letra: &quot;);
entrada = bufer.readLine();
nombre = Entrada.ChartAt(12);
System.out.println(&quot;El nombre que escribiste es: &quot; + Nombre);
}
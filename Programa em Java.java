import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Número para Calcular Tabuada: ");
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + (x * i));
        }
	    
	}
}

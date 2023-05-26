package calculadora;

import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		double numero = 0.0;
		double numero1 = 0.0;
		double numero2 = 0.0;
		double potencia = 0.0;
		double division =0.0;
		double suma = 0.0;
		double resta=0.0;
		double raizcuadrada=0.0;
		boolean menu = false;

		while (menu == false) {
			
			System.out.println("1. Sumar ");
			System.out.println("2. Restar ");
			System.out.println("3. Multiplicar ");
			System.out.println("4. Dividir");
			System.out.println("5 Potencia");
			System.out.println("6 Raiz Cuadrada");
			System.out.println("7 Salir");

			System.out.println("Escribe una de las opciones");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Dime el numero:");
				numero1 = sc.nextDouble();
				System.out.println("Dime otro numero para sumar:");
				numero2 = sc.nextDouble();
				suma = suma(numero1, numero2);
				System.out.println("El resultado es: " + suma);
				System.out.println();
				break;
			}
			case 2: {
				System.out.println("Dime el numero:");
				numero1 = sc.nextDouble();
				System.out.println("Dime otro numero para restar:");
				numero2 = sc.nextDouble();
				resta = resta(numero1, numero2);
				System.out.println("El resultado es: " + resta);
				System.out.println();
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				System.out.println("Dime el numero:");
				numero1 = sc.nextDouble();
				System.out.println("Dime otro numero para dividir:");
				numero2 = sc.nextDouble();
				division = dividir(numero1, numero2);
				System.out.println("El resultado es: " + suma);
				System.out.println();
				
				break;
			}
			case 5: {
				double resulPotencia = 0;

				System.out.println("Dime el numero:");
				numero = sc.nextDouble();
				System.out.println("Dime a que lo quieres elevar:");
				potencia = sc.nextDouble();
				resulPotencia = potencia(numero, potencia);

				System.out.println("El resultado es " + resulPotencia);
				System.out.println();

				break;
			}
			case 6: {
				double resulRaizCuadrada = 0;

				System.out.println("Dime el numero:");
				numero = sc.nextDouble();
				raizcuadrada =numero;
				resulRaizCuadrada = raizcuadrada(numero);

				System.out.println("El resultado es " + resulRaizCuadrada);
				System.out.println();

				break;
			}
			case 7: {
				System.out.println("Adios");
				menu = true;
				break;
			}
			default:
				throw new IllegalArgumentException("Valor incorrecto: " + opcion);
			}

		}
	}

	public static double potencia(double numero1, double potencia) {
		double resultado = 0;
		try {

			resultado = Math.pow(numero1, potencia);

		} catch (Exception e) {
			System.out.println("Error");

		}
		return resultado;

	}

	public static double resta(double numero1, double numero2) {
		double resultado = 0;
		try {

			resultado = numero1 - numero2;

		} catch (Exception e) {
			System.out.println("Error");

		} finally {
			return resultado;
		}

	}
	
	public static double dividir(double numero1, double numero2) {
		double resultado = 0;
		try {

			resultado = numero1/numero2;

		} catch (Exception e) {
			System.out.println("Error");

		} finally {
			return resultado;
		}

	}
	
	public static double raizcuadrada(double numero1) {
		double resultado = 0;
		try {

			resultado = Math.sqrt(numero1) ;

		} catch (Exception e) {
			System.out.println("Error");

		} finally {
			return resultado;
		}

	}

	

	public static double suma(double numero1, double numero2) {

		double resultado = 0;
		try {

			resultado = numero1 + numero2;

		} catch (Exception e) {
			System.out.println("Error");

		} finally {
			return resultado;
		}
	}
}

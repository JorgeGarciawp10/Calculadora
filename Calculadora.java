package caculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		System.out.println("1. Sumar ");
		System.out.println("2. Restar 2");
		System.out.println("3. Multiplicar 3");
		System.out.println("4. Dividir");
		System.out.println("5 Potencia");
		System.out.println("6 Salir");

		System.out.println("Escribe una de las opciones");
		opcion = sc.nextInt();

		switch (opcion) {
		case 1: {
			
			suma(1,1);
			
			break;
		}
		case 2: {
			break;
		}
		case 3: {
			break;
		}
		case 4: {
			break;
		}
		case 5: {
			potencia(2, 2);
			break;
		}
		case 6: {

		}
		default:
			throw new IllegalArgumentException("Valor incorrecto: " + opcion);
		}

	}

	public static void potencia(double numero1, double potencia) {

		try {
			double resultado = 0;

			resultado = Math.pow(numero1, potencia);

			System.out.println("El resultado de " + numero1 + " elevado " + potencia + " es igual: " + resultado);
		} catch (Exception e) {
			System.out.println("Error");

		}
	}
	
	public static void suma(double numero1, double numero2) {

		try {
			double resultado = 0;

			resultado = numero1+numero2;

			System.out.println("El resultado de " + numero1 + " más " + suma + " es igual: " + resultado);
		} catch (Exception e) {
			System.out.println("Error");

		}
	}
	
}

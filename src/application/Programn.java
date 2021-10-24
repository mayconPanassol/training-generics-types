package application;

import java.util.Scanner;

import model.service.PrintService;

public class Programn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();

		System.out.print("How many values? ");
		int numValues = sc.nextInt();

		for (int i = 0; i < numValues; i++) {

			Integer value = sc.nextInt();
			
			ps.addValue(value);

		}

		ps.print();
		
		System.out.println("Fist: " + ps.itemFirst());

		sc.close();
	}

}

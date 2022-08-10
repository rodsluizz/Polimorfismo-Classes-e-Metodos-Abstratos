package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayers> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Annual income: ");
				double aI = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double hE = sc.nextDouble();
				list.add(new Individual(name, aI, hE));
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Annual income: ");
				double aI = sc.nextDouble();
				System.out.print("Number of employees: ");
				int nE = sc.nextInt();
				list.add(new Company(name, aI, nE));
			}
			
		}
		
		System.out.println("TAXES PAID:");
		System.out.println(list.toString());
		
		double sum = 0;
		
		for(TaxPayers tP : list) {
			sum += tP.taxPaid();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}

}

package entities;

public class Company extends TaxPayers{
	
	private int numberOfEmployees;
	
	public Company() {
	}
	
	public Company(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double taxPaid() {
		
		double tP = 0;
		
		if(numberOfEmployees > 10) {
			tP += getAnnualIncome() * 14 / 100; 
		} else {
			tP += getAnnualIncome() * 16 / 100;
		}
		
		return tP;
	}

}

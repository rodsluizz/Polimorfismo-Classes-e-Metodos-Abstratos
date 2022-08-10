package entities;

public class Individual extends TaxPayers{
	
	private Double healthExpenditures;
	
	public Individual() {
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxPaid() {
		
		double tP = 0;
		
		if(getAnnualIncome() < 20000) {
			tP = getAnnualIncome() * 15 / 100;
		} else {
			tP = getAnnualIncome() * 25 / 100;
		}
		
		tP -= getHealthExpenditures() * 50 / 100;
		
		return tP;
	}
	
}

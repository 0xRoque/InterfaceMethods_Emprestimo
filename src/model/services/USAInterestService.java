package model.services;

public class USAInterestService implements InterestService{
	
	private Double interestRate;

	public USAInterestService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}

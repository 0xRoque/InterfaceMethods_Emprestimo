package model.services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();

	default Double payment(Double amount, int months) {
		if(months < 1) {
			throw new InvalidParameterException("Monts must be greater then zero.");
		}
		return amount * Math.pow(1.0 + getInterestRate() /100, months);
	}

}

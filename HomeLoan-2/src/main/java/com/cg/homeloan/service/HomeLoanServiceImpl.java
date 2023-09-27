package com.cg.homeloan.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cg.homeloan.dto.HomeLoanDto;
import com.cg.homeloan.dto.HomeLoanResponse;
import com.cg.homeloan.entity.HomeLoan;
@Service
public class HomeLoanServiceImpl implements HomeLoanService {

	@Override
	public HomeLoan calculate( @Valid HomeLoanDto homeLoanDto) {
	    HomeLoan homeLoan = new HomeLoan();
	    homeLoan.setHomePrice(homeLoanDto.getHomePrice());
	    homeLoan.setZipCode(homeLoanDto.getZipCode());
	    homeLoan.setDownPayment(homeLoanDto.getDownPayment());
	    homeLoan.setDownPaymentPercent(homeLoanDto.getDownPaymentPercent());
	    homeLoan.setLoanAmount(homeLoan.getHomePrice() - homeLoan.getDownPayment());
	    homeLoan.setHoaFeesRate(0.01);
	    homeLoan.setOtherTaxesRate(0.005);
	    homeLoan.setPropertyTaxRate(0.01);
	    homeLoan.setHomeownerInsuranceRate(0.005);

	    // Calculate the principal interest.
	    homeLoan.setPrincipalInterest(homeLoan.getLoanAmount() * (1 + homeLoan.getHoaFeesRate() + homeLoan.getOtherTaxesRate() + homeLoan.getPropertyTaxRate() + homeLoan.getHomeownerInsuranceRate()));

	    // Calculate the HOA fees.
	    homeLoan.setHoaFees(homeLoan.getPrincipalInterest() * homeLoan.getHoaFeesRate());

	    // Calculate the other taxes.
	    homeLoan.setOtherTaxes(homeLoan.getPrincipalInterest() * homeLoan.getOtherTaxesRate());

	    // Calculate the property tax.
	    homeLoan.setPropertyTax(homeLoan.getPrincipalInterest() * homeLoan.getPropertyTaxRate());

	    // Calculate the homeowner insurance.
	    homeLoan.setHomeownerInsurance(homeLoan.getPrincipalInterest() * homeLoan.getHomeownerInsuranceRate());

	    // Calculate the monthly payment.
	    homeLoan.setMonthlyPayment((homeLoan.getPrincipalInterest() + homeLoan.getHoaFees() + homeLoan.getOtherTaxes() + homeLoan.getPropertyTax() + homeLoan.getHomeownerInsurance()) / 12);

	    return homeLoan;
	}

	
}
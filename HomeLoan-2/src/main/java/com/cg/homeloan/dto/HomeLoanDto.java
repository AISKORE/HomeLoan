package com.cg.homeloan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeLoanDto {

	private Double homePrice;
    private String zipCode;
    private Double downPayment;
    private Double downPaymentPercent;
    private Double principalInterest;
    private Double hoaFees;
    private Double otherTaxes;
    private Double propertyTax;
    private Double homeownerInsurance;
    private Double monthlyPayment;
//    private Double loanAmount;

}

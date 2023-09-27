package com.cg.homeloan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HomeLoan {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	  private Long id;
	@NotNull(message = "The home price cannot be null.")
	@Min(value = 1, message = "The home price must be a positive number.")
	    private Double homePrice;
	@NotNull(message = "The zip code cannot be null.")
	@NotEmpty(message = "The zip code cannot be empty.")
	    private String zipCode;
	@NotNull(message = "The down payment cannot be null.")
	@Min(value = 0, message = "The down payment must be a non-negative number.")
	@Max(value = 100, message = "The down payment must be less than or equal to the home price.")
	    private Double downPayment;
	@NotNull(message = "The down payment percent cannot be null.")
	@Min(value = 0, message = "The down payment percent must be a non-negative number.")
	@Max(value = 100, message = "The down payment percent must be less than or equal to 100.")
	    private Double downPaymentPercent;
	    private Double loanAmount;
	    private Double hoaFeesRate;
	    private Double otherTaxesRate;
	    private Double propertyTaxRate;
	    private Double homeownerInsuranceRate;
	    private Double principalInterest;
	    private Double hoaFees;
	    private Double otherTaxes;
	    private Double propertyTax;
	    private Double homeownerInsurance;
	    private Double monthlyPayment;

	    // Constructors, getters, and setters omitted for brevity.

	   
}

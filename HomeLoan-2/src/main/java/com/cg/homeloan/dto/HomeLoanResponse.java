package com.cg.homeloan.dto;

import java.util.HashMap;
import java.util.Map;

public class HomeLoanResponse {

	private Double monthlyPayment;
    private Double principalInterest;
    private Double hoaFees;
    private Double otherTaxes;
    private Double propertyTax;
    private Double homeownerInsurance;

    public HomeLoanResponse() {
    }

    public HomeLoanResponse(Double monthlyPayment, Double principalInterest, Double hoaFees, Double otherTaxes, Double propertyTax, Double homeownerInsurance) {
        this.monthlyPayment = monthlyPayment;
        this.principalInterest = principalInterest;
        this.hoaFees = hoaFees;
        this.otherTaxes = otherTaxes;
        this.propertyTax = propertyTax;
        this.homeownerInsurance = homeownerInsurance;
    }

    public Double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Double getPrincipalInterest() {
        return principalInterest;
    }

    public void setPrincipalInterest(Double principalInterest) {
        this.principalInterest = principalInterest;
    }

    public Double getHoaFees() {
        return hoaFees;
    }

    public void setHoaFees(Double hoaFees) {
        this.hoaFees = hoaFees;
    }

    public Double getOtherTaxes() {
        return otherTaxes;
    }

    public void setOtherTaxes(Double otherTaxes) {
        this.otherTaxes = otherTaxes;
    }

    public Double getPropertyTax() {
        return propertyTax;
    }

    public void setPropertyTax(Double propertyTax) {
        this.propertyTax = propertyTax;
    }

    public Double getHomeownerInsurance() {
        return homeownerInsurance;
    }

    public void setHomeownerInsurance(Double homeownerInsurance) {
        this.homeownerInsurance = homeownerInsurance;
    }

    public Map<String, Double> toMap() {
        Map<String, Double> map = new HashMap<>();
        map.put("monthlyPayment", monthlyPayment);
        map.put("principalInterest", principalInterest);
        map.put("hoaFees", hoaFees);
        map.put("otherTaxes", otherTaxes);
        map.put("propertyTax", propertyTax);
        map.put("homeownerInsurance", homeownerInsurance);
        return map;
    }
}

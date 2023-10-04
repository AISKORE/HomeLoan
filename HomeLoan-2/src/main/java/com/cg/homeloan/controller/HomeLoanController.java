package com.cg.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.Dao.HomeLoanDao;
import com.cg.homeloan.dto.HomeLoanDto;
import com.cg.homeloan.entity.HomeLoan;
import com.cg.homeloan.service.HomeLoanService;

@RestController
public class HomeLoanController {

@Autowired
private HomeLoanService homeLoanService;

@Autowired
private HomeLoanDao homeLoanDao;

@Autowired
public HomeLoanController(HomeLoanService homeLoanService) {
this.homeLoanService = homeLoanService;
this.homeLoanDao = homeLoanDao;
}







@PostMapping("/saveAndCalculate")
public ResponseEntity<HomeLoanDto> saveAndCalculate1(@RequestBody HomeLoan homeLoan) {
    // Calculate the HomeLoan using the service
    HomeLoan calculatedHomeLoan = homeLoanService.calculateHomeLoan(homeLoan);

    // Convert HomeLoan to HomeLoanResponseDTO
    HomeLoanDto responseDTO = convertToResponseDTO(calculatedHomeLoan);

    // Save the calculated HomeLoan
    HomeLoan savedHomeLoan = homeLoanDao.save(calculatedHomeLoan);

    // Return the HomeLoanResponseDTO
    return ResponseEntity.ok(responseDTO);
}

// Define a method to convert HomeLoan to HomeLoanResponseDTO
private HomeLoanDto convertToResponseDTO(HomeLoan homeLoan) {
    HomeLoanDto responseDTO = new HomeLoanDto();
    responseDTO.setPrincipalInterest(homeLoan.getPrincipalInterest());
    responseDTO.setOtherTaxes(homeLoan.getOtherTaxes());
    responseDTO.setPropertyTax(homeLoan.getPropertyTax());
    responseDTO.setHomeownerInsurance(homeLoan.getHomeownerInsurance());
    responseDTO.setMonthlyPayment(homeLoan.getMonthlyPayment());
    responseDTO.setPropertyTax(homeLoan.getPropertyTaxRate());
    responseDTO.setHoaFees(homeLoan.getHoaFees());

    return responseDTO;
}

}

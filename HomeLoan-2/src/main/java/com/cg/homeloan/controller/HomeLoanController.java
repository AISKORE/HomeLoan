package com.cg.homeloan.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.dto.HomeLoanDto;
import com.cg.homeloan.entity.HomeLoan;
import com.cg.homeloan.service.HomeLoanService;

@RestController
public class HomeLoanController {

	
	private final HomeLoanService homeLoanService;

    public HomeLoanController(HomeLoanService homeLoanService) {
        this.homeLoanService = homeLoanService;
    }

//    @PostMapping("/calculate")
//    public ResponseEntity<HomeLoanDto> calculate(@RequestBody HomeLoanDto homeLoanDto) {
//        HomeLoan homeLoan = homeLoanService.calculate(homeLoanDto);
//        return new ResponseEntity<>(homeLoanDto, HttpStatus.OK);
//    }
    @PostMapping("/calculate")
    public HomeLoan calculate(@RequestBody  HomeLoanDto homeLoanDto) {
        return homeLoanService.calculate(homeLoanDto);
    }
}

package com.cg.homeloan.service;

import org.springframework.stereotype.Service;

import com.cg.homeloan.dto.HomeLoanDto;
import com.cg.homeloan.dto.HomeLoanResponse;
import com.cg.homeloan.entity.HomeLoan;


public interface HomeLoanService {

	
    HomeLoan calculate(HomeLoanDto homeLoanDto);

}

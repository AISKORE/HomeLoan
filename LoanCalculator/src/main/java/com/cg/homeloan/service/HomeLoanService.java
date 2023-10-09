package com.cg.homeloan.service;

import javax.validation.ConstraintViolationException;

import org.springframework.stereotype.Service;

import com.cg.homeloan.dto.HomeLoanDto;
import com.cg.homeloan.entity.HomeLoan;

public interface HomeLoanService {

	HomeLoan calculateHomeLoan(HomeLoan homeLoan);

	HomeLoan saveHomeLoan(HomeLoan homeLoan);

}

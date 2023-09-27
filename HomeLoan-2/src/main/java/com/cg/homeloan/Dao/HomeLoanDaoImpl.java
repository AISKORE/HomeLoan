package com.cg.homeloan.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.homeloan.entity.HomeLoan;
@Repository
public class HomeLoanDaoImpl implements HomeLoanDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public HomeLoan getHomeLoan(Long id) {
        String sql = "SELECT * FROM home_loans WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            HomeLoan homeLoan = new HomeLoan();
//            homeLoan.setId(rs.getLong("id"));
            homeLoan.setHomePrice(rs.getDouble("home_price"));
            homeLoan.setZipCode(rs.getString("zip_code"));
            homeLoan.setDownPayment(rs.getDouble("down_payment"));
            homeLoan.setDownPaymentPercent(rs.getDouble("down_payment_percent"));
            homeLoan.setPrincipalInterest(rs.getDouble("principal_interest"));
            homeLoan.setHoaFees(rs.getDouble("hoa_fees"));
            homeLoan.setOtherTaxes(rs.getDouble("other_taxes"));
            homeLoan.setPropertyTax(rs.getDouble("property_tax"));
            homeLoan.setHomeownerInsurance(rs.getDouble("homeowner_insurance"));
            homeLoan.setMonthlyPayment(rs.getDouble("monthly_payment"));
            return homeLoan;
        });
    }
}

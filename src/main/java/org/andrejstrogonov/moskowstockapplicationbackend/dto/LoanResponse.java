package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanResponse {

    private List<MonthlyPayment> monthlyPayments;
    private Double totalInterest;
    private Double totalPaid;
}

package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepositResponse {

    private Double finalAmount;
    private Double totalInterest;
    private List<MonthlyData> monthlyBreakdown;
}

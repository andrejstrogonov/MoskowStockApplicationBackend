package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyPayment {

    private Integer month;
    private Double payment;
    private Double principal;
    private Double interest;
    private Double remainingBalance;
}

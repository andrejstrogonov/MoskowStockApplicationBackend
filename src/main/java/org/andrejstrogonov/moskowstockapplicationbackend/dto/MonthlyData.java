package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyData {

    private Integer month;
    private Double balance;
    private Double interestEarned;
}

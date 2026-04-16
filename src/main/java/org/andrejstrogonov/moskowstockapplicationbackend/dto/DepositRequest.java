package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepositRequest {

    private Double principal;
    private Double annualRate;
    private Integer years;
    private Integer compoundingFrequency = 12;
}

package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BondYieldRequest {

    private Double faceValue;
    private Double currentPrice;
    private Double couponRate;
    private Integer couponFrequency;
    private Double yearsToMaturity;
}

package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BondYieldResponse {

    private Double yieldToMaturity;
    private Double currentYield;
    private Double duration;
    private Double modifiedDuration;
}

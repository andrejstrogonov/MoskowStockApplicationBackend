package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlackScholesResponse {

    private Double optionPrice;
    private Double delta;
    private Double gamma;
    private Double theta;
    private Double vega;
    private Double rho;
}

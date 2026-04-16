package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlackScholesRequest {

    private Double spotPrice;
    private Double strikePrice;
    private Double timeToExpiration;
    private Double volatility;
    private Double riskFreeRate;
    private Boolean isCall;
    private String role;
}

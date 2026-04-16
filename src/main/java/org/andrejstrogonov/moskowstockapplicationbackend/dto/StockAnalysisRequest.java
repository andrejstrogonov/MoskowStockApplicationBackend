package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockAnalysisRequest {

    private Double dividendYield;
    private Double eps;
    private Double pe;
    private Double roe;
    private Double dividendPayout;
    private Double marketCap;
    private String sector;
}

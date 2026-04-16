package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockAnalysisResponse {

    private Double fairValue;
    private Recommendation recommendation;
    private RiskLevel riskLevel;
    private SectorComparison sectorComparison;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SectorComparison {
        private Double avgPE;
        private Double avgROE;
        private Double avgDividendYield;
    }
}

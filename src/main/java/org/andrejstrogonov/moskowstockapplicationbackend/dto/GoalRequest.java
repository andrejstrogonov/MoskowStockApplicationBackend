package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalRequest {

    private Double capital;
    private Double targetAnnualReturnPercent;
    private Integer years;
    private RiskLevel riskLevel;
}

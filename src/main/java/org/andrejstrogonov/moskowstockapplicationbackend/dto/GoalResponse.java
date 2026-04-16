package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.andrejstrogonov.moskowstockapplicationbackend.model.Portfolio;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalResponse {

    private Portfolio portfolio;
    private Double expectedReturn;
    private Boolean achievable;
    private String recommendation;
}

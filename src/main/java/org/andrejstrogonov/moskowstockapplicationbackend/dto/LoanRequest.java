package org.andrejstrogonov.moskowstockapplicationbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanRequest {

    private Double principal;
    private Double annualRate;
    private Integer years;
    private List<EarlyRepayment> earlyRepayments;
}

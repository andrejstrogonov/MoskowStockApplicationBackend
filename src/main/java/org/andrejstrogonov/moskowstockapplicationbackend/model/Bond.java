package org.andrejstrogonov.moskowstockapplicationbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("BOND")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Bond extends Instrument {

    @Column(nullable = false)
    private Double faceValue;

    @Column(nullable = false)
    private Double couponRate;

    @Column(nullable = false)
    private Integer couponFrequency;

    @Column(nullable = false)
    private LocalDateTime maturityDate;

    @Column(nullable = false)
    private Double accrualInterest;

    @Column(nullable = false)
    private Boolean isOFZ;

    private Double rating;

    private String issuer;
}

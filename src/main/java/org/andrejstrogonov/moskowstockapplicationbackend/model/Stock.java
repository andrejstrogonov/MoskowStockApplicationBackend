package org.andrejstrogonov.moskowstockapplicationbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@DiscriminatorValue("STOCK")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Stock extends Instrument {

    @Column(nullable = false)
    private Double dividendYield;

    @Column(nullable = false)
    private Double eps;

    @Column(nullable = false)
    private Double pe;

    @Column(nullable = false)
    private Double roe;

    @Column(nullable = false)
    private Double dividendPayout;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Sector sector;

    @Column(nullable = false)
    private Boolean isExporter;

    @Column(nullable = false)
    private Double marketCap;

    private String companyName;
}

package org.andrejstrogonov.moskowstockapplicationbackend.repository;

import org.andrejstrogonov.moskowstockapplicationbackend.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, String> {
}

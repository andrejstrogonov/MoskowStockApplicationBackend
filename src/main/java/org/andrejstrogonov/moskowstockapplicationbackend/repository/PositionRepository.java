package org.andrejstrogonov.moskowstockapplicationbackend.repository;

import org.andrejstrogonov.moskowstockapplicationbackend.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<Position, String> {

    List<Position> findByPortfolioId(String portfolioId);
}

package org.andrejstrogonov.moskowstockapplicationbackend.controller;

import org.andrejstrogonov.moskowstockapplicationbackend.dto.*;
import org.andrejstrogonov.moskowstockapplicationbackend.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculators")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/deposit")
    public ResponseEntity<DepositResponse> calculateDeposit(@RequestBody DepositRequest request) {
        DepositResponse response = calculatorService.calculateDeposit(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/loan")
    public ResponseEntity<LoanResponse> calculateLoan(@RequestBody LoanRequest request) {
        LoanResponse response = calculatorService.calculateLoan(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/black-scholes")
    public ResponseEntity<BlackScholesResponse> calculateBlackScholes(@RequestBody BlackScholesRequest request) {
        BlackScholesResponse response = calculatorService.calculateBlackScholes(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/bond-yield")
    public ResponseEntity<BondYieldResponse> calculateBondYield(@RequestBody BondYieldRequest request) {
        BondYieldResponse response = calculatorService.calculateBondYield(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/stock-analysis")
    public ResponseEntity<StockAnalysisResponse> analyzeStock(@RequestBody StockAnalysisRequest request) {
        StockAnalysisResponse response = calculatorService.analyzeStock(request);
        return ResponseEntity.ok(response);
    }
}

@RestController
@RequestMapping("/api/portfolios")
class GoalController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/generate-goal")
    public ResponseEntity<GoalResponse> generateGoalPortfolio(@RequestBody GoalRequest request) {
        GoalResponse response = calculatorService.generateGoalPortfolio(request);
        return ResponseEntity.ok(response);
    }
}

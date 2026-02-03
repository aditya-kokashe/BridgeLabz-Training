package com.streamapi.insuranceclaimanalysis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysisMain {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
                new InsuranceClaim("Health", 50000),
                new InsuranceClaim("Health", 30000),
                new InsuranceClaim("Vehicle", 20000),
                new InsuranceClaim("Vehicle", 40000),
                new InsuranceClaim("Life", 100000)
        );

        Map<String, Double> averageClaimAmount =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                InsuranceClaim::getClaimType,
                                Collectors.averagingDouble(InsuranceClaim::getClaimAmount)
                        ));

        averageClaimAmount.forEach((type, avg) ->
                System.out.println(type + " Claim Average: " + avg)
        );
    }
}

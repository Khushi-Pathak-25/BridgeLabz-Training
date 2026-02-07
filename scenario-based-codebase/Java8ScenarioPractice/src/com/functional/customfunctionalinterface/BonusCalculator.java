package com.functional.customfunctionalinterface;

@FunctionalInterface
public interface BonusCalculator {
    double calculate(double salary, int performanceScore);
}
# Simple Calculator

A command-line calculator built in Java with Maven — from Lab 3 & Lab 4 of *Software Development Tools*.

![CI status](https://github.com/rukasa060417/calculator-ci/actions/workflows/ci-calculator.yml/badge.svg)

## Features

- add, subtract, multiply, divide
- Division by zero throws `ArithmeticException` instead of crashing
- JUnit 5 test suite with 11 unit tests (Lab 4)
- Continuous integration with GitHub Actions: compiles and runs all tests on every push / pull request (JDK 17 & JDK 21)

## Build & Test Locally

```bash
mvn clean test
```

## Run the Packaged Jar

```bash
mvn package
java -jar target/calculator-1.0.0.jar
```

## Repository Layout

```
.github/workflows/ci-calculator.yml   GitHub Actions CI workflow
src/main/java/calculator/Calculator.java       calculator core
src/main/java/calculator/CalculatorApp.java    command-line UI
src/test/java/calculator/CalculatorTest.java   JUnit 5 tests
pom.xml                                       Maven project configuration
```

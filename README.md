# java-income-tax-calculator
A console-based Java application for calculating taxable income and income tax based on personal income data.
# Java Income Tax Calculator

A console-based Java application for calculating taxable income and income tax based on predefined rules and personal income data.

This project was developed as a programming assignment to practice Java and object-oriented programming concepts.

## Features

- Create and manage taxpayer objects
- Store personal information such as name, age, and taxpayer number
- Calculate taxable income based on annual income
- Calculate income tax based on taxable income
- Display taxpayer information and calculation results in the console
- Process multiple taxpayers

## Technologies

- Java
- Object-Oriented Programming (OOP)
- Classes and Objects
- Inheritance
- Constructors
- Methods
- Conditional Statements
- Packages

## Project Structure

```text
java-income-tax-calculator/
├── TaxClient.java
└── hito/
    └── Hito.java
```

### `Hito`

Base class representing a person. It contains common personal information such as name and age.

### `TaxPayer`

Extends `Hito` and adds taxpayer-specific information, including taxpayer number, income, taxable income, and income tax.

### `TaxClient`

Contains the `main` method and creates multiple `TaxPayer` objects to perform and display the calculations.

## Example Output

```text
******Taro Yamada******
番号:1001
年齢:25
収入:2000000
課税所得:1220000
所得税額:61000

******Hanako Ito******
番号:1002
年齢:21
収入:3000000
課税所得:1920000
所得税額:96000

******Jiro Suzuki******
番号:1003
年齢:30
収入:5500000
課税所得:3860000
所得税額:772000
```

## Status

Completed as a programming assignment.

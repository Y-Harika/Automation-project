# Automation Testing on vehicle Insurance Application

##  Project Overview

This project is a **Selenium Automation Testing framework** developed using **Java** to automate functional test cases for a web application.
It follows a **Hybrid Framework** approach combining **Page Object Model (POM)** and **Data-Driven Testing** to ensure scalability, reusability, and maintainability of test scripts.

##  Technologies Used

*Programming Language: Java

*Automation Tool: Selenium WebDriver

*Testing Framework: TestNG

*Build Tool: Maven

*Design Pattern: Page Object Model (POM)

*Data Handling: Excel (Data-Driven Testing)

*IDE: Eclipse

*Version Control: Git & GitHub

## Project Structure

```
Automation-project
│
├── src/main/java
│   ├── base
│   │   └── BaseClass.java
│   ├── pages
│   │   └── LoginPage.java
│   └── utilities
│       └── ExcelUtility.java
│
├── src/test/java
│   └── testcases
│       └── LoginTest.java
│
├── testdata
│   └── TestData.xlsx
│
├── pom.xml
└── README.md
```

##  Automated Test Scenarios

-Features

*Automated functional test cases

*Page Object Model for better code organization

*Data-Driven testing using Excel

*Reusable utility classes

*Test execution using TestNG

*Easy maintenance and scalability

## How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/Y-Harika/Automation-project.git
   ```
2. Import the project into **Eclipse/IntelliJ** as a Maven project
3. Update browser drivers if required
4. Run the test cases using:

   * **TestNG XML file**, or
   * Right-click on test class → Run as **TestNG Test**

##  Sample Test Scenario

* Login functionality
  * Valid login
  * Invalid login
  * Empty username/password validation

##  Reporting

* Test execution results are generated using **TestNG reports**
* Logs and failures can be enhanced using reporting tools like **Extent Reports** (future scope)

##  Future Enhancements

* Add Extent Reports
* Integrate with Jenkins for CI/CD
* Cross-browser testing
* Add API automation




# Test Automation Framework

## Overview

This repository provides a structured framework for automating tests using Java and Gherkin. It is designed to facilitate Behavior-Driven Development (BDD) and supports seamless integration with continuous integration/continuous deployment (CI/CD) pipelines.

## Features

- **Behavior-Driven Development (BDD):** Utilize Gherkin syntax for writing human-readable test scenarios.
- **Modular Architecture:** Organized codebase promoting reusability and maintainability.
- **CI/CD Integration:** Compatible with tools like Jenkins and GitHub Actions for automated testing workflows.
- **Comprehensive Reporting:** Extent Reporting

## Project Structure

```
test-automation/
├── .github/             # GitHub workflows and configurations
├── src/
│   ├── main/            # Application source code
│   └── test/            # Test cases and resources
├── .gitignore           # Git ignore file
├── pom.xml              # Maven project configuration
└── README.md            # Project documentation
```

## Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher
- **Maven:** Version 3.6.0 or higher
- **IDE:** IntelliJ IDEA, Eclipse, or any preferred Java IDE

## To Trigger the Test Suite

   ```bash
   git clone https://github.com/baranivasan/test-automation.git
   cd test-automation
   mvn clean install
   mvn test
   ```

## Writing Test Cases

Test scenarios are written in Gherkin syntax and located in the `src/test/resources` directory. Step definitions corresponding to these scenarios are implemented in Java within the `src/test/java` directory.

## Reporting

Extent Report will be generated post-execution

![image](https://github.com/user-attachments/assets/51c32215-83ca-4bce-8e9b-79ba69fb9563)


## Continuous Integration

The project includes GitHub Actions workflows located in the `.github/workflows` directory. These workflows automate the build and test processes on code commits and pull requests.

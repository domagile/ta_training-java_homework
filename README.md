#  Java Automation Project: Paste Automation & String Pattern Analysis

##  Overview

This repository includes a set of practical automation tasks implemented with:


- **Java 17** The primary programming language for writing test scripts.
- **Maven** For build and dependency management
- **JUnit 5** The testing framework for structuring and running unit tests.
- **Selenium WebDriver** Used for web browser automation and executing test scenarios, specifically in Google Chrome.
- **Page Object Model**: Implemented with `@FindBy` annotations for efficient web element localization.

The tests automate paste creation on [https://paste.ee](https://paste.ee) and implement string analysis logic with test coverage.

---

##  Objectives

### Task 1 — Create a Simple Paste
 Scenario:  
Create a new paste with the following parameters:  
Code: "Hello from WebDriver"  
Paste Expiration: "10 Minutes"  
Title: "helloweb"  
Validate that the paste is created and the title is correct

---

### Task 2 — Bash Script Paste with Syntax Highlighting
- Paste content:
  ```bash
  git config --global user.name  "New Sheriff in Town"
  git reset $(git commit-tree HEAD^{tree} -m "Legacy code")
  git push origin master --force
Syntax: Bash

Expiration: "10 Minutes"  
Title: "how to gain dominance among developers"  
Validate title, syntax display, and paste content

---

###  Task 3 — String Pattern Analyzer
Implement methods to find:  
Longest sequence of non-repeating adjacent characters  
Longest sequence of repeated Latin letters  
Longest sequence of repeated digits  
Covered with unit tests  
Test design follows AAA (Arrange–Act–Assert) and FIRST principles  

---

###  How to Run Tests
Using terminal:  
Navigate to the root of the project and run:  
  mvn clean test

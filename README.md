# 🧪 QA Automation – Katalon Studio, BDD, Jenkins & Test Reporting

This project is a **QA Automation learning project** based on an e-learning/course practice.  
It uses **Katalon Studio** to automate web application testing and demonstrates an end-to-end automation workflow with GitHub, Jenkins, BDD/Cucumber, test reporting, Jenkins Build Pipeline, and Katalon True Platform integration.

---

## 📌 About the Project

This project was created as part of a QA Automation learning journey to understand how automated testing works in a real CI workflow.

The project covers:

- Login automation testing
- Positive and negative test scenarios
- Portfolio management automation testing
- Behavior Driven Development using Cucumber / BDD
- Feature file and step definition implementation
- Test Suite and Test Suite Collection management
- GitHub integration
- Jenkins CI execution
- Jenkins Build Pipeline / job chaining
- JUnit report publishing in Jenkins
- Test result visualization using Test Results Analyzer
- Report upload to Katalon True Platform

With this project, automated tests can be executed in a structured, repeatable, readable, and reportable way.

---

## 🛠️ Tools & Technologies

- ⚙️ **Katalon Studio 11.1.3** → automation testing tool
- 🥒 **Cucumber / BDD** → behavior-driven test scenario format
- 🚀 **Katalon Runtime Engine / katalonc** → command line execution
- 🔧 **Jenkins** → CI tool
- 🧩 **Katalon Jenkins Plugin** → execute Katalon tests from Jenkins
- 🔁 **Jenkins Build Pipeline** → visualize CI job flow
- 🐙 **GitHub** → source code repository
- 🌐 **Chrome / Chrome Headless** → browser execution
- 🦊 **Firefox** → cross-browser execution
- 📊 **Katalon True Platform** → execution report dashboard
- 📈 **Jenkins Test Results Analyzer** → visual test result analysis
- 📄 **JUnit Report Publisher** → publish test results in Jenkins

---

## 🧩 Test Scope

The automation tests cover the following modules:

### 🔐 Login Module

- Login with valid credentials
- Login with invalid password
- Login with empty email
- Login with empty password

### 🗂️ Portfolio Module

- Open portfolio page
- Open add portfolio modal
- Create portfolio data
- Edit portfolio data
- Filter portfolio by category
- Delete portfolio data

---

## 🥒 BDD / Cucumber Implementation

This project also implements **BDD (Behavior Driven Development)** using Cucumber-style feature files.

BDD is used to make test scenarios more readable and easier to understand using:

```text
Given
When
Then

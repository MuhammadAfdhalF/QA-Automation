# 🧪 QA Automation – Katalon Studio, Jenkins & Test Reporting

This project is a **QA Automation learning project** based on an e-learning/course practice.  
It uses **Katalon Studio** to automate web application testing and demonstrates an end-to-end automation workflow with GitHub, Jenkins, test reporting, Jenkins Build Pipeline, and Katalon True Platform integration.

---

## 📌 About the Project

This project was created as part of a QA Automation learning journey to understand how automated testing works in a real CI workflow.

The project covers:

- Login automation testing
- Positive and negative test scenarios
- Portfolio management automation testing
- Test Suite and Test Suite Collection management
- GitHub integration
- Jenkins CI execution
- Jenkins Build Pipeline / job chaining
- JUnit report publishing in Jenkins
- Test result visualization using Test Results Analyzer
- Report upload to Katalon True Platform

With this project, automated tests can be executed in a structured, repeatable, and reportable way.

---

## 🛠️ Tools & Technologies

- ⚙️ **Katalon Studio 11.1.3** → automation testing tool
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

## 🧪 Test Suites

This project contains several test suites and test suite collections:

- `TS_Login`
- `TS_Portfolio`
- `TS_All`
- `dynamic`

`TS_All` is used as a **Test Suite Collection** to execute multiple test suites through Jenkins.

---

## 🌐 Automation Workflow

```text
GitHub Repository
↓
Jenkins Clones Repository
↓
Jenkins Cleans Old Reports
↓
Jenkins Runs Katalon Test Suite Collection
↓
Katalon Executes Automated Tests
↓
Katalon Generates Reports
↓
Jenkins Publishes JUnit Test Results
↓
Jenkins Test Results Analyzer Displays Test Summary
↓
Katalon Uploads Report to Katalon True Platform
↓
Build Status Success / Failed
```

---

## ⚙️ Jenkins CI Integration

This project has been successfully executed through Jenkins using the **Katalon Jenkins Plugin**.

Jenkins runs the Katalon test execution using the following command arguments:

```bat
-noSplash -runMode=console ^
-projectPath="%WORKSPACE%\Meraki_Login_Automation.prj" ^
-retry=0 ^
-testSuiteCollectionPath="Test Suites/TS_All" ^
-executionProfile="default" ^
-apiKey="YOUR_API_KEY" ^
--config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true
```

> Note: The API key should not be committed to the repository. Use your own Katalon API key in the Jenkins configuration.

---

## 🔁 Jenkins Build Pipeline

This project also includes a simple Jenkins Build Pipeline to visualize the CI workflow and job chaining process.

Pipeline flow:

```text
BuildJob
↓
DeployJob
↓
MerakkiQA Automation Test
↓
ReleaseJob
```

The `MerakkiQA` job runs the Katalon automation test suite collection as part of the pipeline.  
This demonstrates how automated testing can be included in a CI workflow before moving to the next stage.

### Jenkins Build Pipeline Evidence

![Jenkins Build Pipeline](docs/jenkins-build-pipeline.png)

---

## 🧹 Jenkins Report Cleanup

Before running a new test execution, Jenkins removes the old `Reports` folder to prevent outdated failed test results from being read again.

Windows batch command:

```bat
if exist "%WORKSPACE%\Reports" rmdir /s /q "%WORKSPACE%\Reports"
```

This ensures Jenkins only reads the latest execution report.

---

## 📄 JUnit Report Configuration

JUnit report path used in Jenkins:

```text
Reports/**/TS_Login/**/JUnit_Report.xml,Reports/**/TS_Portfolio/**/JUnit_Report.xml
```

This report configuration allows Jenkins to display:

- Total passed tests
- Total failed tests
- Test result trend
- Detailed test case results
- Test Results Analyzer chart

---

## 📊 Test Report

Automation test reports can be viewed from:

- Katalon Studio local report
- Jenkins build result
- Jenkins JUnit test result
- Jenkins Test Results Analyzer
- Katalon True Platform execution report

---

## 📸 Execution Evidence

### ✅ Jenkins Build Success

![Jenkins Build Success](docs/jenkins-success.png)

### ✅ Jenkins Test Result

![Jenkins Test Result](docs/jenkins-test-result.png)

### 📊 Test Results Analyzer

![Test Results Analyzer](docs/test-results-analyzer.png)

### 📈 Katalon True Platform Report

![Katalon True Platform Report](docs/katalon-true-platform-report.png)

---

## 🧪 Testing Result

Current automation execution result:

```text
Total Test Cases : 10
Passed           : 10
Failed           : 0
Skipped          : 0
Build Status     : SUCCESS
```

---

## 📈 Learning Outcome

Through this project, the QA Automation learning process covers:

✅ Creating automated test cases using Katalon Studio  
✅ Managing Object Repository  
✅ Creating Test Suites and Test Suite Collections  
✅ Running tests on multiple browsers  
✅ Integrating automation project with GitHub  
✅ Running automated tests through Jenkins  
✅ Using Katalon Jenkins Plugin  
✅ Creating Jenkins Build Pipeline / job chaining  
✅ Cleaning old reports before new execution  
✅ Publishing JUnit reports in Jenkins  
✅ Reading test results using Test Results Analyzer  
✅ Uploading execution reports to Katalon True Platform  

---

## 🎯 Learning Goals

The goal of this project is to understand basic to intermediate QA Automation practices, especially:

- Web UI automation testing
- Positive and negative test scenarios
- Test suite management
- CI testing workflow
- Jenkins integration
- Jenkins Build Pipeline
- Test reporting
- Automation portfolio preparation

---

## ✅ Project Status

```text
Katalon Studio execution       : Passed
Jenkins execution              : Passed
Jenkins Build Pipeline         : Passed
JUnit report publishing        : Passed
Test Results Analyzer          : Passed
Katalon True Platform upload   : Passed
GitHub integration             : Done
```

---

## 🙋‍♂️ Author

👨‍💻 **Muhammad Afdhal F**

QA Automation Learning Project  
Tools: Katalon Studio • Jenkins • GitHub • Katalon True Platform  
Focus: Web Automation Testing • CI Integration • Jenkins Pipeline • Test Reporting

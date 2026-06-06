# QA Automation - Katalon Studio

This project is a QA automation practice project using **Katalon Studio** to automate web application testing.

The project has been integrated with:

- GitHub as the source code repository
- Jenkins as the CI tool
- Katalon Jenkins Plugin for CI execution
- Katalon True Platform for execution reports
- Jenkins JUnit report publisher for test result reporting
- Test Results Analyzer plugin for visual test result analysis

## Tools

- Katalon Studio 11.1.3
- Katalon Runtime Engine / katalonc
- Jenkins
- GitHub
- Chrome / Chrome Headless
- Firefox
- Katalon True Platform
- Jenkins Test Results Analyzer Plugin

## Test Scope

The automation tests cover the following modules:

### Login Module

- Login with valid credentials
- Login with invalid password
- Login with empty email
- Login with empty password

### Portfolio Module

- Open portfolio page
- Open add portfolio modal
- Create portfolio data
- Edit portfolio data
- Filter portfolio by category
- Delete portfolio data

## Test Suites

This project contains several test suites and test suite collections:

- `TS_Login`
- `TS_Portfolio`
- `TS_All`
- `dynamic`

## CI Integration with Jenkins

This project has been successfully executed through Jenkins.

Jenkins workflow:

```text
GitHub Repository
↓
Jenkins Clones Repository
↓
Jenkins Cleans Old Reports
↓
Jenkins Runs Katalon Test Suite Collection
↓
Katalon Generates Test Reports
↓
Jenkins Publishes JUnit Test Results
↓
Katalon Uploads Report to Katalon True Platform
↓
Build Status Success / Failed
```

Jenkins uses the **Katalon Jenkins Plugin** to execute the Katalon test suite collection from the command line.

Example Katalon command arguments:

```bat
-noSplash -runMode=console ^
-projectPath="%WORKSPACE%\Meraki_Login_Automation.prj" ^
-retry=0 ^
-testSuiteCollectionPath="Test Suites/TS_All" ^
-executionProfile="default" ^
-apiKey="YOUR_API_KEY" ^
--config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true
```

> Note: The API key should not be committed to the repository. Use your own Katalon API key in Jenkins configuration.

## Jenkins Report Configuration

Before running the Katalon test execution, Jenkins removes the old `Reports` folder to avoid reading outdated failed test results.

Windows batch command:

```bat
if exist "%WORKSPACE%\Reports" rmdir /s /q "%WORKSPACE%\Reports"
```

JUnit report path used in Jenkins:

```text
Reports/**/TS_Login/**/JUnit_Report.xml,Reports/**/TS_Portfolio/**/JUnit_Report.xml
```

## Test Report

Automation test reports can be viewed from:

- Katalon Studio local report
- Jenkins build result
- Jenkins JUnit test result
- Jenkins Test Results Analyzer
- Katalon True Platform execution report

## Execution Evidence

### Jenkins Build Success

![Jenkins Build Success](docs/jenkins-success.png)

### Jenkins Test Result

![Jenkins Test Result](docs/jenkins-test-result.png)

### Test Results Analyzer

![Test Results Analyzer](docs/test-results-analyzer.png)

### Katalon True Platform Report

![Katalon True Platform Report](docs/katalon-true-platform-report.png)

## Learning Goals

The purpose of this project is to learn and practice:

- Creating automation test cases using Katalon Studio
- Managing Object Repository
- Creating Test Suites and Test Suite Collections
- Running tests with multiple browsers
- Running tests with normal browser and headless browser
- Storing automation projects in GitHub
- Running automation tests through Jenkins
- Using Katalon Jenkins Plugin
- Publishing JUnit test results in Jenkins
- Reading and analyzing automation test reports
- Uploading execution reports to Katalon True Platform

## Project Status

```text
Katalon Studio execution: Passed
Jenkins execution: Passed
JUnit report publishing: Passed
Test Results Analyzer: Passed
Katalon True Platform upload: Passed
GitHub integration: Done
```

## Author

Muhammad Afdhal F

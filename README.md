# QA Automation - Katalon Studio

This project is a QA automation practice project using **Katalon Studio** to automate web application testing.

The project has been integrated with:

- GitHub as the source code repository
- Jenkins as the CI tool
- Katalon True Platform for execution reports

## Tools

- Katalon Studio 11.1.3
- Katalon Runtime Engine / katalonc
- Jenkins
- GitHub
- Chrome / Chrome Headless
- Katalon True Platform

## Test Scope

The automation tests cover the following modules:

### Login Module

- Login with valid credentials
- Login with invalid password
- Login with empty email
- Login with empty password

### Portfolio Module

- Open portfolio page
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
Jenkins Runs Katalon Test Suite / Test Suite Collection
↓
Generate Test Result
↓
Build Status Passed / Failed
```

Jenkins uses `katalonc.exe` to run the automation tests from the command line.

Example Jenkins command:

```bat
"C:\Users\TUF GAMING F15\.katalon\packages\KS-11.1.3\katalonc.exe" -noSplash -runMode=console ^
-projectPath="%WORKSPACE%\Meraki_Login_Automation.prj" ^
-retry=0 ^
-testSuiteCollectionPath="Test Suites/TS_All" ^
-executionProfile="default" ^
-apiKey="YOUR_API_KEY" ^
--config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true
```

> Note: The API key should not be committed to the repository. Use your own Katalon API key in Jenkins configuration.

## Test Report

Automation test reports can be viewed from:

- Katalon Studio local report
- Jenkins build result
- Katalon True Platform execution report

## Learning Goals

The purpose of this project is to learn and practice:

- Creating automation test cases using Katalon Studio
- Managing Object Repository
- Creating Test Suites and Test Suite Collections
- Running tests with normal browser and headless browser
- Storing automation projects in GitHub
- Running automation tests through Jenkins
- Reading and analyzing automation test reports

## Project Status

```text
Katalon Studio execution: Passed
Katalon True Platform upload: Passed
Jenkins execution: Passed
GitHub integration: Done
```

## Author

Muhammad Afdhal F

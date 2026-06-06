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

This project contains several test suites:

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

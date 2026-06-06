# QA Automation - Katalon Studio

Project ini adalah latihan automation testing menggunakan **Katalon Studio** untuk menguji fitur web aplikasi secara otomatis.

Project ini juga sudah diintegrasikan dengan:

- GitHub sebagai repository
- Jenkins sebagai CI tool
- Katalon True Platform untuk report execution

## Tools

- Katalon Studio 11.1.3
- Katalon Runtime Engine / katalonc
- Jenkins
- GitHub
- Chrome / Chrome Headless
- Katalon True Platform

## Test Scope

Automation test yang dibuat mencakup:

### Login Module

- Login dengan valid credential
- Login dengan invalid password
- Login dengan email kosong
- Login dengan password kosong

### Portfolio Module

- Open portfolio page
- Create portfolio data
- Edit portfolio data
- Filter portfolio by category
- Delete portfolio data

## Test Suites

Project ini memiliki beberapa test suite:

- `TS_Login`
- `TS_Portfolio`
- `TS_All`
- `dynamic`

## CI Integration with Jenkins

Project ini sudah berhasil dijalankan melalui Jenkins.

Alur Jenkins:

```text
GitHub Repository
↓
Jenkins Clone Repository
↓
Jenkins Run Katalon Test Suite / Test Suite Collection
↓
Generate Test Result
↓
Build Status Passed / Failed

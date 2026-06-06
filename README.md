# 🧪 QA Automation – Katalon Studio, Jenkins & Test Reporting

Project ini adalah latihan **QA Automation berbasis e-learning/course** menggunakan **Katalon Studio** untuk mengotomatisasi pengujian web application.

Project ini berfokus pada pembuatan automation test case, pengelolaan test suite, integrasi dengan GitHub, eksekusi otomatis melalui Jenkins, serta publikasi report melalui Jenkins dan Katalon True Platform.

---

## 📌 Tentang Project

Project ini dibuat sebagai bagian dari proses belajar QA Automation untuk memahami alur kerja automation testing secara end-to-end.

Automation test mencakup:

- Login testing
- Negative testing
- Portfolio management testing
- Test Suite & Test Suite Collection
- CI execution menggunakan Jenkins
- Report analysis menggunakan Jenkins Test Result dan Test Results Analyzer
- Report upload ke Katalon True Platform

Dengan project ini, proses testing dapat dijalankan secara otomatis, terstruktur, dan terdokumentasi dengan baik.

---

## 🛠️ Tools & Teknologi

- ⚙️ **Katalon Studio 11.1.3** → automation testing tool
- 🚀 **Katalon Runtime Engine / katalonc** → command line execution
- 🔧 **Jenkins** → CI tool
- 🧩 **Katalon Jenkins Plugin** → menjalankan Katalon dari Jenkins
- 🐙 **GitHub** → source code repository
- 🌐 **Chrome / Chrome Headless** → browser execution
- 🦊 **Firefox** → cross-browser execution
- 📊 **Katalon True Platform** → execution report
- 📈 **Jenkins Test Results Analyzer** → visual test result analysis
- 📄 **JUnit Report Publisher** → publish test result di Jenkins

---

## 🧩 Test Scope

Automation test pada project ini mencakup beberapa module berikut:

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

Project ini memiliki beberapa test suite dan test suite collection:

- `TS_Login`
- `TS_Portfolio`
- `TS_All`
- `dynamic`

`TS_All` digunakan sebagai **Test Suite Collection** untuk menjalankan beberapa test suite sekaligus melalui Jenkins.

---

## 🌐 Arsitektur Automation Flow

```text
GitHub Repository
↓
Jenkins Clone Repository
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

Project ini sudah berhasil dijalankan melalui Jenkins menggunakan **Katalon Jenkins Plugin**.

Jenkins menjalankan Katalon test execution dengan command argument berikut:

```bat
-noSplash -runMode=console ^
-projectPath="%WORKSPACE%\Meraki_Login_Automation.prj" ^
-retry=0 ^
-testSuiteCollectionPath="Test Suites/TS_All" ^
-executionProfile="default" ^
-apiKey="YOUR_API_KEY" ^
--config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true
```

> Note: API key tidak boleh disimpan langsung di repository. Gunakan API key pribadi pada konfigurasi Jenkins.

---

## 🧹 Jenkins Report Cleanup

Sebelum menjalankan test baru, Jenkins menghapus folder report lama agar tidak membaca hasil test sebelumnya.

Windows batch command:

```bat
if exist "%WORKSPACE%\Reports" rmdir /s /q "%WORKSPACE%\Reports"
```

Hal ini dilakukan agar Jenkins hanya membaca report dari execution terbaru.

---

## 📄 JUnit Report Configuration

JUnit report path yang digunakan di Jenkins:

```text
Reports/**/TS_Login/**/JUnit_Report.xml,Reports/**/TS_Portfolio/**/JUnit_Report.xml
```

Report ini digunakan agar Jenkins dapat menampilkan:

- Total passed tests
- Total failed tests
- Test result trend
- Detail test case result
- Test Results Analyzer chart

---

## 📊 Test Report

Hasil automation test dapat dilihat melalui:

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

## 📈 Dampak / Hasil Pembelajaran

Melalui project ini, proses belajar QA Automation mencakup:

✅ Membuat test case otomatis menggunakan Katalon Studio  
✅ Mengelola Object Repository  
✅ Membuat Test Suite dan Test Suite Collection  
✅ Menjalankan test di beberapa browser  
✅ Mengintegrasikan project automation dengan GitHub  
✅ Menjalankan automation test melalui Jenkins  
✅ Menggunakan Katalon Jenkins Plugin  
✅ Membersihkan report lama sebelum execution baru  
✅ Publish JUnit report di Jenkins  
✅ Membaca hasil test melalui Test Results Analyzer  
✅ Upload execution report ke Katalon True Platform  

---

## 🎯 Learning Goals

Tujuan project ini adalah untuk memahami praktik dasar hingga menengah dalam QA Automation, khususnya:

- Web UI automation testing
- Positive and negative test scenario
- Test suite management
- CI/CD testing workflow
- Jenkins integration
- Test reporting
- Automation portfolio preparation

---

## ✅ Project Status

```text
Katalon Studio execution       : Passed
Jenkins execution              : Passed
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
Focus: Web Automation Testing • CI Integration • Test Reporting

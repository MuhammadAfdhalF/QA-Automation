import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration

import java.text.SimpleDateFormat

class CommonTestListener {

	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		println("========== START TEST CASE ==========")
		println("Test Case ID: " + testCaseContext.getTestCaseId())
	}

	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
		println("========== FINISH TEST CASE ==========")
		println("Test Case ID: " + testCaseContext.getTestCaseId())
		println("Status      : " + testCaseContext.getTestCaseStatus())

		if (testCaseContext.getTestCaseStatus() == 'FAILED') {
			println("Test failed. Taking screenshot...")
			takeScreenshotSafely(testCaseContext)
		}

		if (testCaseContext.getTestCaseId().startsWith('Test Cases/Listener')) {
			println("Listener test detected. Taking evidence screenshot...")
			takeScreenshotSafely(testCaseContext)
			closeBrowserSafely()
		}
	}

	private void takeScreenshotSafely(TestCaseContext testCaseContext) {
		try {
			DriverFactory.getWebDriver()

			String projectDir = RunConfiguration.getProjectDir()
			String screenshotDir = projectDir + File.separator + 'Screenshots' + File.separator + 'Listener'

			File directory = new File(screenshotDir)
			if (!directory.exists()) {
				directory.mkdirs()
			}

			String testCaseName = testCaseContext.getTestCaseId()
					.replace('Test Cases/', '')
					.replace('/', '_')
					.replace(' ', '_')

			String timestamp = new SimpleDateFormat('yyyyMMdd_HHmmss').format(new Date())

			String screenshotPath = screenshotDir + File.separator + testCaseName + '_' + timestamp + '.png'

			WebUI.takeScreenshot(screenshotPath)

			println("Screenshot captured: " + screenshotPath)
		} catch (Exception e) {
			println("Screenshot skipped. Browser is not opened.")
		}
	}

	private void closeBrowserSafely() {
		try {
			DriverFactory.getWebDriver()
			println("Closing browser...")
			WebUI.closeBrowser()
		} catch (Exception e) {
			println("Close browser skipped. Browser is not opened.")
		}
	}
}
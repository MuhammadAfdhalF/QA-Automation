import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.Then

class LoginSteps {

	@Given("admin opens the application")
	def adminOpensTheApplication() {
		// Opening the application is handled inside the reusable login test cases
	}

	@When("admin logs in with valid credentials")
	def adminLogsInWithValidCredentials() {
		WebUI.callTestCase(findTestCase('Admin/Login/Login_As_Admin'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("admin should see the dashboard page")
	def adminShouldSeeTheDashboardPage() {
		WebUI.verifyElementPresent(findTestObject('Admin/Dashboard/Page_Admin_Meraki/lblDashboard'), 10)
		WebUI.closeBrowser()
	}

	@When("admin logs in with empty email")
	def adminLogsInWithEmptyEmail() {
		WebUI.callTestCase(findTestCase('Admin/Login/Login_With_Empty_Email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("admin logs in with empty password")
	def adminLogsInWithEmptyPassword() {
		WebUI.callTestCase(findTestCase('Admin/Login/Login_With_Empty_Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("admin logs in with invalid password")
	def adminLogsInWithInvalidPassword() {
		WebUI.callTestCase(findTestCase('Admin/Login/Login_With_Invalid_Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("admin should stay on the login form")
	def adminShouldStayOnTheLoginForm() {
		// Negative login test cases already verify the login form and close the browser
	}

	@Then("admin should not be redirected to dashboard")
	def adminShouldNotBeRedirectedToDashboard() {
		// Login_With_Invalid_Password test case already performs the negative login flow and closes the browser
	}
}
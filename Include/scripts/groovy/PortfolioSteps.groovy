import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.Then

class PortfolioSteps {

	@Given("admin is ready to manage portfolio")
	def adminIsReadyToManagePortfolio() {
		// Login and portfolio navigation are handled inside each reusable portfolio test case
	}

	@When("admin opens the portfolio page")
	def adminOpensThePortfolioPage() {
		WebUI.callTestCase(findTestCase('Admin/Portfolio/Open_Portfolio_Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("portfolio page should be displayed")
	def portfolioPageShouldBeDisplayed() {
		// Open_Portfolio_Page test case already verifies the portfolio page and closes the browser
	}

	@When("admin opens the add portfolio modal")
	def adminOpensTheAddPortfolioModal() {
		WebUI.callTestCase(findTestCase('Admin/Portfolio/Open_Add_Portfolio_Modal'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("add portfolio modal should be displayed")
	def addPortfolioModalShouldBeDisplayed() {
		// Open_Add_Portfolio_Modal test case already verifies the modal and closes the browser
	}

	@When("admin creates a portfolio with valid data")
	def adminCreatesPortfolioWithValidData() {
		WebUI.callTestCase(findTestCase('Admin/Portfolio/Create_Portfolio_With_Valid_Data'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("created portfolio should be displayed")
	def createdPortfolioShouldBeDisplayed() {
		// Create_Portfolio_With_Valid_Data test case already verifies created portfolio and closes the browser
	}

	@When("admin edits portfolio with valid data")
	def adminEditsPortfolioWithValidData() {
		WebUI.callTestCase(findTestCase('Admin/Portfolio/Edit_Portfolio_With_Valid_Data'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("updated portfolio should be displayed")
	def updatedPortfolioShouldBeDisplayed() {
		// Edit_Portfolio_With_Valid_Data test case already verifies updated portfolio and closes the browser
	}

	@When("admin filters portfolio by category")
	def adminFiltersPortfolioByCategory() {
		WebUI.callTestCase(findTestCase('Admin/Portfolio/Filter_Portfolio_By_Category'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("portfolio data should be filtered")
	def portfolioDataShouldBeFiltered() {
		// Filter_Portfolio_By_Category test case already verifies filtered result and closes the browser
	}

	@When("admin deletes portfolio data")
	def adminDeletesPortfolioData() {
		WebUI.callTestCase(findTestCase('Admin/Portfolio/Delete_Portfolio_Data'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("portfolio page should still be displayed")
	def portfolioPageShouldStillBeDisplayed() {
		// Delete_Portfolio_Data test case already verifies portfolio page and closes the browser
	}
}
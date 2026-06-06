import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.util.Arrays as Arrays

String uniqueId = System.currentTimeMillis().toString()

String portfolioTitle = 'QA Automation Portfolio ' + uniqueId

String portfolioSlug = 'qa-automation-portfolio-' + uniqueId

WebUI.callTestCase(findTestCase('Admin/Login/Login_As_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/btnPortfolioMenu'), 10)
WebUI.click(findTestObject('Admin/Portfolio/Page_Portfolio/btnPortfolioMenu'))

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/lblPortfolioPageTitle'), 10)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/btnAddPortfolio'), 10)
WebUI.click(findTestObject('Admin/Portfolio/Page_Portfolio/btnAddPortfolio'))

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/lblAddPortfolioModalTitle'), 10)

WebUI.setText(findTestObject('Admin/Portfolio/Page_Portfolio/txfTitle'), portfolioTitle)
WebUI.setText(findTestObject('Admin/Portfolio/Page_Portfolio/txfSlug'), portfolioSlug)
WebUI.setText(findTestObject('Admin/Portfolio/Page_Portfolio/txaDescription'), 'Created by Katalon automation test')

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/drpCategory'), 10)
WebUI.selectOptionByValue(findTestObject('Admin/Portfolio/Page_Portfolio/drpCategory'), 'design', false)

WebUI.setText(findTestObject('Admin/Portfolio/Page_Portfolio/txfOrder'), '99')

WebUI.uploadFile(findTestObject('Admin/Portfolio/Page_Portfolio/uplMedia'), 'D:\\LAMAR KERJA\\QA-Automation\\TestData\\portfolio-sample.png')

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/btnSave'), 10)

WebUI.executeJavaScript(
	'arguments[0].click();',
	Arrays.asList(WebUI.findWebElement(findTestObject('Admin/Portfolio/Page_Portfolio/btnSave'), 10))
)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/lblPortfolioPageTitle'), 10)

WebUI.verifyTextPresent(portfolioTitle, false)

WebUI.closeBrowser()
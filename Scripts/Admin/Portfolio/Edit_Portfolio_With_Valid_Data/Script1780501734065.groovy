import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.util.Arrays as Arrays

String uniqueId = System.currentTimeMillis().toString()

String updatedTitle = 'QA Automation Portfolio Updated ' + uniqueId

String updatedDescription = 'Updated by Katalon automation test'

WebUI.callTestCase(findTestCase('Admin/Login/Login_As_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/btnPortfolioMenu'), 10)
WebUI.click(findTestObject('Admin/Portfolio/Page_Portfolio/btnPortfolioMenu'))

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/lblPortfolioPageTitle'), 10)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/btnEditFirstData'), 10)
WebUI.click(findTestObject('Admin/Portfolio/Page_Portfolio/btnEditFirstData'))

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/lblEditPortfolioModalTitle'), 10)

WebUI.clearText(findTestObject('Admin/Portfolio/Page_Portfolio/txfTitle'))
WebUI.setText(findTestObject('Admin/Portfolio/Page_Portfolio/txfTitle'), updatedTitle)

WebUI.clearText(findTestObject('Admin/Portfolio/Page_Portfolio/txaDescription'))
WebUI.setText(findTestObject('Admin/Portfolio/Page_Portfolio/txaDescription'), updatedDescription)

WebUI.clearText(findTestObject('Admin/Portfolio/Page_Portfolio/txfOrder'))
WebUI.setText(findTestObject('Admin/Portfolio/Page_Portfolio/txfOrder'), '98')

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/btnSave'), 10)

WebUI.executeJavaScript(
	'arguments[0].click();',
	Arrays.asList(WebUI.findWebElement(findTestObject('Admin/Portfolio/Page_Portfolio/btnSave'), 10))
)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/lblPortfolioPageTitle'), 10)

WebUI.verifyTextPresent(updatedTitle, false)

WebUI.closeBrowser()
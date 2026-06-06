import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Admin/Login/Login_As_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/btnPortfolioMenu'), 10)
WebUI.click(findTestObject('Admin/Portfolio/Page_Portfolio/btnPortfolioMenu'))

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/lblPortfolioPageTitle'), 10)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/btnDeleteFirstData'), 10)
WebUI.click(findTestObject('Admin/Portfolio/Page_Portfolio/btnDeleteFirstData'))

WebUI.waitForAlert(10)
WebUI.acceptAlert()

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Admin/Portfolio/Page_Portfolio/lblPortfolioPageTitle'), 10)

WebUI.closeBrowser()
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl(GlobalVariable.adminUrl)

WebUI.waitForElementClickable(findTestObject('Admin/Login/Page_Meraki/btnOpenLoginModal'), 20)

WebUI.click(findTestObject('Admin/Login/Page_Meraki/btnOpenLoginModal'))

WebUI.setText(findTestObject('Admin/Login/Page_Meraki/txfEmail'), GlobalVariable.username)

WebUI.setText(findTestObject('Admin/Login/Page_Meraki/txfPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Admin/Login/Page_Meraki/btnLogin'))

WebUI.waitForElementVisible(findTestObject('Admin/Dashboard/Page_Admin_Meraki/lblDashboard'), 10)

WebUI.verifyElementPresent(findTestObject('Admin/Dashboard/Page_Admin_Meraki/lblDashboard'), 10)
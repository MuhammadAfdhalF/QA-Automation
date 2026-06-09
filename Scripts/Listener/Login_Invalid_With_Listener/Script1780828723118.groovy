import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl(GlobalVariable.adminUrl)

WebUI.waitForElementClickable(findTestObject('Admin/Login/Page_Meraki/btnOpenLoginModal'), 20)

WebUI.click(findTestObject('Admin/Login/Page_Meraki/btnOpenLoginModal'))

WebUI.setText(findTestObject('Admin/Login/Page_Meraki/txfEmail'), GlobalVariable.username)

WebUI.setText(findTestObject('Admin/Login/Page_Meraki/txfPassword'), 'wrongpasswordbro')

WebUI.click(findTestObject('Admin/Login/Page_Meraki/btnLogin'))

WebUI.verifyElementPresent(findTestObject('Admin/Login/Page_Meraki/txfEmail'), 10)
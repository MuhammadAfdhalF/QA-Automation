import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

println("This is sample failed test")

WebUI.openBrowser('')

WebUI.navigateToUrl('https://example.com')

WebUI.verifyEqual(1, 2)

WebUI.closeBrowser()
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('API/Auth_Login_API'), [:], FailureHandling.STOP_ON_FAILURE)

ResponseObject response = WS.sendRequest(findTestObject('API/Auth/GET_Me', [
	('apiUrl') : GlobalVariable.apiUrl,
	('token')  : GlobalVariable.token
]))

WS.verifyResponseStatusCode(response, 200)

def jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())

assert jsonResponse.user != null
assert jsonResponse.user.email == GlobalVariable.username

println("Auth Me API success")
println("Authenticated user email: " + jsonResponse.user.email)
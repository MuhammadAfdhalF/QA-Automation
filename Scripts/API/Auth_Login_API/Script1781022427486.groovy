import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

ResponseObject response = WS.sendRequest(findTestObject('API/Auth/POST_Login', [
	('apiUrl')   : GlobalVariable.apiUrl,
	('username') : GlobalVariable.username,
	('password') : GlobalVariable.password
]))

WS.verifyResponseStatusCode(response, 200)

def jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())

assert jsonResponse.token != null
assert jsonResponse.user != null
assert jsonResponse.user.email == GlobalVariable.username

GlobalVariable.token = jsonResponse.token

println("Login API success")
println("Token saved to GlobalVariable.token")
println("User email: " + jsonResponse.user.email)
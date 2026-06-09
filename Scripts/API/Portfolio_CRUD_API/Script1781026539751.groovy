import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

String uniqueId = System.currentTimeMillis().toString()

String title = 'QA API Portfolio ' + uniqueId
String slug = 'qa-api-portfolio-' + uniqueId
String description = 'Created by Katalon API test'
String category = 'design'
String imagePath = '/storage/portfolios/api-test-image.png'
String order = '99'

String updatedTitle = 'QA API Portfolio Updated ' + uniqueId
String updatedDescription = 'Updated by Katalon API test'
String updatedOrder = '98'

WebUI.callTestCase(findTestCase('API/Auth_Login_API'), [:], FailureHandling.STOP_ON_FAILURE)

ResponseObject createResponse = WS.sendRequest(findTestObject('API/Portfolio/POST_Create_Portfolio', [
	('apiUrl')      : GlobalVariable.apiUrl,
	('token')       : GlobalVariable.token,
	('title')       : title,
	('slug')        : slug,
	('description') : description,
	('category')    : category,
	('imagePath')   : imagePath,
	('order')       : order
]))

WS.verifyResponseStatusCode(createResponse, 201)

def createJson = new JsonSlurper().parseText(createResponse.getResponseBodyContent())

assert createJson.message == 'Portfolio created'
assert createJson.data != null
assert createJson.data.id != null
assert createJson.data.title == title
assert createJson.data.slug == slug

String portfolioId = createJson.data.id.toString()

println("Portfolio created successfully")
println("Portfolio ID: " + portfolioId)

ResponseObject updateResponse = WS.sendRequest(findTestObject('API/Portfolio/PATCH_Update_Portfolio', [
	('apiUrl')      : GlobalVariable.apiUrl,
	('token')       : GlobalVariable.token,
	('portfolioId') : portfolioId,
	('title')       : updatedTitle,
	('description') : updatedDescription,
	('order')       : updatedOrder
]))

WS.verifyResponseStatusCode(updateResponse, 200)

def updateJson = new JsonSlurper().parseText(updateResponse.getResponseBodyContent())

assert updateJson.message == 'Portfolio updated'
assert updateJson.data != null
assert updateJson.data.id.toString() == portfolioId
assert updateJson.data.title == updatedTitle
assert updateJson.data.description == updatedDescription

println("Portfolio updated successfully")
println("Updated title: " + updateJson.data.title)

ResponseObject deleteResponse = WS.sendRequest(findTestObject('API/Portfolio/DELETE_Portfolio', [
	('apiUrl')      : GlobalVariable.apiUrl,
	('token')       : GlobalVariable.token,
	('portfolioId') : portfolioId
]))

WS.verifyResponseStatusCode(deleteResponse, 200)

def deleteJson = new JsonSlurper().parseText(deleteResponse.getResponseBodyContent())

assert deleteJson.message == 'Portfolio deleted'

println("Portfolio deleted successfully")
println("Portfolio CRUD API test completed")
<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PATCH_Update_Portfolio</name>
   <tag></tag>
   <elementGuidId>654ca21d-ce40-4774-990e-331af818835d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;title\&quot;: \&quot;${title}\&quot;,\n  \&quot;description\&quot;: \&quot;${description}\&quot;,\n  \&quot;order\&quot;: ${order}\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>c705780e-8dc4-464b-98e2-fd2f62a0bac5</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>683a521b-92aa-46ce-8b6b-8e65e48a32f6</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
      <webElementGuid>c487ba3f-ddbc-4975-b0d7-a195924c2e3e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>11.1.3</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>${apiUrl}/portfolios/${portfolioId}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'http://127.0.0.1:8000/api'</defaultValue>
      <description></description>
      <id>f97ff9db-18dc-46e9-a66e-a0024401c8e6</id>
      <masked>false</masked>
      <name>apiUrl</name>
   </variables>
   <variables>
      <defaultValue>'294|jvOzyQrEKULx2PPeN7bemI0YksSTyZrZ1KhUzCd5b99b64de'</defaultValue>
      <description></description>
      <id>06172184-8b8e-4016-a515-c8bd5f86b716</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>'38'</defaultValue>
      <description></description>
      <id>550022a5-ec9e-4029-98d6-f6de4249a69c</id>
      <masked>false</masked>
      <name>portfolioId</name>
   </variables>
   <variables>
      <defaultValue>'QA API Portfolio Updated'</defaultValue>
      <description></description>
      <id>5c4d8831-4d22-4124-9a3a-f2dd0c9d6f25</id>
      <masked>false</masked>
      <name>title</name>
   </variables>
   <variables>
      <defaultValue>'Updated by Katalon API test'</defaultValue>
      <description></description>
      <id>5e61efe3-b6cc-4570-8d44-7b9d791589e5</id>
      <masked>false</masked>
      <name>description</name>
   </variables>
   <variables>
      <defaultValue>'98'</defaultValue>
      <description></description>
      <id>8a804b5f-3a4b-4391-a6c1-c220e62468f4</id>
      <masked>false</masked>
      <name>order</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

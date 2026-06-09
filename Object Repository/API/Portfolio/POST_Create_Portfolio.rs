<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST_Create_Portfolio</name>
   <tag></tag>
   <elementGuidId>9ad4997c-1f10-4f0a-b3e5-cfd04fed29da</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;title\&quot;: \&quot;${title}\&quot;,\n  \&quot;slug\&quot;: \&quot;${slug}\&quot;,\n  \&quot;description\&quot;: \&quot;${description}\&quot;,\n  \&quot;category\&quot;: \&quot;${category}\&quot;,\n  \&quot;media\&quot;: [\n    {\n      \&quot;type\&quot;: \&quot;image\&quot;,\n      \&quot;path\&quot;: \&quot;${imagePath}\&quot;\n    }\n  ],\n  \&quot;is_featured\&quot;: false,\n  \&quot;order\&quot;: ${order},\n  \&quot;is_active\&quot;: true\n}&quot;,
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
      <webElementGuid>996f820e-25bf-4fd5-90ea-d67dfa0761bd</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>cba9e4cb-5723-454d-86f5-7d9a45cee925</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
      <webElementGuid>8518be5b-97d3-4e17-8eed-5a9bd2074cae</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>11.1.3</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${apiUrl}/portfolios</restUrl>
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
      <id>fd0a7657-1bfa-4803-871f-76eda9068598</id>
      <masked>false</masked>
      <name>apiUrl</name>
   </variables>
   <variables>
      <defaultValue>'294|jvOzyQrEKULx2PPeN7bemI0YksSTyZrZ1KhUzCd5b99b64de'</defaultValue>
      <description></description>
      <id>9791b76d-67e4-4d73-bc7f-babb27d61b25</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>'QA API Portfolio Manual'</defaultValue>
      <description></description>
      <id>e3f1bd8f-0f50-4bf7-a6ca-7a7578a8f7ef</id>
      <masked>false</masked>
      <name>title</name>
   </variables>
   <variables>
      <defaultValue>'qa-api-portfolio-manual-009'</defaultValue>
      <description></description>
      <id>04ce1741-44f9-42e1-9030-d525bdfdc18f</id>
      <masked>false</masked>
      <name>slug</name>
   </variables>
   <variables>
      <defaultValue>'Created by Katalon API test'</defaultValue>
      <description></description>
      <id>32bce43e-6d08-432d-97b4-0534654558ee</id>
      <masked>false</masked>
      <name>description</name>
   </variables>
   <variables>
      <defaultValue>'design'</defaultValue>
      <description></description>
      <id>31ad7627-d58b-4300-ba6e-b49fa4560eff</id>
      <masked>false</masked>
      <name>category</name>
   </variables>
   <variables>
      <defaultValue>'/storage/portfolios/api-test-image.png'</defaultValue>
      <description></description>
      <id>04888c17-0d2b-4d4b-ad2a-df7aa8332330</id>
      <masked>false</masked>
      <name>imagePath</name>
   </variables>
   <variables>
      <defaultValue>'99'</defaultValue>
      <description></description>
      <id>4a545cfe-f4b4-4188-a223-006746165070</id>
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

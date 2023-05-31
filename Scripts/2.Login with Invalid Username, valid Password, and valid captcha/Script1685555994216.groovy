import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlLogin)

WebUI.verifyElementText(findTestObject('Welcome Text'), 'Welcome to Faspay Merchant Page')

WebUI.verifyElementHasAttribute(findTestObject('username field'), 'required', 0)

WebUI.setText(findTestObject('username field'), 'dummydummy')

WebUI.verifyElementHasAttribute(findTestObject('password field'), 'required', 0)

WebUI.setText(findTestObject('password field'), GlobalVariable.password)

WebUI.verifyElementHasAttribute(findTestObject('captcha field'), 'required', 0)

'Manual Input Valid Captcha'
WebUI.delay(10)

WebUI.click(findTestObject('login button'))

'Incorrect Email/Username or Password'
WebUI.verifyElementPresent(findTestObject('Warning Text'), 0)


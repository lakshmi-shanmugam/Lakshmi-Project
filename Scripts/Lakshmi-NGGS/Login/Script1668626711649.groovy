import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://igmsdev.appdev.epa.gov/nggs-pa/saml/discovery?entityID=https%3A%2F%2Figmsdev.appdev.epa.gov%3A443%2Fnggs-pa%2Fsaml%2Fmetadata&returnIDParam=idp')

WebUI.click(findTestObject('Object Repository/Login/Page_NGGS Login/input_You may not process or store classifi_e56759'))

WebUI.click(findTestObject('Object Repository/Login/Page_NGGS Application Detail/a_Funding Opportunities'))

WebUI.click(findTestObject('Object Repository/Login/Page_NGGS Funding Opportunity Detail/a_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Login/Page_NGGS Funding Opportunity Detail/select_WorkflowTask'), 
    'HQ', true)

WebUI.click(findTestObject('Object Repository/Login/Page_NGGS Funding Opportunity Detail/button_Search'))

WebUI.click(findTestObject('Object Repository/Login/Page_NGGS Funding Opportunity Detail/a_Dashboard'))


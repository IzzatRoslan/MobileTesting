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

WebUI.callTestCase(findTestCase('1.Creating Note/Open Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.Creating Note/Create Checklist Note'), [('checklist') : 'Do Laundry'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('3.Set Reminder/Selection Checklist', [('checklist') : notes]), 0)

Mobile.tap(findTestObject('3.Set Reminder/Detail Button'), 0)

Mobile.tap(findTestObject('3.Set Reminder/Reminder Button'), 0)

Mobile.tap(findTestObject('3.Set Reminder/Scroll Reminder Type'), 0)

Mobile.tap(findTestObject('3.Set Reminder/Select All Day'), 0)

Mobile.tap(findTestObject('3.Set Reminder/Done Button'), 0)

Mobile.verifyElementExist(findTestObject('3.Set Reminder/Verify Reminder'), 0)

Mobile.closeApplication()

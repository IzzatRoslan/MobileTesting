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

WebUI.callTestCase(findTestCase('1.Creating Note/Create Notes'), [('notes') : 'TESTING5'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('4.Edit Note/Verify Note Text', [('notes') : notes]), 0)

Mobile.tap(findTestObject('4.Edit Note/Edit Button'), 0)

Mobile.clearText(findTestObject('4.Edit Note/Input Text', [('notes') : notes]), 0)

Mobile.setText(findTestObject('4.Edit Note/Input New Text'), edited, 0)

Mobile.tap(findTestObject('4.Edit Note/Revert Button'), 0)

Mobile.tap(findTestObject('4.Edit Note/Tick Button'), 0)

Mobile.tap(findTestObject('4.Edit Note/Back Button'), 0)

Mobile.verifyElementText(findTestObject('4.Edit Note/Verify Note Text', [('notes') : notes]), notes)

Mobile.closeApplication()


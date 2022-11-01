import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Create_Notes {


	@Given("User open the application")
	def startapplication() {
		Mobile.startApplication('C:\\Users\\izzat\\Downloads\\ColorNote Notepad Notes_4.4.2_Apkpure.apk', true)
	}
	
	@When("User tap the skip button")
	def tapskipbutton() {
		Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.Button - SKIP'), 0)
	}


	@And("User tap on the + Icon")
	def tapaddbutton() {
		Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.FrameLayout'), 0)
	}

	@And("User select note option")
	def selectnoteoption() {
		Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.LinearLayout'), 0)
	}

	@And("User enters fill in their notes (.*)")
	def fillinnotes(String notes) {
		println("test input = "+notes)
		Mobile.setText(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.EditText'), notes, 0)
	}

	@And("User tap on the tick button to save the note")
	def savenote() {
		Mobile.tap(findTestObject('1.Creating Note/Create Notes/android.widget.ImageButton'), 0)
	}

	@And("User tap on back button")
	def backbutton() {
		Mobile.tap(findTestObject('1.Creating Note/Create Notes/android.widget.ImageButton'), 0)
	}
	@Then("User verify their notes in the homepage (.*)")
	def verifynote(String notes) {
		
		Mobile.verifyElementText(findTestObject('1.Creating Note/Create Notes/android.widget.TextView - This is for testing purposes',
			[('notes') : notes]), notes)
	
		Mobile.closeApplication()
	
	}
}
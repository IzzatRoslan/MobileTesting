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

Mobile.startApplication('C:\\Users\\izzat\\Downloads\\ColorNote Notepad Notes_4.4.2_Apkpure.apk', true)

Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.Button - SKIP (1)'), 0)

Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('1.Creating Note/Create Notes/Edit Text'), checklist, 0)

Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.TextView - Add Item'), 0)

Mobile.setText(findTestObject('1.Creating Note/Create Notes/Edit Add Item'), checklist, 0)

Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/1.Creating Note/Create Notes/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('1.Creating Note/Create Notes/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('1.Creating Note/Create Notes/android.widget.LinearLayout (2)'), 0)

Mobile.verifyElementText(findTestObject('1.Creating Note/Create Notes/android.widget.TextView - DO LAUNDRY', [('checklist') : checklist]), 
    checklist)

Mobile.closeApplication()


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

Mobile.startApplication(GlobalVariable.G_HappyDaySHopping, true)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Shopping/BtnSearch'), 0)

Mobile.setText(findTestObject('Shopping/Searchfield'), 'Promo' + '\\n', 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Shopping/prodak1'), 0)

Mobile.tap(findTestObject('Shopping/addToBagPro1'), 0)

Mobile.tap(findTestObject('Shopping/BtnBackPro1'), 0)

Mobile.tap(findTestObject('Shopping/Prodak2'), 0)

Mobile.tap(findTestObject('Shopping/addToBagPro1'), 0)

Mobile.tap(findTestObject('Shopping/BtnBackPro1'), 0)

Mobile.tap(findTestObject('Shopping/BtnBackPro2'), 0)

Mobile.tap(findTestObject('Shopping/BtnFlashSale'), 0)

Mobile.delay(12, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Shopping/ProdakFlash1'), 0)

Mobile.tap(findTestObject('Shopping/AddToBagFlash1'), 0)

Mobile.tap(findTestObject('Shopping/BtnBackPro1'), 0)

Mobile.tap(findTestObject('Shopping/prodakFlash2'), 0)

Mobile.tap(findTestObject('Shopping/addToBagFlash2'), 0)

Mobile.tap(findTestObject('Shopping/BtnYourBag'), 0)

Mobile.tap(findTestObject('Shopping/detailBag'), 0)

Mobile.tap(findTestObject('Shopping/BtnClear'), 0)

Mobile.tap(findTestObject('Shopping/Yes'), 0)

Mobile.checkElement(findTestObject('Shopping/lastReport'), 0)

Mobile.closeApplication()


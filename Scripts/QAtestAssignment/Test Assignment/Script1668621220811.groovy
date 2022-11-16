import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
//WebUI.maximizeWindow()
WebUI.navigateToUrl('https://docs.google.com/forms/d/e/1FAIpQLSeq8naEPofrOrOA0nxdGj6L7jqddI8xHMFIyl9ailFnfl-uTQ/viewform')

WebUI.delay(1)

		for (int j = 0; j <= 2; j++) {
	
				if (WebUI.waitForElementNotPresent(findTestObject("Object Repository/Page_QA test assignment/input__whsOnd zHQkBf"), 3) == false) {
	
					//WebUI.comment()
	
					WebUI.waitForElementPresent(findTestObject("Object Repository/Page_QA test assignment/input__whsOnd zHQkBf"), 5, FailureHandling.STOP_ON_FAILURE)
	
					WebUI.waitForElementVisible(findTestObject("Object Repository/Page_QA test assignment/input__whsOnd zHQkBf"), 5, FailureHandling.STOP_ON_FAILURE)
	
					WebUI.waitForElementClickable(findTestObject("Object Repository/Page_QA test assignment/input__whsOnd zHQkBf"), 5, FailureHandling.STOP_ON_FAILURE)
	
					WebUI.click(findTestObject("Object Repository/Page_QA test assignment/input__whsOnd zHQkBf"))
	
					break
	
				} else {
	
					WebUI.comment("Field is not clickable")
	
					WebUI.delay(1)
				}
			}
			
WebUI.delay(2)
			
WebUI.setText(findTestObject('Object Repository/Page_QA test assignment/input__whsOnd zHQkBf'), 'Alex')

WebUI.setText(findTestObject('Object Repository/Page_QA test assignment/input__whsOnd zHQkBf_1'), 'alexechief@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_QA test assignment/div_playing music_AB7Lab Id5V1'))

WebUI.click(findTestObject('Object Repository/Page_QA test assignment/div_playing music_AB7Lab Id5V1'))

WebUI.setText(findTestObject('Object Repository/Page_QA test assignment/input__whsOnd zHQkBf_1_2'), 'https://github.com/117MasterChief/QA_testAssignment')

WebUI.comment("End of Test")

/** End - Don't Click Send **/

WebUI.closeBrowser()


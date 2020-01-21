package com.pinnsights

import net.sf.cglib.core.Local
import org.openqa.selenium.*
import java.util.HashMap
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.time.LocalDateTime


var birdPost = false
var dogPost = false
var price = false
var autoBirdLogin = ""
var autoBirdPassword = ""
var autoDogLogin = ""
var autoDogPassword = ""
var birdName = ""
var newPrice = ""

fun main(args: Array<String>) {
    scrape()
}

fun scrape() {
    val chromePrefs = HashMap<String, Any>()
    chromePrefs["profile.default_content_settings.popups"] = 0
    val options = ChromeOptions()
    options.setExperimentalOption("prefs", chromePrefs)
    val cap = DesiredCapabilities.chrome()
    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true)
    cap.setCapability(ChromeOptions.CAPABILITY, options)
    val driver = ChromeDriver(cap)


    //////////////////////////////////////////////////
    /////// JORDAN VALUES AND UNCOMMENT //////////////
    //////////////////////////////////////////////////

//    autoBirdLogin = "supportminneapolis@thefinchfarm.com"
//    autoBirdPassword = "TFF2019!"
//    birdPost = true

    //////////////////////////////////////////////////
    /////// JORDAN BIRD POST ABOVE //// //////////////
    //////////////////////////////////////////////////

//    birdName = "Red-Lored Amazon"
//    newPrice = "1764.99"
//    price = true

    //////////////////////////////////////////////////
    //////// ABOVE FOR PRICE CHANGE APP //////////////
    //////////////////////////////////////////////////

//    autoDogLogin = "customersupportNY@thefinchfarm.com"
//    autoDogPassword = "TFF2019!"
//    dogPost = true

    //////////////////////////////////////////////////
    /////// JORDAN BIRD POST ABOVE //// //////////////
    //////////////////////////////////////////////////

    if(birdPost) {
        autoBirdPost(driver, autoBirdLogin, autoBirdPassword)
    } else if (dogPost) {
        autoDogPost(driver, autoDogLogin, autoDogPassword)
    }
    else if (price) {
        priceChange(driver,birdName,newPrice)
    } else {
        renewBirds(driver)
        run(driver)
    }
//    viewCount(driver)
    driver.quit()
}

fun autoBirdPost(driver: ChromeDriver, login: String, pass: String) {
    birdsNowLogin(driver, login, pass)
    createBirds(driver)
    birdsNowLogout(driver)
}

fun autoDogPost(driver: ChromeDriver, login: String, pass: String) {
    dogLogin(driver, login, pass)
    Thread.sleep(5000)
    createDogs(driver)
    dogLogout(driver)
}

fun run(driver: ChromeDriver) {
    val start = LocalDateTime.now()
    val startTime = (start.hour*60) + start.minute
    println(start)
    //runClassifieds(driver)
    for(i in 0..3) {
        runBirdsNow(driver,i)
//        runAllHoobly(driver,i)

        runOtherNowPets(driver,i)
    }
    val end = LocalDateTime.now()
    val endTime = (end.hour*60) + end.minute
    val runTime = endTime - startTime
    println(runTime)
}

fun runBirdsNow(driver: ChromeDriver, i: Int) {
    runBirdsWA(driver,i)
    runBirdsCA(driver,i)
    runBirdsAZ(driver,i)
    runBirdsFL(driver,i)
    runBirdsTX(driver,i)
    runBirdsNY(driver,i)
    runBirdsIL(driver,i)
    runBirdsPA(driver,i)
    runBirdsOH(driver,i)
    runBirdsIN(driver,i)
    runBirdsMA(driver,i)
    runBirdsDL(driver,i)
    runBirdsDC(driver,i)
    runBirdsAT(driver,i)
    runBirdsDT(driver,i)
    runBirdsPDX(driver,i)
    runBirdsMIN(driver,i)
    runBirdsLA(driver,i)
    runBirdsSAN(driver,i)
    runBirdsDEN(driver,i)
    runBirdsBAL(driver,i)
    runBirdsSTL(driver,i)
    runBirdsTMP(driver,i)
    runBirdsORL(driver,i)
    runBirdsRVR(driver,i)
    runBirdsKAN(driver,i)
    runBirdsAUS(driver,i)
    runBirdsLVG(driver,i)
    runBirdsPITT(driver,i)
    runBirdsSAC(driver,i)
    runBirdsCHAR(driver,i)
    runBirdsSANT(driver,i)

    runBirdsSJ(driver,i)
    runBirdsNASH(driver,i)
    runBirdsJACK(driver,i)
//    runBirdsCLV(driver,i)
    runBirdsCOL(driver,i)
    runBirdsBUF(driver,i)
    runBirdsBIR(driver,i)
    runBirdsHAR(driver,i)
    runBirdsSLC(driver,i)
    runBirdsNO(driver,i)
    runBirdsLOU(driver,i)
    runBirdsRICH(driver,i)
    runBirdsMEM(driver,i)
    runBirdsRAL(driver,i)
    runBirdsOKC(driver,i)
    runBirdsMIL(driver,i)
    runBirdsPRO(driver,i)
    runBirdsVIR(driver,i)
}

fun runOtherNowPets(driver: ChromeDriver, i: Int) {
    runCats(driver,i)
    runReps(driver,i)
//    runDogs(driver,i)
}

fun runAllHoobly(driver: ChromeDriver, i: Int) {
    runHooblyWA(driver,i)
    runHooblyFL(driver,i)
    runHooblyAZ(driver,i)
    runHooblyCA(driver,i)
}

fun renewBirds(driver: ChromeDriver) {
    runBirdsNASHRenew(driver)
    runBirdsOKCRenew(driver)
    runBirdsMILRenew(driver)
    runBirdsPRORenew(driver)
    runBirdsVIRRenew(driver)
    runBirdsRICHRenew(driver)
    runBirdsRALRenew(driver)
    runBirdsMEMRenew(driver)
    runBirdsSLCRenew(driver)
    runBirdsNORenew(driver)
    runBirdsLOURenew(driver)
    runBirdsJACKRenew(driver)
    //runBirdsCLVRenew(driver)
    runBirdsCOLRenew(driver)
    runBirdsBUFRenew(driver)
    runBirdsSJRenew(driver)
    runBirdsORLRenew(driver)
    runBirdsRVRRenew(driver)
    runBirdsAUSRenew(driver)
    runBirdsLVGRenew(driver)
    runBirdsPITTRenew(driver)
    runBirdsBIRRenew(driver)
    runBirdsHARRenew(driver)
    runBirdsSACRenew(driver)
    runBirdsCHARRenew(driver)
    runBirdsSANTRenew(driver)
    runBirdsKANRenew(driver)
    runBirdsPDXRenew(driver)
    runBirdsBALRenew(driver)
    runBirdsDENRenew(driver)
    runBirdsMINRenew(driver)
    runBirdsLARenew(driver)
    runBirdsSANRenew(driver)
    runBirdsWARenew(driver)
    runBirdsCARenew(driver)
    runBirdsAZRenew(driver)
    runBirdsFLRenew(driver)
    runBirdsTXRenew(driver)
    runBirdsNYRenew(driver)
    runBirdsILRenew(driver)
    runBirdsPARenew(driver)
    runBirdsOHRenew(driver)
    runBirdsINRenew(driver)
    runBirdsMARenew(driver)
    runBirdsDLRenew(driver)
    runBirdsDCRenew(driver)
    runBirdsATRenew(driver)
    runBirdsDTRenew(driver)
    runBirdsSTLRenew(driver)
    runBirdsTMPRenew(driver)
}
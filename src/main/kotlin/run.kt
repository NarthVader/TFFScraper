package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.UnhandledAlertException
import org.openqa.selenium.chrome.ChromeDriver

fun runBirdsNASH(driver: ChromeDriver, i: Int) {
    val usrBirdsNASH = "supportnashville@thefinchfarm.com"
    val pwBirdsNASH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsNASH,pwBirdsNASH)
    birdsNowNASH(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsOKC(driver: ChromeDriver, i: Int) {
    val usrBirdsOKC = "supportoklahomacity@thefinchfarm.com"
    val pwBirdsOKC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsOKC,pwBirdsOKC)
    birdsNowOKC(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsMIL(driver: ChromeDriver, i: Int) {
    val usrBirdsMIL = "supportmilwaukee@thefinchfarm.com"
    val pwBirdsMIL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMIL,pwBirdsMIL)
    birdsNowMIL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsPRO(driver: ChromeDriver, i: Int) {
    val usrBirdsPRO = "supportprovidence@thefinchfarm.com"
    val pwBirdsPRO = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPRO,pwBirdsPRO)
    birdsNowPRO(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsVIR(driver: ChromeDriver, i: Int) {
    val usrBirdsVIR = "supportvirginia@thefinchfarm.com"
    val pwBirdsVIR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsVIR,pwBirdsVIR)
    birdsNowVIR(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsRICH(driver: ChromeDriver, i: Int) {
    val usrBirdsRICH = "supportrichmond@thefinchfarm.com"
    val pwBirdsRICH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsRICH,pwBirdsRICH)
    birdsNowRICH(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsRAL(driver: ChromeDriver, i: Int) {
    val usrBirdsRAL = "supportraleigh@thefinchfarm.com"
    val pwBirdsRAL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsRAL,pwBirdsRAL)
    birdsNowRAL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsMEM(driver: ChromeDriver, i: Int) {
    val usrBirdsMEM = "supportmemphis@thefinchfarm.com"
    val pwBirdsMEM = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMEM,pwBirdsMEM)
    birdsNowMEM(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsSLC(driver: ChromeDriver, i: Int) {
    val usrBirdsSLC = "supportsaltlake@thefinchfarm.com"
    val pwBirdsSLC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSLC,pwBirdsSLC)
    birdsNowSLC(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsNO(driver: ChromeDriver, i: Int) {
    val usrBirdsNO = "supportneworleans@thefinchfarm.com"
    val pwBirdsNO = "TFF2019!"
    birdsNowLogin(driver,usrBirdsNO,pwBirdsNO)
    birdsNowNO(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsLOU(driver: ChromeDriver, i: Int) {
    val usrBirdsLOU = "supportlouisville@thefinchfarm.com"
    val pwBirdsLOU = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLOU,pwBirdsLOU)
    birdsNowLOU(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsJACK(driver: ChromeDriver, i: Int) {
    val usrBirdsJACK = "supportjacksonville@thefinchfarm.com"
    val pwBirdsJACK = "TFF2019!"
    birdsNowLogin(driver,usrBirdsJACK,pwBirdsJACK)
    birdsNowJACK(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsCLV(driver: ChromeDriver, i: Int) {
    val usrBirdsCLV = "supportcleveland@thefinchfarm.com"
    val pwBirdsCLV = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCLV,pwBirdsCLV)
    birdsNowCLV(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsCOL(driver: ChromeDriver, i: Int) {
    val usrBirdsCOL = "supportcolumbus@thefinchfarm.com"
    val pwBirdsCOL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCOL,pwBirdsCOL)
    birdsNowCOL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsBUF(driver: ChromeDriver, i: Int) {
    val usrBirdsBUF = "supportbuffalo@thefinchfarm.com"
    val pwBirdsBUF = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBUF,pwBirdsBUF)
    birdsNowBUF(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsSJ(driver: ChromeDriver, i: Int) {
    val usrBirdsSJ = "supportsanjose@thefinchfarm.com"
    val pwBirdsSJ = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSJ,pwBirdsSJ)
    birdsNowSJ(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsORL(driver: ChromeDriver, i: Int) {
    val usrBirdsORL = "supportorlando@thefinchfarm.com"
    val pwBirdsORL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsORL,pwBirdsORL)
    birdsNowORL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsRVR(driver: ChromeDriver, i: Int) {
    val usrBirdsRVR = "supportriverside@thefinchfarm.com"
    val pwBirdsRVR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsRVR,pwBirdsRVR)
    birdsNowRVR(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsAUS(driver: ChromeDriver, i: Int) {
    val usrBirdsAUS = "supportaustin@thefinchfarm.com"
    val pwBirdsAUS = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAUS,pwBirdsAUS)
    birdsNowAUS(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsLVG(driver: ChromeDriver, i: Int) {
    val usrBirdsLVG = "supportlasvegas@thefinchfarm.com"
    val pwBirdsLVG = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLVG,pwBirdsLVG)
    birdsNowLVG(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsPITT(driver: ChromeDriver, i: Int) {
    val usrBirdsPITT = "supportpittsburgh@thefinchfarm.com"
    val pwBirdsPITT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPITT,pwBirdsPITT)
    birdsNowPITT(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsBIR(driver: ChromeDriver, i: Int) {
    val usrBirdsBIR = "supportbirmingham@thefinchfarm.com"
    val pwBirdsBIR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBIR,pwBirdsBIR)
    birdsNowBIR(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsHAR(driver: ChromeDriver, i: Int) {
    val usrBirdsHAR = "supporthartford@thefinchfarm.com"
    val pwBirdsHAR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsHAR,pwBirdsHAR)
    birdsNowHAR(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsSAC(driver: ChromeDriver, i: Int) {
    val usrBirdsSAC = "supportsacramento@thefinchfarm.com"
    val pwBirdsSAC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSAC,pwBirdsSAC)
    birdsNowSAC(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsCHAR(driver: ChromeDriver, i: Int) {
    val usrBirdsCHAR = "supportcharlotte@thefinchfarm.com"
    val pwBirdsCHAR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCHAR,pwBirdsCHAR)
    birdsNowCHAR(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsSANT(driver: ChromeDriver, i: Int) {
    val usrBirdsSANT = "supportsanantonio@thefinchfarm.com"
    val pwBirdsSANT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSANT,pwBirdsSANT)
    birdsNowSANT(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsKAN(driver: ChromeDriver, i: Int) {
    val usrBirdsKAN = "supportkansas@thefinchfarm.com"
    val pwBirdsKAN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsKAN,pwBirdsKAN)
    birdsNowKAN(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsPDX(driver: ChromeDriver, i: Int) {
    val usrBirdsPDX = "supportportland@thefinchfarm.com"
    val pwBirdsPDX = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPDX,pwBirdsPDX)
    birdsNowPDX(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsBAL(driver: ChromeDriver, i: Int) {
    val usrBirdsBAL = "supportbaltimore@thefinchfarm.com"
    val pwBirdsBAL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBAL,pwBirdsBAL)
    birdsNowBAL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsDEN(driver: ChromeDriver, i: Int) {
    val usrBirdsDEN = "supportdenver@thefinchfarm.com"
    val pwBirdsDEN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDEN,pwBirdsDEN)
    birdsNowDEN(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsMIN(driver: ChromeDriver, i: Int) {
    val usrBirdsMIN = "supportminneapolis@thefinchfarm.com"
    val pwBirdsMIN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMIN,pwBirdsMIN)
    birdsNowMIN(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsLA(driver: ChromeDriver, i: Int) {
    val usrBirdsLA = "supportlosangeles@thefinchfarm.com"
    val pwBirdsLA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLA,pwBirdsLA)
    birdsNowLA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsSAN(driver: ChromeDriver, i: Int) {
    val usrBirdsSAN = "supportsandiego@thefinchfarm.com"
    val pwBirdsSAN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSAN,pwBirdsSAN)
    birdsNowSAN(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsWA(driver: ChromeDriver, i: Int) {

    val usrBirdsWA = "customersupport@thefinchfarm.com"
    val pwBirdsWA = "TFF2020!"
    birdsNowLogin(driver,usrBirdsWA,pwBirdsWA)
    birdsNowWA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsCA(driver: ChromeDriver, i: Int) {

    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"
    birdsNowLogin(driver,usrBirdsCA,pwBirdsCA)
    birdsNowCA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsAZ(driver: ChromeDriver, i: Int) {

    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAZ,pwBirdsAZ)
    birdsNowAZ(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsFL(driver: ChromeDriver, i: Int) {

    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"
    birdsNowLogin(driver,usrBirdsFL,pwBirdsFL)
    birdsNowFL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsTX(driver: ChromeDriver, i: Int) {

    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"
    birdsNowLogin(driver,usrBirdsTX,pwBirdsTX)
    birdsNowTX(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsNY(driver: ChromeDriver, i: Int) {

    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"
    birdsNowLogin(driver,usrBirdsNY,pwBirdsNY)
    birdsNowNY(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsIL(driver: ChromeDriver, i: Int) {

    val usrBirdsIL = "customersupportIL@thefinchfarm.com"
    val pwBirdsIL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsIL,pwBirdsIL)
    birdsNowIL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsPA(driver: ChromeDriver, i: Int) {

    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPA,pwBirdsPA)
    birdsNowPA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsOH(driver: ChromeDriver, i: Int) {

    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsOH,pwBirdsOH)
    birdsNowOH(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsIN(driver: ChromeDriver, i: Int) {

    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsIN,pwBirdsIN)
    birdsNowIN(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsMA(driver: ChromeDriver, i: Int) {

    val usrBirdsMA = "customersupportMA@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMA,pwBirdsMA)
    birdsNowMA(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsDL(driver: ChromeDriver, i: Int) {

    val usrBirdsDL = "supportdallas@thefinchfarm.com"
    val pwBirdsDL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDL,pwBirdsDL)
    birdsNowDL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsDC(driver: ChromeDriver, i: Int) {

    val usrBirdsDC = "supportwashingtondc@thefinchfarm.com"
    val pwBirdsDC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDC,pwBirdsDC)
    birdsNowDC(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsAT(driver: ChromeDriver, i: Int) {

    val usrBirdsAT = "supportatlanta@thefinchfarm.com"
    val pwBirdsAT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAT,pwBirdsAT)
    birdsNowAT(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsDT(driver: ChromeDriver, i: Int) {

    val usrBirdsDT = "supportdetroit@thefinchfarm.com"
    val pwBirdsDT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDT,pwBirdsDT)
    birdsNowDT(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsSTL(driver: ChromeDriver, i: Int) {

    val usrBirdsSTL = "supportstlouis@thefinchfarm.com"
    val pwBirdsSTL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSTL,pwBirdsSTL)
    birdsNowSTL(driver,i)
    birdsNowLogout(driver)
}

fun runBirdsTMP(driver: ChromeDriver, i: Int) {

    val usrBirdsTMP = "supporttampa@thefinchfarm.com"
    val pwBirdsTMP = "TFF2019!"
    birdsNowLogin(driver,usrBirdsTMP,pwBirdsTMP)
    birdsNowTMP(driver,i)
    birdsNowLogout(driver)
}

fun birdsNowLogin(driver: ChromeDriver, user: String, pass: String) {
    try {
        driver.get("https://www.birdsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$user")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pass")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun birdsNowLogout(driver: ChromeDriver) {
    driver.get("https://www.birdsnow.com/main-logout-now")
    Thread.sleep(3000)
}

fun runHooblyWA(driver: ChromeDriver, i: Int) {

    val usrHooblyWA = "customersupport@thefinchfarm.com"
    val pwHooblyWA = "Marketing2019!"
    hooblyLogin(driver,usrHooblyWA,pwHooblyWA)
    hooblyWA(driver,i)
}

fun runHooblyFL(driver: ChromeDriver, i: Int) {

    val usrHooblyFL = "customersupportFL@thefinchfarm.com"
    val pwHooblyFL = "TFFFL2019!"
    hooblyLogin(driver,usrHooblyFL,pwHooblyFL)
    hooblyFL(driver,i)
}

fun runHooblyAZ(driver: ChromeDriver, i: Int) {

    val usrHooblyAZ = "customersupportAZ@thefinchfarm.com"
    val pwHooblyAZ = "TFFAZ2019!"
    hooblyLogin(driver,usrHooblyAZ,pwHooblyAZ)
    hooblyAZ(driver,i)
}

fun runHooblyCA(driver: ChromeDriver, i: Int) {

    val usrHooblyCA = "customersupportCA@thefinchfarm.com"
    val pwHooblyCA = "TFFC3522!"
    hooblyLogin(driver,usrHooblyCA,pwHooblyCA)
    hooblyCA(driver,i)
}

fun hooblyLogin(driver: ChromeDriver,user: String,pass: String) {
    try {
        driver.get("https://www.hoobly.com/")
        driver.findElement(By.xpath("//a[@href='/c/login']")).click()
        driver.get("https://www.hoobly.com/c/login")
        Thread.sleep(1000)
        driver.findElement(By.id("email")).sendKeys("$user")
        driver.findElement(By.id("pass")).sendKeys("$pass")
        driver.findElement(By.xpath("//button[@type='submit']")).click()
        Thread.sleep(1000)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}


fun runCats(driver: ChromeDriver, i: Int) {

    val usrCats = "support@thefinchfarm.zendesk.com"
    val pwCats = "TFF2019!"
    catsLogin(driver,usrCats,pwCats)
    catsNow(driver,i)

}

fun catsLogin(driver: ChromeDriver, user: String, pass: String) {
    try {
        driver.get("https://www.catsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$user")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pass")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runReps(driver: ChromeDriver, i: Int) {

    val usrRep = "customersupport@thefinchfarm.com"
    val pwRep = "Reptiledirectory2018!"

    repsLogin(driver,usrRep,pwRep)
    repsNow(driver,i)
}

fun repsLogin(driver: ChromeDriver,user: String,pass: String) {
    try {
        driver.get("https://www.reptilesnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$user")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pass")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)
    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runDogs(driver: ChromeDriver,i: Int) {

    val usrDog = "customersupport@thefinchfarm.com"
    val pwDog = "Dogdelight2019!"
    dogLogin(driver,usrDog,pwDog)
    dogsNow(driver,i)
}

fun dogLogin(driver: ChromeDriver,user: String,pass: String) {
    try {
        driver.get("https://www.dogsnow.com/login.htm")
        driver.findElement(By.cssSelector("#username")).sendKeys("$user")
        driver.findElement(By.cssSelector("#pass")).sendKeys("$pass")
        driver.findElement(By.name("doLogin")).click()
        Thread.sleep(3000)

    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun dogLogout(driver: ChromeDriver) {
    try {
        driver.get("https://www.dogsnow.com/main-logout-now")
        Thread.sleep(3000)

    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}

fun runClassifieds(driver: ChromeDriver) {

    val usrAd = "customersupport@thefinchfarm.com"
    val pwAd = "Marketing2019!"
    adsLogin(driver,usrAd,pwAd)
    adNow(driver)
}

fun adsLogin(driver: ChromeDriver,user: String,pass: String) {
    try {
        driver.get("https://www.classifiedads.com/login.php")
        driver.findElement(By.name("login_email")).sendKeys("$user")
        driver.findElement(By.name("login_password")).sendKeys("$pass")
        driver.findElement(By.xpath("//input[@value='Log in']")).click()
        Thread.sleep(1000)

    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}


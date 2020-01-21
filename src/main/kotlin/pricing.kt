package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import java.util.HashMap

fun priceChange(driver: ChromeDriver,birdName: String, birdPrice: String) {

    if(top40template.containsValue(birdName)) {
        val index = top40map.get(birdName)
        println(index)
        executionSuite(driver,index,birdPrice)
    } else {
        println("this isn't in the template. check spelling!")
    }
}

fun birdPriceUpdate(driver: ChromeDriver,price: String) {
    Thread.sleep(3000)
    driver.findElement(By.cssSelector("#price")).clear()
    Thread.sleep(3000)
    driver.findElement(By.cssSelector("#comments")).sendKeys("")
    Thread.sleep(3000)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
}

fun priceChangeExecution(driver: ChromeDriver,birdIndex: Int?,price: String) {
    if(birdIndex!=null) {
        println("!=")
        Thread.sleep(3000)
        driver.get("https://www.birdsnow.com/place_ad-adid-$birdIndex")
        Thread.sleep(3000)
        birdPriceUpdate(driver,price)
        savePriceChange(driver)
        birdsNowLogout(driver)
    } else {
        println("==")
        Thread.sleep(10000)
        birdsNowLogout(driver)
    }

}

fun savePriceChange(driver: ChromeDriver) {
    Thread.sleep(3000)
    driver.findElement(By.name("doContinue")).click()
    Thread.sleep(3000)
}

fun executionSuite(driver: ChromeDriver,birdIndex:Int?,birdPrice: String) {
    birdsNowWAPricing(driver,birdIndex,birdPrice)
    birdsNowCAPricing(driver,birdIndex,birdPrice)
    birdsNowAZPricing(driver,birdIndex,birdPrice)
    birdsNowORLPricing(driver,birdIndex,birdPrice)
    birdsNowFLPricing(driver,birdIndex,birdPrice)
    birdsNowTXPricing(driver,birdIndex,birdPrice)
    birdsNowNYPricing(driver,birdIndex,birdPrice)
    birdsNowILPricing(driver,birdIndex,birdPrice)
    birdsNowPAPricing(driver,birdIndex,birdPrice)
    birdsNowOHPricing(driver,birdIndex,birdPrice)
    birdsNowINPricing(driver,birdIndex,birdPrice)
    birdsNowMAPricing(driver,birdIndex,birdPrice)
    birdsNowDLPricing(driver,birdIndex,birdPrice)
    birdsNowDCPricing(driver,birdIndex,birdPrice)
    birdsNowATPricing(driver,birdIndex,birdPrice)
    birdsNowDTPricing(driver,birdIndex,birdPrice)
    birdsNowPDXPricing(driver,birdIndex,birdPrice)
    birdsNowMINPricing(driver,birdIndex,birdPrice)
    birdsNowLAPricing(driver,birdIndex,birdPrice)
    birdsNowSANPricing(driver,birdIndex,birdPrice)
    birdsNowDENPricing(driver,birdIndex,birdPrice)
    birdsNowBALPricing(driver,birdIndex,birdPrice)
    birdsNowSTLPricing(driver,birdIndex,birdPrice)
    birdsNowTMPPricing(driver,birdIndex,birdPrice)
    birdsNowAUSPricing(driver,birdIndex,birdPrice)
    birdsNowLVGPricing(driver,birdIndex,birdPrice)
    birdsNowPITTPricing(driver,birdIndex,birdPrice)
    birdsNowSACPricing(driver,birdIndex,birdPrice)
    birdsNowCHARPricing(driver,birdIndex,birdPrice)
    birdsNowSANTPricing(driver,birdIndex,birdPrice)

    birdsNowSJPricing(driver,birdIndex,birdPrice)
    birdsNowNASHPricing(driver,birdIndex,birdPrice)
    birdsNowJACKPricing(driver,birdIndex,birdPrice)
    //birdsNowCLVPricing(driver,birdIndex,birdPrice)
    birdsNowCOLPricing(driver,birdIndex,birdPrice)
    birdsNowBUFPricing(driver,birdIndex,birdPrice)
    birdsNowBIRPricing(driver,birdIndex,birdPrice)
    birdsNowHARPricing(driver,birdIndex,birdPrice)
    birdsNowSLCPricing(driver,birdIndex,birdPrice)
    birdsNowNOPricing(driver,birdIndex,birdPrice)
    birdsNowLOUPricing(driver,birdIndex,birdPrice)
    birdsNowRICHPricing(driver,birdIndex,birdPrice)
    birdsNowMEMPricing(driver,birdIndex,birdPrice)
    birdsNowRALPricing(driver,birdIndex,birdPrice)
    birdsNowOKCPricing(driver,birdIndex,birdPrice)
    birdsNowMILPricing(driver,birdIndex,birdPrice)
    birdsNowPROPricing(driver,birdIndex,birdPrice)
    birdsNowVIRPricing(driver,birdIndex,birdPrice)
    birdsNowRVRPricing(driver,birdIndex,birdPrice)
    birdsNowKANPricing(driver,birdIndex,birdPrice)
}

fun birdsNowKANPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsKAN = "supportkansas@thefinchfarm.com"
    val pwBirdsKAN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsKAN,pwBirdsKAN)
    val birdsNowKANPricing: HashMap<Int, Int> = hashMapOf(594 to 560094, 298 to 560911, 609 to 560912,
        435 to 560913, 1171 to 560914, 252 to 560915, 1169 to 560916,
        778 to 560917, 604 to 560918, 439 to 560919, 458 to 560920,
        87 to 560921, 144 to 560922, 1157 to 560923,
        777 to 560924, 89 to 560925, 776 to 560926,
        804 to 560927, 96 to 560889, 557 to 560929, 120 to 560930,
        274 to 560931, 546 to 560932, 456 to 560933,
        820 to 560934, 86 to 560935, 81 to 560936,
        131 to 560898, 142 to 560899, 1271 to 560900,
        441 to 560901, 1168 to 560902,
        541 to 560903, 1156 to 560943, 1250 to 560905, 139 to 560906,
        525 to 560907, 250 to 560928, 257 to 560909, 115 to 560910)
    val index = birdsNowKANPricing.get(birdIndex)

    println("Price Change for BNKAN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowRVRPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsRVR = "supportriverside@thefinchfarm.com"
    val pwBirdsRVR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsRVR,pwBirdsRVR)
    val birdsNowRVRPricing: HashMap<Int, Int> = hashMapOf(594 to 559072, 298 to 560323, 609 to 560324,
        435 to 560325, 1171 to 560326, 252 to 560327, 1169 to 560328,
        778 to 560329, 604 to 560330, 439 to 560331, 458 to 560332,
        87 to 560333, 144 to 560334, 1157 to 560335,
        777 to 560336, 89 to 560337, 776 to 560338,
        804 to 560339, 96 to 560340, 557 to 560341, 120 to 560342,
        274 to 560343, 546 to 560344, 456 to 560345,
        820 to 560346, 86 to 560347, 81 to 560348,
        131 to 560349, 142 to 560350, 1271 to 560351,
        441 to 560352, 1168 to 560353,
        541 to 560354, 1156 to 560355, 1250 to 560356, 139 to 560357,
        525 to 560358, 250 to 560359, 257 to 560360, 115 to 560362)
    val index = birdsNowRVRPricing.get(birdIndex)

    println("Price Change for BNRVR " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowVIRPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsVIR = "supportvirginia@thefinchfarm.com"
    val pwBirdsVIR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsVIR,pwBirdsVIR)
    val birdsNowVIRPricing: HashMap<Int, Int> = hashMapOf(594 to 560101, 298 to 561746, 609 to 561747,
        778 to 561794, 604 to 561753, 439 to 561754, 458 to 561797,
        435 to 561748, 1171 to 561749, 252 to 561750, 1169 to 561751,
        87 to 561756, 144 to 561757, 1157 to 561758,
        777 to 561760, 89 to 561761, 776 to 561762,
        804 to 561763, 96 to 561764, 557 to 561765, 120 to 561766,
        274 to 561767, 546 to 561768, 456 to 561769,
        820 to 561770, 86 to 561771, 81 to 561772,
        131 to 561773, 142 to 561774, 1271 to 561775,
        441 to 561776, 1168 to 561777,
        541 to 561778, 1156 to 561779, 1250 to 561780, 139 to 561781,
        525 to 561782, 250 to 561783, 257 to 561826, 115 to 561785)
    val index = birdsNowVIRPricing.get(birdIndex)

    println("Price Change for BNPRO " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowPROPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsPRO = "supportprovidence@thefinchfarm.com"
    val pwBirdsPRO = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPRO,pwBirdsPRO)
    val birdsNowPROPricing: HashMap<Int, Int> = hashMapOf(594 to 560102, 298 to 561880, 609 to 561881,
        435 to 561883, 1171 to 561884, 252 to 561885, 1169 to 561886,
        778 to 561887, 604 to 561888, 439 to 561889, 458 to 561890,
        87 to 561891, 144 to 561892, 1157 to 561893,
        777 to 561894, 89 to 561895, 776 to 561897,
        804 to 561898, 96 to 561899, 557 to 561900, 120 to 561901,
        274 to 561902, 546 to 561903, 456 to 561904,
        820 to 561951, 86 to 561952, 81 to 561907,
        131 to 561908, 142 to 561955, 1271 to 561910,
        441 to 561911, 1168 to 561912,
        541 to 561913, 1156 to 561914, 1250 to 562087, 139 to 561916,
        525 to 561917, 250 to 561918, 257 to 561919, 115 to 562092)
    val index = birdsNowPROPricing.get(birdIndex)

    println("Price Change for BNPRO " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowMILPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsMIL = "supportmilwaukee@thefinchfarm.com"
    val pwBirdsMIL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMIL,pwBirdsMIL)
    val birdsNowMILPricing: HashMap<Int, Int> = hashMapOf(594 to 560103, 298 to 561968, 609 to 561969,
        435 to 561970, 1171 to 561971, 252 to 561972, 1169 to 561973,
        778 to 561974, 604 to 561976, 439 to 561977, 458 to 561978,
        87 to 561979, 144 to 561980, 1157 to 561981,
        777 to 561983, 89 to 561984, 776 to 561985,
        804 to 561986, 96 to 562029, 557 to 561988, 120 to 561989,
        274 to 561990, 546 to 561992, 456 to 561993,
        820 to 561994, 86 to 561995, 81 to 561996,
        131 to 561997, 142 to 561998, 1271 to 561999,
        441 to 562000, 1168 to 562002,
        541 to 562003, 1156 to 562004, 1250 to 562005, 139 to 562006,
        525 to 562007, 250 to 562009, 257 to 562010, 115 to 562050)
    val index = birdsNowMILPricing.get(birdIndex)

    println("Price Change for BNMIL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowOKCPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsOKC = "supportoklahomacity@thefinchfarm.com"
    val pwBirdsOKC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsOKC,pwBirdsOKC)
    val birdsNowOKCPricing: HashMap<Int, Int> = hashMapOf(594 to 560141, 298 to 562199, 609 to 562200,
        435 to 562201, 1171 to 562202, 252 to 562203, 1169 to 562204,
        778 to 562205, 604 to 562206, 439 to 562207, 458 to 562208,
        87 to 562209, 144 to 562210, 1157 to 562211,
        777 to 562253, 89 to 562213, 776 to 562214,
        804 to 562215, 96 to 562257, 557 to 562217, 120 to 562218,
        274 to 562219, 546 to 562220, 456 to 562221,
        820 to 562263, 86 to 562223, 81 to 562224,
        131 to 562225, 142 to 562226, 1271 to 562227,
        441 to 562228, 1168 to 562229,
        541 to 562230, 1156 to 562231, 1250 to 562233, 139 to 562234,
        525 to 562236, 250 to 562237, 257 to 562238, 115 to 562239)
    val index = birdsNowOKCPricing.get(birdIndex)

    println("Price Change for BNOKC " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowRALPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsRAL = "supportraleigh@thefinchfarm.com"
    val pwBirdsRAL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsRAL,pwBirdsRAL)
    val birdsNowRALPricing: HashMap<Int, Int> = hashMapOf(594 to 561930, 298 to 562516, 609 to 562517,
        435 to 562518, 1171 to 562519, 252 to 562521, 1169 to 562522,
        778 to 562523, 604 to 562525, 439 to 562526, 458 to 562527,
        87 to 562528, 144 to 562529, 1157 to 562530,
        777 to 562700, 89 to 562532, 776 to 562533,
        804 to 562534, 96 to 562536, 557 to 562537, 120 to 562538,
        274 to 562539, 546 to 562540, 456 to 562542,
        820 to 562543, 86 to 562544, 81 to 562545,
        131 to 562546, 142 to 562547, 1271 to 562548,
        441 to 562549, 1168 to 562550,
        541 to 562551, 1156 to 562552, 1250 to 562554, 139 to 562555,
        525 to 562556, 250 to 562557, 257 to 562558, 115 to 562559)
    val index = birdsNowRALPricing.get(birdIndex)

    println("Price Change for BNRAL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowMEMPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsMEM = "supportmemphis@thefinchfarm.com"
    val pwBirdsMEM = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMEM,pwBirdsMEM)
    val birdsNowMEMPricing: HashMap<Int, Int> = hashMapOf(594 to 561939, 298 to 563009, 609 to 563010,
        435 to 563011, 1171 to 563012, 252 to 563013, 1169 to 562974,
        778 to 563015, 604 to 563373, 439 to 563017, 458 to 563018,
        87 to 563019, 144 to 563020, 1157 to 563021,
        777 to 563022, 89 to 563023, 776 to 562984,
        804 to 563383, 96 to 563026, 557 to 563027, 120 to 563028,
        274 to 563029, 546 to 563030, 456 to 563031,
        820 to 562993, 86 to 563033, 81 to 563034,
        131 to 563035, 142 to 563036, 1271 to 563037,
        441 to 563038, 1168 to 563039,
        541 to 563001, 1156 to 563041, 1250 to 563003, 139 to 563004,
        525 to 563044, 250 to 563006, 257 to 563046, 115 to 563008)
    val index = birdsNowMEMPricing.get(birdIndex)

    println("Price Change for BNMEM " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowRICHPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsRICH = "supportrichmond@thefinchfarm.com"
    val pwBirdsRICH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsRICH,pwBirdsRICH)
    val birdsNowRICHPricing: HashMap<Int, Int> = hashMapOf(594 to 561948, 298 to 563193, 609 to 563194,
        435 to 563195, 1171 to 563196, 252 to 563197, 1169 to 563198,
        778 to 563199, 604 to 563200, 439 to 563201, 458 to 563202,
        87 to 563203, 144 to 563204, 1157 to 563205,
        777 to 563206, 89 to 563207, 776 to 563208,
        804 to 563064, 96 to 563210, 557 to 563211, 120 to 563212,
        274 to 563213, 546 to 563111, 456 to 563215,
        820 to 563216, 86 to 563217, 81 to 563218,
        131 to 563075, 142 to 563076, 1271 to 563077,
        441 to 563222, 1168 to 563223,
        541 to 563224, 1156 to 563225, 1250 to 563082, 139 to 563124,
        525 to 563084, 250 to 563229, 257 to 563230, 115 to 563231)
    val index = birdsNowRICHPricing.get(birdIndex)

    println("Price Change for BNRICH " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowLOUPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsLOU = "supportlouisville@thefinchfarm.com"
    val pwBirdsLOU = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLOU,pwBirdsLOU)
    val birdsNowLOUPricing: HashMap<Int, Int> = hashMapOf(594 to 561967, 298 to 563280, 609 to 563242,
        435 to 563282, 1171 to 563244, 252 to 563284, 1169 to 563246,
        778 to 563247, 604 to 563248, 439 to 563249, 458 to 563250,
        87 to 563251, 144 to 563252, 1157 to 563253,
        777 to 563254, 89 to 563255, 776 to 563338,
        804 to 563257, 96 to 563258, 557 to 563259, 120 to 563260,
        274 to 563261, 546 to 563262, 456 to 563263,
        820 to 563264, 86 to 563265, 81 to 563266,
        131 to 563308, 142 to 563268, 1271 to 563269,
        441 to 563270, 1168 to 563271,
        541 to 563272, 1156 to 563273, 1250 to 563359, 139 to 563275,
        525 to 563276, 250 to 563362, 257 to 563278, 115 to 563279)
    val index = birdsNowLOUPricing.get(birdIndex)

    println("Price Change for BNLOU " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowNOPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsNO = "supportneworleans@thefinchfarm.com"
    val pwBirdsNO = "TFF2019!"
    birdsNowLogin(driver,usrBirdsNO,pwBirdsNO)
    val birdsNowNOPricing: HashMap<Int, Int> = hashMapOf(594 to 561975, 298 to 563477, 609 to 563409,
        435 to 563437, 1171 to 563411, 252 to 563481, 1169 to 563440,
        778 to 563414, 604 to 563415, 439 to 563443, 458 to 563444,
        87 to 563418, 144 to 563419, 1157 to 563420,
        777 to 563448, 89 to 563449, 776 to 563492,
        804 to 563424, 96 to 563425, 557 to 563426, 120 to 563427,
        274 to 563428, 546 to 563429, 456 to 563430,
        820 to 563459, 86 to 563501, 81 to 563433,
        131 to 563434, 142 to 563504, 1271 to 563465,
        441 to 563506, 1168 to 563467,
        541 to 563468, 1156 to 563469, 1250 to 563510, 139 to 563511,
        525 to 563472, 250 to 563473, 257 to 563514, 115 to 563475)
    val index = birdsNowNOPricing.get(birdIndex)

    println("Price Change for BNNO " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowBUFPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsBUF = "supportbuffalo@thefinchfarm.com"
    val pwBirdsBUF = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBUF,pwBirdsBUF)
    val birdsNowBUFPricing: HashMap<Int, Int> = hashMapOf(594 to 562008, 298 to 563916, 609 to 563917,
        435 to 563918, 1171 to 563919, 252 to 563920, 1169 to 563961,
        778 to 563922, 604 to 564089, 439 to 563924, 458 to 563925,
        87 to 564004, 144 to 563927, 1157 to 563928,
        777 to 563929, 89 to 563930, 776 to 563931,
        804 to 564014, 96 to 563933, 557 to 564016, 120 to 563936,
        274 to 564102, 546 to 563938, 456 to 563978,
        820 to 563940, 86 to 564022, 81 to 563942,
        131 to 563943, 142 to 563944, 1271 to 563945,
        441 to 563946, 1168 to 563947,
        541 to 563948, 1156 to 563949, 1250 to 563950, 139 to 563951,
        525 to 563922, 250 to 563953, 257 to 563954, 115 to 564036)
    val index = birdsNowBUFPricing.get(birdIndex)

    println("Price Change for BNBUF " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowSLCPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSLC = "supportsaltlake@thefinchfarm.com"
    val pwBirdsSLC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSLC,pwBirdsSLC)
    val birdsNowSLCPricing: HashMap<Int, Int> = hashMapOf(594 to 561982, 298 to 563560, 609 to 563561,
        435 to 563601, 1171 to 563563, 252 to 563643, 1169 to 563604,
        778 to 563566, 604 to 563567, 439 to 563568, 458 to 563569,
        87 to 563570, 144 to 563571, 1157 to 563572,
        777 to 563573, 89 to 563613, 776 to 563575,
        804 to 563576, 96 to 563577, 557 to 563578, 120 to 563618,
        274 to 563619, 546 to 563581, 456 to 563582,
        820 to 563583, 86 to 563584, 81 to 563624,
        131 to 563586, 142 to 563587, 1271 to 563588,
        441 to 563589, 1168 to 563590,
        541 to 563591, 1156 to 563592, 1250 to 563632, 139 to 563594,
        525 to 563595, 250 to 563596, 257 to 563597, 115 to 563598)
    val index = birdsNowSLCPricing.get(birdIndex)

    println("Price Change for BNSLC " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowCOLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsCOL = "supportcolumbus@thefinchfarm.com"
    val pwBirdsCOL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCOL,pwBirdsCOL)
    val birdsNowCOLPricing: HashMap<Int, Int> = hashMapOf(594 to 560098, 298 to 560962, 609 to 561021,
        435 to 561022, 1171 to 560965, 252 to 560966, 1169 to 560967,
        778 to 560968, 604 to 560970, 439 to 560971, 458 to 560972,
        87 to 560973, 144 to 560975, 1157 to 560976,
        777 to 560977, 89 to 560978, 776 to 560979,
        804 to 560980, 96 to 560981, 557 to 560982, 120 to 560984,
        274 to 560985, 546 to 560986, 456 to 560987,
        820 to 560988, 86 to 560989, 81 to 560990,
        131 to 560991, 142 to 560992, 1271 to 560993,
        441 to 560994, 1168 to 560995,
        541 to 561083, 1156 to 560997, 1250 to 560998, 139 to 560999,
        525 to 561000, 250 to 561001, 257 to 561093, 115 to 561003)
    val index = birdsNowCOLPricing.get(birdIndex)

    println("Price Change for BNCOL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowCLVPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsCLV = "supportcleveland@thefinchfarm.com"
    val pwBirdsCLV = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCLV,pwBirdsCLV)
    val birdsNowCLVPricing: HashMap<Int, Int> = hashMapOf(594 to 560119, 298 to 561278, 609 to 561281,
        435 to 561282, 1171 to 561283, 252 to 561284, 1169 to 561285,
        778 to 561286, 604 to 561288, 439 to 561289, 458 to 561290,
        87 to 561291, 144 to 561292, 1157 to 561293,
        777 to 561294, 89 to 561295, 776 to 561296, 96 to 564309,
        804 to 561297, 557 to 561299, 120 to 561300,
        274 to 561302, 546 to 561303, 456 to 561304,
        820 to 561306, 86 to 561307, 81 to 561308,
        131 to 561627, 142 to 561310, 1271 to 561311,
        441 to 561625, 1168 to 561313,
        541 to 561314, 1156 to 561315, 1250 to 561316, 139 to 561317,
        525 to 561318, 250 to 561319, 257 to 561320, 115 to 561321)
    val index = birdsNowCLVPricing.get(birdIndex)

    println("Price Change for BNCLV " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowJACKPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsJACK = "supportjacksonville@thefinchfarm.com"
    val pwBirdsJACK = "TFF2019!"
    birdsNowLogin(driver,usrBirdsJACK,pwBirdsJACK)
    val birdsNowJACKPricing: HashMap<Int, Int> = hashMapOf(594 to 560104, 298 to 562108, 609 to 562156,
        435 to 562110, 1171 to 562112, 252 to 562159, 1169 to 562114,
        778 to 562115, 604 to 562116, 439 to 562117, 458 to 562118,
        87 to 562119, 144 to 562120, 1157 to 562121,
        777 to 562122, 89 to 562123, 776 to 562124,
        804 to 562125, 96 to 562126, 557 to 562127, 120 to 562128,
        274 to 562129, 546 to 562130, 456 to 562131,
        820 to 562132, 86 to 562133, 81 to 562134,
        131 to 562135, 142 to 562136, 1271 to 562137,
        441 to 562138, 1168 to 562140,
        541 to 562142, 1156 to 562143, 1250 to 562144, 139 to 562145,
        525 to 562146, 250 to 562147, 257 to 562149, 115 to 562150)
    val index = birdsNowJACKPricing.get(birdIndex)

    println("Price Change for BNJACK " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowWAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsWA = "customersupport@thefinchfarm.com"
    val pwBirdsWA = "TFF2020!"
    birdsNowLogin(driver,usrBirdsWA,pwBirdsWA)
    val birdsNowWAPricing: HashMap<Int, Int> = hashMapOf(594 to 528585, 298 to 546952, 220 to 547616, 1257 to 530943, 1171 to 545479, 132 to 547687, 216 to 520364, 778 to 537420,
        460 to 545597, 597 to 547217, 572 to 528595, 439 to 534872, 457 to 537303, 469 to 531348, 553 to 528305, 478 to 545694, 483 to 547816, 269 to 545480, 458 to 537300,
        571 to 547210, 557 to 545741, 459 to 546949, 525 to 547810, 83 to 528597, 540 to 543572, 541 to 545791, 419 to 537315, 84 to 520353, 638 to 547615, 797 to 545842, 104 to 547812,
        791 to 547028, 479 to 547815, 133 to 547366, 260 to 544252, 87 to 545475, 527 to 545691, 1157 to 535294, 777 to 545547, 751 to 527836, 256 to 534869, 742 to 545683, 804 to 543931,
        252 to 520733, 144 to 534162, 96 to 544385, 435 to 537313, 477 to 544254, 528 to 526530, 1161 to 547410, 143 to 547160, 115 to 545328, 109 to 545788, 120 to 547814, 606 to 545685,
        608 to 547409, 273 to 520726, 116 to 545908, 546 to 531349, 456 to 537314, 86 to 547111, 131 to 528593, 820 to 545907, 142 to 526507, 810 to 530942, 284 to 531392, 441 to 545739,
        823 to 534155, 771 to 545339, 210 to 520759, 541 to 547510, 821 to 545945, 637 to 520950, 800 to 531395, 141 to 520833, 442 to 545946, 1250 to 528311, 1258 to 520885, 786 to 534157,
        569 to 530947, 250 to 545738, 257 to 545688, 110 to 545947, 803 to 534871, 114 to 547215, 1271 to 520950)
    val index = birdsNowWAPricing.get(birdIndex)

    println("Price Change for BNWA " + top40template.get(birdIndex) + " at index " + index)
    if(birdsNowWAPricing.containsKey(birdIndex)){
        priceChangeExecution(driver,index,price)
    } else {
        birdsNowLogout(driver)
    }
}

fun birdsNowCAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsCA = "CustomersupportCA@thefinchfarm.com"
    val pwBirdsCA = "2019!Birds"
    birdsNowLogin(driver,usrBirdsCA,pwBirdsCA)
    val birdsNowCAPricing: HashMap<Int, Int> = hashMapOf(594 to 549550, 298 to 556355, 609 to 554844, 435 to 550215, 778 to 549549,
        458 to 550026, 87 to 554849, 777 to 549657, 89 to 554848,
        776 to 554836, 144 to 550587, 557 to 554841, 120 to 550585, 274 to 550213, 546 to 554838, 820 to 554839, 86 to 554846,
        81 to 554840, 131 to 554837, 142 to 550583, 441 to 554850, 541 to 550132, 1250 to 554834, 139 to 549689, 525 to 554842,
        250 to 554847, 257 to 554835, 115 to 554845,
        1171 to 558749, 252 to 558750, 1169 to 558752, 604 to 558753, 439 to 558754, 1157 to 558757, 804 to 558758, 96 to 558759,
        456 to 558760, 1271 to 558761, 1168 to 558762, 1156 to 558763)
    val index = birdsNowCAPricing.get(birdIndex)

    println("Price Change for BNCA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowAZPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsAZ = "customersupportAZ@thefinchfarm.com"
    val pwBirdsAZ = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAZ,pwBirdsAZ)
    val birdsNowAZPricing: HashMap<Int, Int> = hashMapOf(1156 to 558832, 1168 to 558831, 1271 to 558830, 456 to 558829, 96 to 558828, 804 to 558827, 776 to 558826, 1157 to 558825, 439 to 558824, 1169 to 558822, 252 to 558821, 1171 to 558820, 298 to 558819, 594 to 550513, 609 to 554876, 435 to 554873, 778 to 550458, 604 to 550511, 458 to 554541, 87 to 554885,
        777 to 550512, 89 to 554884, 114 to 550515, 557 to 554871, 120 to 550516, 274 to 550517, 546 to 554868, 820 to 554869, 86 to 554881, 81 to 554870, 131 to 554865,
        142 to 550514, 441 to 554886, 541 to 550518, 1250 to 554880, 139 to 554877, 525 to 554872, 250 to 554882, 257 to 554867, 115 to 554878)
    val index = birdsNowAZPricing.get(birdIndex)

    println("Price Change for BNAZ " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowNASHPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsNASH = "supportnashville@thefinchfarm.com"
    val pwBirdsNASH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsNASH,pwBirdsNASH)
    val birdsNowNASHPricing: HashMap<Int, Int> = hashMapOf(594 to 560099, 298 to 561657, 609 to 561716,
        435 to 561647, 1171 to 561648, 252 to 561649, 1169 to 561650,
        778 to 561651, 604 to 561652, 439 to 561653, 458 to 561654,
        87 to 561667, 144 to 561668, 1157 to 561669,
        777 to 561670, 89 to 561672, 776 to 561673,
        804 to 561674, 96 to 561675, 557 to 561676, 120 to 561677,
        274 to 561678, 546 to 561679, 456 to 561681,
        820 to 561682, 86 to 561683, 81 to 561684,
        131 to 561685, 142 to 561686, 1271 to 561687,
        441 to 561688, 1168 to 561689,
        541 to 561690, 1156 to 561691, 1250 to 561692, 139 to 561693,
        525 to 561694, 250 to 561695, 257 to 561696, 115 to 561697)
    val index = birdsNowNASHPricing.get(birdIndex)

    println("Price Change for BNNASH " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowBIRPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsBIR = "supportbirmingham@thefinchfarm.com"
    val pwBirdsBIR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBIR,pwBirdsBIR)
    val birdsNowBIRPricing: HashMap<Int, Int> = hashMapOf(594 to 562001, 298 to 563798, 609 to 563799,
        435 to 563800, 1171 to 563801, 252 to 563802, 1169 to 563803,
        778 to 563804, 604 to 563805, 439 to 563806, 458 to 563807,
        87 to 563808, 144 to 563809, 1157 to 563849,
        777 to 563811, 89 to 563812, 776 to 563813,
        804 to 563814, 96 to 563815, 557 to 563816, 120 to 563817,
        274 to 563818, 546 to 563819, 456 to 563820,
        820 to 563821, 86 to 563861, 81 to 563823,
        131 to 563824, 142 to 563825, 1271 to 563826,
        441 to 563827, 1168 to 563828,
        541 to 563829, 1156 to 563830, 1250 to 563831, 139 to 563832,
        525 to 563833, 250 to 563834, 257 to 563875, 115 to 563836)
    val index = birdsNowBIRPricing.get(birdIndex)

    println("Price Change for BNBIR " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowHARPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsHAR = "supporthartford@thefinchfarm.com"
    val pwBirdsHAR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsHAR,pwBirdsHAR)
    val birdsNowHARPricing: HashMap<Int, Int> = hashMapOf(594 to 561991, 298 to 563756, 609 to 563757,
        435 to 563758, 1171 to 563759, 252 to 563760, 1169 to 563761,
        778 to 563684, 604 to 563763, 439 to 563764, 458 to 563687,
        87 to 563688, 144 to 563767, 1157 to 563768,
        777 to 563769, 89 to 563770, 776 to 563771,
        804 to 563772, 96 to 563773, 557 to 563774, 120 to 563775,
        274 to 563737, 546 to 563699, 456 to 563778,
        820 to 563779, 86 to 563702, 81 to 563781,
        131 to 563782, 142 to 563783, 1271 to 563784,
        441 to 563786, 1168 to 563787,
        541 to 563709, 1156 to 563789, 1250 to 563790, 139 to 563791,
        525 to 563792, 250 to 563793, 257 to 563794, 115 to 563795)
    val index = birdsNowHARPricing.get(birdIndex)

    println("Price Change for BNHAR " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowSJPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSJ = "supportsanjose@thefinchfarm.com"
    val pwBirdsSJ = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSJ,pwBirdsSJ)
    val birdsNowSJPricing: HashMap<Int, Int> = hashMapOf(594 to 560120, 298 to 561602, 609 to 561603,
        435 to 561604, 1171 to 561605, 252 to 561606, 1169 to 561607,
        778 to 561608, 604 to 561610, 439 to 561611, 458 to 561612,
        87 to 561613, 144 to 561614, 1157 to 561615,
        777 to 561616, 89 to 561617, 776 to 561618,
        804 to 561619, 96 to 561620, 557 to 561621, 120 to 561622,
        274 to 561623, 546 to 561624, 456 to 561626,
        820 to 561628, 86 to 561743, 81 to 561630,
        131 to 561631, 142 to 561632, 1271 to 561633,
        441 to 561634, 1168 to 561745,
        541 to 561636, 1156 to 561744, 1250 to 561638, 139 to 561639,
        525 to 561640, 250 to 561641, 257 to 561642, 115 to 561643)
    val index = birdsNowSJPricing.get(birdIndex)

    println("Price Change for BNSJ " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowORLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsORL = "supportorlando@thefinchfarm.com"
    val pwBirdsORL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsORL,pwBirdsORL)
    val birdsNowORLPricing: HashMap<Int, Int> = hashMapOf(594 to 559764, 298 to 560532, 609 to 560533,
        435 to 560534, 1171 to 560535, 252 to 560536, 1169 to 560537,
        778 to 560538, 604 to 560539, 439 to 560540, 458 to 560541,
        87 to 560542, 144 to 560543, 1157 to 560544,
        777 to 560545, 89 to 560546, 776 to 560547,
        804 to 560548, 96 to 560549, 557 to 560550, 120 to 560551,
        274 to 560552, 546 to 560553, 456 to 560554,
        820 to 560555, 86 to 560556, 81 to 560557,
        131 to 560577, 142 to 560559, 1271 to 560560,
        441 to 560561, 1168 to 560562,
        541 to 560563, 1156 to 560564, 1250 to 560565, 139 to 560566,
        525 to 560567, 250 to 560568, 257 to 560569, 115 to 560570)
    val index = birdsNowORLPricing.get(birdIndex)

    println("Price Change for BNORL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowFLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsFL = "customersupportFL@thefinchfarm.com"
    val pwBirdsFL = "TFF2019!!"
    birdsNowLogin(driver,usrBirdsFL,pwBirdsFL)

    val birdsNowFLPricing: HashMap<Int, Int> = hashMapOf(594 to 550502, 609 to 554663, 477 to 554661, 778 to 550500, 604 to 550466, 528 to 554575, 87 to 554670, 1157 to 554662,
        776 to 550501, 606 to 550509, 89 to 554669, 144 to 550504, 557 to 554658, 120 to 550505, 274 to 550506, 546 to 554651, 820 to 554654, 86 to 554667, 81 to 554657, 131 to 554577,
        142 to 550503, 441 to 554671, 541 to 550508, 1250 to 554666, 139 to 554664, 525 to 554660, 250 to 554668, 257 to 554647, 115 to 554665,
        298 to 558840, 1169 to 558841, 439 to 558842, 458 to 558853, 776 to 558844,
        804 to 558845, 96 to 558846, 456 to 558847, 1271 to 558849,
        1168 to 558851, 1156 to 558852)
    val index = birdsNowFLPricing.get(birdIndex)

    println("Price Change for BNFL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowTXPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsTX = "customersupportTX@thefinchfarm.com"
    val pwBirdsTX = "TFF2019!"
    birdsNowLogin(driver,usrBirdsTX,pwBirdsTX)
    val birdsNowTXPricing: HashMap<Int, Int> = hashMapOf(594 to 555365, 609 to 555350, 435 to 555346, 778 to 555310, 604 to 555307, 528 to 555314, 458 to 555337,
        87 to 555358, 1157 to 555348, 777 to 555311, 606 to 555327, 89 to 555357, 557 to 555343, 1161 to 555362,120 to 555312,
        274 to 555313, 546 to 555309, 820 to 555339, 86 to 555354, 81 to 555342,
        131 to 555336, 142 to 555306, 441 to 555360, 541 to 555316, 1156 to 555366, 1250 to 555266, 139 to 555351,
        525 to 555344, 250 to 555356, 257 to 555338, 115 to 555353, 1169 to 558962, 439 to 558964, 144 to 558966,
        776 to 558968,
        804 to 558969, 96 to 558970, 456 to 558973, 1271 to 558978, 1168 to 558979)
    val index = birdsNowTXPricing.get(birdIndex)

    println("Price Change for BNTX " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowNYPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsNY = "customersupportNY@thefinchfarm.com"
    val pwBirdsNY = "SELL2020!"
    birdsNowLogin(driver,usrBirdsNY,pwBirdsNY)
    val birdsNowNYPricing: HashMap<Int, Int> = hashMapOf(594 to 551369, 609 to 555636, 435 to 555633, 778 to 550797,
        604 to 550527, 528 to 555622, 458 to 555626, 419 to 555635, 87 to 555127, 777 to 555619,
        606 to 555627, 89 to 555643, 144 to 550605, 557 to 555631,
        120 to 555620,
        274 to 555621, 546 to 555617, 820 to 555629, 86 to 555640, 81 to 555630,
        131 to 555624, 142 to 555615, 441 to 555644, 541 to 550796,
        1250 to 555616, 139 to 555638,
        525 to 555632, 250 to 555641, 257 to 555628, 115 to 555639, 439 to 558989, 1157 to 559001,
        776 to 558991,
        804 to 558992, 96 to 558993, 456 to 558994, 1271 to 558995,
        1169 to 559002, 1168 to 558996, 1156 to 558997)
    val index = birdsNowNYPricing.get(birdIndex)

    println("Price Change for BNNY " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowILPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsIL = "customersupportIL@thefinchfarm.com"
    val pwBirdsIL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsIL,pwBirdsIL)
    val birdsNowILPricing: HashMap<Int, Int> = hashMapOf(594 to 555468, 609 to 555763, 435 to 555761, 778 to 555466,
        604 to 555479, 528 to 555476, 458 to 555647, 87 to 555769, 1157 to 555762, 777 to 555467,
        89 to 555768, 144 to 555469, 557 to 555759,
        120 to 555474,
        274 to 555475, 546 to 555461, 820 to 555650, 86 to 555766, 81 to 555758,
        131 to 555646, 142 to 555453, 441 to 555770, 541 to 555477, 1156 to 555771,
        1250 to 555393, 139 to 555764,
        525 to 555760, 250 to 555767, 257 to 555649, 115 to 555765,
        298 to 559016, 252 to 559003, 1169 to 559004, 439 to 559006, 776 to 559007,
        804 to 559008, 96 to 559009,
        456 to 559010, 1271 to 559011, 1168 to 559013)
    val index = birdsNowILPricing.get(birdIndex)

    println("Price Change for BNIL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowPAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsPA = "customersupportPA@thefinchfarm.com"
    val pwBirdsPA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPA,pwBirdsPA)
    val birdsNowPAPricing: HashMap<Int, Int> = hashMapOf(594 to 555861, 609 to 555890, 435 to 555888, 778 to 555859,
        604 to 555867, 528 to 555865, 458 to 555880, 87 to 555898, 144 to 555903, 777 to 555860,
        606 to 555877, 89 to 555897, 557 to 555886, 1161 to 555901,
        120 to 555862,
        274 to 555864, 546 to 555858, 820 to 555882, 86 to 555894, 81 to 555883,
        131 to 555879, 142 to 555857, 441 to 555900, 541 to 555866, 1156 to 555902,
        1250 to 555781, 139 to 555891,
        525 to 555887, 1169 to 555889, 250 to 555895, 257 to 555881, 115 to 555893,
        298 to 559073, 1157 to 559074, 776 to 559076,
        804 to 559088, 96 to 559089, 456 to 559090, 1271 to 559092,
        1168 to 559093)
    val index = birdsNowPAPricing.get(birdIndex)

    println("Price Change for BNPA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowOHPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsOH = "customersupportOH@thefinchfarm.com"
    val pwBirdsOH = "TFF2019!"
    birdsNowLogin(driver,usrBirdsOH,pwBirdsOH)
    val birdsNowOHPricing: HashMap<Int, Int> = hashMapOf(594 to 558297, 298 to 558502, 609 to 558299,
        435 to 558300, 1171 to 558499, 252 to 558504, 1169 to 558497,
        778 to 558301, 604 to 558303, 439 to 558495, 458 to 558306,
        87 to 558307, 144 to 558311, 1157 to 558308,
        777 to 558309, 89 to 558310, 776 to 558501,
        804 to 558505, 96 to 558493, 557 to 558312, 120 to 558313,
        274 to 558314, 546 to 558315, 456 to 558503,
        820 to 558316, 86 to 558317, 81 to 558318,
        131 to 558319, 142 to 558321, 1271 to 558492,
        441 to 558324, 1168 to 558508,
        541 to 558325, 1156 to 558326, 1250 to 556209, 139 to 558328,
        525 to 558329, 250 to 558330, 257 to 558331, 115 to 558332)
    val index = birdsNowOHPricing.get(birdIndex)

    println("Price Change for BNOH " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver,index,price)
}

fun birdsNowINPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsIN = "customersupportIN@thefinchfarm.com"
    val pwBirdsIN = "TFF2019!"
    birdsNowLogin(driver, usrBirdsIN, pwBirdsIN)
    val birdsNowINPricing: HashMap<Int, Int> = hashMapOf(
        594 to 558546, 298 to 558547, 609 to 558548,
        435 to 558549, 1171 to 558550, 252 to 558551, 1169 to 558552,
        778 to 558553, 604 to 558554, 439 to 558555, 458 to 558556,
        87 to 558557, 144 to 558558, 1157 to 558559,
        777 to 558560, 89 to 558561, 776 to 558562,
        804 to 558563, 96 to 558565, 557 to 558566, 120 to 558567,
        274 to 558568, 546 to 558569, 456 to 558570,
        820 to 558571, 86 to 558573, 81 to 558575,
        131 to 558576, 142 to 558577, 1271 to 558578,
        441 to 558579, 1168 to 558580,
        541 to 558582, 1156 to 558583, 1250 to 556208, 139 to 558584,
        525 to 558585, 250 to 558586, 257 to 558588, 115 to 558589
    )
    val index = birdsNowINPricing.get(birdIndex)

    println("Price Change for BNIN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowMAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsMA = "customersupportMA@thefinchfarm.com"
    val pwBirdsMA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMA,pwBirdsMA)
    val birdsNowMAPricing: HashMap<Int, Int> = hashMapOf(594 to 556314, 778 to 556312, 777 to 556313,
        120 to 556315,
        546 to 556311,
        1250 to 556207,
        298 to 558645, 609 to 558646,
        435 to 558647, 1171 to 558648, 252 to 558650, 1169 to 558651,
        604 to 558653, 439 to 558655, 458 to 558656,
        87 to 558657, 144 to 558658, 1157 to 558738,
        89 to 558739, 776 to 558740,
        804 to 558742, 96 to 558743, 557 to 558745,
        274 to 558746, 456 to 558720,
        820 to 558721, 86 to 558722, 81 to 558723,
        131 to 558724, 142 to 558725, 1271 to 558726,
        441 to 558727, 1168 to 558728,
        541 to 558730, 1156 to 558731, 139 to 558732,
        525 to 558733, 250 to 558734, 257 to 558735, 115 to 558736)
    val index = birdsNowMAPricing.get(birdIndex)

    println("Price Change for BNMA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowDLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsDL = "supportdallas@thefinchfarm.com"
    val pwBirdsDL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDL,pwBirdsDL)
    val birdsNowDLPricing: HashMap<Int, Int> = hashMapOf(594 to 558717, 298 to 559094, 609 to 559095,
        435 to 559096, 1171 to 559097, 252 to 559098, 1169 to 559099,
        778 to 559100, 604 to 559101, 439 to 559102, 458 to 559103,
        87 to 559104, 144 to 559105, 1157 to 559106,
        777 to 559107, 89 to 559108, 776 to 559109,
        804 to 559110, 96 to 559111, 557 to 559112, 120 to 559113,
        274 to 559114, 546 to 559115, 456 to 559116,
        820 to 559117, 86 to 559118, 81 to 559119,
        131 to 559120, 142 to 559121, 1271 to 559122,
        441 to 559123, 1168 to 559124,
        541 to 559125, 1156 to 559126, 1250 to 559127, 139 to 559128,
        525 to 559129, 250 to 559130, 257 to 559131, 115 to 559132)
    val index = birdsNowDLPricing.get(birdIndex)

    println("Price Change for BNDL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowDCPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsDC = "supportwashingtondc@thefinchfarm.com"
    val pwBirdsDC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDC,pwBirdsDC)
    val birdsNowDCPricing: HashMap<Int, Int> = hashMapOf(594 to 558815, 298 to 559153, 609 to 559154,
        435 to 559155, 1171 to 559156, 252 to 559157, 1169 to 559159,
        778 to 559161, 604 to 559163, 439 to 559164, 458 to 559165,
        87 to 559166, 144 to 559169, 1157 to 559170,
        777 to 559171, 89 to 559173, 776 to 559174,
        804 to 559175, 96 to 559176, 557 to 559177, 120 to 559178,
        274 to 559208, 546 to 559210, 456 to 559212,
        820 to 559215, 86 to 559216, 81 to 559217,
        131 to 559218, 142 to 559219, 1271 to 559220,
        441 to 559222, 1168 to 559223,
        541 to 559224, 1156 to 559225, 1250 to 559226, 139 to 559227,
        525 to 559228, 250 to 559229, 257 to 559231, 115 to 559232)
    val index = birdsNowDCPricing.get(birdIndex)

    println("Price Change for BNDC " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowATPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsAT = "supportatlanta@thefinchfarm.com"
    val pwBirdsAT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAT,pwBirdsAT)
    val birdsNowATPricing: HashMap<Int, Int> = hashMapOf(594 to 558958, 298 to 559239, 609 to 559240,
        435 to 559241, 1171 to 559242, 252 to 559243, 1169 to 559245,
        778 to 559292, 604 to 559293, 439 to 559294, 458 to 559295,
        87 to 559296, 144 to 559298, 1157 to 559299,
        777 to 559300, 89 to 559325, 776 to 559326,
        804 to 559301, 96 to 559302, 557 to 559303, 120 to 559304,
        274 to 559305, 546 to 559306, 456 to 559307,
        820 to 559308, 86 to 559309, 81 to 559310,
        131 to 559311, 142 to 559312, 1271 to 559313,
        441 to 559314, 1168 to 559315,
        541 to 559316, 1156 to 559317, 1250 to 559318, 139 to 559319,
        525 to 559320, 250 to 559321, 257 to 559327, 115 to 559322)
    val index = birdsNowATPricing.get(birdIndex)

    println("Price Change for BNAT " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowDTPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsDT = "supportdetroit@thefinchfarm.com"
    val pwBirdsDT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDT,pwBirdsDT)
    val birdsNowDTPricing: HashMap<Int, Int> = hashMapOf(594 to 559150, 298 to 559330, 609 to 559331,
        435 to 559334, 1171 to 559335, 252 to 559485, 1169 to 559486,
        778 to 559487, 604 to 559488, 439 to 559489, 458 to 559490,
        87 to 559491, 144 to 559492, 1157 to 559493,
        777 to 559494, 89 to 559495, 776 to 559496,
        804 to 559497, 96 to 559498, 557 to 559499, 120 to 559500,
        274 to 559501, 546 to 559502, 456 to 559503,
        820 to 559504, 86 to 559505, 81 to 559506,
        131 to 559507, 142 to 559508, 1271 to 559509,
        441 to 559510, 1168 to 559512,
        541 to 559513, 1156 to 559515, 1250 to 559516, 139 to 559517,
        525 to 559519, 250 to 559520, 257 to 559521, 115 to 559522)
    val index = birdsNowDTPricing.get(birdIndex)

    println("Price Change for BNDT " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowPDXPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsPDX = "supportportland@thefinchfarm.com"
    val pwBirdsPDX = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPDX,pwBirdsPDX)
    val birdsNowPDXPricing: HashMap<Int, Int> = hashMapOf(594 to 559666, 298 to 559667, 609 to 559668,
        435 to 559669, 1171 to 559670, 252 to 559671, 1169 to 559672,
        778 to 559674, 604 to 559675, 439 to 559676, 458 to 559677,
        87 to 559678, 144 to 559679, 1157 to 559680,
        777 to 559681, 89 to 559682, 776 to 559684,
        804 to 559685, 96 to 559686, 557 to 559687, 120 to 559688,
        274 to 559689, 546 to 559690, 456 to 559691,
        820 to 559692, 86 to 559693, 81 to 559694,
        131 to 559695, 142 to 559696, 1271 to 559697,
        441 to 559715, 1168 to 559716,
        541 to 559717, 1156 to 559718, 1250 to 559719, 139 to 559720,
        525 to 559721, 250 to 559723, 257 to 559724, 115 to 559725)
    val index = birdsNowPDXPricing.get(birdIndex)

    println("Price Change for BNPDX " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowMINPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsMIN = "supportminneapolis@thefinchfarm.com"
    val pwBirdsMIN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsMIN,pwBirdsMIN)
    val birdsNowMINPricing: HashMap<Int, Int> = hashMapOf(594 to 559291, 298 to 560145, 609 to 560146,
        435 to 560147, 1171 to 560148, 252 to 560149, 1169 to 560150,
        778 to 560151, 604 to 560152, 439 to 560153, 458 to 560154,
        87 to 560155, 144 to 560156, 1157 to 560157,
        777 to 560158, 89 to 560159, 776 to 560160,
        804 to 560161, 96 to 560162, 557 to 560163, 120 to 560164,
        274 to 560165, 546 to 560166, 456 to 560167,
        820 to 560168, 86 to 560169, 81 to 560170,
        131 to 560171, 142 to 560172, 1271 to 560173,
        441 to 560174, 1168 to 560175,
        541 to 560176, 1156 to 560177, 1250 to 560178, 139 to 560179,
        525 to 560180, 250 to 560181, 257 to 560182, 115 to 560183)
    val index = birdsNowMINPricing.get(birdIndex)

    println("Price Change for BNMIN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowLAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsLA = "supportlosangeles@thefinchfarm.com"
    val pwBirdsLA = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLA,pwBirdsLA)
    val birdsNowLAPricing: HashMap<Int, Int> = hashMapOf(594 to 558628, 298 to 560282, 609 to 560283,
        435 to 560284, 1171 to 560285, 252 to 560286, 1169 to 560287,
        778 to 560288, 604 to 560289, 439 to 560290, 458 to 560291,
        87 to 560292, 144 to 560293, 1157 to 560294,
        777 to 560295, 89 to 560296, 776 to 560297,
        804 to 560298, 96 to 560299, 557 to 560300, 120 to 560301,
        274 to 560302, 546 to 560303, 456 to 560305,
        820 to 560306, 86 to 560307, 81 to 560308,
        131 to 560309, 142 to 560310, 1271 to 560311,
        441 to 560312, 1168 to 560313,
        541 to 560314, 1156 to 560315, 1250 to 560316, 139 to 560317,
        525 to 560318, 250 to 560319, 257 to 560320, 115 to 560321)
    val index = birdsNowLAPricing.get(birdIndex)

    println("Price Change for BNLA " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowSANPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSAN = "supportsandiego@thefinchfarm.com"
    val pwBirdsSAN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSAN,pwBirdsSAN)
    val birdsNowSANPricing: HashMap<Int, Int> = hashMapOf(594 to 559483, 298 to 560243, 609 to 560244,
        435 to 560245, 1171 to 560246, 252 to 560247, 1169 to 560322,
        778 to 560249, 604 to 560250, 439 to 560251, 458 to 560252,
        87 to 560253, 144 to 560254, 1157 to 560255,
        777 to 560256, 89 to 560257, 776 to 560258,
        804 to 560259, 96 to 560260, 557 to 560261, 120 to 560262,
        274 to 560263, 546 to 560264, 456 to 560265,
        820 to 560266, 86 to 560267, 81 to 560268,
        131 to 560269, 142 to 560270, 1271 to 560271,
        441 to 560272, 1168 to 560273,
        541 to 560274, 1156 to 560275, 1250 to 560276, 139 to 560277,
        525 to 560278, 250 to 560279, 257 to 560280, 115 to 560281)
    val index = birdsNowSANPricing.get(birdIndex)

    println("Price Change for BNSAN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowDENPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsDEN = "supportdenver@thefinchfarm.com"
    val pwBirdsDEN = "TFF2019!"
    birdsNowLogin(driver,usrBirdsDEN,pwBirdsDEN)
    val birdsNowDENPricing: HashMap<Int, Int> = hashMapOf(594 to 559653, 298 to 560403, 609 to 560448,
        435 to 560405, 1171 to 560406, 252 to 560407, 1169 to 560408,
        778 to 560409, 604 to 560410, 439 to 560411, 458 to 560412,
        87 to 560413, 144 to 560414, 1157 to 560415,
        777 to 560416, 89 to 560417, 776 to 560418,
        804 to 560449, 96 to 560420, 557 to 560421, 120 to 560422,
        274 to 560423, 546 to 560424, 456 to 560425,
        820 to 560426, 86 to 560427, 81 to 560428,
        131 to 560429, 142 to 560430, 1271 to 560431,
        441 to 560432, 1168 to 560433,
        541 to 560434, 1156 to 560435, 1250 to 560436, 139 to 560437,
        525 to 560438, 250 to 560439, 257 to 560440, 115 to 560441)
    val index = birdsNowDENPricing.get(birdIndex)

    println("Price Change for BNDEN " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowBALPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsBAL = "supportbaltimore@thefinchfarm.com"
    val pwBirdsBAL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsBAL,pwBirdsBAL)
    val birdsNowBALPricing: HashMap<Int, Int> = hashMapOf(594 to 559763, 298 to 560491, 609 to 560492,
        435 to 560493, 1171 to 560494, 252 to 560495, 1169 to 560496,
        778 to 560497, 604 to 560498, 439 to 560499, 458 to 560501,
        87 to 560502, 144 to 560503, 1157 to 560504,
        777 to 560505, 89 to 560506, 776 to 560507,
        804 to 560508, 96 to 560509, 557 to 560510, 120 to 560511,
        274 to 560512, 546 to 560513, 456 to 560514,
        820 to 560515, 86 to 560516, 81 to 560517,
        131 to 560518, 142 to 560519, 1271 to 560520,
        441 to 560522, 1168 to 560523,
        541 to 560524, 1156 to 560525, 1250 to 560526, 139 to 560527,
        525 to 560528, 250 to 560529, 257 to 560530, 115 to 560531)
    val index = birdsNowBALPricing.get(birdIndex)

    println("Price Change for BNBAL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowSTLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSTL = "supportstlouis@thefinchfarm.com"
    val pwBirdsSTL = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSTL,pwBirdsSTL)
    val birdsNowSTLPricing: HashMap<Int, Int> = hashMapOf(594 to 559762, 298 to 560450, 609 to 560451,
        435 to 560452, 1171 to 560453, 252 to 560454, 1169 to 560455,
        778 to 560456, 604 to 560457, 439 to 560458, 458 to 560459,
        87 to 560460, 144 to 560461, 1157 to 560462,
        777 to 560464, 89 to 560465, 776 to 560466,
        804 to 560467, 96 to 560468, 557 to 560469, 120 to 560470,
        274 to 560471, 546 to 560472, 456 to 560473,
        820 to 560474, 86 to 560475, 81 to 560476,
        131 to 560477, 142 to 560479, 1271 to 560480,
        441 to 560481, 1168 to 560482,
        541 to 560483, 1156 to 560484, 1250 to 560485, 139 to 560486,
        525 to 560487, 250 to 560488, 257 to 560489, 115 to 560490)
    val index = birdsNowSTLPricing.get(birdIndex)

    println("Price Change for BNSTL " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowTMPPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsTMP = "supporttampa@thefinchfarm.com"
    val pwBirdsTMP = "TFF2019!"
    birdsNowLogin(driver,usrBirdsTMP,pwBirdsTMP)
    val birdsNowTMPPricing: HashMap<Int, Int> = hashMapOf(594 to 559549, 298 to 560363, 609 to 560364,
        435 to 560365, 1171 to 560366, 252 to 560367, 1169 to 560368,
        778 to 560369, 604 to 560370, 439 to 560371, 458 to 560372,
        87 to 560373, 144 to 560374, 1157 to 560375,
        777 to 560376, 89 to 560377, 776 to 560378,
        804 to 560379, 96 to 560380, 557 to 560381, 120 to 560382,
        274 to 560383, 546 to 560384, 456 to 560385,
        820 to 560386, 86 to 560387, 81 to 560388,
        131 to 560389, 142 to 560390, 1271 to 560391,
        441 to 560392, 1168 to 560393,
        541 to 560402, 1156 to 560395, 1250 to 560396, 139 to 560397,
        525 to 560398, 250 to 560399, 257 to 560400, 115 to 560401)
    val index = birdsNowTMPPricing.get(birdIndex)

    println("Price Change for BNTMP " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowAUSPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsAUS = "supportaustin@thefinchfarm.com"
    val pwBirdsAUS = "TFF2019!"
    birdsNowLogin(driver,usrBirdsAUS,pwBirdsAUS)
    val birdsNowAUSPricing: HashMap<Int, Int> = hashMapOf(594 to 560087, 298 to 560832, 609 to 560833,
        435 to 560834, 1171 to 560835, 252 to 560836, 1169 to 560837,
        778 to 560838, 604 to 560839, 439 to 560840, 458 to 560841,
        87 to 560843, 144 to 560844, 1157 to 560845,
        777 to 560846, 89 to 560847, 776 to 560848,
        804 to 560849, 96 to 560850, 557 to 560851, 120 to 560852,
        274 to 560853, 546 to 560854, 456 to 560855,
        820 to 560856, 86 to 560857, 81 to 560858,
        131 to 560859, 142 to 560860, 1271 to 560861,
        441 to 560862, 1168 to 560863,
        541 to 560864, 1156 to 560865, 1250 to 560866, 139 to 560867,
        525 to 560868, 250 to 560869, 257 to 560870, 115 to 560871)
    val index = birdsNowAUSPricing.get(birdIndex)

    println("Price Change for BNAUS " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowLVGPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsLVG = "supportlasvegas@thefinchfarm.com"
    val pwBirdsLVG = "TFF2019!"
    birdsNowLogin(driver,usrBirdsLVG,pwBirdsLVG)
    val birdsNowLVGPricing: HashMap<Int, Int> = hashMapOf(594 to 560086, 298 to 560753, 609 to 560754,
        435 to 560755, 1171 to 560756, 252 to 560757, 1169 to 560758,
        778 to 560759, 604 to 560760, 439 to 560761, 458 to 560762,
        87 to 560763, 144 to 560764, 1157 to 560765,
        777 to 560766, 89 to 560767, 776 to 560808,
        804 to 560769, 96 to 560770, 557 to 560771, 120 to 560773,
        274 to 560774, 546 to 560775, 456 to 560776,
        820 to 560777, 86 to 560817, 81 to 560779,
        131 to 560780, 142 to 560781, 1271 to 560821,
        441 to 560783, 1168 to 560784,
        541 to 560785, 1156 to 560786, 1250 to 560787, 139 to 560788,
        525 to 560789, 250 to 560829, 257 to 560791, 115 to 560792)
    val index = birdsNowLVGPricing.get(birdIndex)

    println("Price Change for BNLVG " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowPITTPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsPITT = "supportpittsburgh@thefinchfarm.com"
    val pwBirdsPITT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsPITT,pwBirdsPITT)
    val birdsNowPITTPricing: HashMap<Int, Int> = hashMapOf(594 to 560084, 298 to 560701, 609 to 560702,
        435 to 560703, 1171 to 560704, 252 to 560705, 1169 to 560706,
        778 to 560707, 604 to 560708, 439 to 560740, 458 to 560710,
        87 to 560711, 144 to 560712, 1157 to 560713,
        777 to 560714, 89 to 560715, 776 to 560716,
        804 to 560717, 96 to 560718, 557 to 560719, 120 to 560720,
        274 to 560721, 546 to 560722, 456 to 560723,
        820 to 560724, 86 to 560725, 81 to 560726,
        131 to 560727, 142 to 560728, 1271 to 560741,
        441 to 560730, 1168 to 560731,
        541 to 560732, 1156 to 560733, 1250 to 560734, 139 to 560735,
        525 to 560736, 250 to 560737, 257 to 560738, 115 to 560739)
    val index = birdsNowPITTPricing.get(birdIndex)

    println("Price Change for BNPITT " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowSACPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSAC = "supportsacramento@thefinchfarm.com"
    val pwBirdsSAC = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSAC,pwBirdsSAC)
    val birdsNowSACPricing: HashMap<Int, Int> = hashMapOf(594 to 560083, 298 to 560651, 609 to 560652,
        435 to 560697, 1171 to 560654, 252 to 560655, 1169 to 560656,
        778 to 560657, 604 to 560658, 439 to 560659, 458 to 560660,
        87 to 560661, 144 to 560662, 1157 to 560663,
        777 to 560664, 89 to 560665, 776 to 560666,
        804 to 560667, 96 to 560668, 557 to 560669, 120 to 560670,
        274 to 560671, 546 to 560672, 456 to 560698,
        820 to 560674, 86 to 560675, 81 to 560676,
        131 to 560677, 142 to 560678, 1271 to 560679,
        441 to 560680, 1168 to 560681,
        541 to 560682, 1156 to 560683, 1250 to 560684, 139 to 560685,
        525 to 560686, 250 to 560687, 257 to 560688, 115 to 560689)
    val index = birdsNowSACPricing.get(birdIndex)

    println("Price Change for BNSAC " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowCHARPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsCHAR = "supportcharlotte@thefinchfarm.com"
    val pwBirdsCHAR = "TFF2019!"
    birdsNowLogin(driver,usrBirdsCHAR,pwBirdsCHAR)
    val birdsNowCHARPricing: HashMap<Int, Int> = hashMapOf(594 to 560079, 298 to 560571, 609 to 560969,
        435 to 560573, 1171 to 560574, 252 to 560576, 1169 to 560578,
        778 to 560579, 604 to 560580, 439 to 560581, 458 to 560582,
        87 to 560583, 144 to 560584, 1157 to 560585,
        777 to 560586, 89 to 560587, 776 to 560588,
        804 to 560589, 96 to 560590, 557 to 560591, 120 to 560592,
        274 to 560593, 546 to 560594, 456 to 560595,
        820 to 560596, 86 to 560597, 81 to 560598,
        131 to 560599, 142 to 560983, 1271 to 560601,
        441 to 560602, 1168 to 560603,
        541 to 560604, 1156 to 560605, 1250 to 560606, 139 to 560607,
        525 to 560608, 250 to 560609, 257 to 560610, 115 to 560611)
    val index = birdsNowCHARPricing.get(birdIndex)

    println("Price Change for BNCHAR " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun birdsNowSANTPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrBirdsSANT = "supportsanantonio@thefinchfarm.com"
    val pwBirdsSANT = "TFF2019!"
    birdsNowLogin(driver,usrBirdsSANT,pwBirdsSANT)
    val birdsNowSANTPricing: HashMap<Int, Int> = hashMapOf(594 to 560080, 298 to 560612, 609 to 560613,
        435 to 560614, 1171 to 560615, 252 to 560616, 1169 to 560617,
        778 to 560618, 604 to 560619, 439 to 560699, 458 to 560621,
        87 to 560622, 144 to 560700, 1157 to 560624,
        777 to 560625, 89 to 560626, 776 to 560627,
        804 to 560628, 96 to 560629, 557 to 560630, 120 to 560631,
        274 to 560632, 546 to 560633, 456 to 560634,
        820 to 560635, 86 to 560636, 81 to 560637,
        131 to 560638, 142 to 560639, 1271 to 560640,
        441 to 560641, 1168 to 560642,
        541 to 560643, 1156 to 560644, 1250 to 560645, 139 to 560646,
        525 to 560647, 250 to 560648, 257 to 560649, 115 to 560650)
    val index = birdsNowSANTPricing.get(birdIndex)

    println("Price Change for BNSANT " + top40template.get(birdIndex) + " at index " + index)
    priceChangeExecution(driver, index, price)
}

fun hooblyWAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrHooblyWA = "customersupport@thefinchfarm.com"
    val pwHooblyWA = "Marketing2019!"
    hooblyLogin(driver,usrHooblyWA,pwHooblyWA)
    val hooblyWAPricing: HashMap<Int, String> = hashMapOf(1250 to "hd8r6", 84 to "KNEXh", 86 to "rcUay",458 to "lwUzY", 250 to "vKclC", 479 to "nyuye", 1161 to "i6yGN",
        260 to "QE0y1",783 to "CWfgP", 477 to "vjc07", 419 to "JMQws", 605 to "0dFbB", 132 to "4iTm6", 594 to "FZ0Bm", 572 to "RnbXy", 1161 to "vXqoa", 269 to "HY7My",
        141 to "dJNJx",139 to "k4N5C",546 to "ltc2x", 751 to "T9KD9", 483 to "U3Kyk", 795 to "U5ORI", 604 to "NaN0H", 777 to "eeDAL", 778 to "ZaAVE", 423 to "AgAwK",
        284 to "7wgmN", 274 to "BkYaN", 457 to "0c8TU", 646 to "ClTO6", 120 to "ZepT3", 131 to "6qGm2", 81 to "IUadk", 606 to "dYrD6", 527 to "CmeqH", 1171 to "5relL",
        144 to "eD3Rn", 528 to "MdUHa", 257 to "CmPz2", 570 to "1Zc33", 647 to "AccBa", 776 to "72ae9", 441 to "WiYEc", 459 to "RXjWL", 132 to "RM2kj", 87 to "gfYMc",
        820 to "Uhi55", 609 to "aVw9O", 142 to "QOZH1", 803 to "ujbPf", 469 to "JJYf0", 114 to "pncBM", 597 to "2fapx", 801 to "Rz06f",525 to "XaVLW",143 to "5lxlC",435 to "Cj53A")
    val index = hooblyWAPricing.get(birdIndex)

    println("Price Change for HooWA " + top40template.get(birdIndex) + " at index " + index)

}

fun hooblyFLPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrHooblyFL = "customersupportFL@thefinchfarm.com"
    val pwHooblyFL = "TFFFL2019!"
    hooblyLogin(driver,usrHooblyFL,pwHooblyFL)
    val hooblyFLPricing: HashMap<Int, String> = hashMapOf(250 to "xyfiT",820 to "nuhMi",87 to "CUMch",257 to "Nc20R",86 to "BbiCS",139 to "AHedI",609 to "zOdc6",115 to "zeq08",
        81 to "7rtFO",525 to "zXLd6",419 to "SQksa", 435 to "7cQR8", 557 to "feg87",458 to "G5fcU",131 to "MDZ3d",1250 to "0dBFw",606 to "gsqLh",546 to "xh26W",777 to "ohKgb",89 to "FPlAs",
        528 to "l6eEy",604 to "pi99M",441 to "n4Bnq",142 to "tewX5",594 to "G05ly",120 to "cmdyr",274 to "flTwp",778 to "kF6lh",541 to "fkLjz")
    val index = hooblyFLPricing.get(birdIndex)

    println("Price Change for HooFL " + top40template.get(birdIndex) + " at index " + index)

}

fun hooblyAZPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrHooblyAZ = "customersupportAZ@thefinchfarm.com"
    val pwHooblyAZ = "TFFAZ2019!"
    hooblyLogin(driver,usrHooblyAZ,pwHooblyAZ)
    var hooblyAZPricing: HashMap<Int, String> = hashMapOf(546 to "ZNq1T",120 to "nWZFV",274 to "xfSlP",139 to "2FPED",250 to "E9OY6",144 to "ozVSI",86 to "vG7af",131 to "h6POZ",
        477 to "C1xCa",1157 to "QwvUF",777 to "6LgSS",594 to "HhzPl",142 to "mOose",115 to "DLZ32",609 to "1WOeY",419 to "jpSrh",435 to "C4wcl",528 to "egumo",89 to "aNDSk",
        541 to "YPQyK",778 to "aHfQm",441 to "1jcUq",87 to "ffcG4",1250 to "pwILM",606 to "7MrjN",458 to "hoOxg",81 to "SmQhH",604 to "hV5if",557 to "yK5Ro",525 to "9mZKz",
        820 to "69WA0")
    val index = hooblyAZPricing.get(birdIndex)

    println("Price Change for HooAZ " + top40template.get(birdIndex) + " at index " + index)
}

fun hooblyCAPricing(driver: ChromeDriver,birdIndex: Int?, price: String) {
    Thread.sleep(3000)
    val usrHooblyCA = "customersupportCA@thefinchfarm.com"
    val pwHooblyCA = "TFFC3522!"
    hooblyLogin(driver,usrHooblyCA,pwHooblyCA)
    val hooblyCAPricing: HashMap<Int, String> = hashMapOf(131 to "lwO0b",81 to "ITYhd",86 to "UXvup",604 to "2HrtL",546 to "N9cro",458 to "RKSUg",419 to "Jmj6h",1250 to "uIvlf",
        144 to "2B7y0",139 to "JpXqh",777 to "4yg3N",528 to "G1H7C",820 to "45bRF",441 to "RVEsv",1258 to "CFCBe",606 to "KNbQg",778 to "9eMkb",594 to "YFSFe",142 to "uEhZb",
        1257 to "bC0sv",274 to "iaDmn",110 to "ZSNbM",115 to "77Ec1",250 to "miryH",87 to "znNNe",609 to "TJ8DM",435 to "uRHMp",525 to "a83tI",557 to "AFn8c",120 to "eqIaw",
        89 to "z2xXB",541 to "DHcvX")
    val index = hooblyCAPricing.get(birdIndex)

    println("Price Change for HooCA " + top40template.get(birdIndex) + " at index " + index)
}

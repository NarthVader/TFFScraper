package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

val comment = "We Ship Safely Nationwide! We use a patented safety travel box that’s climate controlled, comfortable, and meets the bird's nutritional needs! OUR BIRDS ARE VET CERTIFIED WITH A LIVE ARRIVAL GUARANTEE AND AN OPTIONAL EXTENDED WARRANTY! "
val small = "small"
val medium = "mediu"
val large = "large"

fun createBirds(driver: ChromeDriver) {
    //createAfricanRingneck(driver)
    //createAlbinoCocaktiel(driver)
    //createBlackMaskedLovebird(driver)
    //createBGMacaw(driver)
    createBlueLadyFinch(driver)
}

fun createAfricanRingneck(driver: ChromeDriver) {
    val title = "African Ringneck Parakeet"
    val species = "pa1"
    val subspecies = "rin"
    val price = "349.99"
    val searchTags = "african ringneck parakeet, africanringneckparakeet"
    val size = medium

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.birdsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    Select(driver.findElement(By.name("type1"))).selectByValue(species)
    Thread.sleep(3000)
    Select(driver.findElement(By.name("type2"))).selectByValue(subspecies)
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(comment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    //title
    driver.findElement(By.cssSelector("#name")).sendKeys(title)
    //color
    green(driver)
    //size
    Select(driver.findElement(By.name("size"))).selectByValue(size)
    forAllBirds(driver)
    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createAlbinoCocaktiel(driver: ChromeDriver) {
    val title = "Albino Cockatiel"
    val species = "coc"
    val subspecies = "none"
    val price = "247.00"
    val searchTags = "albino cockatiels for sale, cockatiels for sale"
    val size = medium

    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.birdsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //type dropdown
    Select(driver.findElement(By.name("type1"))).selectByValue(species)
    Thread.sleep(3000)
    if(subspecies!="none") {
        Select(driver.findElement(By.name("type2"))).selectByValue(subspecies)
    }
    Thread.sleep(1000)

    //price and comment price again
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(comment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    //title
    driver.findElement(By.cssSelector("#name")).sendKeys(title)
    //color
    albino(driver)
    white(driver)
    //size
    Select(driver.findElement(By.name("size"))).selectByValue(size)
    forAllBirds(driver)
    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
    saveAndContinue(driver)
}

fun createBlackMaskedLovebird(driver: ChromeDriver) {
    val title = "Black Masked Lovebird"
    val species = "lov"
    val subspecies = "bl1"
    val price = "108.99"
    val size = medium
    val searchTags = "black masked lovebirds for sale, lovebirds for sale"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    black(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createBGMacaw(driver: ChromeDriver) {
    val title = "Blue and Gold Macaw"
    val species = "mac"
    val subspecies = "blu"
    val price = "3999.99"
    val size = medium
    val searchTags = "blue and gold macaw, blueandgoldmacaw"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    gold(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

fun createBlueLadyFinch(driver: ChromeDriver) {
    val title = "Blue Back Lady Gouldian Finch"
    val species = "fin"
    val subspecies = "lad"
    val price = "264.99"
    val size = small
    val searchTags = "blue back lady gouldian finch, bluebackladygouldianfinch"

    birdCreationStart(driver,title)
    birdTitle(driver,title)
    birdSpecies(driver,species,subspecies)
    birdPrice(driver,price)
    //color//
    blue(driver)
    /////////
    birdSize(driver,size)
    forAllBirds(driver)
    birdTags(driver,searchTags)
    saveAndContinue(driver)
}

//colors
fun albino(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='alb']")).click()
}

fun black(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='bla']")).click()
}

fun blue(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='blu']")).click()
}

fun grey(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='gr1']")).click()
}

fun gold(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='gol']")).click()
}

fun green(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='gre']")).click()
}

fun white(driver: ChromeDriver) {
    driver.findElement(By.xpath("//input[@value='whi']")).click()
}

//helper functions
fun birdCreationStart(driver: ChromeDriver, title: String) {
    Thread.sleep(3000)
    println("creating $title")
    driver.get("https://www.birdsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
}

fun birdSpecies(driver: ChromeDriver, species: String, subspecies: String) {
    //type dropdown
    Select(driver.findElement(By.name("type1"))).selectByValue(species)
    Thread.sleep(3000)
    if(subspecies!="none") {
        Select(driver.findElement(By.name("type2"))).selectByValue(subspecies)
    }
    Thread.sleep(1000)
}

fun birdSize(driver: ChromeDriver, size: String) {
    //size
    Select(driver.findElement(By.name("size"))).selectByValue(size)
}

fun birdTitle(driver: ChromeDriver, title: String) {
    //title
    driver.findElement(By.cssSelector("#title")).sendKeys(title)
    //title
    driver.findElement(By.cssSelector("#name")).sendKeys(title)
}

fun birdPrice(driver: ChromeDriver, price: String) {
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
    driver.findElement(By.cssSelector("#comments")).sendKeys(comment)
    driver.findElement(By.cssSelector("#price")).sendKeys(price)
}

fun birdTags(driver: ChromeDriver, searchTags: String) {
    //tag words
    driver.findElement(By.cssSelector("#tags")).sendKeys(searchTags)
}

fun saveAndContinue(driver: ChromeDriver) {
    driver.findElement(By.name("doContinue")).click()
    Thread.sleep(3000)
    driver.findElement(By.name("doContinue")).click()
    Thread.sleep(60000)
}

fun forAllBirds(driver: ChromeDriver) {
    Select(driver.findElement(By.name("age"))).selectByValue("you")
    Select(driver.findElement(By.name("adkind"))).selectByValue("for")
    Select(driver.findElement(By.name("sex"))).selectByValue("un")
    driver.findElement(By.cssSelector("#marking")).sendKeys("Phone #: 877-527-5656")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys("http://www.thefinchfarm.com/african-grey-parrots/")
    driver.findElement(By.xpath("//input[@value='exo']")).click()
    driver.findElement(By.xpath("//input[@value='fan']")).click()
    driver.findElement(By.xpath("//input[@value='com']")).click()
    driver.findElement(By.xpath("//input[@value='pet']")).click()
    driver.findElement(By.xpath("//input[@value='cut']")).click()
    driver.findElement(By.xpath("//input[@value='pla']")).click()
    driver.findElement(By.name("shipping")).sendKeys(comment)
}


fun createAfricanGrey(driver: ChromeDriver) {
    Thread.sleep(3000)
    println("creating African Grey")
    driver.get("https://www.birdsnow.com/place_ad-adType-p")
    Thread.sleep(1000)
    driver.findElement(By.cssSelector("#title")).sendKeys("African Grey Parrot")
    Select(driver.findElement(By.name("type1"))).selectByValue("afr")
    Thread.sleep(3000)
    Select(driver.findElement(By.name("type2"))).selectByValue("con")
    Thread.sleep(1000)
    Select(driver.findElement(By.name("age"))).selectByValue("you")
    driver.findElement(By.cssSelector("#price")).sendKeys("4484.99")
    driver.findElement(By.cssSelector("#comments")).sendKeys(comment)
    driver.findElement(By.cssSelector("#price")).sendKeys("4484.99")
    driver.findElement(By.cssSelector("#name")).sendKeys("African Grey Parrot")
    Select(driver.findElement(By.name("adkind"))).selectByValue("for")
    Select(driver.findElement(By.name("sex"))).selectByValue("un")
    driver.findElement(By.xpath("//input[@value='gr1']")).click()
    Select(driver.findElement(By.name("size"))).selectByValue("large")
    driver.findElement(By.cssSelector("#marking")).sendKeys("Phone #: 877-527-5656")
    driver.findElement(By.xpath("//input[@name='url']")).sendKeys("http://www.thefinchfarm.com/african-grey-parrots/")
    driver.findElement(By.xpath("//input[@value='exo']")).click()
    driver.findElement(By.xpath("//input[@value='fan']")).click()
    driver.findElement(By.xpath("//input[@value='com']")).click()
    driver.findElement(By.xpath("//input[@value='pet']")).click()
    driver.findElement(By.xpath("//input[@value='rar']")).click()
    driver.findElement(By.xpath("//input[@value='tal']")).click()
    driver.findElement(By.xpath("//input[@value='cut']")).click()
    driver.findElement(By.xpath("//input[@value='pla']")).click()
    driver.findElement(By.name("shipping")).sendKeys(comment)
    driver.findElement(By.cssSelector("#tags")).sendKeys("african grey parrots for sale")
    driver.findElement(By.name("doContinue")).click()
    Thread.sleep(3000)
}
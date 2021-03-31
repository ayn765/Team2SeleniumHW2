import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainPage extends Base{
    @Test (enabled = false)
    public void testAllLinks() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        Thread.sleep(2000);
        List<WebElement> listOfAllLinks= driver.findElements(By.cssSelector("#hmenu-content>ul"));
        int actualNumOfLinks = listOfAllLinks.size();
        int expectedNumOfLinks = 37;
        Assert.assertEquals(actualNumOfLinks,expectedNumOfLinks, "The number of links is incorrect.");
    }

    @Test (enabled = false)
    public void testCartLink(){
        WebElement cart = driver.findElement(By.cssSelector("#nav-cart-count"));
        cart.click();
        String actualEmptyCartMessage = driver.findElement(By.xpath("//h2[contains(text(),'Your Amazon Cart is empty')]")).getText();
        String expectedEmptyCartMessage = "Your Amazon Cart is empty";
        Assert.assertEquals(actualEmptyCartMessage, expectedEmptyCartMessage, "The Empty cart message is incorrect.");
    }

    @Test (enabled = false)
    public void testChangeLangToSpanish(){
        driver.findElement(By.cssSelector(".icp-nav-flag.icp-nav-flag-us")).click();
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[2]")).click();
        String expectedMessage = "Idioma de preferencia";
        String actualMessage = driver.findElement(By.cssSelector("#lop-heading")).getText();
        Assert.assertEquals(actualMessage,expectedMessage, "Message is incorrect.");
    }

    @Test (enabled = false)
    public void testSignInIncorrectPhoneNum(){
        driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
        WebElement phoneEmailInput = driver.findElement(By.cssSelector("#ap_email"));
        phoneEmailInput.sendKeys("123456789");
        driver.findElement(By.cssSelector("#continue")).click();
        String expectedErrorMessage = "Incorrect phone number";
        String actualErrorMessage = driver.findElement(By.cssSelector("#auth-error-message-box > div > h4")).getText();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage, "Error message is incorrect.");

    }
    @Test (enabled = true)
    public void testAmazonMusicLink() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Amazon Music')]")).click();
        Thread.sleep(1000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon Music Unlimited | Stream 70 Million Songs & Podcasts";
        Assert.assertEquals(actualTitle, expectedTitle, "The title is incorrect.");

    }
    @Test
    public void testSignIn() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("bouharounwarda@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(4000);
        String expectedTitle="Amazon Sign-In";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test sign in");
    }

    @Test(priority = 1)
    public void testPageTitle() {
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page title not match");
    }
    // first way
    @Test
    public void verifyAmazonLogo(){
        boolean logo=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
        Assert.assertTrue(logo);
    }
    @Test
    public void clickOnPrime(){
        WebElement prime=driver.findElement(By.id("nav-link-prime"));
        prime.click();
    }
}

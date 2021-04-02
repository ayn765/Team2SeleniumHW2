import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonAlexa extends Base{


    @Test (enabled = true)
    public void testAmazonAlexaTitle() {
    driver.findElement(By.cssSelector("a[href='https://www.alexa.com']")).click();
    String actualTitle = driver.getTitle();
    String expectedTitle = "Keyword Research, Competitive Analysis, & Website Ranking | Alexa";
    Assert.assertEquals(actualTitle, expectedTitle, "Titles don't match.");
    }
 //comment
    @Test (enabled = true)
    public void testLandingPageImage(){
        driver.findElement(By.cssSelector("a[href='https://www.alexa.com']")).click();
        WebElement imageLandingPage = driver.findElement(By.cssSelector("img.off-edge-right[title='Alexa Competitor Keyword Matrix']"));
        imageLandingPage.isDisplayed();
    }

    @Test (enabled = true)
    public void testHowAlexaCanHelp(){
        driver.findElement(By.cssSelector("a[href='https://www.alexa.com']")).click();
        driver.findElement(By.cssSelector("#ddlMyList")).click();
        List<WebElement> listOfHowCanAlexaHelp = driver.findElements(By.cssSelector(".no_focus.help-dropdown>option"));
        int expectedNumOfOptions = 8;
        int actualNumOfOptions = listOfHowCanAlexaHelp.size();
        Assert.assertEquals(actualNumOfOptions, expectedNumOfOptions, "The number of options is incorrect.");
    }

    @Test (enabled = true)
    public void testHowAlexaCanHelpOption1(){
        driver.findElement(By.cssSelector("a[href='https://www.alexa.com']")).click();
        driver.findElement(By.cssSelector("#ddlMyList")).click();
        List<WebElement> listOfHowCanAlexaHelp = driver.findElements(By.cssSelector(".no_focus.help-dropdown>option"));
        WebElement option1 = listOfHowCanAlexaHelp.get(0);
        String actualTextOption1 = option1.getText();
        String expectedTextOption1 = "discover ideas to grow my traffic";
        Assert.assertEquals(actualTextOption1, expectedTextOption1, "The text of the 1st option is incorrect.");


    }
    @Test (enabled = true)
    public void testHowAlexaCanHelpOption2(){
        driver.findElement(By.cssSelector("a[href='https://www.alexa.com']")).click();
        driver.findElement(By.cssSelector("#ddlMyList")).click();
        List<WebElement> listOfHowCanAlexaHelp = driver.findElements(By.cssSelector(".no_focus.help-dropdown>option"));
        WebElement option2 = listOfHowCanAlexaHelp.get(1);
        String actualTextOption2 = option2.getText();
        String expectedTextOption2 = "create content that engages my audience and adding something else";
        Assert.assertEquals(actualTextOption2, expectedTextOption2, "The text of the 2nd option is incorrect.");
    }
}

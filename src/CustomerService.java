import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CustomerService extends Base{

    @Test (enabled = true)
    public void testYourOrders(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
        WebElement yourOrders = driver.findElement(By.cssSelector("body > div:nth-child(30) > div.a-row > div > div.a-section.a-spacing-large.ss-landing-container-wide > div:nth-child(1) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h3"));
        yourOrders.click();
        String expectedTitle = "Amazon Sign-In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "The title doesn't match.");
    }

    @Test (enabled = true)
    public void testNumOfHelpTopics() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
        Thread.sleep(1000);
        List <WebElement> listOfHelpTopics= driver.findElements(By.cssSelector("ul#category-section>li"));
        int expectedNumOfListOfHelpTopics = 12;
        int actualNumOfListOfHelpTopics = listOfHelpTopics.size();
        Assert.assertEquals(actualNumOfListOfHelpTopics, expectedNumOfListOfHelpTopics, "The number of Help Topics Links is incorrect.");
    }

    @Test (enabled = true)
    public void testSomeTest3(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
        WebElement recommendedTopic = driver.findElement(By.cssSelector("#category-section > li:nth-child(1) > a"));
        String actualLinkText = recommendedTopic.getText();
        String expectedLinkText = "Recommended Topics";
        Assert.assertEquals(actualLinkText, expectedLinkText, "The text is incorrect");

    }

    @Test (enabled = true)
    public void testSomeTest4(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
        WebElement whereIsMyStuff = driver.findElement(By.cssSelector("#category-section > li:nth-child(2) > a"));
        String actualLinkText = whereIsMyStuff.getText();
        String expectedLinkText = "Where's My Stuff?";
        Assert.assertEquals(actualLinkText, expectedLinkText, "The text is incorrect");

    }
    @Test (enabled = true)
    public void testSomeTest5(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
        WebElement managingYourOrder = driver.findElement(By.cssSelector("#category-section > li:nth-child(3) > a"));
        managingYourOrder.click();
        WebElement managingYourOrderMenu = driver.findElement(By.xpath("(//h3[contains(text(), 'Managing Your Orders')])[1]"));
        managingYourOrderMenu.isDisplayed();
    }
}

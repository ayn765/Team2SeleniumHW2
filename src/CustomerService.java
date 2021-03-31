import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CustomerService extends Base{
    @Test
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

    @Test (enabled = false)

    public void testSomeTest3(){

    }

    @Test (enabled = false)
    public void testSomeTest4(){

    }
    @Test (enabled = false)
    public void testSomeTest5(){

    }
}

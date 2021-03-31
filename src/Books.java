import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Books extends Base{

    @Test
    public void childrenBooks(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        WebElement childrenBooks= driver.findElement(By.cssSelector("#widgetFilters > div > div.a-section.tiles > div:nth-child(4) > a > div > div:nth-child(2) > span"));
        childrenBooks.click();
        String expectedTitle = "Children's Books - Amazon.com";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"The title doesn't match. ");

    }

    @Test
    public void artAndPhotography(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        WebElement artAndPhotography = driver.findElement(By.cssSelector("#widgetFilters > div > div.a-section.tiles > div:nth-child(1) > a > div > div:nth-child(2) > span"));
        String expectedTitle="Amazon.com: Books";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "The title doesn't match. ");

    }



    @Test
    public void history() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        WebElement history = driver.findElement(By.cssSelector("#widgetFilters > div > div.a-section.tiles > div:nth-child(6) > a > div > div:nth-child(2) > span"));
        String expectedTitle = "Amazon.com: Books";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "The title doesn't match. ");
    }
    @Test
    public void romance() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        WebElement romance = driver.findElement(By.cssSelector( "#widgetFilters > div > div.a-section.tiles > div:nth-child(9) > a > div > div:nth-child(2) > span"));
        String expectedTitle = "Amazon.com: Books";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "The title doesn't match. ");
    }

    @Test
    public void mysteryAndSuspense() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        WebElement  mysteryAndSuspense= driver.findElement(By.cssSelector( "#widgetFilters > div > div.a-section.tiles > div:nth-child(8) > a > div > div:nth-child(2) > span"));
        String expectedTitle = "Amazon.com: Books";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "The title doesn't match. ");
    }
}

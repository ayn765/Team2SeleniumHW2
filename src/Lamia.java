import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lamia extends Base {


    @Test
    public void testWomenFashion() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
        WebElement womenFashion = driver.findElement(By.className("nav-a-content"));
        womenFashion.click();
        String actualResult = driver.getTitle();
        String expectedResult = "Women";
        Assert.assertEquals(actualResult, expectedResult, "Titles don't match");
    }

    @Test
    public void testMenFashion() {
        driver.findElement(By.className("nav-a")).click();
        WebElement menWatch = driver.findElement(By.xpath("//*[@id=\"sobe_d_b_4_3\"]/a"));
        String actualResult = driver.getTitle();
        String expectedResult = "Watches";
        Assert.assertEquals(actualResult, expectedResult, "Titles don't match");
    }


    @Test
    public void testKidsFashion() {
        driver.findElement(By.className("nav-a")).click();
        WebElement kidsClothing = driver.findElement(By.className("nav-a-content"));
        kidsClothing.click();
        String actualType = driver.getTitle();
        String expectedType = "Boys";
        Assert.assertEquals(actualType, expectedType, "Types don't match");
    }


    @Test
    public void testSomeTest4() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
        WebElement salesDeals = driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(6) > span"));
        salesDeals.click();
        String actualResult = driver.getTitle();
        String expectResult = "https://images-na.ssl-images-amazon.com/images/G/01/AMAZON_FASHION/2021/SITE_FLIPS/SPR_1/SND/desktop/6COL_SPR21_SBP_SND_07.jpg";
        Assert.assertEquals(actualResult, expectResult, "Links don't match");

    }

    @Test
    public void testSearchLatestFashion() {
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("latest fashion for women 2021");
        search.click();
        String actualTitle = driver.getTitle().toLowerCase();
        String expectedTitle = "Amazon.com : latest fashion for women 2021".toLowerCase();
        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }
}
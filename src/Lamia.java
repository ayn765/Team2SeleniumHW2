import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lamia extends Base {

    @Test(enabled=true)
    public void testSearchKidsShoes(){
        WebElement searchshoes = driver.findElement(By.id("twotabsearchtextbox"));
        searchshoes.sendKeys("Stride rite toddler boys shoes");
        searchshoes.click();
        String actualTitle = driver.getTitle().toLowerCase();
        String expectedTitle = "amazon.com: online shopping for electronics, apparel, computers, books, dvds & more".toLowerCase();
        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }


    @Test(enabled = true)
    public void testSignIn(){
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        String actual=driver.getTitle();
        String expected="Amazon Sign-In";
        Assert.assertEquals(actual, expected, "links Do NOT MATCH");
    }

    @Test(enabled = true)
    public void testSearchLatestFashion() {
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("latest fashion for women 2021");
        search.click();
        String actualTitle = driver.getTitle().toLowerCase();
        String expectedTitle = "amazon.com: online shopping for electronics, apparel, computers, books, dvds & more";
        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    @Test(enabled = true)
    public void testWomenFashion() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
        WebElement womenFashion=driver.findElement(By.id("sobe_d_b_4_1"));
        womenFashion.click();
        String actualResult = driver.getTitle();
        String expectedResult = "Women's Clothing, Shoes, Jewelry, Watches & Handbags | Amazon.com";
        Assert.assertEquals(actualResult, expectedResult, "Titles don't match");
    }


    @Test(enabled = true)
    public void testMenFashion() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
        WebElement menFashion = driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(3) > span.nav-a-content"));
        menFashion.click();
        String actualResult = driver.getTitle();
        String expectedResult = "Men's Fashion - Amazon.com";
        Assert.assertEquals(actualResult, expectedResult, "Titles don't match");
    }


    @Test(enabled =true)
    public void testKidsFashion() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
        WebElement kidsClothing = driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(4) > span.nav-a-content"));
        kidsClothing.click();
        String actualType = driver.getTitle();
        String expectedType = "Amazon.com: Kids: Clothing, Shoes & Jewelry";
        Assert.assertEquals(actualType, expectedType, "Types don't match");
    }

    @Test(enabled =true)
    public void testSales() {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
        WebElement salesDeals = driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(6) > span"));
        salesDeals.click();
        String actualResult = driver.getTitle();
        String expectResult = "Amazon Fashion Sales & Deals | Amazon.com";
        Assert.assertEquals(actualResult, expectResult, "Links don't match");

    }


    @Test(enabled = true)
    public void testReturnOrders(){
        driver.findElement(By.id("nav-orders")).click();
        String actualTest=driver.getTitle();
        String expectedTest="Amazon Sign-In";
        Assert.assertEquals(actualTest, expectedTest, "Tests Do NOT MATCH");
    }

    @Test
    public void testSelectYourAddress(){
      driver.findElement(By.id("glow-ingress-line2")).click();
        String actualTest=driver.getTitle();
        String expectedTest="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(actualTest,expectedTest,"tests do not match");

    }
    @Test(enabled =true)
    public void testNewArrivals(){
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)")).click();
        WebElement newArrivals=driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(7) > span.nav-a-content"));
        newArrivals.click();
        String actualTitle = driver.getTitle();
        String expectedTitle="Amazon.com: New Arrivals: Clothing, Shoes & Jewelry";
        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }



}
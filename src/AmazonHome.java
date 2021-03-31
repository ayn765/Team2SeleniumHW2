import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHome extends Base {
    @Test
    public void testSignInPage() {
        WebElement signInButton = driver.findElement(By.cssSelector("#nav-link-accountList"));
        signInButton.click();

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Amazon Sign-In";

        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Sign in page titles don't match");
    }


    @Test
    public void testReturnsAndOrderTab() {
        driver.findElement(By.cssSelector("#nav-orders > span.nav-line-2")).click();
        String expectedTitle = "Amazon Sign-In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "The title doesn't match");


    }


    @Test
    public void testMyCartTab() {
        driver.findElement(By.id("nav-cart-text-container")).click();
        String expectedTitle = "Amazon.com Shopping Cart";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "The title doesn't match");


    }

    @Test
    public void testSearchYourAddressBar() {
        driver.findElement(By.id("glow-ingress-line1")).click();
        String expectedTest = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTest = driver.getTitle();
        Assert.assertEquals(actualTest, expectedTest, "The id doesn't match");
    }


    @Test
    public void testDoSearchCookware() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("cookware");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        String actualTitle = driver.getTitle().toLowerCase();
        String expectedTitle = "Amazon.com : cookware".toLowerCase();

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }

    @Test
    public void testDoSearchToddlerCloths() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("toddler cloths");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        String actualTitle = driver.getTitle().toLowerCase();
        String expectedTitle = "Amazon.com : toddler cloths".toLowerCase();

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");

    }
}
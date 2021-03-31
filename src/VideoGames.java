import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.awt.SystemColor.menu;

public class VideoGames extends Base{

    @Test (priority = 1)
    public void testNavigationToVideoGames() {
        WebElement clickSearchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        clickSearchBox.click();
        clickSearchBox.sendKeys("Video Games");

        WebElement clickMagnifyingGlass = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        clickMagnifyingGlass.click();

        String actualTitle = driver.getTitle().toLowerCase();
        String expectedTitle = "amazon.com : video games";

        Assert.assertEquals(actualTitle, expectedTitle, "VIDEO GAME TITLES DOES NOT MATCH.");



    }

    @Test (priority = 2)
    public void testdoSearch(){
        WebElement search1 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search1.click();
        search1.sendKeys("Mario Kart");
        search1.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        search1.click();

        String actualTitle1 = driver.getTitle().toLowerCase();
        String expectedTitle1 = "amazon.com: online shopping for electronics, apparel, computers, books, dvds & more";

        Assert.assertEquals(actualTitle1, expectedTitle1, "MARIO KART TITLE DOES NOT MATCH");


    }

    @Test (priority = 3)
    public void testDeliveryDayGames() throws InterruptedException {
        WebElement clickSearchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        clickSearchBox.click();
        clickSearchBox.sendKeys("Video Games");

        WebElement clickMagnifyingGlass = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        clickMagnifyingGlass.click();

        WebElement delivery = driver.findElement(By.xpath("//*[@id=\"p_90/8308921011\"]/span/a/div/label/i"));
        Actions action = new Actions(driver);
        action.moveToElement(delivery).click().perform();
        Thread.sleep(5000);


        String actualDelivery = driver.getTitle();
        String expectedDelivery = "Amazon.com: Video Games - Get It by Tomorrow";



    }

    @Test (priority = 4)
    public void testScrollDownPage() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(5000);


    }
    @Test (priority = 5)
    public void testItemInShoppingCart(){
        WebElement clickSearchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        clickSearchBox.click();
        clickSearchBox.sendKeys("Mario Kart");

        WebElement clickMagnifyingGlass = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        clickMagnifyingGlass.click();

        WebElement itemImage = driver.findElement(By.cssSelector("img[src=\"https://m.media-amazon.com/images/I/91KQmjDxj-L._AC_UY218_.jpg\"][alt=\"Mario Kart 8 Deluxe - Nintendo Switch\"]"));
        itemImage.click();

        WebElement cart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        cart.click();

        String actualItem = driver.getTitle();
        String expectedItem = "Amazon.com Shopping Cart";

        Assert.assertEquals(actualItem, expectedItem, "ITEM DOES NOT GO TO CART");



    }
}

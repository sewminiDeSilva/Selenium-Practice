import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class LinkExample {

    WebDriver driver;

    @BeforeMethod
    public void googleTest() {

        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public void LinkTest() {
        //take me to dashboard

        WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();


        //find my destination
        WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL "));
        String path = whereToGo.getAttribute("href");
        System.out.println(path);


        //broken Link
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();
        String title = driver.getTitle();
        if(Objects.requireNonNull(title).contains("404")){
            System.out.println("Link is broken");
        }
        else {
            System.out.println("You can Go ahead");
        }
   driver.navigate().back();


    //duplicate Link

      //  homeLink.click();
        WebElement homeLink1 = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink1.click();
        driver.navigate().back();


    //count links in full page
    List<WebElement> countFullPageLinks = driver.findElements(By.tagName("a"));
     int pageLinkCount = countFullPageLinks.size();
        System.out.println("count of FullPage Links:"+ pageLinkCount);

        //count layout links
         WebElement layoutElement = driver.findElement(By.className("layout-main-content"));
        List<WebElement> countLayoutLinks = layoutElement.findElements(By.tagName("a"));
        int layoutLinkCount = countLayoutLinks.size();
        System.out.println("count of FullPage Links:"+ layoutLinkCount);

}}
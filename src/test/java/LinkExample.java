import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LinkExample {

    WebDriver driver;

    @BeforeMethod
    public void googleTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
    }

    @Test
    public void LinkTest() {
        //take me to dashboard

        WebElement homeLink = driver.findElement(By.linkText(""));
        homeLink.click();
        driver.navigate().back();


        //find my destination
        WebElement whereToGo = driver.findElement(By.partialLinkText(""));
        String path = whereToGo.getAttribute("href");
        System.out.println(path);
        driver.navigate().back();

        //broken Link
        WebElement brokenLink = driver.findElement(By.linkText(""));
        brokenLink.click();
        String title = driver.getTitle();
        if(title.contains("404")){
            System.out.println("Link is broken");
        }
        else {
            System.out.println("You can Go ahead");
        }
   driver.navigate().back();


    //duplicate Link

      //  homeLink.click();
        WebElement homeLink1 = driver.findElement(By.linkText(""));
        homeLink1.click();
        driver.navigate().back();


    //count links in full page
    List<WebElement> countFullPageLinks = driver.findElements(By.tagName("a"));
        System.out.println(countFullPageLinks);

        //count layout links
        List<WebElement> countLayoutLinks = driver.findElements(By.className(""));

}}
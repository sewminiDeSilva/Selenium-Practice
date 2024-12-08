import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {
   WebDriver driver;
    @BeforeMethod
    public  void GoogleTest(){
        driver =new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");
    }

   @Test
   public void textBoxTest(){

       //type your  name
       WebElement name = driver.findElement(By.id("j_idt88:name"));
       name.sendKeys("sewmini");

       //verify if text box is disable
       boolean enabled = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
       System.out.println("Is enable"+ enabled);

       //clear the typed text
       WebElement clearText = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
       clearText.clear();

       //retrieve  the type text
       WebElement textElement = driver.findElement(By.id("j_idt88:j_idt97"));
       String value =textElement.getAttribute("value");
       System.out.println(value);

       //Type email &  tab. confirm control moved to next element
       driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("sample@gmail.com" + Keys.TAB + "control moved to next element");
   }

}

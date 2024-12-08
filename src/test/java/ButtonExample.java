import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {

    WebDriver driver;
    @BeforeMethod
            public void GoogleTest(){
    WebDriver driver = new ChromeDriver();
    driver.get("");}

   @Test
   public void ButtonTest(){
        //click and confirm click

   }
}

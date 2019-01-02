import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHome extends CommonApi {
    @Test
    public void test1(){
        //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("books");
        typecss("#twotabsearchtextbox", "books");

    }
}

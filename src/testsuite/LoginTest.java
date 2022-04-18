package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void openBrowser(){
        setUpBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
// Enter “Admin” username
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
// Enter “admin123 password
        WebElement passWord = driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("admin123");
//* Click on ‘LOGIN’ button
        driver.findElement(By.id("btnLogin")).click();

// Verify the ‘Welcome’ text is display
        String expectedMsg = "welcome";
        String actualText = driver.findElement(By.id("welcome")).getText();
        System.out.println(actualText);
        Assert.assertEquals(expectedMsg,actualText);
    }
    @After
    public void quitBrowser(){
        closeBrowser();
    }
}

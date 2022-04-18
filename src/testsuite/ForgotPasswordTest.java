package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void openBrowser(){
        setUpBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
// click on the ‘Forgot your password’ link
        driver.findElement(By.linkText("Forgot your password?")).click();
// Verify the text ‘Forgot Your Password?
        String expectedMsg = "Forgot Your Password?";
       String actualMsg = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]")).getText();
        System.out.println(actualMsg);
        Assert.assertEquals(expectedMsg,actualMsg);
    }
    @After
    public void quitBrowser(){
        closeBrowser();
    }
}

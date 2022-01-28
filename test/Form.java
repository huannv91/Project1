import Pages.ConfirmationPage;
import Pages.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class Form {
    @Test
    public void testcase1() {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Chromedriver\\chrome97\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        /*FormPage formPage = new FormPage();
        formPage.submitForm(driver);*/

        FormPagePF obj = new FormPagePF(driver);
        obj.submitFormPF();

        /*FormPagePF obj = PageFactory.initElements(driver,FormPagePF.class);
        obj.submitFormPF();*/




        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitforAlert(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertText(driver));

        driver.quit();
    }

    @Test
    public void testcase2() {
        System.out.println("test case 2 result");
    }


    @Test
    public void testcase3() {
        System.out.println("Test case 3 result");
    }
}

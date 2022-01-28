package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
    public static void waitforAlert(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-success")));

    }
    public static String getAlertText(WebDriver driver) {

        String alertText = driver.findElement(By.className("alert-success")).getText();
        return alertText;

    }

}

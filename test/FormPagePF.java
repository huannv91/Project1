import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPagePF {

    final WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstname;

    @FindBy(id = "last-name")
    WebElement lastname;

    @FindBy(id = "job-title")
    WebElement jobTitle;

    @FindBy(id = "radio-button-2")
    WebElement radioBtn2;

    @FindBy(id = "checkbox-2")
    WebElement checkBox2;

    @FindBy(css = "option[value='1']")
    WebElement Option1;

    @FindBy(id = "datepicker")
    WebElement date;

    @FindBy(css = ".btn.btn-lg.btn-primary")
    WebElement submitBtn;

    public FormPagePF(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver1, this);
    }

    public void submitFormPF() {
        firstname.sendKeys("Nguyen");
        lastname.sendKeys("Huan");
        jobTitle.sendKeys("Tester");
        radioBtn2.click();
        checkBox2.click();
        Option1.click();
        date.sendKeys("01/25/2022");
        date.sendKeys(Keys.RETURN);
        submitBtn.click();

    }



}

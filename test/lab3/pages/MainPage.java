package lab3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

    @FindBy(xpath = "//*[@id=\"PH_authLink\"]")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"ColumnCenter\"]/div/div/div[6]/div[1]/a[2]")
    public WebElement firstQuestionLink;
    @FindBy(xpath = "//*[@id=\"portal-menu__toolbar\"]/div[1]/div/div[2]/div/span/span[2]/span[3]/span/form/span[1]/span[1]/input")
    public WebElement searchBar;
    @FindBy(xpath = "//*[@id=\"portal-menu__toolbar\"]/div[1]/div/div[2]/div/span/span[2]/span[3]/span/form/span[2]/button")
    public WebElement searchButton;

    public WebElement username;
    public WebElement password;

    public MainPage(WebDriver driver) {
        super(driver);
    }

}

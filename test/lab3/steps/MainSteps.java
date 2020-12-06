package lab3.steps;

import lab3.pages.MainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainSteps extends Steps {

    private MainPage page;

    public MainSteps(WebDriver driver) {
        this.driver = driver;
        page = new MainPage(this.driver);
    }

    public MainSteps openMain() {
        driver.get("https://otvet.mail.ru/");
        return this;
    }

    public MainSteps openQuestionCreation() {
        driver.get("https://otvet.mail.ru/ask/");
        return this;
    }

    public MainSteps openFirstQuestion() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(page.firstQuestionLink));
        page.firstQuestionLink.click();
        return this;
    }

    public MainSteps clickLogin() {
        page.loginButton.click();
        return this;
    }

    public MainSteps searchQuestion(String request) {
        page.searchBar.sendKeys(request);
        page.searchButton.click();
        return this;
    }

    public MainSteps enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div/iframe")));
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[5]/div/iframe")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/form/div[2]/div/div[1]/div/div/div/div/div/div[1]/div/input")));
        page.username = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/form/div[2]/div/div[1]/div/div/div/div/div/div[1]/div/input"));
        page.username.sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/form/div[2]/div/div[3]/div/div[1]/button/span")).click();
        driver.switchTo().defaultContent();
        return this;
    }

    public MainSteps enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div/iframe")));
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[5]/div/iframe")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/form/div[2]/div/div[2]/div/div/div/div/div/input")));
        page.password = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/form/div[2]/div/div[2]/div/div/div/div/div/input"));
        page.password.sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div/form/div[2]/div/div[3]/div/div[1]/div/button/span")).click();
        driver.switchTo().defaultContent();
        return this;
    }

    public MainSteps checkAuthentication(String username) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"PH_user-email\"]")));
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + username + "@mail.ru')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
        return this;
    }

    public MainSteps checkMessageOnPage(String msg) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div/form/div[2]/div/div[2]/div/div/div[1]/div/div/input")));
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + msg + "')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
        return this;
    }

    public MainSteps verifyCurrentUrl(String url) {
        Assert.assertEquals(driver.getCurrentUrl(), url);
        return this;
    }

    // Utility functions
    public MainSteps loginWithCorrectCreds() {
        return this
                .clickLogin()
                .enterUsername("testinglab3")
                .enterPassword("lab.2020");
    }
}

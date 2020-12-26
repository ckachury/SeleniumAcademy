import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class registrationFacebookTest {

    public WebDriver iniciaDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @Test
    public void fullRegistrationTest() throws InterruptedException {
        WebDriver driver= iniciaDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Alan");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        Thread.sleep(3000);
        driver.findElement(By.id("u_1_4"));
        WebElement dia = driver.findElement(By.name("birthday_day"));
        Select select = new Select(dia);
        select.selectByValue("4");

        WebElement mes = driver.findElement(By.id("month"));
        Select selectmes = new Select(mes);
        selectmes.selectByVisibleText("abr");

        WebElement anio = driver.findElement(By.name("birthday_year"));
        Select selectanio = new Select(anio);
        selectanio.selectByIndex(9);
    }

    @Test
    public void birthdateTest() throws InterruptedException{
        WebDriver driver = iniciaDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.cssSelector("#password_step_input")).sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_4"));

        WebElement birthDate = driver.findElement(By.id("day"));
        Select selectDay = new Select(birthDate);
        selectDay.selectByVisibleText("26");

        WebElement birthMonth = driver.findElement(By.id("month"));
        Select selectMonth = new Select(birthMonth);
        selectMonth.selectByVisibleText("jun");

        WebElement birthYear = driver.findElement(By.id("year"));
        Select selectYear = new Select(birthYear);
        selectYear.selectByValue("1980");

    }
}

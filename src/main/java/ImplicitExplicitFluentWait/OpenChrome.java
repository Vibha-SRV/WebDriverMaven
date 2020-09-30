package ImplicitExplicitFluentWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome {

	@Test
	public void OpenChromeMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys("vibha.srv@gmail.com");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("ajjayya09*");
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_b"))).click();;
		driver.findElement(By.id("u_0_b")).click();

		// Extra line added to verify in GIT
	}

}

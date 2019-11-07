import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER PC\\eclipse-workspace\\aravindh\\Day 3 Task\\java day4\\selenium day4\\Adactin\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.adactin.com/HotelApp/ ");
	    WebElement s = driver.findElement(By.xpath("//input[@id='username']"));
	    s.sendKeys("asfAFDsf");
	    String x = s.getAttribute("value");
	    System.out.println(x);
	    WebElement z = driver.findElement(By.xpath("//input[@id='password']"));
z.sendKeys("asosdihfji");
String n = z.getAttribute("value");
System.out.println(n);
driver.quit();
	}
	
}

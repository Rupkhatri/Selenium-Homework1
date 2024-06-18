package browser_drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {

        String setProperty = System.setProperty("webdriver.edge.driver", "C:\\Software\\Driver\\msedgedriver.exe");

        WebDriver driver=new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");

        String PageTitle=driver.getTitle();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        System.out.println("Print Title is:"+PageTitle);

        driver.close();

        driver.quit();






    }
}

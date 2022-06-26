import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OpenBrowser {

    public static  void main(String[] args){
        System.out.println("hello");
        String[] arrays = new String[100];

        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        Customers customerList = new Customers();


        for(int i=0;i<customerList.customerList.size();i++){

            System.out.println(customerList.customerList.get(i));
        }

        System.out.println(absolutePath);
        System.setProperty("webdriver.chrome.driver", absolutePath+"/binary/chromedriver");

        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/webtables";
        driver.get(url);
        //WebElement clickMeBtn = driver.findElement(By.xpath("//*[text()=\"Click Me\"]"));
        //clickMeBtn.click();

        // arraylist vs array

        List<WebElement> webElementList = new ArrayList();

        webElementList = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]/div[1]"));
        for(int i=0;i<webElementList.size();i++){
            System.out.println(webElementList.get(i).getText());
        }



        //List<WebElement> parentWebElements = new ArrayList<>();
        //parentWebElements = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]"));
        System.out.println(webElementList.get(0).getAttribute("width"));
        System.out.println("test");


        int a = 10;

        if(customerList.customerList.get(0).equals(webElementList.get(0).getText())){
            System.out.println("those are equal");
        }

        /*arrayList.add("ahmet");
        arrayList.add(10);
        arrayList.remove("ahmet");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }*/


        /*for(int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }*/
        /*int first= 13;
        int sec = 4;
        double firstD = 13;
        double secD = 4;
        int sum = 45 + 55;
        System.out.println(sum);
        int division = first / sec;
        System.out.println(division);
        float divide = first / sec;
        System.out.println(divide);
        double divideOmer = first / sec;
        System.out.println(divideOmer);
        double tamSayi =  (firstD / secD);
        System.out.println(tamSayi);

        //0,1,2,3,4,5,6,7,8,9
        for (int i = 0; i < 10;i++) {

            System.out.println(i);
        }
        int index = 0;
        while (index<10){
            System.out.println(index);
            index++;
        }*/
    }
}

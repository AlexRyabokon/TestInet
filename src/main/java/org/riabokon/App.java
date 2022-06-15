package org.riabokon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App 
{
    public static void main( String[] args )
    {

       /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\leoni\\Desktop\\chrdrv\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

            driver.get("https://google.com/");

        WebElement input = driver.findElement(By.className("gNO89b"));
        input.click();
*/

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(new Key("https://vk.com/doc", 20396896));
        executorService.shutdown();





    }
}

class Key implements Runnable{

    String link;
    long id;
    static String underLine = "_";

    public Key(String link, long id) {
        this.link = link;
        this.id = id;
    }

    public static ArrayList<String> createVkLink(String link, long id){

        ArrayList<String> resultStr = new ArrayList<>();


        for (long i = 600000000l; i < 999999999l ; i++) {
            System.out.println(link + id + underLine + i);
        }



        return null;
    }


    @Override
    public void run() {
        createVkLink(link, id);
    }
}

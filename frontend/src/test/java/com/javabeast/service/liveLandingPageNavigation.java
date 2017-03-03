package com.javabeast.service;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// navigation link tests. verification that buttons are linking to correct URL.
public class liveLandingPageNavigation {

    private WebDriver driver = new ChromeDriver();

    // faq navigation - top nav bar
    @Test
    public void callFAQNav() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.linkText("FAQ")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/faq");
        driver.quit();
    }

    // features navigation - top nav bar
    @Test
    public void callFeaturesNav() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.linkText("Features")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/#features");
        driver.quit();
    }

    // pricing navigation - top nav bar
    @Test
    public void callPricingNav() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.linkText("Pricing")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/#pricing");
        driver.quit();
    }

    // buy navigation - top nav bar
    @Test
    public void callBuyNav() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.linkText("Buy")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/checkout");
        driver.quit();
    }

    // login navigation - top nav bar
    @Test
    public void callLoginNav() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.linkText("Login")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/login");
        driver.quit();
    }

    // pricing 9.99/mo buy navigation
    @Test
    public void callBuy1() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"start-now-starter\"]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/checkout?plan=monthly");
        driver.quit();
    }

    // pricing 99.99/year buy navigation
    @Test
    public void callBuy2() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"start-now-plus\"]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/checkout?plan=annual1");
        driver.quit();
    }

    // pricing 269.00/3 year buy navigation
    @Test
    public void callBuy3() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"start-now-premium\"]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/checkout?plan=annual2");
        driver.quit();
    }

    // english language dropdown
    @Test
    public void enLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[1]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=en");
        driver.quit();
    }

    // deutsch language dropdown
    @Test
    public void deLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[2]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=de");
        driver.quit();
    }

    // espanol language dropdown
    @Test
    public void esLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[3]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=es");
        driver.quit();
    }

    // italiano language dropdown
    @Test
    public void itLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[4]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=it");
        driver.quit();
    }

    // nederlands language dropdown
    @Test
    public void nlLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[5]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=nl");
        driver.quit();
    }

    // polskie language dropdown
    @Test
    public void plLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[6]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=pl");
        driver.quit();
    }

    // portugues language dropdown
    @Test
    public void ptLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[7]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=pt");
        driver.quit();
    }

    // dansk language dropdown
    @Test
    public void daLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[8]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=da");
        driver.quit();
    }

    // russian language dropdown
    @Test
    public void ruLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[9]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=ru");
        driver.quit();
    }

    // ukraine language dropdown
    @Test
    public void ukLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[10]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=uk");
        driver.quit();
    }

    // norsk language dropdown
    @Test
    public void noLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[11]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=no");
        driver.quit();
    }

    // svenska language dropdown
    @Test
    public void svLangCheck() throws InterruptedException {
        driver.get("https://bike-tracker.com/"
        );
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/div[1]/nav/div/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropdown1\"]/li[12]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://bike-tracker.com/?lang=sv");
        driver.quit();
    }

}
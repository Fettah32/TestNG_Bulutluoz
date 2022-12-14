package tests.day19_smokeTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    BrcPage brcPage;
    @Test
    public void yanlisSifre() throws InterruptedException {
        brcPage=new BrcPage();
        // Bir test method olustur positiveLoginTest()
        //		 https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //		login butonuna bas
        Thread.sleep(2000);
        brcPage.ilkLoginButonu.click();
        // test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password : 54321
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();
    }
    // bu class'da 2 test methodu daha oilusturun
    // biri yanlisKullanici
    // digeri de yanlis sifre ve kullanici adi

    @Test
    public void yanlisKullanici() {
        brcPage=new BrcPage();
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        brcPage.ilkLoginButonu.click();

        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));

        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));

        brcPage.ikinciLoginButonu.click();

        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void yanlisSifreYanlisKullaniciAdi() {
        brcPage=new BrcPage();

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        brcPage.ilkLoginButonu.click();

        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));

        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));

        brcPage.ikinciLoginButonu.click();

        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());

        Driver.closeDriver();
    }
}

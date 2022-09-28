package tests.day17_pom;

public class C00_Notlar {

    /*
        1) pages package olustur --> kullanacağimiz webelementlerin locatini ve temel methodlari class acarak buraya kaydederiz.
               -- oncelikle constructor olustururuz.
                 public amazonPage(){
            PageFactory.initElements(Driver.getDriver(),this);         }

                -- @FindBy notasyonu ile webelementlerin locatini yazariz.alt satıra isim yazilir.
                @FindBy(id="twotabsearchtextbox")
                 public WebElement aramaKutusu;


    2) tests package olustur   -- çalıştıracağımız testlerin oldugu class.
    bu classlarda kullanacağimiz elementleri pages classindan çağırmak için pages classin obje olustururuz.
    kullanacağımız elementleri obje üzerinden çağırırız.



    3) utilities package olusutr -- driver classinin olduğu package'dir.
    Driver classını olustururken normal eski kurulum kodlarini yazariz. Yanliz her çalışmada browser
    acilip kapanmasin diye if içine alarak yazariz.
    --getDriver methodu için eğer driver kapalıysa yani null'sa çalıştır deriz.
    --closeDriver methodu için eğer driver çalışıyorsa yani null değilse ,kapat deriz.
        method bitimine driver = null; koyarız çunku driveri sıfırlasın


    4) configuration.properties olusutur. --> bu sayfa icine test datalarini yazariz.
    amazonUrl=https://www.amazon.com
     */
}

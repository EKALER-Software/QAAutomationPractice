package com.ui.pages;

import com.ui.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
    public indexPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    public WebElement homeButton;

    @FindBy(xpath = "(//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement productsButton;

    @FindBy(xpath = "(//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    public WebElement cartButton;

    @FindBy(xpath = "(//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    public WebElement casesButton;

    @FindBy(xpath = "(//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[6]/a")
    public WebElement apiButton;

    @FindBy(xpath = "(//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[7]/a")
    public WebElement contactButton;


}

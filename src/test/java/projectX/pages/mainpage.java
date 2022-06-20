package projectX.pages;

import org.openqa.selenium.support.PageFactory;
import projectX.utilities.Driver;
import projectX.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpage {

    public mainpage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id = "search-icon-div")
    public WebElement searchButton;

    @FindBy(id = "cookieAcceptance")
    public WebElement accept;



}

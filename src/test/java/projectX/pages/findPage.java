package projectX.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectX.utilities.Driver;

import java.util.List;

public class findPage {
    public  findPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "search-box")
    public WebElement searchBox;

    @FindBy(xpath = "//*[text()=\"Testing & Automation\"]")
    public WebElement searchResult;

    @FindBy(xpath = "//h1[text()=\"Testing & Automation\"]")
    public WebElement pageTitle;




}

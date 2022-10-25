package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class GoogleSearchPage extends WebBase {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    protected WebElement searchInput;
    @FindBy(xpath = "(//input[@class='gNO89b'])[1]")
    protected WebElement buscarButton;

    public void writeSearch(String data) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        type(searchInput, data);
    }

    public void search() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(buscarButton));
        click(buscarButton);
    }

}
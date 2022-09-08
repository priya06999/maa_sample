package com.citizens.pagerepository;

import com.citizens.utils.GenericMethods;
import org.openqa.selenium.By;

public class LipTrailBalancePage extends GenericMethods {


    //span[contains(text(),'Excel')]
    private By excelButton=By.xpath("//span[contains(text(),'Excel')]");
    private By csvButton=By.xpath("//span[contains(text(),'CSV')]");
    public void clickOnExcelButton(){
        click(excelButton,"click on excel button");
    }
    public void clickOncsvButton(){
        click(csvButton,"click on CSV button");
    }
}

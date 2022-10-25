package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component
public class GoogleSearchStep {

    @Autowired
    private StepPages page;

    public void searchData(String data) {
        page.searchPage().writeSearch(data);
        page.searchPage().search();
    }

    public void validateResults(int count) {
        Assert.assertTrue("Resultado esperado menor o igual 0.", page.resultsPage().getSearchResults().length() > count);
    }

}

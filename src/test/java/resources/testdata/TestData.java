package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "jobData")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Test Analyst", "London", "up to 10 miles", "35000", "50000", "Per annum", "Permanent", "permanent","Test Anayst jobs in London"},
                {"QA Tester", "South London", "up to 5 miles", "40000", "60000", "Per annum", "Contract", "Contract","QA Tester jobs in South London"},
                {"QA Tester", "South London", "up to 10 miles", "40000", "60000", "Per annum", "Permanent", "Permanent","QA Tester jobs in South London"},
                {"Automation Engineer", "Manchester", "up to 10 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Engineering jobs in Manchester"},
                {"Automation Tester", "Bristol", "up to 15 miles", "400", "700", "Per day","Contract", "Contract Automation Tester jobs in Bristol"},
        };
        return data;
    }
}

package testScript;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pages.DemoPage;

public class DemoTest extends BaseClass {

    @Test
    public void userLoginSuccess() throws Exception {
        DemoPage hp = new DemoPage(driver); //Instance Page Object
        Thread.sleep(5000);

        hp.firstDemoElement();

    }
}
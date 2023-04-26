package utils;

import io.cucumber.java.After;

public class Hooks {

    @After
    public void after(){
        Driver.driver.quit();
        Driver.driver=null;
    }

}


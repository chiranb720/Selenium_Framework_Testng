package com.zapkiller.automation.testcase;

import com.zapkiller.automation.config.Hooks;
import com.zapkiller.automation.pages.HomePage;
import org.testng.annotations.Test;


public class DemoTestCase extends Hooks {


        @Test
        public void Test() throws InterruptedException {

                HomePage page = new HomePage();
                utils.navigateToUrl("http://vistacommerce-qa.rf.gd/");
                utils.clickElement(page.signInButton);
                Thread.sleep(3000);
        }






}

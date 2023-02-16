package com.itexps.bddFeb13;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-html-report","json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt" }, features = "feature", publish = true 
)


public class RunCucumberTest {

}

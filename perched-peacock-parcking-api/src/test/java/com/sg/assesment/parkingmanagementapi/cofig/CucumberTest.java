package com.sg.assesment.parkingmanagementapi.cofig;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources" , glue = {"com.sg.assesment.parkingmanagementapi.stepdef"})
public class CucumberTest {

}

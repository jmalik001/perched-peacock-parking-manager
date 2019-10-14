package com.sg.assesment.parkingmanagementapi.stepdef;

import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDef {

	

@When("^the client calls /users$")
public void the_client_calls_users() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^the client receives status code of (\\d+)$")
public void the_client_receives_status_code_of(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^the client receives (\\d+) users$")
public void the_client_receives_users(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}



}

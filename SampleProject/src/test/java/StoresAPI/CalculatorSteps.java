package StoresAPI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps
{

    @Given("I have a calculator")
     public void  I_have_a_calculator()
    {

        System.out.println("Addition of two numbers");
        throw new io.cucumber.java.PendingException();
    }

    @When("I add {int} and {int}")
    public void  I_add_and(int num1, int num2)
    {

        System.out.println("Subtraction of two numbers");
        throw new io.cucumber.java.PendingException();
    }

    @When("I subtract {int} from {int}")
    public void I_subtract_from(int num1, int num2)
    {
        int result = Calculator.subtract(num1, num2);
        throw new io.cucumber.java.PendingException();
    }


    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult)
    {
        int result = 0;
        assert result == expectedResult : "Actual result: " + result + ", Expected result: " + expectedResult;
        throw new io.cucumber.java.PendingException();
    }
}
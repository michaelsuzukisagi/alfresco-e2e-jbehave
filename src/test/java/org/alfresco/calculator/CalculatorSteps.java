/*
 * Copyright (C) 2005-2014 Alfresco Software Limited.
 * This file is part of Alfresco
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.calculator;

import org.junit.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Steps that maps {@linkCalculatorStories} behavior to executable code.
 * @author Michael Suzuki
 * @since 1.0
 */
public class CalculatorSteps
{
    private Calculator calculator;
    private int value;

    @Given("a calculator")
    public void givenACalculator()
    {
        calculator = new Calculator();
    }

    @When("I add <number1> and <number2>")
    public void whenIAddNumber1AndNumber2(@Named("number1")int number1, @Named("number2")int number2)
    {
        value = calculator.addition(number1, number2);
    }

    @Then("the outcome should <result>")
    public void thenTheOutcomeShould(@Named("result")int result)
    {
        System.out.println("================");
        System.out.println("======restult :" + result);
        System.out.println("======value :" + value);
        Assert.assertEquals(result, value);
    }
  }

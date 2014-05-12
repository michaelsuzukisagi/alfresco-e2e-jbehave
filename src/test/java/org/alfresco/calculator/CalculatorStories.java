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

import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.TXT;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

/**
 * Simple calculator story that maps steps with calculator
 * story specification.
 * 
 * @author Michael Suzuki
 * @since 1.0
 */
public class CalculatorStories extends JUnitStory
{
    @Override
    public Configuration configuration()
    {
        return super.configuration()
                .useStoryReporterBuilder(new StoryReporterBuilder()
                .withDefaultFormats()
                .withFormats(CONSOLE, TXT));
    }
    //Specify the step classes
    @Override
    public InjectableStepsFactory stepsFactory()
    {
        return new InstanceStepsFactory(configuration(), new CalculatorSteps());
    }
}

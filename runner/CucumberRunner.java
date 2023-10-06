package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features= {"src/test/java/features/"},glue={"steps"},monochrome=true,publish=true,
tags="@Smoke"
//tags="not @Smoke"
//tags="@Smoke or @Functional"
//tags="@Smoke and @Regression"
)
public class CucumberRunner extends BaseClass{

}

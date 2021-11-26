package br.com.keeggo.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		tags= "@02",
		glue = "br.com.keeggo.steps"
		)

public class RunnerTest {	
	
}


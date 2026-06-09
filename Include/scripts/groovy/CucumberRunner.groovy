import org.junit.runner.RunWith

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "Include/features",
	glue = "",
	plugin = [
		"pretty",
		"html:BDDReports/HTML",
		"json:BDDReports/JSON/report.json"
	]
)
class CucumberRunner {
}
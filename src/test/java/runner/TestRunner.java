package runner.web;


@cucumberoptions(
    features = "src/test/resources/features",
    glue= {"stepDefinitions"},
    plugin={"pretty"},
    tags="test"
)

public class TestRunner extends AbstractTestNGCucumbrrTests{
    
}


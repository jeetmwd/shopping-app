package anncode.solution.cucumber;

import anncode.solution.ShoppingappApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ShoppingappApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

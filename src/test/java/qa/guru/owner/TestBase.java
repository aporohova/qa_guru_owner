package qa.guru.owner;


import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import qa.guru.owner.config.WebDriverConfig;


public class TestBase {
    @BeforeAll
    static void settingRunParameters() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();

        if(config.isRemote()) {
            Configuration.remote = config.getRemoteUrl();
        }

    }
}

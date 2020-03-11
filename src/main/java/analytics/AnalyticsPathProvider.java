package analytics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springfox.documentation.spring.web.paths.AbstractPathProvider;

@Component
public class AnalyticsPathProvider extends AbstractPathProvider {

    @Value("${swagger.application.path}")
    private String applicationPath;

    @Value("${swagger.documentation.path}")
    private String documentationPath;

    @Override
    protected String applicationPath() {
        return applicationPath;
    }

    @Override
    protected String getDocumentationPath() {
        return documentationPath;
    }
}

package guru.qa.allure.notifications.template.data;

import guru.qa.allure.notifications.config.base.Base;
import guru.qa.allure.notifications.config.base.CustomString;
import guru.qa.allure.notifications.formatters.Formatters;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kadehar
 * @since 4.0
 * Utility class for mapping build data for template.
 */
@Slf4j
public class BuildData implements TemplateData {
    private final Base base;

    public BuildData(Base base) {
        this.base = base;
    }

    @Override
    public Map<String, Object> map() {
        log.info("Collecting build data for template");
        Map<String, Object> info = new HashMap<>();
        info.put("env", base.getEnvironment());
        info.put("reportLink", Formatters.formatReportLink(base.getReportLink()));
        Map<String, String> customStrings = processCustomStrings();
        info.put("customStrings", customStrings);

        log.info("Build data: {}", info);
        return info;
    }

    private Map<String, String> processCustomStrings() {
        Map<String, String> customStrings = new HashMap<>();
        if (base.getCustomStrings() != null) {
            for (CustomString customString : base.getCustomStrings()) {
                customStrings.put(customString.getKey(), customString.getValue());
                log.info("Custom string added: key={}, value={}", customString.getKey(), customString.getValue());
            }
        }
        return customStrings;
    }
}



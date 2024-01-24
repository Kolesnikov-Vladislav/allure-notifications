package guru.qa.allure.notifications.model.phrases;

import com.google.gson.annotations.SerializedName;
import guru.qa.allure.notifications.config.base.CustomString;
import lombok.Getter;

import java.util.List;

/**
 * @author kadehar
 * @since 4.0
 * Model class, representing template phrases.
 */
@Getter
public class Phrases {
    @SerializedName("results")
    private String results;
    @SerializedName("environment")
    private String environment;
    @SerializedName("customStrings")
    private List<CustomString> customStrings;
    @SerializedName("comment")
    private String comment;
    @SerializedName("reportAvailableAtLink")
    private String reportAvailableAtLink;
    @SerializedName("scenario")
    private Scenario scenario;
}
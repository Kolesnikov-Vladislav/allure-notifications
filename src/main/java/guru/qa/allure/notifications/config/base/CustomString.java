package guru.qa.allure.notifications.config.base;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CustomString {
    @SerializedName("key")
    private String key;
    @SerializedName("value")
    private String value;
}
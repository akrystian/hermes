package pl.allegro.tech.hermes.management.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "group")
public class GroupProperties {

    private boolean nonAdminCreationEnabled = false;

    private String allowedGroupName =  "[a-zA-Z0-9_.]+";

    public boolean isNonAdminCreationEnabled() {
        return nonAdminCreationEnabled;
    }

    public void setNonAdminCreationEnabled(boolean nonAdminCreationEnabled) {
        this.nonAdminCreationEnabled = nonAdminCreationEnabled;
    }

    public String getAllowedGroupName() {
        return allowedGroupName;
    }

    public void setAllowedGroupName(String allowedGroupName) {
        this.allowedGroupName = allowedGroupName;
    }
}

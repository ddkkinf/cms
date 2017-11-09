package dev.argent.cms.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
@Validated
@ConfigurationProperties("application")
public class ApplicationSetting {
    @NotNull
    private String deployPhase;
}

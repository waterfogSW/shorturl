package com.waterfogsw.shorturl.common.config

import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationPropertiesScan
@EnableConfigurationProperties(AppProperties::class)
class AppConfig

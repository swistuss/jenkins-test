package com.jenkins.example.jenkins_expl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
class ApplicationController {

    @Value("${application.name}")
    private String appName;
    @Value("${application.version}")
    private String appVersion;


    @GetMapping("/data")
    AppDto getAppData() {
        return new AppDto(appName, appVersion);
    }

}

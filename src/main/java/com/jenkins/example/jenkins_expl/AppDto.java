package com.jenkins.example.jenkins_expl;

public class AppDto {

    private String name;
    private String version;

    public AppDto(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }
}

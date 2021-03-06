package com.example.davidebelvedere.testbackend;

public class DeviceOutput {
    private String rom;
    private String screenSize;
    private String backCamera;
    private String companyName;
    private String name;
    private String frontCamera;
    private String battery;
    private String operatingSystem;
    private String processor;
    private String url;
    private String ram;

    public DeviceOutput(String rom, String screenSize, String backCamera, String companyName, String name, String frontCamera, String battery, String operatingSystem, String processor, String url, String ram) {
        this.rom = rom;
        this.screenSize = screenSize;
        this.backCamera = backCamera;
        this.companyName = companyName;
        this.name = name;
        this.frontCamera = frontCamera;
        this.battery = battery;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.url = url;
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBackCamera() {
        return backCamera;
    }

    public void setBackCamera(String backCamera) {
        this.backCamera = backCamera;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "DeviceOutput{" +
                "rom='" + rom + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", backCamera='" + backCamera + '\'' +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", frontCamera='" + frontCamera + '\'' +
                ", battery='" + battery + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", processor='" + processor + '\'' +
                ", url='" + url + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}

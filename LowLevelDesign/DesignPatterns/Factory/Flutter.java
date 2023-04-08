package com.collection.LowLevelDesign.designPattern.Factory;

public class Flutter {
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme() {
        System.out.println("setting a theme for the app");
    }

    public void setRefreshRate(){
        System.out.println("setting refresh rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
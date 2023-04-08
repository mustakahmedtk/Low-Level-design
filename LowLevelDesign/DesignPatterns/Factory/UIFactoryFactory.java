package com.collection.LowLevelDesign.designPattern.Factory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform supportedPlatform){
        if(supportedPlatform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(supportedPlatform.equals(SupportedPlatform.IOS)){
            return new IosUIFactory();
        }
        else if(supportedPlatform.equals(SupportedPlatform.WINDOWS)){
            return new WindowsUIFactory();
        }else{
            return null;
        }
    }

}

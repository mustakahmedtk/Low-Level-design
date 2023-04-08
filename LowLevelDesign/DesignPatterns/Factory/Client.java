package com.collection.LowLevelDesign.designPattern.Factory;

import com.collection.LowLevelDesign.designPattern.Factory.Components.Button.Button;
import com.collection.LowLevelDesign.designPattern.Factory.Components.DropDown.DropDown;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter =  new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button  = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
    }
}

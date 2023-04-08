package com.collection.LowLevelDesign.designPattern.Factory;

import com.collection.LowLevelDesign.designPattern.Factory.Components.Button.Button;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Button.IosButton;
import com.collection.LowLevelDesign.designPattern.Factory.Components.DropDown.DropDown;
import com.collection.LowLevelDesign.designPattern.Factory.Components.DropDown.IosDropDown;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Menu.IosMenu;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
         return new IosDropDown();
    }
}

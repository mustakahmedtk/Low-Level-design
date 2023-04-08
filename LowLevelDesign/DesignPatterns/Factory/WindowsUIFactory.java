package com.collection.LowLevelDesign.designPattern.Factory;

import com.collection.LowLevelDesign.designPattern.Factory.Components.Button.Button;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Button.WindowsButton;
import com.collection.LowLevelDesign.designPattern.Factory.Components.DropDown.DropDown;
import com.collection.LowLevelDesign.designPattern.Factory.Components.DropDown.WindowsDropDown;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Menu.Menu;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}

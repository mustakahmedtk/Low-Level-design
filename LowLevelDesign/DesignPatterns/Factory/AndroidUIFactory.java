package com.collection.LowLevelDesign.designPattern.Factory;

import com.collection.LowLevelDesign.designPattern.Factory.Components.Button.AndroidButton;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Button.Button;
import com.collection.LowLevelDesign.designPattern.Factory.Components.DropDown.AndroidDropDown;
import com.collection.LowLevelDesign.designPattern.Factory.Components.DropDown.DropDown;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Menu.AndroidMenu;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}

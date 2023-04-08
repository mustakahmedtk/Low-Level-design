package com.collection.LowLevelDesign.designPattern.Factory;

import com.collection.LowLevelDesign.designPattern.Factory.Components.Button.Button;
import com.collection.LowLevelDesign.designPattern.Factory.Components.DropDown.DropDown;
import com.collection.LowLevelDesign.designPattern.Factory.Components.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();

}

package src.cherrymx;

import src.*;

public class CherryMXBrand extends SwitchMaker {

    SwitchComponentFactory CherryMxBrandComponentFactory = new CherryMXBrandFactory();
    Switch switchh;
    protected Switch createSwitch(String type){
        if(type == "linear"){
            switchh = new Linear(CherryMxBrandComponentFactory);
        }
        else if(type == "tactile"){
            switchh = new Tactile(CherryMxBrandComponentFactory);
        }else if(type == "clicky"){
            switchh = new Clicky(CherryMxBrandComponentFactory);
        }
        return switchh;
    }

    @Override
    public Switch assembleSwitch(String type) {
        Switch s = createSwitch(type);
        s.gatherParts();
        s.placeCoilSpring();
        s.placeStem();
        s.placeKeyCap();
        return s;
    }
}

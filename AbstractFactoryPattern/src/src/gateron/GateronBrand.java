package src.gateron;

import src.*;

public class GateronBrand extends SwitchMaker {
    protected Switch createSwitch(String type){
        Switch switchh = null;
        SwitchComponentFactory GateronBrandComponentFactory = new GateronBrandFactory();
        if(type == "linear"){
            switchh = new Linear(GateronBrandComponentFactory);
        }
        else if(type == "tactile"){
            switchh = new Linear(GateronBrandComponentFactory);
        }else if(type == "clicky"){
            switchh = new Linear(GateronBrandComponentFactory);
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

package com.kivattt.creativeonjoin;

import com.fox2code.foxloader.event.FoxLoaderEvents;
import com.fox2code.foxloader.launcher.FoxLauncher;
import com.fox2code.foxloader.loader.Mod;

public class CreativeOnJoin extends Mod {
    @Override
    public void onPreInit() {
        if (FoxLauncher.isServer()) {
            FoxLoaderEvents.INSTANCE.registerEvents(new Events());
        }
    }
}

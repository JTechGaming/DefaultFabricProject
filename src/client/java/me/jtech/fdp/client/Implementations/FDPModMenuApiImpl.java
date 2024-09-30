package me.jtech.fdp.client.Implementations;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import eu.midnightdust.lib.config.MidnightConfig;

public class FDPModMenuApiImpl implements ModMenuApi{
    // You can do whatever you want with this implementation, but at least it is there to begin with :)
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> MidnightConfig.getScreen(parent, "fdp");
    }

}

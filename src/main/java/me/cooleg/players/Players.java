package me.cooleg.players;

import org.bukkit.plugin.java.JavaPlugin;

public final class Players extends JavaPlugin {

    @Override
    public void onEnable() {
        new Placeholder().register();
    }

}

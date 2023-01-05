package me.cooleg.players;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Placeholder extends PlaceholderExpansion {


    @Override
    public @NotNull String getIdentifier() {
        return "multipleplayers";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Cooleg";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public @Nullable String onRequest(OfflinePlayer player, @NotNull String params) {
        return (Bukkit.getOnlinePlayers().size() == 1) ? "" : "s";
    }
}

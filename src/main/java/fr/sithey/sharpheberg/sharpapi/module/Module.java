package fr.sithey.sharpheberg.sharpapi.module;

public interface Module {

    void onEnable();

    void onDisable();

    String getName();
}

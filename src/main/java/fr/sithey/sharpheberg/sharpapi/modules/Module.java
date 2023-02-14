package fr.sithey.sharpheberg.sharpapi.modules;

public interface Module {

    void onEnable();

    void onDisable();

    String getName();
}

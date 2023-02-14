package fr.sithey.sharpheberg.sharpapi.modules;

public interface ModuleManager {

    <T extends Module> T getModule(Class<T> userClass);

}

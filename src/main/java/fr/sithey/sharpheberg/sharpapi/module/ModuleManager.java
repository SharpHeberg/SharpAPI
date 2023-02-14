package fr.sithey.sharpheberg.sharpapi.module;

public interface ModuleManager {

    <T extends Module> T getModule(Class<T> userClass);

}

package fr.sithey.sharpheberg.sharpapi;

import fr.sithey.sharpheberg.sharpapi.database.DatabaseManager;
import fr.sithey.sharpheberg.sharpapi.module.ModuleManager;
import fr.sithey.sharpheberg.sharpapi.user.UserManager;

public class SharpAPI {

    private static SharpAPI instance;

    public static SharpAPI getInstance() {
        return instance;
    }

    private final UserManager userManager;
    private final ModuleManager moduleManager;
    private final DatabaseManager databaseManager;
    private final String name;
    public SharpAPI(UserManager userManager, ModuleManager moduleManager, DatabaseManager databaseManager, String name) {
        instance = this;

        this.userManager = userManager;
        this.moduleManager = moduleManager;
        this.databaseManager = databaseManager;
        this.name = name;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public String getName() {
        return name;
    }
}

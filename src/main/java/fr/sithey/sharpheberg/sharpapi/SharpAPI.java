package fr.sithey.sharpheberg.sharpapi;

import fr.sithey.sharpheberg.sharpapi.database.DatabaseManager;
import fr.sithey.sharpheberg.sharpapi.module.ModuleManager;
import fr.sithey.sharpheberg.sharpapi.user.UserManager;

public record SharpAPI(UserManager userManager, ModuleManager moduleManager, DatabaseManager databaseManager) {

    private static SharpAPI instance;

    public static SharpAPI getInstance() {
        return instance;
    }

    public SharpAPI {
        instance = this;
    }
}

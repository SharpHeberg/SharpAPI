package fr.sithey.sharpheberg.sharpapi.database;

public interface DatabaseManager {

    MongoDB getMongoDB();

    Redis getRedis();

}

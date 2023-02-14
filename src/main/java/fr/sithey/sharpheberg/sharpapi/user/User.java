package fr.sithey.sharpheberg.sharpapi.user;

import org.bson.Document;

import java.util.UUID;

public interface User {

    UUID getUniqueId();

    String getName();

    Document getDocument();

    void updateUser();
}

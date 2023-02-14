package fr.sithey.sharpheberg.sharpapi.database;

import org.bson.Document;

import java.util.List;
import java.util.Optional;

public interface Redis {

    List<Document> getDocuments(String database);

    List<Document> getDocuments(String database, String key);

    Optional<Document> getDocument(String database);

    Optional<Document> getDocument(String database, String key);

    void insertOrUpdates(String database, Document... document);

    void insertOrUpdate(String database, String key, Document... document);

    void insertOrUpdate(String database, Document document);

    void insertOrUpdate(String database, Document document, String key);

    void clear(String database);

    void remove(String database, String key);
}

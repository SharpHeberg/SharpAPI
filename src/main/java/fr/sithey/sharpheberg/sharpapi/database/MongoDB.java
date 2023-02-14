package fr.sithey.sharpheberg.sharpapi.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;
import java.util.Optional;

public interface MongoDB {

    MongoClient getClient();

    MongoDatabase getDatabase();

    List<Document> getDocuments(MongoCollection collection);

    List<Document> getDocuments(MongoCollection collection, String key);

    List<Document> getDocuments(MongoCollection collection, String key, Object value);

    Optional<Document> getDocument(MongoCollection collection);

    Optional<Document> getDocument(MongoCollection collection, String key);

    Optional<Document> getDocument(MongoCollection collection, String key, Object value);

    void insertOrUpdate(MongoCollection collection, Document document);

    void insertOrUpdate(MongoCollection collection, Document document, String key);

    void insertOrUpdate(MongoCollection collection, Document document, String key, Object value);

    void insert(MongoCollection collection, Document document);

    void update(MongoCollection collection, Document document, String key, Object value);

    void update(MongoCollection collection, Document document);

    void clear(MongoCollection collection);

    void remove(MongoCollection collection,String key);

    void remove(MongoCollection collection, String key, Object value);

}

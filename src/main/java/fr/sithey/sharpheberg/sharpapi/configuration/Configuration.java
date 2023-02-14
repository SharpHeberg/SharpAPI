package fr.sithey.sharpheberg.sharpapi.configuration;

public interface Configuration {

    String getName();

    Object addValue(String path, Object value);

    Object setValue(String path, Object value);

    Object getValue(String path);

}

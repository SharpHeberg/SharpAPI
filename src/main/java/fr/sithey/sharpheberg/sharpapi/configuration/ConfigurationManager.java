package fr.sithey.sharpheberg.sharpapi.configuration;

public interface ConfigurationManager {

    Configuration loadConfiguration(String file_name);

    Configuration getConfiguration(String file_name);

}

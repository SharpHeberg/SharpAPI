package fr.sithey.sharpheberg.sharpapi.user;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserManager {

    <T extends User> Optional<T> getUser(Class<T> userClass, UUID uniqueId);

    <T extends User> Optional<T> getUser(Class<T> userClass, String name);

    default Optional<User> getUser(UUID uuid){
        return getUser(User.class, uuid);
    }

    default Optional<User> getUser(String name){
        return getUser(User.class, name);
    }

    List<User> getRegisteredUsers();

    List<User> getOnlineUsers();

    List<User> getEnvironmentUsers();
}

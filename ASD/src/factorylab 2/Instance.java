package practice.factorylab;


//Represents an abstract product
public interface Instance {
    void activate();
    void attacheStorage(Storage storage);
    void attachMessageing( Messaging messaging);
    void endSubscription();
}

package practice.factorylab;

public interface CloudResourceFactory {
    Instance createInstance(Subscription subscription );
    Storage attachStorage(int size);
    Messaging attachMessageing();

}

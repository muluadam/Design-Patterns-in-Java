package practice.factorylabUM;

public class AzureResourceFactory implements CloudResourceFactory {
    @Override
    public Instance createInstance(Subscription subscription) {
        return new AzureInstance(subscription);
    }

    @Override
    public Storage attachStorage(int size) {
        return new AzureCloud(size);
    }

    @Override
    public Messaging attachMessageing() {
        return new MSExchange();
    }
}

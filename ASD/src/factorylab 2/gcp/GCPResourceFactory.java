package practice.factorylab.gcp;

import practice.factorylab.*;
import practice.factorylab.azure.AzureInstance;

public class GCPResourceFactory implements CloudResourceFactory {
    @Override
    public Instance createInstance(Subscription subscription) {
        return new AzureInstance(subscription);
    }

    @Override
    public Storage attachStorage(int size) {
        return new GCPStorage(size);
    }

    @Override
    public Messaging attachMessageing() {
        return new GSute();
    }
}

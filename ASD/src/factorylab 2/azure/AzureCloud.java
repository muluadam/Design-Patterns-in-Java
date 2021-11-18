package practice.factorylab.azure;


import practice.factorylab.Storage;
import practice.factorylab.Subscription;

public class AzureCloud implements Storage {
    private  int size;
    public AzureCloud(int storageSize) {
        this.size=storageSize;
    }

    @Override
    public String toString() {
        return "AzureCloud Storage";
    }
}

package practice.factorylabUM;


import practice.factorylabUM.Storage;

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

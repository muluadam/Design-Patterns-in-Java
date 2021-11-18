package practice.factorylab.gcp;

import practice.factorylab.Storage;

public class GCPStorage implements Storage {
    private  int size;
    public GCPStorage(int storageSize) {
        this.size=storageSize;
    }
    @Override
    public String toString() {
        return "GCP Storage";
    }
}

package practice.factorylabUM;

import practice.factorylabUM.Storage;

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

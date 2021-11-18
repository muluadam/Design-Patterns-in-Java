package practice.factorylabUM;

import practice.factorylabUM.Storage;

public class S3Storage implements Storage {
    private  int size;
    public S3Storage(int storageSize) {
        this.size=storageSize;
    }
    @Override
    public String toString() {
        return "S3 Storage with "+size+ "Mb";
    }
}

package practice.factorylabUM;

public class AwsResourceFactory implements CloudResourceFactory {


    @Override
    public Instance createInstance(Subscription subscription) {
        return new Ec2Instance(subscription);
    }

    @Override
    public Storage attachStorage(int size) {
        return new S3Storage(size);
    }

    @Override
    public Messaging attachMessageing() {
        return new AmazonSeS();
    }
}

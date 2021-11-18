package practice.abstractfactory.aws;

import practice.abstractfactory.Instance;
import practice.abstractfactory.ResourceFactory;
import practice.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {

        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {

        return new S3Storage(capMib);
    }
}

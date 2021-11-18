package practice.factorylab;

import practice.factorylab.aws.AmazonSeS;
import practice.factorylab.aws.AwsResourceFactory;
import practice.factorylab.aws.S3Storage;
import practice.factorylab.azure.AzureCloud;
import practice.factorylab.azure.AzureResourceFactory;
import practice.factorylab.azure.MSExchange;
import practice.factorylab.gcp.GCPResourceFactory;
import practice.factorylab.gcp.GCPStorage;
import practice.factorylab.gcp.GSute;

public class Client {
    private CloudResourceFactory factory;
    public Client(CloudResourceFactory factory){
        this.factory=factory;
    }
    public CloudResourceFactory getFactory(){
        return factory;
    }

    public static void main(String[] args) {
        System.out.println("**************************** AWS");

        Client awsclient = new Client(new AwsResourceFactory());
        Instance instance= awsclient.factory.createInstance(Subscription.PayAsYouGo);

        Storage storage=awsclient.factory.attachStorage(1024*100);
        instance.activate();
        instance.attachMessageing(new AmazonSeS());
        instance.attacheStorage(new S3Storage(1024*100));
        instance.endSubscription();
        System.out.println("**************************** Azure");

        Client azureClient=new Client(new AzureResourceFactory());

        Instance instance1= azureClient.factory.createInstance(Subscription.PayAsYouGo);
instance1.activate();
instance1.attachMessageing(new MSExchange());
instance1.attacheStorage(new AzureCloud(100));;
        instance1.endSubscription();
        System.out.println("**************************** GCP");
        Client gcp= new Client(new GCPResourceFactory());
        Instance gcpInstance=gcp.factory.createInstance(Subscription.FreeTrial);
        gcpInstance.activate();
        gcpInstance.attacheStorage(new GCPStorage(1024*100));
        gcpInstance.attachMessageing(new GSute());
        gcpInstance.endSubscription();


    }
}

package practice.factorylab.aws;

import practice.factorylab.Instance;
import practice.factorylab.Messaging;
import practice.factorylab.Storage;
import practice.factorylab.Subscription;

public class Ec2Instance implements Instance {
    private Subscription subscription;
    public Ec2Instance(Subscription subscription) {
        this.subscription=subscription;
    }

    @Override
    public void activate() {
        System.out.println("AWS new Instance is activated with "+this.subscription+" Subscription ");
    }

    @Override
    public void attacheStorage(Storage storage) {
        System.out.println("Storage "+storage +" is attached to your account");
    }

    @Override
    public void attachMessageing(Messaging messaging) {
        System.out.println("Mail Messaging "+messaging +" is attached to your account");

    }

    @Override
    public void endSubscription() {
        System.out.println("AWS subscription is terminated");
    }
}

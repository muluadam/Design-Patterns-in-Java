package practice.factorylabUM;

import practice.factorylabUM.Instance;
import practice.factorylabUM.Messaging;
import practice.factorylabUM.Storage;
import practice.factorylabUM.Subscription;

public class GCPInstance implements Instance {

    private Subscription subscription;
    public GCPInstance(Subscription subscription) {
        this.subscription=subscription;
    }

    @Override
    public void activate() {
        System.out.println("GCP new Instance  is activated with "+this.subscription+" Subscription ");
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
        System.out.println("GCP subscription is terminated");
    }
}
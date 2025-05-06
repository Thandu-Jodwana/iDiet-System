public class SubscriptionService {
    private final SubscriptionRepository subRepo;

    public SubscriptionService(SubscriptionRepository subRepo) {
        this.subRepo = subRepo;
    }

    public Subscription activate(Subscription sub) {
        if (subRepo.findActiveByUserId(sub.getUserId()).isPresent()) {
            throw new IllegalStateException("User already has an active subscription");
        }
        sub.setStatus("ACTIVE");
        return subRepo.save(sub);
    }

    public void cancel(String subId) {
        Subscription sub = subRepo.findById(subId)
                .orElseThrow(() -> new RuntimeException("Subscription not found"));
        sub.setStatus("CANCELED");
        subRepo.save(sub);
    }
}

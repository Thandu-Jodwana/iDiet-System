public class MealPlanService {
    private final MealPlanRepository mealPlanRepo;

    public MealPlanService(MealPlanRepository mealPlanRepo) {
        this.mealPlanRepo = mealPlanRepo;
    }

    public MealPlan createPlan(MealPlan plan) {
        // Only one active meal plan at a time
        if ("ACTIVE".equals(plan.getStatus()) && 
            mealPlanRepo.countActiveByUserId(plan.getUserId()) > 0) {
            throw new IllegalStateException("User already has an active meal plan.");
        }
        return mealPlanRepo.save(plan);
    }
}

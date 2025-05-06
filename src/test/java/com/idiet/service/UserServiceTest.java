@Test
void shouldNotAllowMultipleActivePlans() {
    MealPlan activePlan = new MealPlan("ACTIVE", userId);
    when(mealPlanRepo.countActiveByUserId(userId)).thenReturn(1);

    assertThrows(IllegalStateException.class, () -> {
        mealPlanService.createPlan(activePlan);
    });
}

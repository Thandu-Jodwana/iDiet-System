  Person(User, "User", "Interacts with the dietary system to track meals and nutrition.")
    System(DietarySystem, "iDietary System", "Helps people manage their diet.")
    ExternalSystem(FoodAPI, "Food Database", "Provides nutritional information for food items.")
    
    User --> DietarySystem : "Logs meals, views nutrition"
    DietarySystem --> FoodAPI : "Fetches food data"

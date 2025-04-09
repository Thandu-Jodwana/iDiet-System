
## Task 2: Class Diagram (30 Marks)

```mermaid
classDiagram
    class User {
        +String userId
        +String name
        +String email
        +String password
        +String role
        +register()
        +login()
        +updateProfile()
    }

    class MealPlan {
        +String planId
        +String title
        +int calorieLimit
        +String status
        +Date createdDate
        +createPlan()
        +updatePlan()
        +submitForApproval()
    }

    class Recipe {
        +String recipeId
        +String name
        +String ingredients
        +String instructions
        +Boolean approved
        +submitRecipe()
        +editRecipe()
        +approveRecipe()
    }

    class Subscription {
        +String subId
        +String planType
        +String status
        +Date startDate
        +Date endDate
        +activate()
        +cancel()
        +renew()
    }

    class Order {
        +String orderId
        +String status
        +Date orderDate
        +placeOrder()
        +cancelOrder()
        +trackOrder()
    }

    class ProgressLog {
        +String logId
        +Date date
        +int caloriesConsumed
        +float weight
        +Boolean goalAchieved
        +addEntry()
        +updateEntry()
        +checkProgress()
    }

    class SupportTicket {
        +String ticketId
        +String subject
        +String description
        +String status
        +Date dateSubmitted
        +String resolutionNote
        +openTicket()
        +updateStatus()
        +addResolution()
    }

    User --> MealPlan : creates
    User --> Subscription : has
    User --> Order : places
    User --> ProgressLog : tracks
    User --> SupportTicket : submits
    MealPlan --> Recipe : includes
    Order --> MealPlan : for
```

### Explanation:
This class diagram captures the core structure of the iDiet system and its relationships:
- The **User** entity is central, connected to MealPlans, Orders, Subscriptions, SupportTickets, and ProgressLogs.
- A **MealPlan** can contain multiple **Recipes**, which must be approved before inclusion.
- Each **Order** is placed by a User for a MealPlan.
- Subscriptions and logs ensure service control and health tracking.
- SupportTickets help manage user support within the system.

Each class includes both attributes and key behavioral methods, aligning with domain logic and Agile requirements.

Let me know when you’d like to proceed to Task 3: System Sequence Diagram (SSD).

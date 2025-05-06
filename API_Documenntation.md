## Task 3: Ensure Alignment (10 Marks)

### 🔁 Mapping REST API Endpoints to Project Artifacts

| **Endpoint**                          | **Use Case / Requirement**           | **Service Method**                   | **Diagram Alignment**                     |
| ------------------------------------- | ------------------------------------ | ------------------------------------ | ----------------------------------------- |
| POST /api/users/register              | UC-001: Register User / FR-001       | UserService.register()               | State: User lifecycle; Activity: Register |
| GET /api/users/{id}                   | UC-002: View Profile / FR-001        | UserService.getUserById()            | State: User Active/Deleted                |
| POST /api/mealplans                   | UC-003: Create Meal Plan / FR-002    | MealPlanService.createPlan()         | Activity: Create Meal Plan                |
| POST /api/orders                      | UC-004: Place Order / FR-005         | OrderService.placeOrder()            | State: Order Placed → Confirmed           |
| PUT /api/orders/{id}/cancel           | UC-005: Cancel Order / FR-005        | OrderService.cancelOrder()           | State: Order Confirmed → Canceled         |
| POST /api/subscriptions               | UC-006: Subscribe / FR-004           | SubscriptionService.activate()       | State: Subscription Active                |
| PUT /api/subscriptions/{id}/cancel    | UC-007: Cancel Subscription / FR-004 | SubscriptionService.cancel()         | State: Subscription Canceled              |
| POST /api/support-tickets             | UC-008: Submit Ticket / FR-009       | SupportTicketService.submitTicket()  | State: Ticket Open                        |
| PUT /api/support-tickets/{id}/resolve | UC-009: Resolve Ticket / FR-009      | SupportTicketService.resolveTicket() | State: Ticket Resolved                    |

### ✅ Explanation

These RESTful API endpoints are directly derived from the functional requirements in Assignment 4, user stories and sprint tasks in Assignment 6, and object and activity diagrams in Assignment 8. This ensures strong traceability and alignment across the development process.


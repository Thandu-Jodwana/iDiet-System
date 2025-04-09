
# Task 1: Domain Model

## Key Domain Entities for iDiet System:


| **Entity**        | **Attributes**                                                                 | **Methods**                                                              | **Relationships**                                                                                  | **Business Rules**                                                                 |
|-------------------|--------------------------------------------------------------------------------|---------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| **User**          | userId, name, email, password, role                                            | register(), login(), updateProfile()                                     | A User can create MealPlans, place Orders, and submit SupportTickets                                 | A user must be registered to access premium features                              |
| **MealPlan**      | planId, title, calorieLimit, status, createdDate                               | createPlan(), updatePlan(), submitForApproval()                          | A MealPlan is created by a User and may include multiple Recipes                                     | A user can have multiple MealPlans, but only one Active at a time                 |
| **Recipe**        | recipeId, name, ingredients, instructions, approved                            | submitRecipe(), editRecipe(), approveRecipe()                            | A Recipe can be part of multiple MealPlans                                                           | Only approved recipes can be included in MealPlans                                |
| **Subscription**  | subId, userId, planType, status, startDate, endDate                            | activate(), cancel(), renew()                                            | A Subscription is linked to a User                                                                   | Only one active Subscription allowed per User                                     |
| **Order**         | orderId, userId, mealPlanId, status, orderDate                                 | placeOrder(), cancelOrder(), trackOrder()                                | An Order is placed by a User and is associated with one MealPlan                                     | Orders must be placed only for approved MealPlans                                 |
| **ProgressLog**   | logId, userId, date, caloriesConsumed, weight, goalAchieved                    | addEntry(), updateEntry(), checkProgress()                               | A User can have multiple ProgressLogs                                                                | Logs are used to monitor goal progression                                          |
| **SupportTicket** | ticketId, userId, subject, description, status, dateSubmitted, resolutionNote | openTicket(), updateStatus(), addResolution()                            | A SupportTicket is raised by a User                                                                  | All resolved tickets must include a resolution note                               |

## Summary
This domain model captures the essential data and functional structure of the iDiet system. It identifies core objects, their properties, actions, and rules that govern the business logic. These entities lay the foundation for the system’s class diagram, sequence modeling, and later implementation phases.


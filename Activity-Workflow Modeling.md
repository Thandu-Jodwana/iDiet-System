
# Activity Workflow Modeling for iDiet System

## 1. User Registration
```mermaid
flowchart TD
    UserStart([Start]) --> InputDetails["Enter Personal Details"]
    InputDetails --> Validate["System Validates Details"]
    Validate -->|Valid| CreateAccount["System Creates Account"]
    Validate -->|Invalid| ErrorPrompt["Show Error Message"]
    ErrorPrompt --> InputDetails
    CreateAccount --> Confirmation["Send Confirmation Email"]
    Confirmation --> UserEnd([End])
```
**Explanation:** This workflow addresses stakeholder concerns regarding data integrity and user experience by ensuring input validation and feedback during account creation.

## 2. Meal Plan Creation
```mermaid
flowchart TD
    Start([Start]) --> CreatePlan["User Drafts Meal Plan"]
    CreatePlan --> SubmitPlan["Submit Plan for Approval"]
    SubmitPlan -->|Approved| ActivatePlan["Activate Meal Plan"]
    SubmitPlan -->|Rejected| NotifyUser["Notify User"]
    ActivatePlan --> End([End])
```
**Explanation:** The process ensures all plans meet system standards through admin review, aligning with dietary regulation policies.

## 3. Recipe Submission and Approval
```mermaid
flowchart TD
    Start([Start]) --> SubmitRecipe["User Submits Recipe"]
    SubmitRecipe --> Review["Admin Reviews Recipe"]
    Review -->|Approved| Publish["Publish Recipe"]
    Review -->|Rejected| Notify["Notify User"]
    Publish --> End([End])
```
**Explanation:** Recipes undergo admin moderation, ensuring content quality and safety before publication.

## 4. Place Order
```mermaid
flowchart TD
    Start([Start]) --> AddItems["User Adds Items to Cart"]
    AddItems --> Checkout["Proceed to Checkout"]
    Checkout --> ValidatePayment["Validate Payment"]
    ValidatePayment -->|Success| ConfirmOrder["Confirm Order"]
    ValidatePayment -->|Failed| NotifyError["Show Error Message"]
    ConfirmOrder --> End([End])
```
**Explanation:** Streamlines ordering with integrated payment validation, addressing concerns of transaction errors.

## 5. Subscription Management
```mermaid
flowchart TD
    Start([Start]) --> ChoosePlan["User Selects Plan"]
    ChoosePlan --> MakePayment["Enter Payment Details"]
    MakePayment -->|Success| ActivateSubscription["Activate Plan"]
    MakePayment -->|Failed| RetryPayment["Retry Payment"]
    ActivateSubscription --> End([End])
```
**Explanation:** Simplifies onboarding for premium services while ensuring secure and validated payment flows.

## 6. Progress Tracking
```mermaid
flowchart TD
    Start([Start]) --> SelectGoal["User Sets Goal"]
    SelectGoal --> LogMeals["Log Daily Meals"]
    LogMeals --> LogProgress["Update Progress"]
    LogProgress --> CheckGoal["Check Goal Completion"]
    CheckGoal -->|Complete| Celebrate["Show Congratulations"]
    CheckGoal -->|Incomplete| LogMeals
    Celebrate --> End([End])
```
**Explanation:** Motivates users through goal-based tracking, fostering healthy habits and accountability.

## 7. Support Ticket Process
```mermaid
flowchart TD
    Start([Start]) --> RaiseTicket["User Raises Ticket"]
    RaiseTicket --> AssignAgent["System Assigns Support Agent"]
    AssignAgent --> Diagnose["Agent Diagnoses Issue"]
    Diagnose -->|Resolved| ResolveTicket["Resolve Ticket"]
    Diagnose -->|Unresolved| Escalate["Escalate to Specialist"]
    ResolveTicket --> Close["User Confirms Closure"]
    Escalate --> ResolveTicket
    Close --> End([End])
```
**Explanation:** Ensures responsive user support and accountability, supporting user satisfaction and issue resolution.

## 8. Account Suspension and Reinstatement
```mermaid
flowchart TD
    Start([Start]) --> DetectViolation["System Detects Violation"]
    DetectViolation --> SuspendAccount["Suspend Account"]
    SuspendAccount --> AppealOption["User Appeals"]
    AppealOption --> ReviewAppeal["Admin Reviews Appeal"]
    ReviewAppeal -->|Approved| Reinstate["Reinstate Account"]
    ReviewAppeal -->|Rejected| MaintainSuspension["Maintain Suspension"]
    Reinstate --> End([End])
    MaintainSuspension --> End
```
**Explanation:** Reinforces community standards while ensuring fair appeal and resolution, aligning with policy enforcement needs.


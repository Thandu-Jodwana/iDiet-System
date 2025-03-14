# Explanation of the Use Case Diagram
## Key Actors and Their Roles

**End Users** – Primary users who track weight, log meals, receive diet suggestions, and engage in community features.

**Nutritionists** – Experts providing consultations, validating meal plans, and ensuring AI-based diet suggestions align with health standards.

**Fitness Trainers** – Assist users by recommending workout routines and ensuring fitness-tracking data is effectively utilized.

**Software Developers** – Maintain system functionality, update AI recommendations, and ensure seamless performance.

**Healthcare Providers** – Oversee the medical impact of dietary plans, ensuring safe weight management for users.

**Regulatory Bodies** – Are the to ensure there's compliance with dietary and health regulations, overseeing AI ethics and data security.

## Relationships Between Actors and Use Cases

**Generalization:** Both Nutritionists and Healthcare Providers influence dietary recommendations and ensure medical compliance.

**Inclusion:** Logging meals includes barcode scanning to simplify user input. AI-based diet suggestions rely on weight tracking and meal logging.

**Association:** Users interact with most functions, while specialized roles validate or enhance the system.

## Addressing Stakeholder Concerns

**Personalization & Accuracy:** AI-driven meal plans adapt to individual users, validated by nutritionists and healthcare providers.

**Usability & Engagement:** Gamification and social diet groups increase motivation for end users.

**Security & Compliance:** Regulatory bodies ensure data security and AI compliance.




```mermaid
graph TD;
  %% Layer 1: Users
  User[End User] -->|Interacts with| System
  Nutritionist -->|Provides Consultations| System
  FitnessTrainer -->|Analyzes Workout Data| System
  HealthcareProvider -->|Monitors Health Impact| System
  RegulatoryBody -->|Ensures Compliance| System
  SoftwareDeveloper -->|Maintains & Updates| System

  %% Layer 2: Core Functionalities
  subgraph System
    Register[Register & Login]
    Track[Track Weight & Calories]
    LogMeals[Log Meals]
    AIRecommendations[AI-Based Diet Suggestions]
    SyncFitness[Sync with Fitness Tracker]
    VirtualConsult[Book Virtual Consultation]
    SocialGroups[Join Diet Groups]
  end

  %% Layer 3: Data Processing & Integration
  AIEngine[AI Engine] -->|Processes Data| AIRecommendations
  DB[Database] -->|Stores User Data| Register & Track & LogMeals & SyncFitness
  API[API Gateway] -->|Connects System Components| System
  SecurityModule[Security Module] -->|Ensures Data Protection| System

  %% Layer 4: External Services
  FitnessAPI[External Fitness API] -->|Provides Workout Data| SyncFitness
  PaymentGateway[Payment Gateway] -->|Processes Subscription Payments| VirtualConsult
  ComplianceCheck[Compliance Service] -->|Verifies Regulatory Standards| RegulatoryBody

  %% Connections between layers
  System --> AIEngine
  System --> DB
  System --> API
  System --> SecurityModule
  SyncFitness --> FitnessAPI
  VirtualConsult --> PaymentGateway
  RegulatoryBody --> ComplianceCheck
```


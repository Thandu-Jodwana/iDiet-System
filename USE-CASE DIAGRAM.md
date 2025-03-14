# Explanation of the Use Case Diagram
## Key Actors and Their Roles

End Users – Primary users who track weight, log meals, receive diet suggestions, and engage in community features.

Nutritionists – Experts providing consultations, validating meal plans, and ensuring AI-based diet suggestions align with health standards.

Fitness Trainers – Assist users by recommending workout routines and ensuring fitness-tracking data is effectively utilized.

Software Developers – Maintain system functionality, update AI recommendations, and ensure seamless performance.

Healthcare Providers – Oversee the medical impact of dietary plans, ensuring safe weight management for users.

Regulatory Bodies – Ensure compliance with dietary and health regulations, overseeing AI ethics and data security.

## Relationships Between Actors and Use Cases

Generalization: Both Nutritionists and Healthcare Providers influence dietary recommendations and ensure medical compliance.

Inclusion: Logging meals includes barcode scanning to simplify user input. AI-based diet suggestions rely on weight tracking and meal logging.

Association: Users interact with most functions, while specialized roles validate or enhance the system.

## Addressing Stakeholder Concerns

Personalization & Accuracy: AI-driven meal plans adapt to individual users, validated by nutritionists and healthcare providers.

Usability & Engagement: Gamification and social diet groups increase motivation for end users.

Security & Compliance: Regulatory bodies ensure data security and AI compliance.







graph TD;
  subgraph iDietary System
    UC1[Register & Login]
    UC2[Track Weight & Calorie Intake]
    UC3[Generate Personalized Meal Plan]
    UC4[Log Meals (Manual & Barcode)]
    UC5[AI-Based Diet Suggestions]
    UC6[Sync with Fitness Trackers]
    UC7[Book Virtual Consultation]
    UC8[Share Progress & Join Diet Groups]
  end

  User -->|Interacts with| UC1
  User -->|Tracks & Logs| UC2
  User -->|Receives| UC3
  User -->|Logs & Tracks| UC4
  User -->|Receives| UC5
  User -->|Syncs Data| UC6
  User -->|Engages with| UC8
  
  Nutritionist -->|Provides Consultations| UC7
  Nutritionist -->|Validates| UC5
  
  FitnessTrainer -->|Analyzes Data| UC6
  FitnessTrainer -->|Provides Workouts| UC3
  
  SoftwareDeveloper -->|Maintains & Updates| UC1
  SoftwareDeveloper -->|Ensures AI Accuracy| UC5
  
  HealthcareProvider -->|Monitors Health Impact| UC7
  HealthcareProvider -->|Validates Health Safety| UC3
  
  RegulatoryBody -->|Ensures Compliance| UC5
  RegulatoryBody -->|Oversees Data Security| UC1


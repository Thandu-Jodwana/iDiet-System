

## Integration with previous assignments(4 & 6).

The following tables demonstrates how the state transition and activity diagrams from Assignment 8 relate to:
- Functional requirements (from Assignment 4)
- User stories and sprint tasks (from Assignment 6)

This ensures traceability and relation of the iDiet system's modeling artifacts.

### Assignment 4: Mapping to Functional Requirements

| Diagram Type | Object/Workflow       | Functional Requirement(s) | Explanation |
|--------------|------------------------|-----------------------------|-------------|
| State        | User Account           | FR-001, FR-006              | Ensures users can register, activate, suspend, and delete accounts. Reflects account status transitions. |
| State        | Meal Plan              | FR-002, FR-007              | Reflects plan drafting, submission, approval, and expiration processes. |
| State        | Order                  | FR-003, FR-005              | Tracks order lifecycle: pending, confirmed, delivered, and canceled. Supports cancellation policy. |
| State        | Subscription           | FR-004                      | Handles subscription activation, expiration, and user-initiated cancellation. |
| State        | Recipe                 | FR-007                      | Covers recipe publishing and archival. Tied to content management functions. |
| State        | Progress Tracking      | FR-008                      | Supports user goal tracking through not started, in progress, stalled, and completed stages. |
| State        | Support Ticket         | FR-009                      | Visualizes support process from ticket creation to closure or escalation. |
| Activity     | User Registration      | FR-001                      | Describes step-by-step registration process, including decisions and validations. |
| Activity     | Create Meal Plan       | FR-002                      | Workflow to draft, customize, and submit meal plans. Captures user and system roles. |
| Activity     | Place Order            | FR-003                      | Covers order placement, payment, confirmation, and delivery steps. |
| Activity     | Cancel Order           | FR-005                      | Allows users to cancel pending orders and reflects real-time updates. |
| Activity     | Subscribe to Plan      | FR-004                      | Handles subscribing workflow, including validation and subscription state. |
| Activity     | Publish Recipe         | FR-007                      | Admins publish approved recipes. Reflects parallel actions such as content check and database update. |
| Activity     | Track Progress         | FR-008                      | Shows how users log activities and track milestones for health goals. |
| Activity     | Submit Support Ticket  | FR-009                      | From issue report to resolution, escalation, or closure. Shows swimlanes for user and support agent. |

### Assignment 6: Mapping to User Stories and Sprint Tasks

| Diagram Type | Object/Workflow       | User Story ID(s) | Sprint Task ID(s) | Explanation |
|--------------|------------------------|------------------|-------------------|-------------|
| State        | User Account           | US-001, US-006   | T-001             | Linked to user registration and account maintenance stories. |
| State        | Meal Plan              | US-002, US-007   | T-002             | Connected to user-customized diet planning and admin approval. |
| State        | Order                  | US-003, US-005   | T-003             | Supports ordering functionality, including cancellation. |
| State        | Subscription           | US-004           | T-004             | Reflects user actions for managing subscriptions. |
| State        | Recipe                 | US-007           | T-005             | Aligned with recipe creation and publication workflow. |
| State        | Progress Tracking      | US-008           | T-006             | Enables user tracking and feedback mechanisms. |
| State        | Support Ticket         | US-009           | T-007             | Ensures users receive support for issues via tickets. |
| Activity     | User Registration      | US-001           | T-001             | Walkthrough of registration steps matching sprint tasks. |
| Activity     | Create Meal Plan       | US-002           | T-002             | User workflow to build, submit, and manage meal plans. |
| Activity     | Place Order            | US-003           | T-003             | Follows through all stages of placing an order. |
| Activity     | Cancel Order           | US-005           | T-004             | Enables real-time cancellation logic. |
| Activity     | Subscribe to Plan      | US-004           | T-004             | Reflects subscription interaction and logic. |
| Activity     | Publish Recipe         | US-007           | T-005             | Assigns recipe approval and publishing roles. |
| Activity     | Track Progress         | US-008           | T-006             | Tracks milestone progress for user health. |
| Activity     | Submit Support Ticket  | US-009           | T-007             | Workflow ensures issue tracking and resolution. |

## Summary
in a nutshell this traceability document maps diagrams from Assignment 8 to both the functional requirements of Assignment 4 and the Agile deliverables from Assignment 6. It reinforces how the system modeling is aligned with project needs, ensuring completeness and traceability in development.


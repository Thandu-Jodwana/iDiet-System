
# Use Case Specifications

## Use Case 1:
### Register User

 **Actor:**  User
 
 **Preconditions:** None
 
 Postconditions: User account is createdBasic Flow:

User enters registration details

System validates input

System creates user account

#### Alternative Flows:

Invalid input → Display error message

## Use Case 2:
### Log In

**Actor:** Registered User

**Preconditions**: User must be registered in order to log in.

**Postconditions**: User is logged inBasic Flow:

User enters credentials (username & password)

System verifies credentials

User is granted access

#### Alternative Flows:

Invalid credentials → Displays an error

## Use Case 3:
### Input Dietary Preferences

**Actor:** Registered User

**Preconditions**: User must be logged in to access this option

**Postconditions**: Preferences are storedBasic Flow:

User selects dietary restrictions

User inputs health conditions

System saves preferences

#### Alternative Flows:

Missing input → Display prompt

## Use Case 4:
### Generate Meal Plan

**Actor:** AI Engine

**Preconditions:** User must have input preferences

Postconditions: Meal plan is generated

**Basic Flow:**

System analyzes user data

AI engine selects meals

Meal plan is displayed

## Use Case 5: 
### Track Nutritional Intake

**Actor:** Registered User

**Preconditions:** User must log meals

Postconditions: System updates nutritional dataBasic Flow:

User logs meal

System calculates nutrient intake

Data is stored

## Use Case 6: 
### Provide AI Recommendations

**Actor:** AI Engine

**Preconditions:** User must have tracked meals

**Postconditions:** Personalized recommendations are providedBasic Flow:

System analyzes user diet

AI recommends adjustments

User receives suggestions

## Use Case 7: 
### Update User Profile

**Actor:** Registered User

**Preconditions:** User must be logged in

Postconditions: Profile information is updated

#### Basic Flow:

User edits profile

System validates and saves data

## Use Case 8: 
### Export Meal Plan

**Actor:** Registered User

**Preconditions:** User must have a meal plan

**Postconditions:** File is generated for download

#### Basic Flow:

User requests export

System creates downloadable file

User downloads/views meal plan

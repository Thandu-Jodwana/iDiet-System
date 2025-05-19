

## Welcome to the iDiet Project 

Thank you for your interest in contributing to **iDiet**, a dietary management system focused on helping users plan, subscribe, and track their nutrition and meal goals. This guide provides everything you need to start contributing efficiently and responsibly.

---

## Prerequisites & Setup

### Tools Required

* Java 17+
* Maven 3.8+
* Git & GitHub
* IDE: IntelliJ IDEA, Eclipse, or VS Code
 
### Installation Instructions

```bash
# Clone your fork of the repository
$ git clone https://github.com/your-username/idiet.git

# Navigate into the project directory
$ cd idiet

# Run the application
$ ./mvnw spring-boot:run
```

### Running Tests

```bash
# Run unit and integration tests
$ ./mvnw test
```

---


### 1. Fork the Repository

Click the **Fork** button at the top right corner of the iDiet GitHub page.

### 2. Clone the Repository

```bash
git clone https://github.com/your-username/idiet.git
```

### 3. Pick an Issue

Browse issues labeled `good-first-issue` or `feature-request`. Comment to get it assigned.

### 4. Create a Branch

```bash
git checkout -b feature/your-feature-name
```

### 5. Write Code and Add Tests

Follow the coding standards above. Ensure your code passes tests.

### 6. Commit Your Changes

```bash
git add .
git commit -m "[Feature] Add support ticket resolution flow"
git push origin feature/your-feature-name
```

### 7. Submit a Pull Request

* Go to your fork → Click **“New Pull Request”**
* Fill in a clear description of what you’ve done
* Link the issue it resolves (e.g., `Closes #42`)
* Wait for review and feedback

---

## Branch Naming Convention

Use the format: `type/short-description`

* `feature/user-authentication`
* `bugfix/null-pointer-in-order`
* `refactor/service-layer-cleanup`

---

## Pull Request Review Checklist

* [ ] Code compiles successfully
* [ ] No unused imports or code
* [ ] Includes unit/integration tests
* [ ] Relevant issue is linked
* [ ] Code is self-documented or well-commented

---

##  Code of Conduct

* Be respectful in all communications
* Provide constructive feedback
* Help newcomers when possible

---

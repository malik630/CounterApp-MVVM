# CounterApp – JavaFX MVVM Example

## Architecture (MVVM)

The application follows the **MVVM pattern**:


### Model
- Contains the application data (counter value)
- Implements the business logic (increment / decrement)
- Independent from the UI

### ViewModel
- Acts as an intermediary between the View and the Model
- Exposes observable properties (`IntegerProperty`)
- Contains UI-related logic
- No direct reference to the View

### View
- JavaFX user interface
- Displays data using data binding
- Forwards user actions to the ViewModel
- Contains no business logic

---

## Data Binding
JavaFX **data binding** is used to automatically synchronize the UI with the data:

- When the counter value changes in the ViewModel
- The View updates automatically
- No manual UI refresh is required

---

## Technologies Used
- Java 17
- JavaFX 17
- Maven
- MVVM Architectural Pattern

---

## How to Run the Application

### Using Maven (recommended):
```bash
mvn clean javafx:run

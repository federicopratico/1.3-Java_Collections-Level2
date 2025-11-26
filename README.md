# ☕ Java Collections & Data Structures

## 📄 Description
This repository contains a set of practical Java exercises designed to master the **Java Collections Framework**. The goal is to practice managing Lists, Sets, and Maps, handling File I/O, and implementing custom object logic for sorting and uniqueness (hashing).

## 📚 Exercise Details

### Level 1: Lists, Sets, and Maps
**Exercise 1: List Insertion & Iteration**
The objective is to manipulate an `ArrayList`, maintain order during insertion, and convert collections.

* **Class:** `Month` with a `name` attribute.
* **Logic:**
    * Instantiate 11 `Month` objects and add them to an `ArrayList`, excluding the object for "August".
    * Insert the "August" object into the correct index to maintain calendar order.
    * Prove that the `ArrayList` maintains the correct order.
    * Convert the list into a **`HashSet`** to ensure no duplicates are allowed.
* **Iteration:**
    * Traverse the list using both a standard `for` loop and an `Iterator`.

**Exercise 2: ListIterator & Reverse Order**
The goal is to copy elements from one list to another in reverse order using iterators.

* **Logic:**
    * Create and populate a `List<Integer>`.
    * Create a second, empty `List<Integer>`.
    * Use a **`ListIterator`** to read elements from the first list and insert them into the second list in **reverse order**.

**Exercise 3: HashMap & File I/O (Capitals Game)**
This program reads a file, stores data in a Map, and runs a quiz game.

* **Resources:** Requires a file named `countries.txt` (Country Name, Capital).
* **Logic:**
    * Read the file and store data in a **`HashMap<String, String>`** (Key: Country, Value: Capital).
    * Ask the user for their name.
    * Select a random country from the Map and ask the user for its capital. Repeat this 10 times.
    * Score 1 point per correct answer.
* **Output:**
    * After 10 rounds, save the user's name and score into a file named **`classificacio.txt`**.

### Level 2: Custom Objects & Sorting
**Exercise 1: Custom Uniqueness (HashSet)**
The goal is to ensure a `HashSet` correctly identifies duplicate custom objects based on specific attributes.

* **Class:** `Restaurant` with attributes `name` (String) and `score` (int).
* **Logic:**
    * Override `equals()` and `hashCode()` to ensure that two `Restaurant` objects are considered duplicates **only if they have the same name AND the same score**.
    * *Note:* Restaurants with the same name but different scores should be accepted.

**Exercise 2: Custom Sorting (Comparator)**
Using the class from the previous exercise, implement logic to sort a list of restaurants.

* **Logic:**
    * Implement `Comparable` or a `Comparator` to sort the `Restaurant` objects.
* **Sorting Criteria:**
    1.  By **Name** (Ascending / Alphabetical).
    2.  If names are equal, by **Score** (Descending).
    * *Example:* `RestA` (8) comes before `RestA` (7).

## 💻 Technologies Used
* **Java 21** - Core language.
* **IDE** (IntelliJ IDEA / Eclipse) - Development environment.
* **Git** - Version control.

## 📋 Requirements
* **Java SDK 17** or higher installed locally.
* Understanding of:
    * Java Collection Interfaces (`List`, `Set`, `Map`).
    * `Iterator` and `ListIterator`.
    * File Reading/Writing (`java.io`).
    * Object overrides (`equals`, `hashCode`, `compareTo`).

## 🛠️ Installation
1.  Clone this repository:
    ```bash
    git clone https://github.com/federicopratico/1.3-Java_Collections-Level2.git
    ```
    With SSH: 
    ```bash
    git clone git@github.com:federicopratico/1.3-Java_Collections-Level2.git
    ```
2.  Navigate to the project directory:
    ```bash
    cd 1.3-Java_Collections-Level2
    ```
3.  Open the project in your preferred IDE.

## 🚀 Execute
Each level is organized into its own package. To run the exercises:

1.  **Level 1 Ex 3 (Quiz):**
    * Ensure `countries.txt` is in the root directory (or update the path in the code).
    * Run the `Main` class in `Level1/Exercise3`.
2.  **Level 2 Ex 2 (Sorting):**
4.  * Run the `Main` class in `Level2/Exercise1` to see the console output for the exercise 1.
    * Run the `Main` class in `Level2/Exercise2` to see the console output of the sorted restaurants.
    * `Level2/Exercise1/Main` and `Level2/Exercise2/Main` share `Level2/Exercise1/Restaurant` class. 

## 🤝 Contributions
Contributions are welcome! If you find a bug or want to improve the sorting algorithms:

1.  **Fork** the repository.
2.  Create a **branch** for your feature:
    ```bash
    git checkout -b feature/ImprovedSorting
    ```
3.  **Commit** your changes:
    ```bash
    git commit -m "feat: Optimized comparator logic"
    ```
4.  **Push** to the branch:
    ```bash
    git push origin feature/ImprovedSorting
    ```
5.  Open a **Pull Request**.

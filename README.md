# Java Restaurant Order System 

A console-based Restaurant Order Management System built in Java to demonstrate core Object-Oriented Programming (OOP) concepts, specifically encapsulation and composition. The system allows the creation of menu items and aggregates them dynamically into individual customer orders to calculate total costs.

---

## Key Features

* **Menu Item Encapsulation:** Utilizes a dedicated `MenuItem` class with private fields and getter methods to protect item data (name and price).
* **Dynamic Order Aggregation:** Implements an `Order` class that uses an `ArrayList` to dynamically hold and manage multiple menu selections per customer.
* **Composition-Based Architecture:** Showcases a strong "has-a" relationship where an `Order` *has a* list of `MenuItems`.
* **Automated Invoice Calculation:** Iterates through order elements to output detailed receipts and calculate the exact total price in real-time.

---

## Core Concepts Demonstrated

* **Composition:** Designing classes that contain instances of other classes to handle complex data relationships.
* **Encapsulation:** Keeping fields private and exposing them safely through public methods.
* **Collections Framework:** Utilizing `java.util.ArrayList` for dynamic array resizing and object storage.
* **Control Flow:** Implementing enhanced `for-each` loops to traverse object collections cleanly.

---

## Class Structure & Workflow

1. **`MenuItem`:** Defines the blueprint for any food or drink item with a specific name and price.
2. **`Order`:** Acts as the cart. It provides methods to safely add `MenuItem` objects and display the final bill.
3. **`Main`:** Simulates a live restaurant environment by creating a digital menu, initializing 3 separate customer orders, adding various combinations of items, and printing the receipts.

---

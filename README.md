Rest Services basic of exceptional handling validation , Test cases

Welcome to our Java Spring Boot technical interview test! This test is designed to assess your understanding of the Java
Spring Boot framework and your ability to build practical applications.

## Test Instructions

1. **Clone this repository**: Use the 'Code' button on this repository to clone it to your local machine.

2. **Create a new branch**: Before you start the test, create a new branch. Name it using your full name and the date of
   the test (e.g., `john-doe-24-06-2023`).

3. **Solve the problem**: In the `TestCases` directory, you'll find the problem statement in a `README.md` file. Read
   the problem carefully and write your solution using Java Spring Boot.

4. **Push your solutions**: Once you've completed the problem, commit your changes and push your branch to the GitHub
   repository.

5. **Create a pull request**: After you've pushed your solution, go back to the GitHub repository and create a new pull
   request. Please name the pull request using your full name and the date of the test (e.g., `John Doe - 24/06/2023`).

## Write a end to end SpringBoot Application, contains controller, service, repository layer

- **Problem**: You have to develop inventory management service. The application should allow users to add items, update
  item information, and remove items from inventory.
- `public Inventory addItemToInventory(String itemName, int quantity)`  // adding existing or new item to an inventory
- `public Inventory pickItemFromInventory(String itemName, int quantity)` // pick item with provided quantity form
  inventory table - Amazon item check out operation in Amazon or Flipkart kind applications
- `public Inventory deleteItemFromInventory(String itemName)` // Delete item form inventory table
- `public List<Inventory> getAvailableInventory()` //This will get the list inventory table for all the items by which
  we get to know individual item availability in the inventory

The problem directory contains a `README.md` file with detailed requirements and any necessary resources or files.

## Evaluation

We will evaluate your solution based on the following criteria:

- **Functionality**: Does your application work as expected?
- **Code Quality**: Is your code clean, organized, and easy to understand?
- **Design Principles**: Did you follow good software design principles?

Best of luck with the test! If you have any questions, please don't hesitate to reach out.

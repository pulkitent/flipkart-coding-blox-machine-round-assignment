# Problem Statement

![alt text](https://raw.githubusercontent.com/pulkitent/coding-blox-flipkart-machine-round/master/problemStatement1.png)

![alt text](https://raw.githubusercontent.com/pulkitent/coding-blox-flipkart-machine-round/master/problemStatement2.png)

![alt text](https://raw.githubusercontent.com/pulkitent/coding-blox-flipkart-machine-round/master/problemStatement3.png)


# What are the company's expectations:

1. You can put sample data it into a file, test case or main driver program itself.
2. Code should be demoable. Either by using a main driver program or test cases.
3. Code should be modular. Code should have basic OO design. Please do not jam in
   responsibilities of one class into another.
4. Code should be extensible. Wherever applicable, use interfaces and contracts between different
   methods. It should be easy to add/remove functionality without re-writing the entire codebase.
5. Code should handle edge cases properly and fail gracefully.
6. Code should be legible, readable and DRY.

# Further in depth company's expectations:

They are looking for people who can write code that has flexibility built in, by adhering to the principles of Object
Oriented Development, and have the ability to deal with the real-life constraints / trade-offs while designing a system.

It is important to note that they are not looking for a GUI and they are not assessing you on the capabilities around
code required to do the I/O. The focus is on the overall design. So, while building a solution, it would be nicer if
input to the code is provided either via unit tests or a file. Using command line (for input) can be tedious and
difficult to test, so it is best avoided. Following is a list of things to keep in mind, before you submit your code :

1. Is behaviour of an object distinguished from its state and is the state encapsulated?

2. Have you applied SOLID principles to your code?

3. Have you applied principles of YAGNI and KISS (additional info here)?

4. Have you looked at basic refactoring to improve design of your code?

5. Finally, and foremost, are the principles applied in a pragmatic way.

Simplicity is the strongest of the trait of a piece of code. However, easily written code may not necessarily be simple
code.

# Things I tried to follow :

1. Tried to create all the required domain entities/models as per problem statement

2. Tried not to break encapsulation by avoiding getters & setters (as much as possible)

3. Tried to have immutable state with value objects (as much as possible) so as to avoid concurrency issues (Thread
   safety)

4. Tried to have readable methods & variables naming so as to clear the intention
   (4 rules of simple design).

6. Tried to avoid code duplication by refactoring/reusing duplicate code (DRY)
   but still code duplication can be improved if given more time

7. Didn't make un-necessary interfaces as per YAGNI principles because for now I don't feel the need for the same (Yes,
   I am aware of this principle also - "Program to interfaces rather than concrete implementation")

# Things I could have done/improved if given more time :

1. TDD with 100% code coverage

3. Level of indentation can be further reduced in some methods by breaking them into smaller methods

4. Encapsulation of behaviour in some classes can be further improved
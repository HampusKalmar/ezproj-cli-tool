# Reflection of laboration 3

## Chapter 2: Intention-Revealing Names
During this project, I prioritized method naming. Inspired by the Clean Code book, I aimed for names that were so descriptive that additional comments were often unnecessary, truly trying to implement the "Use Intention-Revealing Names" principle at its fulllest.

## Chapter 3: Do One Thing
Building on practices from Laboratory 2, I tried to continue the "Do One Thing" practice. By ensuring each method had a single, distinct purpose, I believe I largely maintained clarity and cohesion throughout my code.

## Chapter 4: Mumbling
My approach to comments this time was mixed. While I strive for self-explanatory code, I felt compelled to include comments, even if redundant. The book's concept of "Mumbling" resonates with me, as my comments sometimes felt obligatory rather than informative.

## Chapter 5: Indentation
Utilizing Google Checkstyle proved instrumental in enforcing code structure, especially concerning 'Indentation'. It was a  reminder to align my code consistently, ensuring that elements like loops and conditions followed a predictable format, so the  readability became much easier.

## Chapter 6: Data Abstraction 
In my two classes 'CreateJavaProj' and 'CreateJavaScriptProj' I tried to encapsulate the data in a way that I kept the data and operations private within the same class. Almost all methods are set to private except for the counstructor and the method that calls the different methods within the same class. This falls under the catagory 'Data Abstraction' in the book.

## Chapter 7: Use Exceptions Rather Than Return Codes
In this project i tried to keep my error handling consistent by using a 'try-catch' and then if something when wrong, i would throw a new exception with a message. This is a good way to handle errors because it is easy to understand and it is consistent. This falls under the catagory 'Use Exceptions Rather Than Return Codes' in the book. But sometimes i would just print an error message, and that is something i could have done better.

## Chapter 8

## Chapter 9

## Chapter 10: Class Orginaization
In 'CreateJavaProj' i think i followed the 'Class Orginaization' principle pretty well. I have the private variables directly under the class declaration and then the constructor and then the methods. The only public method was first and the private methods that would be called upon in the public method was last. This is a good way to organize a class because it is easy to understand and it is consistent. It is also the same structure in the class 'CreateJavaScriptProj'.

## Chapter 11
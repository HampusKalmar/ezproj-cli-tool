# Reflection of laboration 3

## Chapter 2: Intention-Revealing Names
During this project, choosing the right names for methods was my main focus. The Clean Code book greatly influenced me in this aspect, suggesting names that are clear and self-explanatory. The goal was to select names that described exactly what the method does, so much so that there was often no need for additional comments. It was all about having names that revealed their intentions without being cryptic.

## Chapter 3: Do One Thing
Drawing from my experiences in Laboratory 2, I stuck with the principle of "Do One Thing". This meant that every method I created had just one job to do. This focus helped in making sure the code was neat, clear, and that every piece had a specific role. This, I believe, added to the overall clarity and simplicity of my code.

## Chapter 4: Mumbling
My stance on comments was a bit two-sided this time. I always aim for my code to speak for itself, but I found myself adding comments that perhaps weren't always necessary. I felt like I was sometimes just mumbling through comments, just like the book suggested. There were moments where comments felt more like a duty than something genuinely helpful.

## Chapter 5: Indentation
Using tools like Google Checkstyle was a real game changer. It played a huge role in making sure the structure of my code was up to the mark. This was particularly true when it came to indentation. The tool kept reminding me to have a consistent layout for elements such as loops and conditions. This made the task of reading and understanding the code much simpler.

## Chapter 6: Data Abstraction 
In my two classes, 'CreateJavaProj' and 'CreateJavaScriptProj'. In these, I made a conscious effort to wrap up the data in such a way that both the data and its related operations stayed within the class, away from external interference. Except for the constructors and a few essential methods, most of them were private. This approach is highlighted as 'Data Abstraction' in the Clean Code book. This method not only keeps the data safe but also makes sure that each class sticks to its primary purpose.

## Chapter 7: Use Exceptions Rather Than Return Codes
In this project i tried to keep my error handling consistent by using a 'try-catch' and then if something when wrong, i would throw a new exception with a message. This is a good way to handle errors because it is easy to understand and it is consistent. This falls under the catagory 'Use Exceptions Rather Than Return Codes' in the book. But sometimes i would just print an error message, and that is something i could have done better.

## Chapter 8: Using Third-Party Code
I used a third-party code called 'picocli' to create a command line interface (CLI) for the user. I used this code because it was easy to use and it was well documented. I did not have to write a lot of code to create the CLI. I just had to create a class that extends the 'CommandLine' class and then i could use the 'CommandLine' class to create the CLI. This is a good way to use third-party code because it is easy to understand and it is consistent. It is also the same structure in the class 'EzprojCommand'.

## Chapter 9: Unit Tests
I did manual testing of my cli-tool, so when it comes to chapter 9 in the book 'Clean Code' i did not follow the 'Unit Tests' principle. I did not have time to write unit tests for my cli-tool. But i did write a test specification and a test report. 

## Chapter 10: Class Orginaization
In 'CreateJavaProj' i think i followed the 'Class Orginaization' principle pretty well. I have the private variables directly under the class declaration and then the constructor and then the methods. The only public method was first and the private methods that would be called upon in the public method was last. This is a good way to organize a class because it is easy to understand and it is consistent. It is also the same structure in the class 'CreateJavaScriptProj'.

## Chapter 11: Optimize Decision Making
In this project, creating four distinct classes was a deliberate choice to optimize decision-making and promote modularity. Reflecting upon the creation of the project, this separation allowed for several advantages such as better readability, easier debugging, and the ability to reuse code. This approach is highlighted as 'Optimize Decision Making' in the Clean Code book. 
*It is better to have a system omit certain anomalous features and improvements, but to reflect one set of design ideas, than to have one that contains many good but independent and uncoordinated ideas.*
-Fred Brooks 
using certain design principles and programming constructs can also help in maintaining conceptual integrity. Consider Java interfaces. An interface defines a type,
with behaviors that implementing classes of that type should all have in common.
This creates consistency in your software,
thereby also increasing the conceptual integrity of your software.
In this specialization, you will also learn about design patterns.
They provide conventional structures for your classes to solve a design issue and
lead to consistency.
Another approach to achieving conceptual integrity is having a well defined design
or architecture underlying your software.
While software design is typically associated with guiding
the internal design of software running as a single process, software architecture describes how software, running as multiple processes, work together, and how they relate to each other.
Much like using certain design principles, having a strong software design or
architecture to guide how your software is organized creates consistency.
Unifying concepts is also another approach to maintaining conceptual integrity.
It is taking seemingly different things and finding common ground so that each concepts can be seen and treated in similar ways.
For example, in the Unix operating systems, every resource can be seen and
manipulated as if it were a file.
The same set of operations can be used on different types of resources.
This simplifies things by making it so
that any resource can be treated in the same way.
Unifying concepts to avoid special cases can provide consistency in your software.
Finally, having a small core group that accepts commits to the code base
is another approach in achieving conceptual integrity. This is similar to exercising code reviews, but it restricts the review to only core members of your software team.
These members will be responsible for ensuring that any software changes follow the overall architecture and design of the software. Restricting this decision to only either a single person or a small group will solve any design issues and lead to consistency. 
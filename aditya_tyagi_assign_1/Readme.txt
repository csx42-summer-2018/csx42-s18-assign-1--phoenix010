
Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=FIRST -Darg1=SECOND -Darg2=THIRD

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip or tar -zcvf firstName_secondName_assign_number.tar.gz firstName_secondName_assign_number

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.”

[Date: 6/14/2018]

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)

The Datastructure which we have used is arrays. Although, we were assigned to 
do this assignment through arrays.Although, at some places I have used Linked list.
Linked lists provides far more advantage when it comes to delete any value. The time complexity of
deleting a value from array is O(n) while it's constant when it comes to linked list.

So I have used linked list in removeAllOccurences method. I copied the array and paste it in 
a linked list.Then, I removed that element from that linked list. using.remove(). After removing that
value, I used the concpt of unboxing to change the type of linked list from INTRGER to primitive int.
After that, I copied the linked list into another array.
-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken code
(if any).
I have used these References:

1. Its for writing the output file:
https://www.youtube.com/watch?v=72BEuCPMgTo 

2. Its for reading the file:
 "https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file"

3. I have studied the concepts of soting and unboxing from an udemy paid online course. Its name is "Complete JAVA Masterclass". I have purchased this course long back ago(even before coming to     Binghamton).

NOTE:: I have hardcoded the name of the file as "input file". It means that you need to provide a file whose name is "input.txt". Although you can make as many as changes as you like within that input file.The output file whose name is: "output.txt" will be generated with required output. You can overwrite that output.txt as many as time as you want.








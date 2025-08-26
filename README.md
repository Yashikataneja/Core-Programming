# Core-Programming
1995 ; developed by Sun microsystems.

WORA PRINCIPLE OF JAVA :
"WRITE ONCE, RUN ANYWHERE"

Features of Java :
Simple – syntax thoda C/C++ jaisa hai.
Object-Oriented – classes, objects, inheritance, polymorphism sab use hota hai.
Platform Independent – Java code pehle bytecode me convert hota hai, fir JVM (Java Virtual Machine) usse run karta hai.
Secure – viruses aur memory corruption ke chances kam.
Robust – errors handle karne ke liye exception handling system.
Multithreaded – ek saath multiple tasks perform kar sakta hai.
Automatic Garbage Collection – unused memory automatically free hoti hai.

tHE 4 PILLARS OF OOPS ARE :
Inheritance
Polymorphism
Abstraction
Encapsulation

Java is a high-level, object-oriented programming language that is platform-independent due to the Java Virtual Machine (JVM).

JAVAC : Javac is a compiler of Java which is present in the JDK (Java Development Kit), Javac compiler is used to compile the java programs.

JRE : Java Runtime Environment : It is used to run the Java programs. It consists of libraries and components of java.

JDK : Java Development Kit : It is a type of java development tools kit which is used to create the java applications and tools.

JVM : Java Virtual Machine : It is used to run the compiled byte code files and used to convert the byte code file into machine level code i.e. 0 and 1.

The extension of java is .java and when we create any program in java, it is stored with a name of .java file and after compilation, it is converted into a .class file which is a byte code file.

JAVA is an independent language because of its byte code and a .class file.

The two differences between an interpreter and a compiler are :

1) The first is in interpreter, the code is read line by line and then compile it... whereas in compiler, it compiles the whole code at once.
2) The interpreter finds the error in every one line of the code but whereas on the other hand, the compiler shows all the errors at once!

jvm is present in jre (java runtime environment)
javac compiler is present in JDK KIT.

jit (Just In time) presents in jvm environment and it helps in optimising the jaava program.
The Just-In-Time (JIT) compiler is a component of the runtime environment that improves the performance of Java™ applications by compiling bytecodes to native machine code at run time.

Java was first released in 1995, with development beginning in 1991 at Sun Microsystems. 


DATA TYPES IN JAVA :

1) Primitive : (any data type which object cannot be made is called primitive data type)
int ;float ; double ; char
2) Non-primitive: ( any data type which object can be made is called non-primitive data type)
array; string .

(*) BOXING AND UNBOXING :
(*) SIZE OF DATA TYPES IN TERMS OF MEMORY.



Ques : I have a data type abc, how can i define it as primitive or non primitive??
How will i check it?

Ques: Which is the smallest data type in terms of memory and which is the largest ?


/* CLASS NAME ALWAYS STARTS WITH CAPITAL LETTERS */

public class MyClass {

    int b; //this var is inside class, so this is instance variable
    static int s; //this can be accessed anywhere inside the class.

    //Moreover, when we write static infront of any var, it is named as static var

    void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }



    public static void main(String[] args)
    {
        int a; //this variable is inside the main method, therefore, this is local variable
        System.out.println(s);

    }


}


command to check that the git repo is connected to the main folder or not,

 (git remote -v)
 OUTPUT : origin  https://github.com/Yashikataneja/Bridgelab (fetch)
          origin  https://github.com/Yashikataneja/Bridgelab (push)


TYPES OF VARIABLE ARE :

1) LOCAL  : THEY ARE ACCESSED INSIDE THE METHODS ONLY ; Local variables must be initialized before they can be used
2) INSTANCE : THEY AREACCESSED INSIDE THE CLASS ONLY ; Instance variables are created when an object is instantiated, and are accessible to all the constructors, methods, or blocks in the class.
3) STATIC  : Static variables are accessed through the class they belong to, they are declared using the static keyword, it can be accessed anywhere from static or from non static method.


(CLASS NAME ALWAYS STARTS WITH UPPERCASE LETTERS AND METHODS NAME WITH LOWERCASE LETTERS.)

main method is run by JVM.





//String input=sc.nextLine();
        the above line of code in which I have written nextLine(), that is why it is giving the string type
        input.
//int  input=sc.nextInt();
    in the same manner, if i want to take the integer as an input, i will use the above code line for it.



=========================================================================================================================

TO RUN YOUR PROGRAM IN COMMAND PROMPT :

FOR COMPILE COMMAND : 

javac (file name.java)

FOR RUN COMMAND :
java (file name)



How to write your code in NOTEPAD ?

Just make a new folder, and make a new text file and write the code in it and then open it with notepad++ ,
THEN SAVE IT AND THEN rename it to java source file , then open it with command prompt, and use compilation and run commands.

ENTRY POINT OF THA JAVA PROGRAM :

main method :

public static void main(String[] args){
         System.out.println("hey");
}

public : Access Specifier: It is an Access modifier, which specifies from where and who can access the method. Making the main() method public makes it globally available.
static : Keyword : It is a keyword that is when associated with a method, making it a class-related method. The main() method is static so that JVM can invoke it without instantiating the class.
void : Return Type : It is a keyword and is used to specify that a method does not return anything. 
main : Method name : It is the name of the Java main method. It is the identifier that the JVM looks for as the starting point of the Java program. It's not a keyword.
string[] args : Array of String Type : It stores Java command-line arguments and is an array of type java.lang.String class. Here, the name of the String array is args but it is not fixed and the user can use any name in place of it. 

Java command-line argument is an argument, i.e., passed at the time of running the Java program. In Java, the command line arguments passed from the console can be received in the Java program, and they can be used as input. The users can pass the arguments during the execution, bypassing the command-line arguments inside the main() method.

What are Command Line Arguments?
When we run a Java program, we can give extra information right after the program name. This extra information is called command-line arguments. Let's understand this with the help of an example. If we run this,

java Geeks Hello World , hello and world are arguements ..


OPERATORS :

Operators are used to perform operations on operands.
 Operations like addition, subtraction, multiplication, division , modulus , increment , decrement ...etc

1) Arithmetic Operators are : '+' ; '-' ; '*' ; '/' 
2) Assignment Operators : '='
left shift and right shift operators :
<< <<(left shift) ; >> >>(right shift) right shift exclude karke baki wale elements ko right side pe kardo shift.... same in the case of left shift
They work on bits.

(>>= and <<=) : right and left shift equals.
>>= and <<= are bitwise assignment operators in Java (and many other languages like C, C++, etc.).

They are compound assignment operators that:
Perform a bitwise shift (>> or <<)
And then assign the result back to the variable.

3) Comparison Operators : They are used to compare the two operands like (3==90 or not??)

(==) :  double equals
! = not
< = less than 
> = greater than
<= less than or equals to
>= greater than or equals to

4) Logical Operators :

& : and
|| : or
! : not : it will just toggle / reverse the bits : 
^ : Xor : one true and one false: it will check both the operators.....

AND : 

a>=b : Either a can be greater than b or equals to b, then only it will be true.

. Logical Operators (&&, ||, !)
These work with boolean (true = 1, false = 0):

| A | B | A && B | A \|\| B | !A |
| - | - | ------ | -------- | -- |
| 0 | 0 | 0      | 0        | 1  |
| 0 | 1 | 0      | 1        | 1  |
| 1 | 0 | 0      | 1        | 0  |
| 1 | 1 | 1      | 1        | 0  |

. Bitwise Operators :  (&,|, ~)

| A | B | A & B | A \| B | A ^ B |
| - | - | ----- | ------ | ----- |
| 0 | 0 | 0     | 0      | 0     |
| 0 | 1 | 0     | 1      | 1     |
| 1 | 0 | 0     | 1      | 1     |
| 1 | 1 | 1     | 1      | 0     |

 . Bitwise not : (~) 

| A | \~A |
| - | --- |
| 0 | 1   |
| 1 | 0   |

============================================================================================

TYPES OF LOOPS :

Basically loop is used to perform repetion tasks until a specific condition is met or not...

There are two types of loops :
1) Entry Controlled Loop : until a condition is not met, loop will not start working.. CONDITION IS MANDATORY FIRSTLY TO EXECUTE THE LOOP OF ENTRY CONTROL..(while loop )
2) Exit Controlled loop : it is execute once, then a condition can execute after once.. (example is : DO WHILE LOOP) (which is execute once, then the condition is met!)

The Sliding Window algorithm is a method for finding a subset of elements that satisfy a certain condition in issues.

liding Window Technique is a method used to solve problems that involve subarray or substring or window.

The main idea is to use the results of previous window to do computations for the next window.
This technique is commonly used in algorithms like finding subarrays with a specific sum, finding the longest substring with unique characters, or solving problems that require a fixed-size window to process elements efficiently.

Fixed Size Sliding Window:

The general steps to solve these questions by following below steps:

Find the size of the window required, say K.
Compute the result for 1st window, i.e. include the first K elements of the data structure.
Then use a loop to slide the window by 1 and keep computing the result window by window.
2. Variable Size Sliding Window:

The general steps to solve these questions by following below steps:

In this type of sliding window problem, we increase our right pointer one by one till our condition is true.
At any step if our condition does not match, we shrink the size of our window by increasing left pointer.
Again, when our condition satisfies, we start increasing the right pointer and follow step 1.
We follow these steps until we reach to the end of the array.
How to Identify Sliding Window Problems?
These problems generally require Finding Maximum/Minimum Subarray, Substrings which satisfy some specific condition.
The size of the subarray or substring ‘k’ will be given in some of the problems.
These problems can easily be solved in O(n2) time complexity using nested loops, using sliding window we can solve these in O(n) Time Complexity.
Required Time Complexity: O(n) or O(n log n)
Constraints: n <= 106 

****FOR LOOP AND ENHANCED FOR LOOP (FOR EACH LOOP) DIFFERENCE :******

for loop :

Introduced in early Java versions as a basic loop structure.
General-purpose loop suitable for arrays, collections, and numerical ranges.
Allows access to elements by their index using i.
Supports both read and modify operations on elements.
Offers more control over iteration (start, end, and step).
May perform slightly better when accessing array elements directly by index.

enhanced loop (for each loop) :

Introduced in Java 5 as a simplified version for iterating over collections/arrays.
Specifically designed for iterating over arrays and collections.
No index-based access; iterates directly over elements.
Primarily for read-only operations. Modification may lead to errors.
Limited control as it automatically iterates over all elements.
Performance depends on the internal iteration mechanism of the collection.

===========================================================================================================================================================================

STRINGS :

STRING IS A SEQUENCE OF array of CHARACTERS, STRINGS ARE IMMUTABLE IN JAVA.
We use String Buffer and String Builder to make them mutable....

(==) : use to check the strings comparison..                                                                                                                                     
EXAMPLE OF STRING CODE :

String str1= " hello";
String str2= "hello";
String str=new String(hello);
sout(str1==str2);  : true 
sout(str1==str3);  : false

in first case, true output will print and in second case, it will create object in heap that is why the strings are not equal.... 

String methods :

trim ; substring ; toUppercase ; toLowercase ; charAt ; replace 

String Constant Pool (SCP) 

=============================================================================================================================================================================

ARRAY : this is a linear data structure which holds the homogeneous data (same type of data), we can access its elements through indices..

It is access through arr[8] or arr[0] (through indices only).

Array is of 2 types: 1) single 2) multi

best way to access values from arrays is loop, bcz when we have to perform repeated tasks, we use loops.

length method will always count and starts from 1 not 0., but index always starts with 0.

for each loop will use when we have to print the indexes and value .. In java we will write only for, not each!! but in other languages, we will write for and each separately,

SYNTAX :  

FOR(INT NUM:MARKS){
    SOUT(NUM);
}

FOR EACH LOOP WILL PRINT ONLY VALUES... NOT FULL ARRAY!

2. 2D : arr[i][j] : rows and cols
3. two loops : inner and outer ; outer[i] rows will modify the rows and inner[j] cols will perform the inner operations..

1D Array : it is also known as vector array in some languages..
Multi Dimensional Array

For primitive arrays, elements are stored in a contiguous memory location, For non-primitive arrays, references are stored at contiguous locations, but the actual objects may be at different locations in memory.

 Create an Array
To create an array, you need to allocate memory for it using the new keyword:
// Creating an array of 5 integers
int[] numbers = new int[5]; 

Array Properties
In Java, all arrays are dynamically allocated.
Arrays may be stored in contiguous memory [consecutive memory locations].
Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using size of.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered, and each has an index beginning with 0.
Java array can also be used as a static field, a local variable, or a method parameter.
An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class, depending on the definition of the array. In the case of primitive data types, the actual values might be stored in contiguous memory locations (JVM does not guarantee this behavior). In the case of class objects, the actual objects are stored in a heap segment.

Declare
Initialize
Access

The general form of array declaration is 
Method 1:
type var-name[]; 
Method 2:
type[] var-name;

 First, you must declare a variable of the desired array type. Second, you must allocate the memory to hold the array, using new, and assign it to the array variable. Thus, in Java, all arrays are dynamically allocated.

 Array Literal in Java : 
In a situation where the size of the array and variables of the array are already known, array literals can be used. 
// Declaring array literal  
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
The length of this array determines the length of the created array.
There is no need to write the new int[] part in the latest versions of Java.

In Java, you can initialize arrays in several ways. Here are the main ways:

1) static Initialization (Declaration + Initialization in one line)
int[] arr = {1, 2, 3, 4, 5};
Java automatically figures out the size based on the number of elements.
2) dynamic initialization using new :
int[] arr = new int[5];  // size 5, all elements default to 0
arr[0] = 10;
arr[1] = 20;
3. Using new with values : 
int[] arr = new int[]{1, 2, 3, 4, 5};
Useful when array is declared separately from initialization.
4) Anonymous Array : 
printArray(new int[]{1, 2, 3, 4}); 
void printArray(int[] arr) {
    for (int i : arr) System.out.println(i);
}




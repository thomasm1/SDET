package com.revature.eval.java.core;

public class Notes {
	public static void main(String[] args) {
		 
//		 TODO Auto-generated method stub
	 byte y = 12; 	// 8 bits
	short s = 4000;	//16 bits 
	char c = 'h';	//16 bits
	int in = 2000000;//32 bits 2^31 - 1 positive integers
Integer I = 2000;
	float f = 2.5f; //32 bits
	double d = 3.5;// 64 bits 
Double D = 3.5; // 63 bits
	long l = 3;		//64 bits 2^64 integers

//METHODS 
//String()
String hello1 = "hello";
String hello3 = new String("hello");
System.out.println(hello1==hello3); 
//	 False bc 'new' memory location Strings share same location
hello1 ="HEY";
//	 not changing string, just reassigning, changing location, not changing value.";  
System.out.println(hello1.toString());
String a2 = new String("a");
	for(int i = 0; i <2; i++) { 
		a2 += "a";
		a2.concat("a");  // concat is much faster

//StringBuilder()
StringBuilder sb = new StringBuilder("hello there");
sb.reverse();
	for (int ii = 0; ii <10; ii++) {
	sb.append("!"); 
	}

//Unboxing (Object to Primitive); Autoboxing (primitive to Object)
int n1 = 9;
int n2 = 10;
Integer n3 = 14;
Integer n4 = 15;

add(n3, n4); //  Unboxing - object into primitive
add(n1, n2);
multiply(n1,n2);
Integer n5 = 25;
Integer n6 = 4;
multiply(n5,n6);// autoboxing

//Scope
//class/static scope: the variable or method belongs
//to the class and not to any particular instance of the class/
//static int staticnum = 10;
	
//instance/object scope means that the variable/method
//is attached to a particular object
int instancenum = 100;
	
//method scope are all variables created/initialized
//in a method. These do not leave the method.
//public void method(int number) { 
int methodnum = 5; 
//}
//block scope 
	if(true) {
		int blocknum = 9;
		blocknum = 8;
		System.out.println(blocknum); 	
		} 
	System.out.println(methodnum);
}

		System.out.println("MainApp");
		final int myInt = 1;
		String notes = myInt + ".)___DAY ONE NOTES_\n\nWhy JAVA: strong + static Data type\n";
		String day1 = notes + "JDK  - all tools necsssary to create/compile\n"
		+ "JRE  - classes and runtime libs to run\n"
		+ "JVM  - Abstract machine executing Java byte code\n"
		+ "Compile?  - java c myClass.java -. myClass.class\n" + "Run?  - java myClass.class"
		+ "CLASS - Blueprint for an Object that defines its states and behaviors\n"
		+ "OBJECT - Instance of Class (allocated memory)" + "Heap: Stores all Objects\n"
		+ "STACK: Current methods being called are stored (everything else)\n"
		+ "\nJava is 100% pass by Value, because you pass by copy reference.\n"
		+ "CLASS\n - Methods, behaviors for a class.\n - Variables, states/fields (attributes) of a class\n"
		+ "\nConstructor\n builds an instance of a class, i.e. Object.\n"
		+ "Constructor Fields"
		+ "\n - No-arg constructor"
		+ "\n - Full-arg constructr"
		+ "\n - Id-less Constructor"
		+ "\n   Getters & Setters"
		+ "\n   Equals & Hashcode"
		+ "\n - toString"
		+ "\nBlocks, segmented chunks of executable code.\n"
		+ "SCOPES in Java\n - class/static\n - object/instance\n - block (local, curly braces for(...) { })\n"
		+ " - Method (local doSomething)\n" + "OOP: rogramming paradigm based on thee object as the building block of programs: Java, Python, C++, Ruby, C#" + "\n - 4 Pillars: APIE\n - 1.) A - Abstraction, 2.) P -Polymorphism, 3.) Inheritance, 4.) Encapsulation\n"
		+ "Abstraction: \n - Something not asssociated with a particular object. only fundamental parts. \n - Intent over implementation - no details.\n - Interfaces, Abstract classes"+ "\nPolymorphism\n - A single object that can be many things. a single method signature/name can have multiple implenations.\n" + " - Static polymorphism - overloading;\n - "
		+ "Dynamic Polymorphism - overriding\n - Casting\n  - List<Object> list = new ArrayList<Object>()"
		+ "\nInheritance\n - One class can derive from another class. Code reusability\nEncapsulation\n - hiding\n - Access Modifiers";
		
		String notes2 = day1 + "\n\n`2.)___DAY TWO NOTES_\n#################\nTypes of Access Modifiers\n";
		String day2 = notes2 + "\nPublic\n1.)Class, 2.)Package subclass, 3.)Package non-subclass, 4.)Diff package subclass, 5.)Diff package non-subclass, "
				+ "\n\nProtected\n1.)Class, 2.)Package subclass, 3.)Package non-subclass, 4.)Diff package subclass,  \n  "
				+ "\nDefault\n1.)Class, 2.)Package subclass, 3.)Package non-subclass\n \nPrivate\n1.)Class \n"
				+ "\nConstructor\n - Allocates memory for an Object \n - Uses new keyword \n creates an instance of a class "
				+ "\n - All classes have a default constructor\n - Can be overloaded"
				+ "\n\nOverloading\nDefault constructor is a no argument constructor; \n "; 
 
	 
		String day22 =  day2 + "\n2c.)Arrays\n - Indexed block of sequentially stored elements of the same type* \n - The size is fixed \nn int[] ray = new int[10]"
				+ "int[] ray 2 = {1,2,3,4,5};\n"
				+ "String[] args = {\"hello\", \"world\"\n"
				+ "\nVarargs \nVariable arguments\n"
				+ " - Alternate syntax for an array\n"
				+ " - must be the last parameter in a method\n"
				+ " - Looks like DataType ...  i.e.: "
				+ " - public Wizard(String name, Magic ... proficiencies)"
				+ "\nGarbage Collection\n"
				+ " - Java frees up memory in the heap by removing objects\n"
				+ " - Objects are remvoed if that Object has no references at the time of GC.\n"
				+ " - Garbage cannot be forced, but can be requested by:"
				+ " - System.gc();\n"
				+ " - The finalize() method is called when object is garbage collected\n"
				+ "\nWrapper Classes"
				+ " - Let you treat primitives as objects, one for each primitive\n"
				+ " - Ex. Integer, Double, Boolean, Byte, Character, ..\n"
				+ " - Autoboxing -> primitive to a wrapper class\n"
				+ " - Unboxing -> wrapper class to primitive"
				+ "\n\nString\n"
				+ " - Object that stores character information"
				+ " - Not a primitive; String is immutable, i.e. String is a final class\n" 
				+ " - Common String methods\n"
				+ " - - length();\n"
				+ " - - compareTo();\n"
				+ " - - indexOf();\n"
				+ " - - toLowerCase\n"
				+ " - - equals(); Object class, but it is overriden, implemented with string comparing the two locations"
				+ " - - if 2 diff locations, then not equaling..."
				+ "\nString Pool:\n"
				+ " - Strings with same value share the same memory location bc saves memory."
				+ "\n - Can force new memory allocation with the 'new' Keyword"
				+ "\nString Builder:"
				+ "\n - similar to string, yet this is mutable: No string pool, so new methods"
				+ "\n - reverse(); "
				+ "\nString Buffer: "
				+ "\n - Same as String Builder, but Thread-safe - one access at a time" //
				+ "\n\nOverloading"
				+ "\n - Overloading is when yuou have methods with the same name but different number"
				+ "\n   or order of parameters. Unique comination of parameters\n"
				+ " - Rules for overriding the method signature has to be exactly the same in the parent class as child classs-\n"
				+ " - if loading a car, this is static parked car. Overloading is Static. Overriding is Dynamic (riding in a car)\n"				
				+ "//Covariant return type\r\n" + 
				"	//The return return of an overridden method may be\r\n" + 
				"	//the same as the parent's implementation or any\r\n" + 
				"	//of its subclasses.\r\n" + 
				"	@Override\r\n" + 
				"	public Child method() {   // Can be Child's implementation (Parent, but not Object)"
				+ "\nObject Class\n"
				+ " - Java.lang.Object; All classes inherit from Object; Broadest class\n"
				+ "toString()\n"
				+ " - called when an Object is printed"
				+ " - default is to print the memory location unless overridden"
				+ "\nequals()"
				+ "provides a way to see if 2 objets have same state"
				+ "\ndefault is to check memory addresses"
				+ "\nhashCode()\n"
				+ " - generates a number to identify an Object based of a custom algorithm"
				+ " - often uses the Objects fields in the calculation"
				+ " - hash code are not guaranteed unique"
				
				
				+ "\n\n==================================================================\n"
				+ "TODO: \n1.) study Variable Args\n"
				+ "2.) toString()\n"
				+ "\n3.) Practice: Constructor - overriding, SuperConstructors, inheriting; getters and setters\n"
				+ "equals() with Object class & as implemented by String()"; 
				
		String day3 = day22 + "\n\n3.)___DAY THREE NOTES_\n######################################\n"
				+ "\nJava Bean \n" 
				+ "is a class that follows 3 conventions:\n"
				+ " - 1. private variables\n"
				+ " - 2. public getters and setters -> accessors modifiers/mutators"
				+ " - 3. *is Serializable -> Interface  *Serialization is not necessary for beans"
				+ " - - Serializable is a marker interface (deprecated)... encrypted into bytecode: it was a hacking problem, so no longer used"
				+ "POJO - Plain Old Java Object - is everything else\n"
				+ "\nEXCEPTIONS/ERRORS - All underneath the Throwable class\n"
				+ "Errors\n"
				+ " - Something has gone horribly wrong\n"
				+ "- Should not attempt to recover from \n"
				+ "	- - StackOverflowError\n"
				+ " - - OutOfMemoryError\n"
				+ " - - NoClassFoundError\n"
				+ " - - Syntax Error\n"
				+ "\n[Checked] Compile-time Exceptions \n"
				+ " - Compiler couldn't check them before runtime\n"
				+ " - Code was not able to be executed as intended\n"
				+ " - Should be handled by the program\n"
				+ " - - FileIOException\n"
				+ " - - FileNotFoundException\n"
				+ " - - SQLException\n"
				+ "\n[Unchecked] Run-time Exceptions RuntimeException/n"
				+ " - Exception that cannot be anticipated/n"
				+ " - Are not required to be handled/n"
				+ " - - NullPointerException\n"
				+ " - - IndexOutOfBoundsException\n"
				+ " - - ArmithmeticException\n"
				+ " - - InputMismatchException\n" 
				+ "\nHandling Exceptions\n"
				+ " - try-cactch block\n"
				+ " - - try {\n"
				+ " - - - someCode();\n"
				+ " - - } catch(ArithmeticException ae) { // Specific\n"
				+ " - - syso('you divided by zero!') \n"
				+ " - - ae.printStackTrace();\n"
				+ " - - } catch(Exception e) { // General\n"
				+ " - - syso('Your made a mistake'); \n"
				+ " - - e.printStackTrace();\n"
				+ " - - } finally {\n"
				+ "     lastlyMethod(); \n"
				+ "Throws\n"
				+ " - placed in individual methods, 'throws' makes the main() method caller responsible for handling\n"
				+ " - This *dodges* the exception -- Throws the exception to the method caller.\n"
				+ " - Ultimately all thrown exception will either be caught or hit the JVM.\n"
				+ " - THIS will halt the JVM, so use Throw\n"
				+ " - public void divide(int num1, int num2) throws ArithmeticException {"
				+ " - syso(num1/num2);"
				+ "Throw\n"
				+ " - send an exception down the stack until it gets handled.\n"
				+ " - This *adds* an exception into your code\n"
				+ "\nControl Statements\n"
				+ " - Conditionals -> They evaluate some condition to be true or false\n"
				+ " - if statement    if (num == 5)\n"
				+ " - if - else statement\n"
				+ " - if - elseif - else \n"
				+ "switch statement\n"
				+ " - switch (evaluation) {\n"
				+ " - - case value0: { somecode(); break }\n"
				+ " - - case1: case2: { some other code(); break;}\n"
				+ " - - default: { default code to run(); break; }\n"
				+ "\nOperators\n"
				+ "num != 5 --> !(num==5)\nj"
				+ "&& ||  and $ or | force next evaluation"
				+ "!(num>5)\n"
				+ "\nLoops\n"
				+ "for loop\n"
				+ "  for(int i = 0; i < array.length; i++) {\n"
				+ " -  lots of code();"
				+ " -   if(condition) {"
				+ " -    continue // stop this iterationo, but continue to next iteration\n"
				+ " -    } more code()\n"
				+ "enhanced for loop = foreach loop\n"
				+ " -  for( DataType d : someCollection)"
				+ " -    perform some code();"
				+ " -    syso(d.name);"
				+ " -  for ( String s : stringArrray) {"
				+ "	    syso(s);}\n"
				+ "while loop\n"
				+ " -  while (condition) {\n"
				+ "      some code() } \n"
				+ "    while (true) {\n"
				+ "while(!isValid) {\n"
				+ "   ask for new input();\n"
				+ "do {\n"
				+ "		perform some code();\n"
				+ "} while (condition); \n"
				+ " "
				+ "";
		
		String day4 = day3 + new String("\n4.)___DAY FOUR NOTES_\n"
				+ "#######################\nAbstract classes and interfaces\r\n" + 
				"\r\n" + 
				"Abstract class\r\n" + 
				" - Class that cannot be instantiated => MyAbstractClass obj = new MyAbstractClass();\r\n" + 
				"  - can have abstract methods\r\n" + 
				"  - Can have concrete methods\r\n" + 
				"  - Variables can have modifiers\r\n" + 
				"	 - i.e. static, public, private, final, whatever ...\r\n" + 
				"	 - Child class will use the extends keyword\r\n" + 
				"	 - A class can inherit only one abstract class, just like any other class\r\n"
				+ "* An abstract class can have any variables of any type.\r\n" + 
				"	 * It can have as many or as few abstract or \r\n" + 
				"	 * concrete methods as you like.\n"
				+ " * You do not have to have implementations of methods\r\n" + 
				"	 * in an abstract class. If you want a method that should\r\n" + 
				"	 * always be overridden or implemented in a child class\r\n"
				+ "	//Cannot make just an Animal\r\n" + 
				"		//Animal a = new Animal();\r\n" + 
				"		\r\n" + 
				"		Lion leo = new Lion();\r\n" +  
				"		//Java only knows that this object has methods\r\n" + 
				"		//declared within the Animal class\r\n" + 
				"		//despite that fact that it has other methods\r\n" + 
				"		//as well." + 
				"	 * you should make the method abstract.\n\n"
				+ 	"Interface \r\n" + 
				" - Cannot be instantiated\r\n" + 
				" - Variables are always public static final. Even if you don't specify much.\r\n" + 
				" - Always* has abstract methods; however, default keyword allows for a concrete method.\r\n" + 
				" - Classes must use *implements* keyword\r\n" + 
				" - A class may implement multiple interfaces. \r\n" + 
				" - (now has ability to have concrete metods)" +
				"  You do not have to have implemenations of methods in an abstract class.\\n\"\r\n" +  
				" - If you want a method that should always be overriden or implemented in a child class you should make the method abstract.\r\n" + 
				" - Marker Interface: Sole purpose is to give a type to an object/class\n" 
				+ "Java Collections Framework\n"
				+ " - Collections Framework is a group of classes and interfaces used for data structures.\n"
				+ " - A collection is an object which is designed to hold other objects.\n"
				+ " - How it is stored and which methods are available depend on the object\n"
				+ "List\n"
				+ " - Orded: preserves the order of insertion"
				+ "\n - Allows duplicates"
				+ "\nArrayList"
				+ "\n - backed by an array"
				+ "\n - Traversal is faster than Linked list"
				+ "\nLinkedList"
				+ "\n - Traversal slower than ArrayList"
				+ "\n - Insertion/Deltion is faster"
				+ "\nVector"
				+ "\n - Thread safe ArrayList"
				+ "\nQueue"
				+ "\n - Used when elements should added and removed in a certain order"
				+ "\n - FIFO - First in, First out"
				+ "\n - LILO - Last in, Last out"
				+ "\nStack"
				+ "\n - Stack of books:- First in, Last out"
				+ "\n - if((((((x))))))) {"
				+ "\n				somecode();"
				+ "\n - }"
				+ "\n - ArrayDeque"
				+ "\nDeque - Double Ended Queue"
				+ "\n - Both FIFO and FILO"
				+ "\n - Grab an element form the top or bottom of the collection"
				+ "\n - Deck of Cards"
				+ "\nSet"
				+ "\n - Not index driven"
				+ "\n - Unique elements only "
				+ "\n - Does not preserve the order of insertion"
				+ "\nHashSet\n"
				+ " - backed by a HashMap"
				+ "\n - no order when iterating"
				+ "\n - allow one null value\n"
				+ "TreeSet"
				+ "\n - backed by a sorted tree"
				+ "\n - maintains order"
				+ "\n - no null values"
				+ "\nHash vs Tree - Hash"
				+ "\n - Unordered: Tree - Ordered\n"
				+ "Map"
				+ "\n - Elements are accessed via a Key-Value Pair"
				+ "\n - essentially a dictionary, or ssid to person"
				+ "HashMap\n"
				+ " - Insertion and Deletion is constant"
				+ "\n - Allows for one null key and many null values"
				+ "\n - Key -'Tom', Value - User Object w/ all information"
				+ "TreeMap\n"
				+ " - Keys are sorted, maintain order"
				+ "\n - Adding and deleting is slow"
				+ "\nHashtable"
				+ "\n - HashMap that is Thread-safe"
				+ "\n - no null keys or values"
				+ "\n - (deprecated)"
				+ "\n\nIterator"
				+ "Tell the difference between the Java Collections Framework (JCF), the collection class and the collection interface:::\n"
				+ " - JCF - this framework is conglomeration of objects designed for data storage (includes maps)"
				+ " - Collection interface - Underneath Iterable: Collections inherit: Queue, List, Set"
				+ " - Collection class - Utility class"
				+ " - - this has methods that are available to all collections "
				+ "	- - Collections.sort(list);"
				+ " - - people.sort() ->  "
				+ "class"
				+ "\n - Object that iterates over a location\n"
				+ " - hasNext() iterator.hasNext() -> boolean, does it have another element"
				+ " - next()    iterator.next() ->  return of the next element"
				+ "\n\nComparable"
				+ "\n - Interface allows us to say how objects should be sorted in a collection"
				+ "\n - Returns an integer\n"
				+ " - Negative: means smaller\n"
				+ " - 0 means same\n"
				+ " - Positive means larger\n"
				+ "  - - Can only have one comparable - compareTo();"
				+ "\n\nComparator\n"
				+ " - Object that is used to sort a collection\n"
				+ " - an object can have many comparators\n"
				+ "\nDesign Pattern"
				+ " - \nEstablished convention to solve a software development problem.\n"
				+ " - Promotes reusability, low maintenance - easy to understand\n"
				+ " - Why? Coding speed (automated ways of doing things)\n"
				+ " - Efficiency\n"
				+ " - Easy to read, other coders can understand it"
				+ ""
				+ "\n\nSingleton\n"
				+ " - Solution to making an object we only ever want one instance of in entire program."
				+ "\nprivate construtor"
				+ "\n - private static variable of the Class"
				+ "public method that will handle creating the object"
				+ "\n\n"
				+ "Factory\n"
				+ " - Solution to write code that creates Objects whose type will not be known until runtime\n"
				+ " - Abstract type\n"
				+ " - Classes will inherit it\n"
				+ " - Static method returns concrete\n"
				+ ""
				+ "");
		String day5 = day4 + ""
				+ "\n5.)___Day_5____\n"
				+ "###################\n"
				+ "Generics \n"
				+ " - enforces compile time restraints of what type of object is allowed in a collection\n"
				+ "List<String> list = new ArrayList<String>();"
				+ "Set<? extends Object> myset = new HashSet<? extends Object>();"
				+ "Map<String, Person>"
				+ "\n\nFile I/O"
				+ "\n - File I/O is accessing data from a resource outside the JRE "
				+ "\n  - - input - reading data "
				+ "\n  - Stream - Data is passed as bytes"
				+ "\n -  Reader/Writer - - Data is passed as characters"
				+ "\n -  FileInputStream  - reads in bytes"
				+ "\n  - FileReader - reads characters"
				+ "\n  - BufferedReader - reads a file by line and is generally more efficient than just a filereader"
				+ "\n\nReflection API"
				+ "\n - Allows us access class information at runtime."
				+ "\n - -  Class name, method names, variables, etc"
				+ "\n - Is a way for Java to essentially write Java code from within Java."
				+ "\n\nLog4J"
				+ "\n - Reliable, fast and flexible logging framework"
				+ "\n Why do we log?"
				+ "\n - Record events that occur during execution"
				+ "\n - Allows informatin to the segments of code we do not have access to."
				+ "\nLog Levels"
				+ "\n - All"
				+ "\n - Debug"
				+ "\n - Error"
				+ "\n - Fatal"
				+ "\n - Info - tells what is going on (good for putting in console), i.e. Recursive."
				+ "\n - Off"
				+ "\n\nLog4J is a Dependency, put in pom.xml: https://mvnrepository.com/"
				+ "\n - https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core (Placed in pom.xml)"
				+ "\n - place snippet into new 'log4j2.xml' into resources folder"
				+ "\n -Steps:"
				+ "\n - 1.)Add log4J dependency to pom.xml file. (Right click project -> Maven -> Update Project)"
				+ "\n - 2.)Configure your log4j2.xml file; put in src/main/resources. (Copy/Past from previous log4j2.xml) "
				+ "\n - 3.)Create logger class, MyLogger"
				+ "\n - 3a.)Add a public static final Logger. Uses LogManager.getLogger (MyLogger.class)"
				+ "\n - 4.)Use that static variable anywhere in your code."
				+ "\n\nLambdas"
				+ "\n - enable functional programming in Java"
				+ "\n - ability to define behavior independent of any class"
				+ "\nWhy use Lambdas"
				+ "\n - Allows us to make code more concise"
				+ "\n - removes boiler plate code"
				+ "\n - Enables passing functions as a value/parameters"
				+ "\nLambda Creation"
				+ "\n - We make a functional interface"
				+ "\n - - @FunctionalInterface"
				+ "\n - - Has only *one* (abstract) method "
				+ "\n - - (with Default keyword, this can be stretched)"
				+ "\n - We use arrow notation to define parameters and a segment of code"
				+ "\n\nThreads"
				+ "\n - Process"
				+ "\n - - is an executing program"
				+ "\n - - process is composed of one ot many htreads"
				+ "\n - Thread"
				+ "\n - - Smallest unit of commands that can be executed"
				+ "\n - - Subset of a process"
				+ "\n - - All Java programs have a main thread"
				+ "\n - - Threads can spawn off of other threads"
				+ "\n - Multi-threading"
				+ "\n - - The abilit for multiple threads to exist concurrently and run individually in parallel"
				+ "\n - - Each thread can have its own task"
				+ "\n - - OS divides processing time between threads"
				+ "\n - Why use multi-threading?"
				+ "\n - - Two heads are faster than one"
				+ "\n - - Decides what process in a program should have resources"
				+ "\n - Priorities"
				+ "\n - - dictate when they are run: minpriority = 1, maxpriority = 10"
				+ "\n - Create a thread"
				+ "\n - - Create a class that extends the Thread class"
				+ "\n - - Override the run() method"
				+ "\n - - Call the start() method"
				+ "\n - Another way to create a thread:"
				+ "\n - - Create a class that implements Runnable"
				+ "\n - - Instantiate the class"
				+ "\n - - Call the start() method"
				+ "\n - Scheduler - decides what threads run and when"
				+ "\n - 'Synchronized' keyword"
				+ "\n - - only one thread can access this method/variable at a time"
				+ "\nThread Lifecycle"
				+ "\n - new: newly created Thread not yet started"
				+ "\n - runnable: ready for execution but waiting for a resource"
				+ "\n - running: schedular has selected this thread to run"
				+ "\n - blocked: waiting for a monitor to release a lock on a synchronized method or block"
				+ "\n - terminated: Thread has finished"
				+ "\n\nDeadlock - Situation in which two or more threads are trying to access the other threads's \n"
				+ "resource(s) but neither is allowing access."
				+ "\n\nLivelock - Situation in which 2 ore more threads are both 'offering' up their\n"
				+ "resources and waiting for the other to use it.";
		
		
		System.out.println(day5);
//		public static void concat(int num, String names) {
//			for (int i=0; i< names.length; i++) {
//				System.out.print(name[i] +_" ");
//			}
//		}
			 
	}

//	@Override
//	public String toString() {
//		return "Primitives [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	} 

	public static void multiply(int n1, int n2) {
		System.out.println(n1 * n2);

	}

	public static void add(Integer n3, Integer n4) {
		System.out.println(n3 + n4);
	}
	
	

}

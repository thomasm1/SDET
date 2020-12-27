//
////define the interface for creating criteria 
//interface PredicateInterfaceCheckEmployee {
//	boolean check(Employee e);
//
//	// write a method that filters Employees based on given criteria.
//public void filterEmployees(ArrayList<Employee> dataList, CheckEmployee p){ 
//	���Iterator<Employee> i = dataList.iterator(); ���
//	while(i.hasNext()){ ��������
//		if(p.check(i.next())){ �������������
//			i.remove(); ����} ���} }
//
////create a specific criteria by defining a class that implements CheckEmployee 
//	class MyCheckEmployee implements CheckEmployee {
//	public boolean check(Employee e){ �������
//		return e.getSalary()>100000; ���}
//	};
//
////use the filter method with the specific criteria to filter the collection. 
//filterEmployees(employeeList, new MyCheckEmployee());   
//
////This is a very common requirement across applications. The purpose of Predicate interface (and other standard functional interfaces) is to eliminate the need for every application to write a customized interface.��For example, you can do the same thing with the Predicate interface as follows -   
//public void filterEmployees(ArrayList<Employee> dataList, Predicate<Employee> p){ �
//	��Iterator<Employee> i = dataList.iterator(); ���
//	while(i.hasNext()){ ��������
//		if(p.test(i.next())){ �������������
//			i.remove(); ���
//			�} ���} }
//
////Instead of defining a MyPredicate class (like we did with MyCheckEmployee), we could also define and instantiate an anonymous inner class to reduce code clutter 
//	Predicate<Employee> p = new Predicate<Employee>(){ ��
//		public boolean test(Employee e){
//} }; 
//
//filterEmployees(employeeList,p);
//}filterEmployees(employeeList,e->e.getSalary()>100000);
//
//}
///*
// * Note that both the interfaces (CheckEmployee and Predicate) can be used with
// * lambda expressions in exactly the same way.��Instead of creating an anonymous
// * inner class that implements the CheckEmployee or Predicate interface, you
// * could just do - The benefit with Predicate is that you don't have to write
// * it. It is already there in the standard java library.
// * 
// * java.util.function.Predicate is one of the several functional interfaces that
// * have been added to Java 8. This interface has exactly one abstract method
// * named test, which takes any object as input and returns a boolean. This comes
// * in very handy when you have a collection of objects and you want to go
// * through each object of that collection and see if that object satisfies some
// * criteria. For example, you may have a collection of Employee objects and, in
// * one place of your application, you want to remove all such employees whose
// * age is below 50, while in other place, you want to remove all such employees
// * whose salary is above 100,000. In both the cases, you want to go through your
// * collection of employees, and check each Employee object to determine if it
// * fits the criteria. This can be implemented by writing an interface named
// * CheckEmployee and having a method check(Employee ) which would return true if
// * the passed object satisfies the criteria. The following code fragments
// * illustrate how it can be done -
// * 
// */

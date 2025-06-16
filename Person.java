// public class StudentDetails {
//      String name;
//      int age;
//      String grade;

//     public StudentDetails(String name, int age, String grade) {
//         this.name = name;
//         this.age = age;
//         this.grade = grade;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getGrade() {
//         return grade;
//     }

//     @Override
//     public String toString() {
//         return "StudentDetails{" +
//                 "name='" + name + '\'' +
//                 ", age=" + age +
//                 ", grade='" + grade + '\'' +
//                 '}';
//     }
//   public static void main(String[] args) {
//         StudentDetails student = new StudentDetails("John Doe", 20, "A");
//         System.out.println(student);
//     }


// }


// it is a programming approach that approach that orgnize code into class and objects.
// and make it more structured and easy to manage.
// a class is a blueprint for creating objects, and an object is an instance of a class.



// public class StudentDetails{
//     String name;
//     String University;
//     float salary;

//     int age;
//     String grade;
//     public StudentDetails(String name, String University, int age, String grade,float salary) {
//         this.name = name;
//         this.University = University;
//         this.age = age;
//         this.grade = grade;
//         this.salary = salary;
//     }
    

//     public String getName() {
//         return name;
//     }
//     public String getUniversity() {
//         return University;
//     }
//     public int getAge() {
//         return age;
//     }
//     public String getGrade() {
//         return grade;

//     }
//     public float getSalary() {
//         return salary;
//     }
//     @Override
//     public String toString() {
//         return "StudentDetails{" +
//                 "name='" + name + '\'' +
//                 ", University='" + University + '\'' +
//                 ", age=" + age +

//                 ", grade='" + grade + '\'' +
//                 ", salary=" + salary +
//                 '}';
//     }

    
//     public static void main(String[] args) {
//         StudentDetails student = new StudentDetails("Datta Panchal", "Harvard University", 20, "A",1000.0f);
//         System.out.println(student);
//     }


// }


//Inheritance is a fundamental concept in object-oriented programming that allows a class to inherit properties and behaviors (methods) from another class.
// This promotes code reusability and establishes a relationship between classes.
// public class Person {
//     String name;
//     int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public void displayInfo() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
//     public static void main(String[] args) {
//         Person person = new Person("Datta ", 20);
//         person.displayInfo();
//     }
// }
// class one{
//     public void print1(){
//         System.out.println("Good");

//     }



// }
// class two extends one{
//     public void print2(){
//         System.out.println("for");
//     }
// }
// class three extends two{
//     public void print3(){
//         System.out.println("Health");
//     }

//     public static void main(String[] args) {
//         two obj = new two();
//         obj.print1(); // Calling method from parent class
//         obj.print2();



            
//         // Calling method from child class
//     }
// }


// write a program for hybrid inheritance in java
// class Animal {
//     public void eat() {
//         System.out.println("Animal is eating");
//     }
// }
// class Dog extends Animal {
//     public void bark() {
//         System.out.println("Dog is barking");
//     }
// }
// class Cat extends Animal {
//     public void meow() {
//         System.out.println("Cat is meowing");
//     }
// }
// class Person {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat(); // Method from Animal class
//         dog.bark(); // Method from Dog class

//         Cat cat = new Cat();
//         cat.eat(); // Method from Animal class
//         cat.meow(); // Method from Cat class
//     }


// }



// write a program for multilevel  inheritance in java using interfaces
// interface Animal {
//     void eat();
// }
// interface Dog extends Animal {
//     void bark();
// }
// interface Cat extends Animal {
//     void meow();
// }
// class DogImpl implements Dog {
//     public void eat() {
//         System.out.println("Dog is eating");
//     }
//     public void bark() {
//         System.out.println("Dog is barking");
//     }
// }
// class CatImpl implements Cat {
//     public void eat() {
//         System.out.println("Cat is eating");
//     }
//     public void meow() {
//         System.out.println("Cat is meowing");
//     }
// } 
// public class Person {
//     public static void main(String[] args) {
//         DogImpl dog = new DogImpl();
//         dog.eat(); // Method from Animal interface
//         dog.bark(); // Method from Dog interface

//         CatImpl cat = new CatImpl();
//         cat.eat(); // Method from Animal interface
//         cat.meow(); // Method from Cat interface
//     }
// }





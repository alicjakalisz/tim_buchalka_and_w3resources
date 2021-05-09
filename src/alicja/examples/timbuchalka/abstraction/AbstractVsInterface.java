package alicja.examples.timbuchalka.abstraction;

public class AbstractVsInterface {

    /*
    *********ABSTRACT CLASSES***************
    Abstract classes are similar to interfaces:
        You cannot instantiate them,
        they may contain a mix of methods declared with or without implementation;
    Abstract classes you can declare fields that are not static or final
        (interface needs to have constants (static, final) or nothing)
    Abstract classes can have public, protected and private methods (interface only public)
    Abstract class can extend only one parent class but it can implement multiple interfaces
    When an abstract class is subclassed (has a subclass), the subclass usually provides implementations of all
    of the abstract methods in its parent class (if not then the subclass needs to be declared as abstract as well)

    USE ABSTRACT CLASS when:
       * you want to share the code among several closely related classes(animal with fields name, age)
       *you expect subclasses to have many commmon methods or fields
       *also when you want to declare NON static and NON final fields (as interface lets you only static final),
        this will enable you to defne methods that can modify the state of objects (its fields - getName, set Name)
       * when you have a requirement for your base class to provide method with default implementation but
       child classes later can override it (interface cannot have implementation, only declaration)
       * ABSTRACT class is a print for multiple derived classes that can share similar  definietiion

  ********INTERFACES************************
  * only declaration of methods of the class, NOT the implementation
  * all the methods are public and abstract
   *interadace can extend another interface
   * more flexible and can make the design of the program easier
   * since java interfaces can as well contain default methods (with implementation, before it was not possible
   * can contain private emthods as well now
   *
  WHEN uSE
  * unrelated classes
  * you want to separate dfferent behaviour
    */
}

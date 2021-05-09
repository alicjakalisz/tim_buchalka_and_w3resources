package alicja.examples;

public class ByReferenceValueMain {

    public static void main (String[] args){
        int a=45;
        int b=55;
        System.out.println("Before running method: a= " + a);
        notchangeParameter(a);// method is run
        System.out.println("After running method: a= " + a);


        Person javier=new Person("Javier"); // created object of class alicja.examples.Person and intialized it / new is a contructor and in the parenthesis you have attributes
        System.out.println(" Before The name of the person is "+ javier.getName());// getmethod is called on object Javier , getmethod only returns the only one attribute -"Javier".

        // in the contructors you pass name and this name is returned in the method.
        // so when you want to print the name you need to creat the object, pass the name in constructors and call the method whcih will return this name which we passed
        changeParameterToDavid(javier);
        System.out.println("After The name of the person is "+ javier.getName());
    }

    public static void changeParameterToDavid(Person a){
        a.setName("David");
    }

    public static void notchangeParameter(int myParameter){
        myParameter=myParameter+2;
        System.out.println(" Parameter modified but only inside the method as it is promitive type: "+ myParameter);
    }

    //when you pass a primitive type or Wrapper classe variable into the method (into parameters) and the method is changing it inside of its scope,
    // it will not be modified outside of this method. it will modify only object so when it leaves the method it will be modifiy because variable that hold objects, are not storing
    // this object but inlky showing the address of this object in the memory so the method finds it in the memeory and changes it.

}

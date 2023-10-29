/*
Encapsulations example (Create package name ‘encapsulation26’ and create all below classes in this package)

public class Encapsulate {

// private variables declared these can only be accessed by public methods of class
private String name;
private int rollNo;
private int age;

//set method for name to access private variable name
public void setName(String name) {
this.name = name;
}

// get method for Name to access private variable age
public String getName() {
return name;
}

// get method for roll to access private variable rollNo
public int getRollNo() {
return rollNo;
}

// set method for roll to access private variable rollNo
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}

// get method for age to access private variable age
public int getAge() {
return age;
}

// set method for age to access private variable age
public void setAge(int age) {
this.age = age;
}

public class TestEncapsulation {
public static void main(String[] args) {
Encapsulate obj = new Encapsulate();

// setting values of the variables
obj.setName("Amit");
obj.setAge(19);
obj.setRollNo(51);

// Displaying values of the variables
System.out.println("Prime's name: " + obj.getName());
System.out.println("Prime's age: " + obj.getAge());
System.out.println("Prime's rollNo: " + obj.getRollNo());

// Direct access of rollNo is not possible due to encapsulation
// System.out.println("Prime's rollNo : " + obj.geekName);
}
}

 */

public class Program26_Encapsulation {

    // Private variables declared; these can only be accessed by public methods of the class
    private String name;
    private int rollNo;
    private int age;

    // Set method for name to access the private variable name
    public void setName(String name) {
        this.name = name;
    }

    // Get method for Name to access the private variable age
    public String getName() {
        return name;
    }

    // Get method for roll to access the private variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Set method for roll to access the private variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Get method for age to access the private variable age
    public int getAge() {
        return age;
    }

    // Set method for age to access the private variable age
    public void setAge(int age) {
        this.age = age;
    }

    public class Program26_TestEncapsulation {

        public static void main(String[] args) {
            Program26_Encapsulation obj = new Program26_Encapsulation();

            //setting values of the variables
            obj.setName("Amit");
            obj.setAge(19);
            obj.setRollNo(51);

            //displaying values of the variables
            System.out.println("Name: " + obj.getName());
            System.out.println("Age: " + obj.getAge());
            System.out.println("RollNo: " + obj.getRollNo());
        }
    }
}

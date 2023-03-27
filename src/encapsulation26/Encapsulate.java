package encapsulation26;
//26. Encapsulations example (Create package name ‘encapsulation26’ and create all
//below classes in this package)
public class Encapsulate {

    //private variables declared these can only be accessed by public methods of class
    private String name;
    private int rolNo;
    private int age;

    // get method for name to access private variable name

    public String getName(){
        return name;
    }
    //set method for name to access private variable name
    public void setName(String name){
        this.name = name;
    }
    // get method for roll to access private variable rollNo

    public int getRolNo() {
        return rolNo;
    }

    //set method for roll to access private variable rollNo

    public void setRollNo(int rollNo){
        this.rolNo = rollNo;
    }
    //get method for age to access private variable age

    public int getAge(){
        return age;
    }

    // set method for age to access private variable age
    public void setAge(int age){
        this.age = age;
    }


        }



package LearnJava;

public class Student{
    public int id;
    public String name, address;
    public Student(int id, String name, String address){
        this.name = name;
        this.address = address;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        return this.id == ((Student) obj).id;
    }
}
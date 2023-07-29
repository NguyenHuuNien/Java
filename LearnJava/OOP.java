package LearnJava;

import mypack.Person;

public  class OOP{
    public static void main(String[] args) {
        Person[] a = new Person[2];
        for (int i = 0; i<2; i++){
        a[i] = new Person("Nien"+i,18+i,220000+i*234);
        
        System.out.println(a[i].name);
        System.out.println(a[i].age);
        System.out.println(a[i].mssv);
        }

        a[0].tabemasu("ringo");
        a[1].nansai();
        System.out.println(Person.kuNi);
        System.out.println("a[0]: "+ a[0].total);
        System.out.println("Person: "+ Person.total);

    }
}
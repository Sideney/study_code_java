package jmu.reflection;

import java.lang.reflect.Field;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //Person person = new Student();
        Person person = new Student();
        //Person person = new Student();会报错 java.lang.NoSuchFieldException c1.getDeclaredField("name");
        Class c1 = person.getClass();
/*        Student student =new Student();
        Class c2 = student.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        Class c3 = Class.forName("jmu.reflection.Student");
        System.out.println(c3.hashCode());
        Class superclass = c3.getSuperclass();
        System.out.println(superclass);*/
        person.setName("jack");
        person.setAge(19);
        Field age = c1.getSuperclass().getDeclaredField("name");
        System.out.println(age);
        System.out.println(person.getName());
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field field:declaredFields){
            System.out.println(field.toString());
        }


    }
}

class Person{
    public String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}

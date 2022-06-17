package EasyJava.ch07.pro06;

public class Student implements Human{
    int age;
    Student (int age){
        this.age = age;
    }
    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }

    public void print(){
        System.out.println(this.age + "세의 학생입니다.");
    }
}

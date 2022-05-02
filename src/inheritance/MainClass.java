package inheritance;

class Student{
    String name;
    String num;
    String phone;
    String home;
    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }
    public void study(){
        System.out.println("공부하다");
    }
    public void eat(){
        System.out.println("먹다");
    }
}

class Leader extends Student{
    boolean leader;
    public Leader(String name, String num, boolean leader){
        super(name, num);
        this.leader = leader;
    }
    public void isLeader(){
      if(leader) System.out.println(name+"은 학급회장입니다.");
      else System.out.println(name+"은 학급회장이 아닙니다.");
    };
}

public class MainClass {
    public static void main(String[] args) {
        Leader hong = new Leader("홍길동", "30130", true);
        hong.isLeader();


    }
}

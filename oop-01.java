/*
class Employees{
    int Salary;
    String name;
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;

    }
 }
class CellPhone{
    public void Ringing(){
        System.out.println("Ringing......");
    }
    public void Vibrating(){
        System.out.println("Vibrating......");
    }
    public void CallFriend(){
        System.out.println("Calling a Friend......");
    }
}
*/
//class Square{
//    int side;
//    public int area(){
//        return side * side ;
//    }
//    public int perimeter(){
//        return 4 * side;
//    }
//}
//class Rectangle{
//    int length;
//    int width;
//    public int area(){
//        return length * width;
//    }
//    public int perimeter(){
//        return (length + width) * 2;
//    }
//}
//class Tommy{
//    public void Hit(){
//        System.out.println("Hitting the enemy.......");
//    }
//    public void Run(){
//        System.out.println("Running From the  enemy.......");
//    }
//    public void Fire(){
//        System.out.println("Fireing the enemy.......");
//    }
//
//}
class Circle{
  int radius;
  public double area(){
      return radius * 3.14 * radius;
  }
  public double perimeter(){
      return 2 * 3.14 * radius;
  }
}
public class CWH_39_chapter8_PracticeSet {
  public static void main(String[] args) {
      //Problem 01
//        Employees harry = new Employees();
//        harry.setName("CodeWithHarry");
//        harry.Salary = 10200;
//        System.out.println(harry.getSalary());
//        System.out.println(harry.getName());
//        //Problem 02
//       CellPhone Samsung = new CellPhone();
//       Samsung.Ringing();
//        Samsung.Vibrating();
//        Samsung.CallFriend();
     //Problem 03
//        Square sq = new Square();
//        sq.side = 4;
//        System.out.println( sq.area());
//        System.out.println(sq.perimeter());
      //Problem 04
//        Rectangle r1 = new Rectangle();
//        r1.length = 2;
//        r1.width = 3;
//        System.out.println(r1.area());
//        System.out.println(r1.perimeter());
      //Problem 05
//        Tommy player = new Tommy();
//        player.Fire();
//        player.Hit();
//        player.Run();
      //Problem 06

        Circle c1 = new Circle();
        c1.radius = 3;
      System.out.println(c1.area());
      System.out.println(c1.perimeter());

  }
}

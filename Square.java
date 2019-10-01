import java.util.*;
class Square
{

  int a;
  public Square(int a)
  {
    this.a = a;
  }

  public long Area()
  {
    return Math.pow(this.a,2);
  }

  public long Perimeter()
  {
    return 4*a;
  }

  public double Diagonal()
  {
    return Math.sqrt((a*a)+(a*a));
  }
  
  public static void main(String[] args)
  {
    Scanner jk = new Scanner(System.in);
    Square sq = new Square(jk.nextInt());
    System.out.println(sq.Area());
    System.out.println(sq.Perimeter());
    System.out.println(sq.Diagonal());
  }
}

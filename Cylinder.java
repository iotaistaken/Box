class Cylinder
{
  public static void main(String[] args)
  {
    Scanner jk = new Scanner(System.in);
    System.out.println("Enter radius");
    int r = jk.nextInt();
    System.out.println("Enter Height");
    int h = jk.nextInt();
    double ans = Math.pi*Math.pow(r,2)*h;
    double area =2*Math.pi*r*h;
    double ar2 = area+2*Math.pi(r,2);
    System.out.println("Volume" + ans);
    System.out.println("Surface Area" + area);
    System.out.println("Total Surface Area" + area);
    
    
  }
}

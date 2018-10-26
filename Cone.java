class Cone
{
  public static void main(String[] args)
  {
    Scanner jk = new Scanner(System.in);
    System.out.println("Enter radius");
    int r = jk.nextInt();
    System.out.println("Enter Height");
    int h = jk.nextInt();
    double ans = (1/3)*Math.pi*Math.pow(r,2)*h;
    double l = Math.sqrt(Math.pow(r,2)+Math.pow(h,2));
    double area =Math.pi*r*l;
    double ar2 = area+Math.pi(r,2);
    System.out.println("Volume" + ans);
    System.out.println("Surface Area" + area);
    System.out.println("Total Surface Area" + area);
    
    
  }
}

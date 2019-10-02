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
}

interface Swimming{
    void swim();

    
}
 interface Flying {
void flay();
    
}

 class Bird implements Swimming , Flying{
    public void swim(){
       System.out.println("Bird Is Swimming");
}
  public void flay(){
    System.out.println("Bird Is Flying");
  }
}
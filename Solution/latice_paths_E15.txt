
public class E15
{
  
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
     int gridSize = 20;
long paths = 1;
 
for (int i = 0; i < gridSize; i++) {
    paths *= (2 * gridSize) - i;
    paths /= i + 1;
}
   System.out.println(paths); 
}
}
//https://www.mathblog.dk/project-euler-15/
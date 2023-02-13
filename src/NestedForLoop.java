public class NestedForLoop
{
    public static void main(String[] args)
    {

   // we nest for loops to do 2 dimentional structures
   // typically for output tables.  Examples are the tables
   // that children use to learn arithmetic fnctons like multiplication

   // Multiplication table 12 X 12

       for(int row = 1; row <= 12; row++)
       {
           System.out.print("|");
           for (int col = 1; col <= 12; col++)
           {
               System.out.printf("%4d |", row * col);
           }
           System.out.println(); // don't want everything on one line!
       }
   }
}

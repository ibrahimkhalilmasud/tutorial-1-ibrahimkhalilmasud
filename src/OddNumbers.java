import java.util.Scanner; // import Scanner


class OddNumbers{
    public static void main (String args[]){
        int r,i;
        Scanner scan=new Scanner(System.in); //create a scanner object for input


        System.out.print("Please enter X: ");  // X from user
        int X = scan.nextInt();

        System.out.print("Please enter Y: ");  // Y from user
        int Y = scan.nextInt();

//        System.out.println("Difference :");
//       for (
//               int z =Y - X;
//               return z;
//               )
        System.out.print("\nDifference numbers between "+X+" and "+Y+" are :\n");
        for(i=X; i<=Y; i++){
            r=i%2;
            if(r==1)
                System.out.println(i);

            }
    }
}

public class Pattern{
        public static void main(String [] args)
        {
            int n=10 ;
            for(int i=0 ;n<10 ;i++)
            {
                for(int j=0 ; j<10 ;j++)
                    if ((j==0 &&i>0) ||(i==(n-1)/2 && j<=(3*n)/4) ||( i==0 && j< (3*n)/4) ||(j==(3*n)/4 && i>0 ) )  {
                        System.out.println("*");
                    }
                    else {
                        System.out.println("");
                    }
            }
        }

}

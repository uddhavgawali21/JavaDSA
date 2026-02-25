public class Pattern2 {
    void pattern1(int n){                  //Onesided pyramid                   
        for(int i=0; i<n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern2(int n){                  //onsided reveerse pyramid
        for(int i= 0; i<n; i++){
            for(int j=0; j < (n-i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
    void pattern3(int n){                   //Pyramid of number
        for(int i= 1; i<= n; i++){
            for(int j=1; j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    void pattern4(int n){                    //pyramid of number
        for(int i= 1; i<= n; i++){
            for(int j=1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    void pattern5(int n){                    //Pyramid
        for(int i =1; i <= n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern6(int n){                       //reverse pyramid
        for(int i =1; i <= n; i++){
            for(int j = 1; j<= i+1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*(n-i)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 p = new Pattern2();
    //  p.pattern1(5);
    //  p.pattern2(5);
    //  p.pattern3(5);
    //  p.pattern4(5);
    //    p.pattern5(4);
          p.pattern6(4);

    }
}

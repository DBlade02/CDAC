class Main1 {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Pattern1(4);
        System.out.println("");
        Pattern2(4);
        System.out.println("");
        Pattern3(4);
        System.out.println("");
        Pattern4(5);
        System.out.println("");
        Pattern5(5);
        System.out.println("");
        Pattern6(5);
    }
    static void Pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void Pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void Pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void Pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    static void Pattern5(int n){
        for (int i = 0; i < 2 * n; i++) {
            int total =i>n?2*n-i:i;
            for(int j=0;j<total;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n){
        for (int i = 0; i < 2 * n; i++) {
            int nospace= 2*n;
            int total =i>n?2*n-i:i;
            for (int s =0; s <nospace-total; s++){
                System.out.print(" ");
            }
            for(int j=0;j<total;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
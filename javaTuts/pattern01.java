class pattern01 {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {// number of rows the program requires
            for (int col = 1; col<=row; col++){ // col< rows for 4 rows 3 cols max will print 
                System.out.print("* ");
            }
            System.out.println();//new line after every row 
        }
    }

    static void pattern2(int n){
        for (int row =1;row<=n;row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

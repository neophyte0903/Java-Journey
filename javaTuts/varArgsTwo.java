class varArgsTwo {
    public static void sum(int... x){
        int total=0;
        for (int i:x){//for int i in x
            total=total+i;
        }
        System.out.println("sum is "+total);
    }
    

    public static void main(String[] args) {
        System.out.println("demonstration");
        sum();
        sum(10);
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
    }
}

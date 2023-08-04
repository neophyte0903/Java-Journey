 class varArgs {
    public static void m1(int... x){
        System.out.println("number of arguements"+x.length);
        System.out.println("hello world");
        
    } 

    public static void main(String[] args) {
        m1();
        m1(10,20);
        m1(10,20,30);
    }
}

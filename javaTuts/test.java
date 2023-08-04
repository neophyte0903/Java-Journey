// class test{
//     int x;
//     protected int num=32;
//     static int y=32;
//     public static void main(String[] args) {
//         final int z=10;
//         test t=new test();
//         test r=new test();
//         System.out.println(t.y);
//         t.y=45;
//         System.out.println(t.x);
//         System.out.println(t.x+"..."+t.y);
//         System.out.println(r.x+"..."+r.y);
//         System.out.println(y);
//         System.out.println(z);
//         System.out.println(t.num);
//         System.out.println(sum(20, 30));

//     }
//     public static int sum(int a,int b){
//         int result=a+b;
//         return result;
//     }
// }



/*class test{
    static{
        System.out.println("print");
        //System.exit(0); //jvm shuts down
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}*/

class test{
    // public static void main(String[] args) {
    //     int n=Integer.parseInt(args[0]);
    //     System.out.println(n*n);
    // }
    private String name;
    public void setname(String name) {
        this.name="name";
    }
}
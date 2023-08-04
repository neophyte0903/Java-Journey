public class StudentBean {
    private String name;
    public void setName(String name) {
        this.name="name";
        
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        double x='a';
        double y=++x;
        String s="soda";
        int a=10;
        int b= 20;
        int c=30;
        s=s+b+c;
        System.out.println(x+","+y);
        System.out.println(0.0/0);
        System.out.println(s);
    }
}

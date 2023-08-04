class arrayThree {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{10,20,30}));
    }
    public static int sum(int[] x){
        int total=0;
        for(int i : x){
            total=total+i;
        }
        return total;
    }
}

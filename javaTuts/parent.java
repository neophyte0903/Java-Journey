class parent {
    public static void main(String[] args) {
        System.out.println("valid main");
    }
    class child extends parent{
        public static void main(String[] args) {
            System.out.println("child main");
        }
    }
}

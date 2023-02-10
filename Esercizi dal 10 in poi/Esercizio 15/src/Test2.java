public class Test2 {
    public static void main(String[] args) {

        String name = "G1ior3gio";
name.strip();
        System.out.println(name);

        for (int i = 0; i <name.length() ; i++) {
            if (!Character.isDigit(name.charAt(i))){

                System.out.println("non é un numero");
            }else System.out.println("suca");
        }
    }
}

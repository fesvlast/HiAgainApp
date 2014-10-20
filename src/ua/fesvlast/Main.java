package ua.fesvlast;

public class Main {

    public static void main(String[] args) {
        System.out.print("Hello, world!\n");
        System.out.print("And hi again!\n");

        int num =5+(int)(Math.random()*((50-5)+1));
        StringBuilder explMark=new StringBuilder();

        for(int i=0; i<=num; i++){
            explMark.append("!");
        }
	    System.out.println(explMark);
    }
}

import java.util.*;

public class hangman{
    static String word = "";
    static int stage = 0;
    static char[] arr;
    static boolean done = false;

    private static void printPic(int n){
        if(n==0){
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("---");
        }
        if(n==1){
            System.out.println(" |   ");
            System.out.println(" |   ");
            System.out.println(" |   ");
            System.out.println(" |  ");
            System.out.println(" |  ");
            System.out.println(" |   ");
            System.out.println("---");
        }
        if(n==2){
            System.out.println(" ____");
            System.out.println(" |   ");
            System.out.println(" |   ");
            System.out.println(" |   ");
            System.out.println(" |  ");
            System.out.println(" |  ");
            System.out.println(" |   ");
            System.out.println("---");
        }
        if(n==3){
            System.out.println(" ____");
            System.out.println(" |   \\");
            System.out.println(" |   |");
            System.out.println(" |   ");
            System.out.println(" |  ");
            System.out.println(" |  ");
            System.out.println(" |   ");
            System.out.println("---");
        }
        if(n==4){
            System.out.println(" ____");
            System.out.println(" |   \\");
            System.out.println(" |   |");
            System.out.println(" |   O");
            System.out.println(" |  ");
            System.out.println(" |  ");
            System.out.println(" |   ");
            System.out.println("---");
        }
        if(n==5){
            System.out.println(" ____");
            System.out.println(" |   \\");
            System.out.println(" |   |");
            System.out.println(" |   O");
            System.out.println(" |  /|\\");
            System.out.println(" |  ");
            System.out.println(" |   ");
            System.out.println("---");
        }
        if(n==6){
            System.out.println(" ____");
            System.out.println(" |   \\");
            System.out.println(" |   |");
            System.out.println(" |   O");
            System.out.println(" |  /|\\");
            System.out.println(" |  / \\");
            System.out.println(" |   ");
            System.out.println("---");
            System.out.println("YOU LOSE!");
        }
    }

    private static void printFull(int n){
        printPic(n);
        for(char c : arr){
            System.out.print(c);
        }
        System.out.println();
    }

    private static void setWord(String input){
        word=input;
        arr = new char[input.length()];
        for(int i = 0; i<arr.length; i++){
            arr[i]='_';
        }
        int i=0;
        while(i<9999){
            System.out.println();
            i++;
        }
    }

    private static void guess(String input){
        if(!word.contains(input)){
            stage++;
        }
        else{
            for(int i = 0; i<arr.length; i++){
                if(word.charAt(i)==input.charAt(0)) arr[i]=input.charAt(0);
            }
        }
        printFull(stage);
        done=true;
        for(char c : arr){
            if(c == '_') done = false;
        }
        if(stage>5)done=true;
        

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input Word: ");
        setWord(in.nextLine());


        printFull(stage);

        while(!done){
            System.out.print("guess: ");
            guess(in.next());
            
            
        }



    }

}
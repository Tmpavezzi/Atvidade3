import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);

      System.out.print("Um numero :");
      int n = entrada.nextInt();

      int x = 0;
    while(x<n){
      for(int y=0;y<3;y++){
      for(int i=0;i<3;i++){
      System.out.print("*");
      
      }
      System.out.print("\n");
      x++;
        
      }
      
      
      
    }

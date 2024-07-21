import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          int birthyear;
          System.out.println("***********Çin Zodyağı Hesaplama***********");
         System.out.print("Lütfen doğum yılınızı giriniz: ");
         Scanner input = new Scanner(System.in);
         birthyear = input.nextInt();
         if(birthyear %12 == 0){
             System.out.println("Çin Zodyağı Burcunuz: Maymun");
         }
        else if(birthyear %12 == 1){
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }
        else if (birthyear %12 == 2){
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }
        else if(birthyear %12 == 3){
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }
        else if(birthyear %12 == 4){
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }
        else if(birthyear %12 == 5){
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }
        else if(birthyear %12 == 6){
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }
        else if(birthyear %12 == 7){
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }
        else if(birthyear %12 == 8){
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }
        else if(birthyear %12 == 9){
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }
        else if(birthyear %12 == 10){
            System.out.println("Çin Zodyağı Burcunuz: At");
        }
        else if(birthyear %12 == 11){
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }

    }
}
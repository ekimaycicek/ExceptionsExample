import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
          /*
        Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
         */




        Scanner sc = new Scanner(System.in);
        System.out.print("enter password : ");

        String password = sc.next();

        try {
            if (password.length()<6 ||password.length()>10){
                throw new StringIndexOutOfBoundsException("You entered less than 6 characters or more than 10 characters :( ");
            }
            else System.out.println("password is valid :) "+password);

        } catch (StringIndexOutOfBoundsException ebikGabık) {
            System.out.println(ebikGabık);
            System.out.println(" allah bildği gibi selametle :( ");
        }
        System.out.println("the problem has been handled :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}

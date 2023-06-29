import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution sol=new Solution();
        int choice=0;

        do {
            System.out.println("*************MENU****************\n");
            System.out.println(" 1.CharAt function \n 2.CompareTo method \n 3.Concat Example \n 4.Contains Example \n" +
                    " 5.Equlas Example \n 6.Trim Example \n 7.Value of method \n 8.Length of string \n" +
                    " 9.Join Example \n 10.Uppercase Example \n 11.Lowercase Example \n 12.Split Example \n" +
                    " 13.Replace All Example \n 14.Is Empty Example \n 15.SubString Example \n 16.Exit");
            System.out.println("Enter Your Choice!!!");
            choice= sc.nextInt();
            Solution s = new Solution();
            switch (choice){
                case 1: {
                    String str="love the life you live";
                    sol.returnChar(str);
                }
                break;
                case 2:{
                    sol.compareMethod();
                }
                break;
                case 3:
                {
                    sol.concatEx();
                }
                break;
                case 4: {
                    sol.equlasEx();
                }
                break;
                case 5: {
                    sol.containsEx();
                }
                break;
                case 6: {
                    sol.trimEx();
                }
                break;
                case 7: {
                    sol.valueOfEx();
                }
                break;
                case 8: {
                    String a="Rahul";
                    s.lengthEx(a);
                }
                break;
                case 9: {
                    s.joinEx();
                }
                case 10: {
                    String a="love the life";
                    s.upperCaseEx(a);
                }
                case 11: {
                    String a="LOVE THE LIFE";
                    s.lowerCaseEx(a);
                }
                case 12: {
                    String a="LOVE THE LIFE";
                    s.splitEx(a);
                }
                case 13: {
                    String a="My Name is Rahul";
                    s.replaceAllEx(a);
                }
                break;
                case 14: {
                    s.isEmptyEx();
                }
                break;
                case 15: {
                    s.subStringEx();
                }
                break;
                case 16:
                    System.out.println("Thank You For Visiting !!!!");
                    break;

                default:
                    System.out.println("You Have Enter Wroung Choice!!");

            }
        }while (choice!=16);
    }
}

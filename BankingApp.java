//Java program for Bank Management System.
import java.util.Scanner;  
class BankDetails{  
    private String Account_Number;  
    private String Name;  
    private String Account_Type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    public void openAccount(){  
        System.out.print("Enter Account Number: ");  
        Account_Number = sc.next();  
        System.out.print("Enter Account type: ");  
        Account_Type = sc.next();  
        System.out.print("Enter Name: ");  
        Name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();
        System.out.println("---------------------------------");  
    }  
    public void AccountDetails(){  
        System.out.println("---------------------------------");
        System.out.println("Name of account holder: " + Name);  
        System.out.println("Account Number: " + Account_Number);  
        System.out.println("Account type: " + Account_Type);  
        System.out.println("Balance: " + balance);  
    }   
    public void Deposit(){  
        long amount;  
        System.out.println("Enter the amount you want to deposit: ");  
        amount = sc.nextLong();  
        balance = balance + amount;  
    }  
    public void withdrawal(){  
        long amount;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amount = sc.nextLong();  
        if (balance >= amount){  
            balance = balance - amount;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );  
        }  
    }    
    public boolean Search(String ac_no){  
        if (Account_Number.equals(ac_no)){  
            AccountDetails();  
            return (true);  
        }  
        return (false);  
    }  
}  
class BankingApp{  
    public static void main(String arg[]){
        int ch,j;   
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter the number of customers :");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++){
            j=i+1;
            System.out.println("Costumer "+j);  
            C[i] = new BankDetails();  
            C[i].openAccount();  
        }   
        do {  
            System.out.println("\n\tBanking System Application");  
            System.out.println("1. Display all account details \n2. Search by Account number\n3. Deposit the amount \n4. Withdraw the amount \n0.Exit ");  
            System.out.print("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) { 
                            j=i+1;
                            System.out.println("\nNo.:"+j);  
                            C[i].AccountDetails();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++){  
                            found = C[i].Search(ac_no);  
                            if (found){  
                                break;  
                            }  
                        }  
                        if (!found){  
                            System.out.println("Search failed!!\tAccount doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++){  
                            found = C[i].Search(ac_no);  
                            if (found){  
                                C[i].Deposit();  
                                break;  
                            }  
                        }  
                        if (!found){  
                            System.out.println("Search failed!!\tAccount doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++){  
                            found = C[i].Search(ac_no);  
                            if (found){  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found){  
                            System.out.println("Search failed!!\tAccount doesn't exist..!!");  
                        }  
                        break;  
                    case 0:  
                        System.out.println("See you soon...");  
                        break;
                    default:  System.out.println("Invalid input!!"); 
                }  
            }  
            while (ch != 0);  
            sc.close();
        }       
}  
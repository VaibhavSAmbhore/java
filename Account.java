 class Account{

  int AccountNumber;
  String NameHolder;
  double balance;
  String type;

  public static void main(String arg[])
  {
  	Account account1 = new Account();
  	account1.AccountNumber=1;
  	account1.NameHolder="vaibhav";
  	account1.balance=24000;
  	account1.type="current";

  	System.out.println("AccountNumber="+account1.AccountNumber);
  	System.out.println("NameHolder="+account1.NameHolder);
  	System.out.println("balance="+account1.balance);
  	System.out.println("type="+account1.type);

  }
 }
package Encapsulation;

 class BankApp {
	 public static void main(String[] args) {
		Bank b=new Bank();
		b.setMoney(6000);
		System.out.println("Taking the money"+b.getMoney());
	}

}

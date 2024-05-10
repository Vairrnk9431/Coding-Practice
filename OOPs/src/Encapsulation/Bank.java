package Encapsulation;

 class Bank {
	private int money;
	public void setMoney(int amount) {
		if(amount>0) {
			money=amount;	
		}else {
			System.out.println("kindly enter positive number");
			System.exit(0);
		}
	}
	public int getMoney() {
		return money;
	}
    
}

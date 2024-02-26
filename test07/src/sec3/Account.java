package sec3;

public class Account {
	private int accId; //계좌번호
	private String name; //예금주
	private String bankName; //금융기관
	private int balance; //잔액
	
	public Account() {
		this.balance = 0;
	}
	//작업수행
	public void desk(int no) {
		if (no == 1) {
			
		}
	}
	
	//입금
	public void deposit(int acnt, int money) {
		
	}
	
	//출금
	public void withdraw(int acnt, int money) {
		
	}
	
	//잔액조회
	public void info(int acnt) {
		System.out.print("금융기관\t예금주\t계좌번호\t잔액\t\n");
		System.out.printf("%s\t%s\t%d\t%d\t");
	}
	
	//작업종료
	public void escape() {
		
	}
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

package model;


/**
*	Models a check account.
*
*/


public final class CompteCourant extends Compte{

	public CompteCourant(String owner,double initialBalance){
		super(owner,initialBalance);
	}

	public CompteCourant(String owner){
		super(owner);
	}

	@Override
	public double withDraw(double amount){
		double previous = this.getBalance();
		this.setBalance(previous - amount);
		return this.getBalance();
	}

	@Override
	public double deposit(double amount){
		double previous= this.getBalance();
		this.setBalance(previous + amount);
		return this.getBalance();
	}


}
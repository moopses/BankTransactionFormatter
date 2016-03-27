package bank.transaction.formatter.main;

public class BankTransaction {
	private String date;
	private String transactionDetails;
	private double fundsIn;
	private double fundsOut;

	public BankTransaction(String date, String transactionDetails, double fundsOut, double fundsIn) {
		super();
		this.date = date;
		this.transactionDetails = transactionDetails;
		this.fundsIn = fundsIn;
		this.fundsOut = fundsOut;
	}

	public double getFundsOut() {
		return fundsOut;
	}

	public double getFundsIn() {
		return fundsIn;
	}

	@Override
	public String toString() {
		String formattedFundsIn = String.format("%.2f", fundsIn);
		if (formattedFundsIn.equals("0.00")) {
			formattedFundsIn = "";
		}

		String formattedFundsOut = String.format("%.2f", fundsOut);
		if (formattedFundsOut.equals("0.00")) {
			formattedFundsOut = "";
		}

		return date + ", " + transactionDetails + "," + formattedFundsOut + "," + formattedFundsIn;
	}
}

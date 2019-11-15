package howtoprogram;

// Fig. 5.11: AutoPolicy.java
// Class that represents an auto insurance policy.

public class AutoPolicy {

    private int accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;

        switch (getState()) {
        case "MA":
        case "NJ":
        case "NY":
        case "PA":
            noFaultState = true;
            break;

        default:
            noFaultState = false;
            break;
        }

        return noFaultState;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return this.makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

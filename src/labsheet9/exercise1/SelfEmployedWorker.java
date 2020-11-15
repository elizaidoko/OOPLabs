package labsheet9.exercise1;

public final class SelfEmployedWorker extends Employee{
    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName){
        super(firstName,lastName);

    }

    @Override
    public String toString() {
        return "Self employed workers name is " + super.toString();
    }

    public void setEstimatedIncome() {
        this.estimatedIncome = (int)(Math.random()*(900-400+1));
    }

    @Override
    public double earnings() {
        return estimatedIncome;
    }
}

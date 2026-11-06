package java_class.Nov6.College;

public class FeeStructure {
    final int Registration_Fee = 10000;
    int tuitionFee;

    public FeeStructure(int tuitionFee){
        this.tuitionFee = tuitionFee;
    }

    public void calculateTotalFee(){
        int totalFee = Registration_Fee + tuitionFee;

        System.out.println("Registration Fee : ₹ " + Registration_Fee);
        System.out.println("Tuition Fee      : ₹ " + tuitionFee);
        System.out.println("Total Fee        : ₹ " + totalFee);
    }
}

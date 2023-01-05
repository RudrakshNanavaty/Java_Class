/*
 * 21BCP182
 * Rudraksh Nanavaty
 * Computer Science
 * Division 3 G6
*/

public class BillTest {

    public static void main(String[] args) {
        Bill b1 = new Bill(1000);
        b1.units_of_consumption = 100;
        b1.unit_rate = 3;
        System.out.println(b1);
        System.out.println("Bill amount: " + b1.getBillAmount());
        Bill b2 = new Bill(1001);
        b2.units_of_consumption = 100;
        b2.unit_rate = 3;
        System.out.println(b2);
        System.out.println("Bill amount: " + b2.getBillAmount());
        Bill b3 = new Bill(1002);
        b3.units_of_consumption = 150;
        b3.unit_rate = 3;
        System.out.println("Details for b3 " + b3);
        System.out.println("Bill amount: " + b3.getBillAmount());
        System.out.println("all bills are");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println("all bills average is");
        System.out.println(getAverageBillAmount(b1.getBillAmount(), b2.getBillAmount(), b3.getBillAmount()));
    }

    public static float getAverageBillAmount(float a, float b, float c) {
        float avg = 0;
        avg = (a + b + c) / 3;
        return avg;
    }
}

class Bill {
    public int billNumber;
    public float units_of_consumption;
    public float unit_rate;
    public static int count;

    // Default construtor
    {
        count = count + 1;
    }

    Bill(int billNumber) {
        this.billNumber = billNumber;
    }

    Bill(int billNumber, float units_of_consumption, float unit_rate) {
        this.billNumber = billNumber;
        this.units_of_consumption = units_of_consumption;
        this.unit_rate = unit_rate;
    }

    Bill(Bill b) {
        this.billNumber = b.billNumber;
        this.units_of_consumption = b.units_of_consumption;
        this.unit_rate = b.unit_rate;
    }

    public static int getTotalCount() {
        return count;
    }

    public static boolean equals(Bill b1, Bill b2) {
        return b1.billNumber == b2.billNumber;
    }

    public int getBillNumber() {
        return this.billNumber;
    }

    public float getUnitsOfConsumption() {
        return this.units_of_consumption;
    }

    public void setUnitsOfConsumption(float units_of_consumption) {
        this.units_of_consumption = units_of_consumption;
    }

    public float getUnitRate() {
        return this.unit_rate;
    }

    public void setUnitRate(float unit_rate) {
        this.unit_rate = unit_rate;
    }

    public float getBillAmount() {
        return this.units_of_consumption * this.unit_rate;
    }

    public String toString() {
        return "Bill No.: " + billNumber +
                "\nUnits of Consumption: " + units_of_consumption +
                "\nUnit Rate:" + unit_rate + "\n";
    }
}

class ElectricityBill extends Bill {
    public float fixed_charge;

    ElectricityBill(int billNumber, float units_of_consumption, float unit_rate, float fixed_charge) {
        super(billNumber, units_of_consumption, unit_rate);
        this.fixed_charge = fixed_charge;
    }

    ElectricityBill(int billNumber) {
        super(billNumber);
    }

    ElectricityBill(ElectricityBill eb) {
        super(eb.billNumber, eb.units_of_consumption, eb.unit_rate);
        this.fixed_charge = eb.fixed_charge;
    }

    public int getBillNumber() {
        return super.billNumber;
    }

    public float getUnitsOfConsumption() {
        return super.units_of_consumption;
    }

    public void setUnitsOfConsumption(float units_of_consumption) {
        super.units_of_consumption = units_of_consumption;
    }

    public float getUnitRate() {
        return super.unit_rate;
    }

    public void setUnitRate(float unit_rate) {
        super.unit_rate = unit_rate;
    }

    public float getFixedCharge() {
        return fixed_charge;
    }

    public void setFixedCharge(float fixed_charge) {
        this.fixed_charge = fixed_charge;
    }

    public float getBillAmount() {
        return super.getBillAmount() + fixed_charge;
    }

    public String toString() {
        return "Electricity Bill:\nBill No.: " + super.billNumber +
                "\nUnits of Consumption: " + super.units_of_consumption +
                "\nUnit Rate: " + super.unit_rate +
                "\nFixed Charge: " + fixed_charge;
    }
}


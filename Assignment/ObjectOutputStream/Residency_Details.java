import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Main {
	public static void main(String[] args) {

		try {

			Residency residence_1 = new Residency('B', 7, 50000);
			Residency residence_2 = new Residency('D', 2, 37000);
			Residency residence_3 = new Residency('D', 3, 35000);
			Residency residence_4 = new Residency('C', 6, 20000);
			Residency residence_5 = new Residency('C', 2, 25000);

			// Creates an ObjectOutputStream
			FileOutputStream file = new FileOutputStream("ResidencyDetails.dat");
			ObjectOutputStream oos = new ObjectOutputStream(file);

			// writes objects to output stream
			oos.writeObject(residence_1);
			oos.writeObject(residence_2);
			oos.writeObject(residence_3);
			oos.writeObject(residence_4);
			oos.writeObject(residence_5);

			oos.close();

			// Reads data using the ObjectInputStream
			FileInputStream fis = new FileInputStream("ResidencyDetails.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			// Printing objects from file
			System.out.println("\nResidencies within aukaat:");

			int i = 5;
			while (i-- > 0) {

				Residency r = (Residency) ois.readObject();

				if (r.cost >= 30000 && r.cost <= 40000)
					System.out.println(r.toString());
			}

			System.out.println();

			ois.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Residency implements Serializable {
	char block;
	int flat_no;
	int cost;

	// Constructor
	Residency(char block, int flat_no, int cost) {
		this.block = block;
		this.flat_no = flat_no;
		this.cost = cost;
	}

	// Copy Constructor
	Residency(Residency r) {
		this.block = r.block;
		this.flat_no = r.flat_no;
		this.cost = r.cost;
	}

	public String toString() {
		return String.format("%c-%03d costs $%d", block, flat_no, cost);
	}
}
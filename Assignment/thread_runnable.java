import java.util.Scanner;

public class thread_runnable {
	public static void main(String[] args) {
		System.out.println("Enter the value of N =");
		ReaderThread r = new ReaderThread();
		Runnable read = new Runnable() {
			public void run() {
				r.printing();
			}
		};

		Runnable write = new Runnable() {
			public void run() {
				r.printing1();
			}
		};
		Thread t1 = new Thread(read);
		Thread t2 = new Thread(write);
		t1.start();
		t2.start();
	}
}

class ReaderThread {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int count;
	boolean read;

	public synchronized void printing() {
		for (count = 1; count < n; count++) {
			try {
				if (read) {
					wait();
				}
			} catch (Exception e) {
			}

			System.out.println(" Reader - Reading ");
			read = true;
			notify();
		}
	}

	public synchronized void printing1() {
		for (count = 1; count < n; count++) {
			try {
				if (!read) {
					wait();
				}
			} catch (Exception e) {
			}
			System.out.println(" Writer - Writing ");
			read = false;
			notify();
		}
	}
}

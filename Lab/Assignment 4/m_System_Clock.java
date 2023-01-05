import java.time.Clock;
import java.time.Duration;

public class m_System_Clock {

	public static void main(String[] args) {
		Clock c = Clock.systemUTC();
		Duration d = Duration.ofHours(5);

		Clock clock = Clock.offset(c, d);
		System.out.println("\n" + clock.instant() + "\n");
	}
}

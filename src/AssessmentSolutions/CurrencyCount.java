package AssessmentSolutions;

public class CurrencyCount {

	public static void main(String[] args) {
		int notes[] = {1};
		int amount = 5300; // 10 500 5000
							// 1 100 5100
							// Min Notes 11
		exchange(notes,amount);
	}

	private static void exchange(int[] notes, int amount) {
		if (amount > 0 && notes.length>0) {
			int noteCount[] = new int[notes.length];
			System.out.println("Amount " + amount);
			int totalNotes = 0;
			for (int i = 0; i < notes.length; i++) {
				noteCount[i] = amount / notes[i];
				amount = amount % notes[i];
				totalNotes += noteCount[i];
			}

			for (int i = 0; i < notes.length; i++) {
				if (noteCount[i] != 0)
					System.out.println(noteCount[i] + "X" + notes[i]);
			}

			System.out.println("Total Notes " + totalNotes);
			System.out.println("Balance Amount " + amount);
		} else {
			System.out.println("Invalid Data");
		}

		
	}
}

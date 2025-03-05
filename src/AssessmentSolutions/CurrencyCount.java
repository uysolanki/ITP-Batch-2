package AssessmentSolutions;

public class CurrencyCount {

	public static void main(String[] args) {
		int notes[]= {500,200,100,50,20,10,5};
		int amount=7855;			//10 500    5000
                                    //1  100    5100
		                            //Min Notes 11
		int noteCount[]=new int[notes.length];
		System.out.println("Amount " + amount);
		int totalNotes=0;
		for(int i=0;i<notes.length;i++)
		{
			noteCount[i]=amount/notes[i];
			amount=amount%notes[i];
			totalNotes+=noteCount[i];
		}
		
		
		for(int i=0;i<notes.length;i++)
		{
			if(noteCount[i]!=0)
			System.out.println(noteCount[i] + "X" + notes[i]);
		}
		
		System.out.println("Total Notes "+ totalNotes);
		System.out.println("Balance Amount "+ amount);
		}
		
	

}

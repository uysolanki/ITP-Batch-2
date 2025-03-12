package javaday17.collection;

public class CricketTeamFormation {

	public static void main(String[] args) {
	int players[]= {30,45,17,24};
	int n=4;
	int not=numberOfTeams(players,n);
	System.out.println("Maximum Number of Teams possible is "+not);
	}

	private static int numberOfTeams(int[] players, int sizeofTeam) 
	{
		int first=1;
		int last=100;
		while(first<=last)
		{
			int mid=(first+last)/2;   //mid=2
			
			if(checkTeamsPossible(players,mid,sizeofTeam))
			{
				if(checkTeamsPossible(players,mid+1,sizeofTeam))
				{
					first=mid+1;
				}
				else
				{
				return mid;
				}
			}
			else
			{
				last=mid-1;
			}
		}
		return 0;
	}

	private static boolean checkTeamsPossible(int[] players, int NumberOfTeamsPossible, int sizeofTeam) {
		int sum=0;  //{5,4,3,7};
		int totalPlayersNeeded=NumberOfTeamsPossible*sizeofTeam;  //8
		for(int p:players)
		{
			sum+=Math.min(p, NumberOfTeamsPossible); //sum=0,2,4,6,8
		}
		if(sum>=totalPlayersNeeded)
			return true;
		else
			return false;
	}

}

package day6;

public class MaxCricketTeams {

	public static void main(String[] args) {
		int arr[]= {7,6,5,4};
		int k=3;
		
		int maxTeams=getMaximumNumberOfTeams(arr,k);
		System.out.println(maxTeams);
		

	}

	private static int getMaximumNumberOfTeams(int[] arr, int k) 
	{
		int first=1;
		int last=10;
		
		while(first<=last)												//mid=5
		{
			int mid=(first+last)/2;
				if(checkMidTeamsPossible(arr,mid,k))
				{
					if(checkMidTeamsPossible(arr,mid+1,k))
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
	return -1;
	}

	private static boolean checkMidTeamsPossible(int[] arr, int mid, int k) {
		int totalPlayers=mid*k;		//15		int arr[]= {7,6,5,4};
		
		int availablePlayers=0;
		for(int players:arr)
		{
			availablePlayers+=Math.min(players, mid);	//0,5,10,15,19
		}
		
		if(availablePlayers>=totalPlayers)
			return true;
		else
			return false;
		
	}

}

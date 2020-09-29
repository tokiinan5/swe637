package swe637.hw3;

import java.util.ArrayList;

public class ReservationService {

	Rank rank;
	//seam
	RankingService rankingService = RankingServices.getRankingService();
	ArrayList<Customer>customerList = new ArrayList();
	
	//enabling point
	void setRankingService(RankingService rankingService) {
		this.rankingService = rankingService;
	}
	
	public void reserve(Customer customer) {
		//RankingService rankingService = RankingServices.getRankingService();
		//do something ...
		rank = rankingService.getRank(customer);
		customerList.add(customer);
;		//if(rank > 1) give high priority else treat as normal person
		System.out.println("Reservation completed for rank " + rank);
		
		
		
	}
	public int returnSize()
	{
		return customerList.size();
	}
}

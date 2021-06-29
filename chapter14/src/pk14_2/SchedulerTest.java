package pk14_2;

public class SchedulerTest {

	//Scueduler클래스를 지준으로 하여 RoundRobin, LeasJob, PriorityAllocation
	
	public static void main(String[] args) {
		Scheduler Rr = new RoundRobin();
		Rr.getNextCall();
		Rr.sendCallToAgent();
		System.out.println();
		
		Scheduler Lj = new LeastJob();
		Lj.getNextCall();
		Lj.sendCallToAgent();
		System.out.println();
		
		Scheduler Pa = new PriorityAllocation();
		Pa.getNextCall();
		Pa.sendCallToAgent();

	}

}

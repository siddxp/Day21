public class EmpWageUC7 {

	public static final int IS_FULL_TIME=1;
   public static final int IS_PART_TIME=2;
   public static final int EMP_RATE_PER_HOUR=20;
	public static final int WorkingDays=5;
	public static final int MaxHours=100;

		public static void ComputeWages(){

			int EmpHours=0;
			int Salary=0;
			int TotalWage=0;
			int TotalHours=0;
			int TotalDays=0;

			while(TotalDays<=WorkingDays || TotalHours<=MaxHours) {
				TotalDays++;
      		int EmpCheck= (int)( Math.random()*2+1);

				if(EmpCheck==IS_FULL_TIME) {
					System.out.println("Full-Time : Present");
					EmpHours=8;
					}
				else if(EmpCheck==IS_PART_TIME) {
					System.out.println("Part-Time : Present");
					EmpHours=4;
					}
				else {
					System.out.println("Employee is absent"+'\n');
					}

				TotalHours+=EmpHours;
				Salary=EMP_RATE_PER_HOUR*EmpHours;
				System.out.println("Employee Salary for a day : "+Salary + '\n');
				TotalWage+=Salary;
			}
      	System.out.println("Total Salary:"+TotalWage);
      }

		public static void main(String[] args) {
			System.out.println("Welcome Employee "+ "\n");
			ComputeWages();
	}
}

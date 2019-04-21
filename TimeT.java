class TimeT{

	public static void main (String az[]){
		int A,B,T;

		A=1;
			while (A<=10){
				if (A%2==0){
					T=1;
					while (T<=A){
						System.out.println("timetable of"+T);
						B=1;
						while (B<=10){
							System.out.println( T+"x "+ B + "="+(T*B));
							B=B+1;
						}
						T=T+1;	
					}
				}
				else {
						T=A;
						while (T>=1){
							System.out.println("timetable of"+ T);
							B=1;
							while (B<=10){
								System.out.println( T+"x "+ B + "="+(T*B));
								B=B+1;
							}
							T=T-1;
						}
								
				}
			A++;					
			}
	}
}


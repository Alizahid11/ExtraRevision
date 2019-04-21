class MyString{
	public void FindandReplace(String msg, String lookfor, String change){

		int i, found;
		i=found=0;
		String rp= "";


		for(; i<msg.length();i++){
			if(msg.substring(i,i+1).equals(lookfor.substring(0,1))){
				if (msg.length()-i>=lookfor.length()){ 	
					if (msg.substring(i,i+lookfor.length()).equals(lookfor)){
						found++;
						rp = rp + change;
						i=i+lookfor.length()-1;
					}else{
						rp = rp + msg.substring(i,i+1);
					}
				}
				else{
				rp = rp + msg.substring(i,i+1);
			}
			} else{
				rp = rp + msg.substring(i,i+1);
			}
		}

				System.out.println(msg);
				System.out.println(found);
				System.out.println(rp);
	}

		



}


class FindandReplace{
	public static void main(String az[]){
		MyString x = new MyString();
		x.FindandReplace("ShafeeqS is Shafeeq and SSS Shafeeq or ShafeeqSHjl", "Shafeeq","***");

	}
}
class MyString{
	public void Find(String msg, String lookfor){

		int i, found;
		i=found=0;

		for(; i<msg.length();i++){
			if(msg.substring(i,i+1).equals(lookfor.substring(0,1))){

				if (msg.length()-i>=lookfor.length()){ 
			
				if (msg.substring(i,i+lookfor.length()).equals(lookfor)){
					found++;
					i=i+lookfor.length()-1;
				
					
				}
			}
				
		}
	}

		System.out.println(found);
		


	}
}

class Find{
	public static void main(String az[]){
		MyString x = new MyString();
		x.Find("Shafeeq is Shafeeq and Shafeeq or ShafeeqS", "Shafeeq");

	}
}
package logicalPrograms;

public class CountCharOccurance {
	
	public static void main(String[]args) {
		
		String Str = "good morning good bye";
		
		int TotalCount =Str.length();
		System.out.println("TotalCount :"+TotalCount);
		
		int TotalCountAfterRemove = Str.replace("o" ,"").length();
		
		int Count = TotalCount - TotalCountAfterRemove;
		
		System.out.println(Count);
	}

}

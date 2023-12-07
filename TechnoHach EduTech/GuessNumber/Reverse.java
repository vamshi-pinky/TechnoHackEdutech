class Reverse 
{
	public static void main(String[] args) 
	{
		String s="Vamshi Developer";
		String s1[]=s.split(" ");
		String revString="";
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			String revWord="";
			for(int j=s2.length();j>=0;j--)
			{
				revWord+=s2.charAt(j);
			}
			revString+=revWord+" ";
		}
		System.out.println(revString);
	}
}

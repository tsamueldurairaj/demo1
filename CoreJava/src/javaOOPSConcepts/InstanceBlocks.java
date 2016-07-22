package javaOOPSConcepts;

public class InstanceBlocks {

	InstanceBlocks()
	{
		this(10);
		System.out.println("0-arg constructor");
	}
	InstanceBlocks(int a)
	{
		System.out.println("1-arg constructor");
	}
	
	
	{
		System.out.println("Instance Blocks");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new InstanceBlocks();
		new InstanceBlocks(10);

	}

}

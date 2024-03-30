package org.repo;

public class GitDemo {
	
	private void branch1() {
		System.out.println("Branch1 code");
	}
	
	private void branch2() {
		System.out.println("Branch2 code");
	}
	
	public static void main(String[] args) {
        
		GitDemo g = new GitDemo();
		g.branch1();
		g.branch2();
		
		System.out.println("Demo code");
	}

}

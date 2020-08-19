package day18statickeywords;

	class Student{
		int number;
		
		String name;
		
		static String college ="ITS";  // class variable
		
		Student(int r, String n, String college){
		// Constructor
			number = r;
			
			name = n;
			
		//	college = college;
		}
		
		public static void main(String args[]){
		
			Student s1 = new Student(111,"Karan", "MIT");    // r ==111, n== Karan, college == ITS (Because of static)
			Student s2 = new Student(222,"Aryan", "Harvard");// r ==222, n== Aryan, college == ITS (Because of static)
			System.out.println(s1.number); // 111
			System.out.println(s2.number); // 222
			System.out.println(s1.name); // Karan
			System.out.println(s2.name); // Aryan
			//System.out.println(s1.college); // ITS
			//System.out.println(s2.college); // ITS
		}
}
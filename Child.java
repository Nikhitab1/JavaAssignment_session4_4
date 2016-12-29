
 class Child extends Conchain {
	
	public Child() {
		// TODO Auto-generated constructor stub
		 super();     //Calling a parent class default constructor from the child class default constructor
		
	
 }
	Child(int a,int b){
		super(a,b);   //calling a parent class paremeterised constructor from the parameterised constructor of a child class
		
	}
	
 public static  void main(String[] args) {
		 
		Child ch=new Child();        
		Child ch1=new Child(5,10);
		 
 }
	 
 }

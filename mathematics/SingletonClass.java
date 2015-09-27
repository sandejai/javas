package interview;

public class SingletonClass {
	
	private static SingletonClass  singletonInstance;
	
	private SingletonClass(){
		
	}
	
	public SingletonClass(int age){
		
	}
	
	public static SingletonClass getInstance(){
		if(singletonInstance!=null){
			return singletonInstance;
		}
		else{
			singletonInstance = new SingletonClass();
			return singletonInstance;
		}
	}

}



public class Main {
	
	public static void main(String[] args) {
	
		UserManagement userManagement = new UserManagement();
		userManagement.addUser(new User(1,"Ajay"));
		userManagement.addUser(new User(2,"Akshay"));
		userManagement.addUser(new User(3,"Aakash"));
		userManagement.addUser(new User(4,"Shubham"));
		
		MyIterator myIterator = userManagement.getIterator();
		
		while(myIterator.hasNext()) {
			User user = (User) myIterator.next();
			System.out.print(user.getId()+" ");
			System.out.println(user.getName());
		}
	}

}

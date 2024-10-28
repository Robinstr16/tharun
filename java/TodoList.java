package adv.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TodoList {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<AppUsers> userList=new ArrayList<>();
		
		while(true) {
			System.out.println("choose the following operation \n1.Add 2.Read 3.Delete 4.Exit");
			String operation=scanner.next();
			switch(operation) {
			case"1":
				AppUsers appUsers=new AppUsers();
				System.out.println("Enter the user ID");
				scanner.next();
				appUsers.setId(Long.parseLong(scanner.next()));
				System.out.println("Enter the user name:");
				appUsers.setUserName(scanner.next());
				System.out.println("Enter the password:");
				appUsers.setPassword(scanner.next());
				userList.add(appUsers);
				System.out.println("Added Successfully");
				break;
			case "2":
				System.out.println(userList);
			case "3":
				System.out.println("Please enter the id, you want delete:");
				long deleteID=Long.parseLong(scanner.next());
				for(AppUsers user:userList) {
					if(user.getId()==deleteID) {
						userList.remove(user);
						System.out.println("User has been removed");
						System.out.println(userList);
			
					}
				}
				break;
			case "4":
				scanner.close();
				System.exit(0);
				break;
				default :
					System.err.println("Operation not found");
					break;
				
			}
			
			
		}

	}

}

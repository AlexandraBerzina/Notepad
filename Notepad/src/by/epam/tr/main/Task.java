package by.epam.tr.main;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			Notepad notes = new Notepad();
			boolean exit = false;
			System.out.println("Выберите необходимую функцию: ");
			int amountOfNotes = 0;
			while (!exit) {
				System.out.println("1 - добавить запись");
				System.out.println("2 - удалить запись");
				System.out.println("3 - изменить запись");
				System.out.println("4 - показать все записи");
				System.out.println("5 - выход");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					notes.addNote();
					amountOfNotes++;
					break;
				case 2: 
					notes.removeNote();
					amountOfNotes--;
					break;
				case 3:
					notes.changeNote();
					break;
				case 4: 
					notes.showAllNotes(amountOfNotes);
					
					break;
				case 5:
					exit = true;
					break;
				default: exit = true;			
				} 
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
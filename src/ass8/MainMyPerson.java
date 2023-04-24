package ass8;

public class MainMyPerson {
 //   public class Main {
        public static void main(String[] args) {
            MyPersonList personList = new MyPersonList(5);

            // create some Person objects and insert them into the list
            Person person1 = new Person("Doe", "John", 30);
            Person person2 = new Person("Smith", "Jane", 25);
            Person person3 = new Person("Johnson", "Bob", 40);
            personList.insert(person1);
            personList.insert(person2);
            personList.insert(person3);

            // display the list of persons
            System.out.println("List of Persons:");
            personList.displayList();

            // find a person by last name
            String searchName = "Smith";
            MyPersonList foundPerson = personList.find(searchName);
            if (foundPerson != null) {
                System.out.println("Found person with last name " + searchName + ":");
                System.out.println(foundPerson);
            } else {
                System.out.println("Person with last name " + searchName + " not found.");
            }

            // delete a person by last name
            searchName = "Johnson";
            boolean deleted = personList.delete(searchName);
            if (deleted) {
                System.out.println("Deleted person with last name " + searchName + ".");
            } else {
                System.out.println("Person with last name " + searchName + " not found.");
            }

            // display the updated list of persons
            System.out.println("List of Persons (after deletion):");
            personList.displayList();
        }
    }
//}

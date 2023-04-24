package ass8;

    public class MyPersonList {
        private ass8.MyPersonList[] personArray; // array of Persons
        private int numElements; // number of elements in array

        // --------------------------------------------------------------
        public MyPersonList(int max) { // constructor
            personArray = new ass8.MyPersonList[max]; // create array
            numElements = 0;
        }

        // --------------------------------------------------------------
        public ass8.MyPersonList find(String searchName) { // find specified value
            for (int i = 0; i < numElements; i++) {
                if (personArray[i].getLast().equals(searchName)) {
                    return personArray[i]; // found it, return it
                }
            }
            return null; // can't find it
        }

        private Object getLast() {
        }

        // --------------------------------------------------------------
        public void insert(Person person) { // put person into array
            personArray[numElements] = person;
            numElements++;
        }

        // --------------------------------------------------------------
        public boolean delete(String searchName) { // delete person from array
            int i;
            for (i = 0; i < numElements; i++) {
                if (personArray[i].getLast().equals(searchName)) {
                    break;
                }
            }
            if (i == numElements) {
                return false; // can't find it
            } else {
                for (int j = i; j < numElements; j++) {
                    personArray[j] = personArray[j + 1];
                }
                numElements--;
                return true; // found it and deleted it
            }
        }

        // --------------------------------------------------------------
        public void displayList() {
            for (int i = 0; i < numElements; i++) {
                System.out.println(personArray[i]);
            }
        }
    }


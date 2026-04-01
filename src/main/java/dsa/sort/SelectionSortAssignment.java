package dsa.sort;

import java.util.Arrays;

class User {
    int id;
    String name;
    int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + id + ", " + name + ", " + age + "}";
    }
}

public class SelectionSortAssignment {

    // Renamed to camelCase (selectionSortAssignmentImpl)
    public static User[] selectionSortAssignmentImpl(User[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Reset minIndex to the current unsorted start

            for (int j = i + 1; j < arr.length; j++) {
                // Comparing 'age' property of User objects
                if (arr[j].age < arr[minIndex].age) {
                    minIndex = j;
                }
            }

            // Swap the User object references
            User tempVar = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tempVar;
        }
        return arr;
    }

    public static void main(String[] args) {
        User[] users = {
                new User(101, "Vishal", 25),
                new User(102, "Amit", 22),
                new User(103, "Sagar", 28),
                new User(104, "Rahul", 21)
        };

        // Arrays.toString() is essential to see the actual content
        System.out.println("Before Sorting : " + Arrays.toString(users));

        selectionSortAssignmentImpl(users);

        System.out.println("After Sorting  : " + Arrays.toString(users));
    }
}
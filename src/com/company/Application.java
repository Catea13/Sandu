package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();

// Add new users to the arrayList
        users.add(new User("Grgg", "ngtnhknt", "mfkrmtkg", 27, new Date(1020, 5, 18), Status.ACTIVE));
        users.add(new User("Grgg", "ngtnhknt", "mfkrmtkg", 27, new Date(1016, 9, 21), Status.NEW));
        users.add(new User("Grgg", "ngtnhknt", "mfkrmtkg", 27, new Date(1015, 8, 15), Status.NEW));
        users.add(new User("Grgg", "ngtnhknt", "mfkrmtkg", 27, new Date(1014, 2, 20), Status.NEW));
        users.add(new User("Grgg", "ngtnhknt", "mfkrmtkg", 27, new Date(1010, 5, 21), Status.NEW));

// Show user data
        for (User user : users) {
            user.printDetails("dd.MM.yyyy");
        }

/*
for (User u : users) {
// Manual change of user status
users.get(1).setStatus(Status.ACTIVE);
users.get(2).setStatus(Status.ACTIVE);
users.get(3).setStatus(Status.ACTIVE);
users.get(4).setStatus(Status.ACTIVE);
System.out.println("After change:");
u.printDetails("dd/MM/yyyy");
}
*/

        System.out.println("========================================");

// Change status to the correct one depending on date of registration
        for (User us : users) {
            int dayDifference = Application.getDayDateDifference(us.getRegistrationDate(), new Date());

// If difference is more than yesterday
            if (dayDifference > 1) {
                us.setStatus(Status.ACTIVE);
            }

// If difference is more than one month
            if (dayDifference > 31) {
                us.setStatus(Status.BLOCKED);
            }

// Print user details
            us.printDetails("dd-MM-yyyy");
        }
    }



    public static int getDayDateDifference(Date date1, Date date2) {
        Integer dayDifference = 0;
        try {
            long difference = date2.getTime() - date1.getTime();
            float daysBetween = (difference / (1000 *60 *60 * 24));
            dayDifference = (int) Math.round(daysBetween);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dayDifference;
    }
}

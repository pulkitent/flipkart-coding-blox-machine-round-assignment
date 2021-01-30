package com.flipkart.models;

import java.util.Comparator;
import java.util.List;

import static com.flipkart.models.SortingType.ASC;

public class LeaderBoard {
    void displayLeaderBoard(List<User> userList, SortingType sortingType) {
        if (sortingType.equals(ASC)) {
            userList.sort(Comparator.comparing(User::getScore));
        } else {
            userList.sort(Comparator.comparing(User::getScore));
        }
        System.out.println(userList);
    }
}

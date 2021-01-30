package com.flipkart.models;

import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.isNull;

public class User {
    private final String actualName;
    private final String userName;
    private Integer score;
    private final Long createdOn;
    private final List<Contest> attendingContests = new LinkedList<>();

    List<Contest> createdContests;

    public User(String actualName, String userName) {
        this.actualName = actualName;
        this.userName = userName;
        this.score = 1500;
        this.createdOn = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return userName + "     : " + score;
    }

    void createContest(Integer contestId, String contestName, ContestDifficultyType contestDifficultyType) {
        Contest contest = new Contest(contestId, contestName, contestDifficultyType, this.userName);
        createdContests.add(contest);
        attendingContests.add(contest);
    }

    public void attendContest(Contest contest) {
        attendingContests.add(contest);
    }

    String getUserName() {
        return userName;
    }

    void startTheGivenContest(Integer contestId) {
        Contest contestToBeStarted = null;
        for (Contest contest : createdContests) {
            Integer id = contest.getContestId();
            if (id.equals(contestId)) {
                contestToBeStarted = contest;
            }
        }

        if (isNull(contestToBeStarted))
            throw new RuntimeException("Contest To be Started not found");

        contestToBeStarted.startTheContest();
    }

    Integer getScore() {
        return score;
    }
}

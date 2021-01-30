package com.flipkart.models;

import java.util.List;

public class Contest {
    private final Integer contestId;
    private final String contestName;
    private final ContestDifficultyType contestDifficultyType;
    private final String createdByUserName;
    private final long createdOn;
    private Boolean isStarted;

    List<User> attendingContest;
    List<Question> questionList;

    public Contest(Integer contestId, String contestName, ContestDifficultyType contestDifficultyType,
                   String createdByUserName) {
        this.contestId = contestId;
        this.contestName = contestName;
        this.contestDifficultyType = contestDifficultyType;
        this.createdByUserName = createdByUserName;
        this.isStarted = false;
        createdOn = System.currentTimeMillis();
    }

    public List<User> getAttendingContest() {
        return attendingContest;
    }

    boolean isDifficultyMatchingGivenDifficulty(ContestDifficultyType difficulty) {
        return contestDifficultyType.equals(difficulty);
    }

    Integer getContestId() {
        return contestId;
    }

    void startTheContest() {
        this.isStarted = true;
    }

    void assignQuestions(List<Question> questionsWithSameDifficulty) {
        questionList = questionsWithSameDifficulty;
    }

    ContestDifficultyType getContestDifficulty() {
        return contestDifficultyType;
    }

    void addUsersToContest(List<User> attendingContest) {
        this.attendingContest = attendingContest;
    }

    void randomlyAssignQuestionsToAttendingUsers() {
        //TODO: To be implemented
    }
}

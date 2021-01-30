package com.flipkart.models;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.isNull;

public class CodingBloxPlatform {
    private final List<User> usersList;
    private final List<Contest> contestList;
    private final List<Question> questionList;

    public CodingBloxPlatform(List<User> usersList, List<Contest> contests, List<Question> questionList) {
        this.usersList = usersList;
        this.contestList = contests;
        this.questionList = questionList;
    }

    void createUser(User user) {
        if (isNull(user)) {
            throw new RuntimeException("Null user");
        }

        usersList.add(user);
    }

    void createQuestion(QuestionDifficultyType difficulty, Integer score) {
        Question question = new Question(questionList.size(), difficulty, score);
        questionList.add(question);
    }

    List<Question> listQuestions() {
        return questionList;
    }

    List<Question> listQuestions(QuestionDifficultyType difficulty) {
        List<Question> questionsWithGivenDifficulty = new LinkedList<>();

        for (Question question : listQuestions()) {
            if (question.isDifficultyMatchingGivenDifficulty(difficulty)) {
                questionsWithGivenDifficulty.add(question);
            }
        }

        return questionsWithGivenDifficulty;
    }

    List<Contest> listContests() {
        return contestList;
    }

    List<Contest> listContests(ContestDifficultyType difficulty) {
        List<Contest> contestsWithGivenDifficulty = new LinkedList<>();

        for (Contest contest : listContests()) {
            if (contest.isDifficultyMatchingGivenDifficulty(difficulty)) {
                contestsWithGivenDifficulty.add(contest);
            }
        }

        return contestsWithGivenDifficulty;
    }

    public void attendContest(Integer contestId, String attendingUsername) {
        User attendingUser = getUserWithGivenUserName(attendingUsername);
        Contest contestToBeAttended = getContestWithGivenId(contestId);

        if (Objects.isNull(attendingUser) || Objects.isNull(contestToBeAttended))
            throw new RuntimeException("Given User or Contest not found");

        attendingUser.attendContest(contestToBeAttended);
    }

    void runContest(Integer contestId, String creatorUserName) {
        User creatorUser = getUserWithGivenUserName(creatorUserName);

        Contest contestToBeStarted = getContestWithGivenId(contestId);

        if (Objects.isNull(creatorUser) || Objects.isNull(contestToBeStarted))
            throw new RuntimeException("Given User or Contest not found");

        assignQuestionToContest(contestToBeStarted);
        contestToBeStarted.randomlyAssignQuestionsToAttendingUsers();
    }

    private void assignQuestionToContest(Contest contestToBeStarted) {
        ContestDifficultyType contestDifficulty = contestToBeStarted.getContestDifficulty();
        QuestionDifficultyType questionDifficulty = null;

        switch (contestDifficulty) {
            case LOW:
                questionDifficulty = QuestionDifficultyType.LOW;
                break;
            case MEDIUM:
                questionDifficulty = QuestionDifficultyType.MEDIUM;
                break;
            case HIGH:
                questionDifficulty = QuestionDifficultyType.HIGH;
                break;
        }

        List<Question> questionsWithGivenDifficulty = listQuestions(questionDifficulty);
        contestToBeStarted.assignQuestions(questionsWithGivenDifficulty);
    }

    private User getUserWithGivenUserName(String creatorUserName) {
        User creatorUser = null;
        for (User user : usersList) {
            String userName = user.getUserName();
            if (userName.equals(creatorUserName)) {
                creatorUser = user;
            }
        }
        return creatorUser;
    }

    private Contest getContestWithGivenId(Integer contestId) {
        Contest contestToBeAttended = null;
        for (Contest contest : contestList) {
            Integer id = contest.getContestId();
            if (id.equals(contestId)) {
                contestToBeAttended = contest;
            }
        }
        return contestToBeAttended;
    }
}

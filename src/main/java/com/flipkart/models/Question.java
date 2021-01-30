package com.flipkart.models;

public class Question {
    private final Integer id;
    private final QuestionDifficultyType questionDifficultyType;
    private final Integer score;

    public Question(Integer id, QuestionDifficultyType questionDifficultyType, Integer score) {
        this.id = id;
        this.questionDifficultyType = questionDifficultyType;
        this.score = score;
    }

    boolean isDifficultyMatchingGivenDifficulty(QuestionDifficultyType difficultyType) {
        return difficultyType.equals(questionDifficultyType);
    }
}

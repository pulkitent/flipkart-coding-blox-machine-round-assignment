package Startup;

import com.flipkart.models.*;

import java.util.LinkedList;
import java.util.List;

import static com.flipkart.models.QuestionDifficultyType.*;

public class Startup {
    public static void main(String[] args) {
        String rossUsername = "ross";
        String monicaUsername = "monica";

        User ross = new User("ross", rossUsername);
        User monica = new User("monica", monicaUsername);
        User joey = new User("joey", "joey");

        List<User> allUsers = new LinkedList<>();
        allUsers.add(ross);
        allUsers.add(monica);
        allUsers.add(joey);

        Question question0 = new Question(1, LOW, 50);
        Question question1 = new Question(2, MEDIUM, 100);
        Question question2 = new Question(3, MEDIUM, 100);
        Question question3 = new Question(4, MEDIUM, 100);
        Question question4 = new Question(5, HIGH, 200);
        Question question5 = new Question(6, HIGH, 200);

        List<Question> allQuestions = new LinkedList<>();
        allQuestions.add(question0);
        allQuestions.add(question1);
        allQuestions.add(question2);
        allQuestions.add(question3);
        allQuestions.add(question4);
        allQuestions.add(question5);

        ContestDifficultyType lowContestDifficulty = ContestDifficultyType.LOW;
        ContestDifficultyType highContestDifficulty = ContestDifficultyType.HIGH;

        Contest diwaliContest = new Contest(1, "diwali_Contest", lowContestDifficulty, rossUsername);
        Contest holiContest = new Contest(1, "holi_Contest", highContestDifficulty, monicaUsername);
        Contest lohriContest = new Contest(1, "lohri_Contest", highContestDifficulty, monicaUsername);

        List<Contest> allContest = new LinkedList<>();
        allContest.add(diwaliContest);
        allContest.add(holiContest);
        allContest.add(lohriContest);


        CodingBloxPlatform codingBlox = new CodingBloxPlatform(allUsers, allContest, allQuestions);

        monica.attendContest(diwaliContest);
        joey.attendContest(diwaliContest);

        //TODO: To be continued
    }
}

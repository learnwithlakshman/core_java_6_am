package com.careerit.cj.day18.quiz;
import com.careerit.cj.day17.playerstat.util.CsvReaderUtil;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class QuestionReaderUtil {

    private static final String fileName = "/quiz.txt";

    private QuestionReaderUtil() {
    }
    public static List<Question> loadQuestionsFromFile() {
        List<Question> questions = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(CsvReaderUtil.class.getResource(fileName).toURI()));
            for (int i = 0; i < lines.size(); ) {
                List<String> sublist = lines.subList(i, i + 7);
                i = i + 7;
                Question question = convertSubListQuestions(sublist);
                questions.add(question);
            }
        } catch (Exception e) {
            System.out.println("While reading the file :" + e);
        }
        return questions;
    }
    private static Question convertSubListQuestions(List<String> sublist) {
        int i=0;
        int num = Integer.parseInt(sublist.get(i++).replace("#", ""));
        String questionData = sublist.get(i++);
        List<String> options = List.of(sublist.get(i++), sublist.get(i++), sublist.get(i++), sublist.get(i++));
        int answer = Integer.parseInt(sublist.get(i++).split(":")[1]);
        Question question = Question.builder().num(num)
                .questionData(questionData)
                .options(options)
                .answer(answer).
                build();
        return question;
    }
}



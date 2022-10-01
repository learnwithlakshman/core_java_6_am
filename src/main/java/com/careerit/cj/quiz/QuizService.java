package com.careerit.cj.quiz;

import lombok.SneakyThrows;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static com.careerit.cj.day15.InnerclassExample.showResult;

public class QuizService {

        List<Question> questionList = List.of(
                Question.builder().num(1).questionData("2 + 3 = ?").options(List.of("2","3","4","5")).answer(4).build(),
                Question.builder().num(2).questionData("3 - 3 = ?").options(List.of("0","3","6","5")).answer(1).build()
        );//QuestionReaderUtil.loadQuestionsFromFile();

        @SneakyThrows
        public void startQuiz()  {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name :");
            String name = sc.nextLine();
            System.out.println("-".repeat(100));
            System.out.println("Hi "+name+" your quiz is going start in few seconds please wait..., wish you all the best");
            TimeUnit.SECONDS.sleep(5);
            int correct = 0;
            for(Question question:questionList){
                System.out.println("#"+question.getNum()+". "+question.getQuestionData());
                System.out.println("\n");
                int i=1;
                for(String option:question.getOptions()){
                    System.out.println(i+") "+option);
                    i++;
                }
                System.out.println("Enter your answer ");
                int ch = sc.nextInt();
                if(ch == question.getAnswer()){
                    correct++;
                }
            }
            System.out.println("Please wait we computing result.......");
            TimeUnit.SECONDS.sleep(5);
            showResult(name,questionList.size(),correct);
        }

    private void showResult(String name, int size, int correct) {
        System.out.println(name+ " thank for taking quiz");
        System.out.println("Total question  : "+size);
        System.out.println("Your score is   : "+correct);

    }
}

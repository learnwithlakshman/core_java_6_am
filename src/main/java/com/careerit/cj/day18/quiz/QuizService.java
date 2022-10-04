package com.careerit.cj.day18.quiz;

import lombok.SneakyThrows;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizService {

        List<Question> questionList = QuestionReaderUtil.loadQuestionsFromFile();

        @SneakyThrows
        public void startQuiz()  {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name :");
            String name = sc.nextLine();
            System.out.println("-".repeat(100));
            System.out.println("Hi "+name+" your quiz is going start in few seconds please wait..., wish you all the best");
            TimeUnit.SECONDS.sleep(5);
            int correct = 0;
            System.out.println("-".repeat(100));
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

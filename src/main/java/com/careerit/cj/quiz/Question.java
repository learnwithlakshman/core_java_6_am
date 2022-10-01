package com.careerit.cj.quiz;

import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {
    private int num;
    private String questionData;
    private List<String> options;
    private int answer;
}

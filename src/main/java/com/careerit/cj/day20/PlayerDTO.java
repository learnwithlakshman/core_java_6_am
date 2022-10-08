package com.careerit.cj.day20;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

  private String name;
  private String role;
  private String teamLabel;

}

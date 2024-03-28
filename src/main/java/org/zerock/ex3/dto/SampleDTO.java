package org.zerock.ex3.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
//Getter , Setter , toString , equals , hashcode 메소드를 자동으로 생성한다
public class SampleDTO {

    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;

}

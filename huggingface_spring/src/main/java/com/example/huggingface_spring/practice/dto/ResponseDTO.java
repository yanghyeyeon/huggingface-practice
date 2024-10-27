package com.example.huggingface_spring.practice.dto;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseDTO {

    private String summary;
    private String sentiment;
}

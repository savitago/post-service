package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private String id;
    @NotEmpty(message = "post should not be empty")
    private String post;
    private String postedBy;
}
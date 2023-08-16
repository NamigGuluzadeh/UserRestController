package com.example.in28minutes17.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ExceptionDetails {

    private LocalDate time;
    private String message;
    private String details;
}

package pl.sdacademy.springexercise11.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PCGameForm {
    private String title;
    private String producer;
    private String genre;
    @NotNull(message = "Minimum age should not be empty!")
    @Min(value = 0, message = "The minimum value is 0")
    @Max(value = 20, message = "The maximum value is 20")
    private Integer minimumAge;
    private Boolean isAAA;
}

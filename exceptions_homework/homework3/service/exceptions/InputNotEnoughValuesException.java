package exceptions_homework.homework3.service.exceptions;

import java.io.IOException;

public class InputNotEnoughValuesException extends IOException {
    public InputNotEnoughValuesException(String message) {
        super(message);
    }
}

package com.database.common.error;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
@Getter
public class Error {
    private final HttpStatus code;
    private final String msg;
    private final Throwable ex;

    public static Error createError(HttpStatus code,
                                    String msg,
                                    Throwable ex) {
        return new Error(code, msg, ex);
    }
}

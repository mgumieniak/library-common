package com.database.common.error;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
@Getter
public class Error {
    private final int code;
    private final String msg;
    private final Exception ex;

    public static Error createError(int code,
                                    String msg,
                                    Exception ex) {
        return new Error(code, msg, ex);
    }
}

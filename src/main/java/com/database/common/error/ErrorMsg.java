package com.database.common.error;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ErrorMsg {
    USER_NOT_FOUND("User not found");

    private final String errorMsg;

    public String errorMsg() {return errorMsg;}

}

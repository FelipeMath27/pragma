package com.pragma.users.infrastructure.exceptions;

public class ConstantsErrorMessages {
    public static final String PERMISSION_DENIED = "You do not have permission to create users.";
    public static final String USER_UNDERAGE = "The user must be of legal age.";
    public static final String INVALID_EMAIL_FORMAT = "The email is not in a valid format.";
    public static final String INVALID_PHONE_FORMAT = "The phone number must have a maximum of 13 characters and may include '+'.";
    public static final String ROL_REQUIRED = "No role was provided for the creator user.";
    public static final String ROL_NOT_FOUND = "The rol provided is not exist";
    public static final String INVALID_DOCUMENT_FORMAT = "The document format is invalid. Please provide a valid document number based on the document type.";
    public static final String PASSWORD_CANNOT_BE_EMPTY = "Password cannot be null or empty";
    public static final String USER_NOT_FOUND = "User not found in the platform";
    public static final String CANT_BE_NULL = "This parameter can't be null";
    public static final String ADMIN_NOT_FOUND = "User admin not found in the system";
    public static final String USER_WITHOUT_ROLE = "This user has not role";


    private ConstantsErrorMessages() {
    }
}

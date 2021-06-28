package com.bank.admin.user.utils;

import java.util.regex.Pattern;

import com.bank.admin.user.model.AccountRequest;
import com.bank.admin.user.model.TransactionRequest;

public class InputValidator {

    private static final Pattern sortCodePattern = Pattern.compile("^[0-9]{2}-[0-9]{2}-[0-9]{2}$");

    private static final Pattern accountNumberPattern = Pattern.compile("^[0-9]{8}$");

    public static boolean isSearchCriteriaValid(AccountRequest accountInput) {
        return sortCodePattern.matcher(accountInput.getSortCode()).find() &&
                accountNumberPattern.matcher(accountInput.getAccountNumber()).find();
    }

    public static boolean isSearchTransactionValid(TransactionRequest transactionInput) {

        if (!isSearchCriteriaValid(transactionInput.getSourceAccount()))
            return false;

        if (!isSearchCriteriaValid(transactionInput.getTargetAccount()))
            return false;

        if (transactionInput.getSourceAccount().equals(transactionInput.getTargetAccount()))
            return false;

        return true;
    }
}

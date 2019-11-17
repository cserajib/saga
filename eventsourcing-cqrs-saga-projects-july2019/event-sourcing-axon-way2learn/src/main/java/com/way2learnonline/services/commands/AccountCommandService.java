package com.way2learnonline.services.commands;

import java.util.concurrent.CompletableFuture;

import comway2learnonline.dto.commands.AccountCreateDTO;
import comway2learnonline.dto.commands.MoneyCreditDTO;
import comway2learnonline.dto.commands.MoneyDebitDTO;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}

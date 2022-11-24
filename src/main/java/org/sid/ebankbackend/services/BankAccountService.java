package org.sid.ebankbackend.services;

import org.sid.ebankbackend.dtos.*;
import org.sid.ebankbackend.exceptions.BalanceNotSufficientException;
import org.sid.ebankbackend.exceptions.BankAccountNotFountException;
import org.sid.ebankbackend.exceptions.CustomerNotFountException;

import java.util.List;

public interface BankAccountService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFountException;

    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFountException;

    List<CustomerDTO> listCustomers();

    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFountException;

    void debit(String accountId, double amount, String description) throws BankAccountNotFountException, BalanceNotSufficientException;

    void credit(String accountId, double amount, String description) throws BankAccountNotFountException;

    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFountException, BalanceNotSufficientException;


    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFountException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);


    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFountException;

    List<CustomerDTO> searchCustomers(String keyword);
}

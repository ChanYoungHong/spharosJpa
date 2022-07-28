package com.prac.jpaprac.spharosJpa.nhnaccount.service;

import com.prac.jpaprac.spharosJpa.nhnaccount.domain.Account;
import com.prac.jpaprac.spharosJpa.nhnaccount.repo.AccountRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class NhnAccountService implements AccountService, AccountRepository {

    private final AccountRepository accountRepository;

    @Autowired
    public NhnAccountService(
        AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}

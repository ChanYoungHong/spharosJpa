package com.prac.jpaprac.spharosJpa.nhnaccount.repo;


import com.prac.jpaprac.spharosJpa.nhnaccount.domain.Account;
import java.util.List;

public interface AccountRepository {

    List<Account> findAll();
}

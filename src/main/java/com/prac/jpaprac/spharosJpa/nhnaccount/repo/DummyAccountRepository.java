package com.prac.jpaprac.spharosJpa.nhnaccount.repo;

import com.prac.jpaprac.spharosJpa.nhnaccount.domain.Account;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class DummyAccountRepository implements AccountRepository{


    @Override
    public List<Account> findAll() {
        return null;
    }

}

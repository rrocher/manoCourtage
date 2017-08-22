package com.mano.courtage.service;

import java.util.List;

import com.mano.courtage.domain.LoanPsblAmount;

public interface IService<T> {
    public T create(T t) throws Exception;
    public boolean deleteIfPossible(T t);
    public T find(T t);
    public T validateNew(T t) throws Exception ;
	List<T> getAll() throws Exception;
}

package poly.store.service;

import java.util.List;

import poly.store.model.Account;

public interface AccountService {
	public List<Account> findAll() ;
	public Account findById(String username) ;
	public List<Account> getAdministrators() ;
}

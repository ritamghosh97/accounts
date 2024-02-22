package com.ritam.accounts.service;

import com.ritam.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto: CustomerDto object
     */
    void createAccount(CustomerDto customerDto);


}

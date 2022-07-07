package com.example.keymodum4.repository;

import com.example.keymodum4.model.Wallet;
import com.example.keymodum4.model.user.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WalletRepository extends PagingAndSortingRepository<Wallet,Long> {
    Iterable<Wallet> findAllByUser(User user);

    Iterable<Wallet> findAllByNameContaining(String name);


}

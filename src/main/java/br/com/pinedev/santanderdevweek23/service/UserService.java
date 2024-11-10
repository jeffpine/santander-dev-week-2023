package br.com.pinedev.santanderdevweek23.service;

import br.com.pinedev.santanderdevweek23.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
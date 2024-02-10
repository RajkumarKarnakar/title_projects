package com.learn.jpa.repository;

import com.learn.jpa.entity.Company;

import java.util.Optional;

public interface CompanyRepository {
    Optional<Company> save(Company company);
    Optional<Company> getCompanyById(Long id);
    void deleteCompany(Company company);
}

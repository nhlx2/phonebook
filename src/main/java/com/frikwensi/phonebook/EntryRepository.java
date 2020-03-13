package com.frikwensi.phonebook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@CrossOrigin
@RepositoryRestResource
public interface EntryRepository extends CrudRepository<Entry, Long> {
    List<Entry> findByNameContaining(String name);
}

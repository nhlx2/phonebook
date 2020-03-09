package com.frikwensi.phonebook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@CrossOrigin
@RepositoryRestResource
public interface EntryRepository extends CrudRepository<Entry, Long> {

}

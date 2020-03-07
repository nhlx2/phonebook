package com.frikwensi.phonebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final EntryRepository repository;

    @Autowired
    public DatabaseLoader(EntryRepository repository) {
	this.repository = repository;
    }

    @Override
    public void run(String... string) throws Exception {
	this.repository.save(new Entry("Nhlx2", "0832540110"));
    }
}

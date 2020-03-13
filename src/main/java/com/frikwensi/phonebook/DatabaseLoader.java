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
	this.repository.save(new Entry("Bono", "016777330"));
	this.repository.save(new Entry("The Pope", "39-06-6982"));
	this.repository.save(new Entry("Bill Gates", "206-709-3100"));
	this.repository.save(new Entry("Oprah", "312-633-1182"));
	this.repository.save(new Entry("Michelle", "555-2424"));
    }
}

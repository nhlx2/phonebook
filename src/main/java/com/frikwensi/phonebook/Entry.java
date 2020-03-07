package com.frikwensi.phonebook;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "entries")
public class Entry {
    private @Id @GeneratedValue Long id;
    private String name;
    private String phoneNumber;

    private Entry() {}

    public Entry(String name, String phoneNumber) {
	this.name = name;
	this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	Entry entry = (Entry) o;
	return Objects.equals(id, entry.id) &&
	    Objects.equals(name, entry.name) &&
	    Objects.equals(phoneNumber, entry.phoneNumber);
    }

    @Override
    public int hashCode() {
	return Objects.hash(id, name, phoneNumber);
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getPhoneNumber() {
	return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
	return "Entry{" +
	    "id=" + id +
	    ", name='" + name + '\'' +
	    ", phoneNumber='" + phoneNumber + '\'' +
	    '}';
    }
}

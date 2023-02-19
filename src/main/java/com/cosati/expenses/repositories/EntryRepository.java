package com.cosati.expenses.repositories;

import com.cosati.expenses.data.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Long> {
}

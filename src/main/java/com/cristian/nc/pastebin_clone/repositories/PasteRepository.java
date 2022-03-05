package com.cristian.nc.pastebin_clone.repositories;

import com.cristian.nc.pastebin_clone.entities.Paste;
import org.springframework.data.repository.CrudRepository;

public interface PasteRepository extends CrudRepository<Paste, Long> {
}

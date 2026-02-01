package com.interfaces.marker.serialization;

// Custom marker interface
// Just extends Serializable to group backup-eligible objects
import java.io.Serializable;

public interface Backupable extends Serializable {
    // no methods – pure marker
}
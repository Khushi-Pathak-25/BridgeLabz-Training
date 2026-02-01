package com.interfaces.marker.cloningprototype;

// Custom marker interface
// Just extends Cloneable to group cloneable objects
public interface Prototype extends Cloneable {
    // no methods – pure marker
    Object clone() throws CloneNotSupportedException;
}
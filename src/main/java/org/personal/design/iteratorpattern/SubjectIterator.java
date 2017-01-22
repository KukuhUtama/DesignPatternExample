package org.personal.design.iteratorpattern;

public interface SubjectIterator {
   public Boolean hasNext();
   public Subject next();
   public void remove();
}

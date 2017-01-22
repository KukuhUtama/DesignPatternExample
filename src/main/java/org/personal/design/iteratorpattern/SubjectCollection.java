package org.personal.design.iteratorpattern;

public interface SubjectCollection {
	
	public void addSubject(Subject subject);

	public void removeSubject(Subject subjet);
	
	public SubjectIterator iterator(SubjectType type);
}

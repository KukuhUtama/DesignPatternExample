package org.personal.design.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectCollectionImpl implements SubjectCollection {

	private List<Subject> subjects;

	public SubjectCollectionImpl() {
		subjects = new ArrayList<Subject>();
	}

	public void addSubject(Subject subject) {
		subjects.add(subject);
	}

	public void removeSubject(Subject subject) {
		subjects.remove(subject);
	}

	public SubjectIterator iterator(SubjectType type) {
		return new Iterator(type, subjects);
	}

	private class Iterator implements SubjectIterator {

		private SubjectType type;
		private int index;
		private List<Subject> subjects;

		private Iterator(SubjectType type, List<Subject> subjects) {
			this.type = type;
			this.subjects = subjects;
		}

		public Boolean hasNext() {
			while (index < subjects.size()) {
				Subject s = subjects.get(index);
				if (s.getType().equals(type)) {
					return true;
				} else {
					index++;
				}
			}
			return false;
		}

		public Subject next() {
			Subject s = subjects.get(index);
			index++;
			return s;
		}

		public void remove() {
			subjects.remove(index);
			index++;
		}

	}

}

package org.personal.design.ren;

import org.personal.design.factorypattern.SocialMediaFactory;
import org.personal.design.factorypattern.SocialMediaType;
import org.personal.design.iteratorpattern.Subject;
import org.personal.design.iteratorpattern.SubjectCollection;
import org.personal.design.iteratorpattern.SubjectCollectionImpl;
import org.personal.design.iteratorpattern.SubjectIterator;
import org.personal.design.iteratorpattern.SubjectType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SubjectCollection subjectCollection = populateSubject();
    	SubjectIterator iterator = subjectCollection.iterator(SubjectType.ALL);
    	while(iterator.hasNext()){
    		Subject s = iterator.next();
    		System.out.println(s.toString());
    	}
    	System.out.println("-----------------------");
    	iterator = subjectCollection.iterator(SubjectType.MANDATORY);
    	while(iterator.hasNext()){
    		Subject s = iterator.next();
    		System.out.println(s.toString());
    	}
    	System.out.println("-----------------------");
    	iterator = subjectCollection.iterator(SubjectType.OPTIONAL);
    	while(iterator.hasNext()){
    		Subject s = iterator.next();
    		System.out.println(s.toString());
    	}
    }
    
    public static SubjectCollection populateSubject(){
    	SubjectCollection subjectCollection = new SubjectCollectionImpl();
    	
    	subjectCollection.addSubject((new Subject("Accounting", "John", SubjectType.OPTIONAL)));
    	subjectCollection.addSubject((new Subject("Art", "Smith", SubjectType.OPTIONAL)));
    	subjectCollection.addSubject((new Subject("Chemistry", "Lennon", SubjectType.ALL)));
    	subjectCollection.addSubject((new Subject("Civil", "Alan", SubjectType.ALL)));
    	subjectCollection.addSubject((new Subject("Economics", "Mike", SubjectType.MANDATORY)));
    	subjectCollection.addSubject((new Subject("Education", "Joe", SubjectType.MANDATORY)));
    	
    	return subjectCollection;
    }
}

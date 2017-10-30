package uk.org.tombolo.field;

import uk.org.tombolo.core.Subject;
import uk.org.tombolo.core.TimedValue;

/**
 * SingleValueField.java
 * A Field that can return a single String value.
 *
 * Note that you should only implement this if it makes sense for your
 * field to do this. Think about what the user is likely to expect from
 * the name of your field. It may be more readable if you create a subclass
 * of your generic field, or another field entirely.
 */
//ans getTimedValue shouldn't be here
public interface SingleValueField extends Field {
    String valueForSubject(Subject subject, Boolean timeStamp) throws IncomputableFieldException;
    TimedValue getTimedValue(Subject subject) throws IncomputableFieldException;
}

package uk.org.tombolo.field.value;

import com.vividsolutions.jts.geom.Point;
import uk.org.tombolo.core.Subject;
import uk.org.tombolo.field.AbstractField;

/**
 * SubjectLatitudeField.java
 * Returns the latitude of the centroid of the subject.
 */
//TOASK do we use this? where and why?
    //ans needed if we need a centroid value.
public class SubjectLatitudeField extends AbstractField {

    public SubjectLatitudeField(String label) {
        super(label);
    }

    @Override
    public String valueForSubject(Subject subject, Boolean timeStamp) {
        Point centroid = subject.getShape().getCentroid();
        return String.valueOf(centroid.getY());
    }

}

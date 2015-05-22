package common;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;


/**
 * Created by ldrs on 2015/5/21.
 */
public class ToString implements Serializable {

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}

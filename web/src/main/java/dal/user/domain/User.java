package dal.user.domain;

import common.ToString;

/**
 * Created by ldrs on 2015/5/21.
 */
public class User extends ToString {

    Long id;

    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public interface Users {

    User findByUsername(String username);
    Long insert(User user);

    Object all();
}

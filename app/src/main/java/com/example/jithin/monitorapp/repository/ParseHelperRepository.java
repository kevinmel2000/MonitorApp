package com.example.jithin.monitorapp.repository;

import com.parse.ParseException;
import com.parse.ParseUser;

/**
 * Created by jithin on 18/3/18.
 */

public interface ParseHelperRepository {

    String getUserType(ParseUser object, ParseException e);


}

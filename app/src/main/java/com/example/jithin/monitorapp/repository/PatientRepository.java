package com.example.jithin.monitorapp.repository;

/**
 * Created by Master on 3/19/2018.
 */

public interface PatientRepository {

    void updatingUserProfileDetails(String objid, final String age, final String weight, final String height, final String totalchol, final String hdlChol, final String symbp, final String havesmoker, final String havetreatment);
}

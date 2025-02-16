package org.day06.problemstatement.annotation.practiceproblems.customannotations.advancedlevel.customserialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
    //Defining custom JSON key
}
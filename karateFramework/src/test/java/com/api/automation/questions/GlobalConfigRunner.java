package com.api.automation.questions;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class GlobalConfigRunner {
    @Test
    public Karate testSample() {
        return Karate.run("getGlobalConfig").relativeTo(getClass());
    }

}

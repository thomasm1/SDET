package com.intuit.karate.junit4.files.relative;

import com.intuit.karate.junit4.Karate;
import com.intuit.karate.KarateOptions;
import org.junit.runner.RunWith;

/**
 *
 * @author pthomas3
 */
@RunWith(Karate.class)
@KarateOptions(features = "classpath:com/intuit/karate/junit4/files/relative/caller.feature")
public class CallerRunner {
    
}

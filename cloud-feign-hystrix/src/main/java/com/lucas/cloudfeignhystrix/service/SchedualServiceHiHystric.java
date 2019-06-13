package com.lucas.cloudfeignhystrix.service;

import org.springframework.stereotype.Component;

/**
 * @author Lucas
 */
@Component
public class SchedualServiceHiHystric  implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}

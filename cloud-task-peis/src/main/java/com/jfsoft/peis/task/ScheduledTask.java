package com.jfsoft.peis.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by web on 2017/6/29.
 */
@Component
public class ScheduledTask {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "*/5 * * * * ?")
    public void execute() {
        System.out.println("现在时间是："+System.currentTimeMillis());
    }

}

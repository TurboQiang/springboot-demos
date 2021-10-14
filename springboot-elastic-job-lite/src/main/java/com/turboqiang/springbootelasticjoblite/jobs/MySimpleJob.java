package com.turboqiang.springbootelasticjoblite.jobs;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.LongAdder;

/**
 * @author turboqiang
 */
@Slf4j
@Service
public class MySimpleJob implements SimpleJob {

    static LongAdder adder = new LongAdder();

    @Override
    public void execute(ShardingContext context) {
        adder.add(1L);
        log.info("定时任务执行了... 第{}次", adder);
    }

}

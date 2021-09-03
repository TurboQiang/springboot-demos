package com.turboqiang.springbootmybatisplus;

import com.turboqiang.springbootmybatisplus.realamount.entity.DriverRealAmountInfo;
import com.turboqiang.springbootmybatisplus.realamount.mapper.DriverRealAmountInfoMapper;
import com.turboqiang.springbootmybatisplus.realamount.service.IDriverRealAmountInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    IDriverRealAmountInfoService driverRealAmountInfoServiceImpl;
    @Test
    void testInsert(){
        DriverRealAmountInfo driverRealAmountInfo = new DriverRealAmountInfo();
        driverRealAmountInfo.setDriverId(1213);
        driverRealAmountInfo.setBeforeRealAmount(BigDecimal.TEN);
        driverRealAmountInfo.setAfterRealAmount(BigDecimal.valueOf(20));
        driverRealAmountInfo.setIncrAmount(BigDecimal.TEN);
        driverRealAmountInfo.setCreateTime(LocalDateTime.now());
        driverRealAmountInfo.setUpdateTime(LocalDateTime.now());

        driverRealAmountInfoServiceImpl.save(driverRealAmountInfo);

    }

}
